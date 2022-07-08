package homework.books;

import homework.books.command.Command;
import homework.books.enums.Gender;
import homework.books.exeption.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;

public class BookDEmo implements Command {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bokStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {
        entry();
        boolean run = true;
        while (run) {
            Command.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case PRINT_ALL_BOOKS:
                    bokStorage.print();
                    break;
                case PRINT_BOOKS_BY_AUTHOR:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    BookGenre();
                    break;
                case PRINT_BOOKS_BY_PRICE_RANGE:
                    priceRangeSearch();
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHOR:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("Invalid command , please try again ");
            }
        }
    }

    private static void entry() {
        String login;
        String password;
        login = "admin";
        password = "123456";
        System.out.println("please input login");
        String login1 = scanner.nextLine();
        System.out.println("please input password");
        String password1 = scanner.nextLine();
        if (!login1.equals("admin") || !password1.equals("123456"))
            System.out.println("Invalid login and password");
    }


    private static void changeBookAuthor() {
        bokStorage.print();
        System.out.println("please input Author index");
        int index = Integer.parseInt(scanner.nextLine());
        Author author = null;
        try {
            author = authorStorage.getAuthorByIndex(index);

        } catch (AuthorNotFoundException e) {
            throw new RuntimeException(e);
        }
        if (author != null) {
            authorStorage.print();
            System.out.println("please chose author index");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            try {
                Author author1 = authorStorage.getAuthorByIndex(authorIndex);
                author.setName(author.getName());
                author.setSurname(author.getSurname());
                author.setEmail(author.getEmail());
                author.setGender(author.getGender());

            } catch (AuthorNotFoundException e) {
                System.out.println("please input correct index");
                changeBookAuthor();
            }
        }

    }

    private static void priceRangeSearch() {
        double price = 0;
        try {
            price = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("please input price ");
        }
        double maxPrice = 0;
        try {
            maxPrice = Integer.parseInt(scanner.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("please input maxPrice ");

        }
        bokStorage.priceRangeSearch(price, maxPrice);


    }

    private static void BookGenre() {

        bokStorage.print();
        System.out.println("please input by Genre ");
        String genre = scanner.nextLine();
        bokStorage.bookGenre(genre);
    }

    public static void addBook() {
        if (authorStorage.getSize() == 0) {
            System.out.println("please input Author ");
            addAuthor();
        } else {
            authorStorage.print();
            System.out.println("please choose author  index");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            try {
                Author author = authorStorage.getAuthorByIndex(authorIndex);
                System.out.println("please input title");
                String title = scanner.nextLine();
                System.out.println("please input price");
                String priceStr = scanner.nextLine();
                System.out.println("please input count");
                String count = scanner.nextLine();
                System.out.println("please input genre");
                String genre = scanner.nextLine();

                double price = Integer.parseInt(priceStr);
                int counts = Integer.parseInt(count);
                Book book = new Book(title, author, price, count, genre);
                bokStorage.add(book);
                System.out.println("THANK YOU");
            } catch (AuthorNotFoundException e) {
                System.out.println("please input correct index ");
                addBook();
            }
        }
    }

    private static void addAuthor() {
        System.out.println("please input name ");
        String name = scanner.nextLine();
        System.out.println("please input  surname");
        String surname = scanner.nextLine();
        System.out.println("please input email");
        String email = scanner.nextLine();
        gender();

//        System.out.println("please input gender");
//        String gender = scanner.nextLine();
//        if (gender.equals("MALE") || gender.equals("FEMALE")) {
//            Author author = new Author(name, surname, email, gender);
//            authorStorage.add(author);
//            System.out.println("author created");
//        } else {
//            System.out.println("please input gender");
//        }
    }

    private static Gender gender() {

        System.out.println("select gender");
        Gender[] genders = Gender.values();
        for (Gender value : genders) {
            System.out.println(value + " ");

        }
        Gender gender = null;
        try {
            gender = Gender.valueOf(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            gender();
            System.out.println("no such option:try again");

        }
        return gender;
    }
}
