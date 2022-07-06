package homework.books;

import homework.books.command.Command;
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
                case PRINT_BOOKS_BY_AUTHOR_NAME:
                    AuthorAuthor();

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
                default:
                    System.out.println("Invalid command , please try again ");
            }
        }
    }


    private static void AuthorAuthor() {
        bokStorage.print();
        System.out.println("please input Author index");
        int index = Integer.parseInt(scanner.nextLine());
        Author author = null;
        try {
            author = authorStorage.getAuthorByIndex(index);

        } catch (AuthorNotFoundException  e) {
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

            }catch (AuthorNotFoundException e){
                System.out.println("please input correct index");
                AuthorAuthor();
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
                System.out.println("please input authorName");
                String authorName = scanner.nextLine();
                System.out.println("please input price");
                String priceStr = scanner.nextLine();
                System.out.println("please input count");
                String count = scanner.nextLine();
                System.out.println("please input genre");
                String genre = scanner.nextLine();

                double price = Integer.parseInt(priceStr);
                int counts = Integer.parseInt(count);
                Book book = new Book(title, authorName, price, count, genre);
                bokStorage.add(book);
                System.out.println("THANK YOU");
            }catch (AuthorNotFoundException e){
                System.out.println("please input correct index ");
                addBook();
            }
        }
    }

    private static void addAuthor() {
        Author Author = null;
        System.out.println("please input name ");
        String name = scanner.nextLine();
        System.out.println("please input  surname");
        String surname = scanner.nextLine();
        System.out.println("please input email");
        String email = scanner.nextLine();
        System.out.println("please input gender");
        String gender = scanner.nextLine();
        if (gender.equals("MALE ") || gender.equals("FEMALE")) {
            Author author = new Author(name, surname, email, gender);
            authorStorage.add(author);
            System.out.println("author created");
        } else {
            System.out.println("please input gender");
        }
    }
}