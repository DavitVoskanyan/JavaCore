package homework.books;


import homework.books.command.Command;
import homework.books.enums.Gender;
import homework.books.exeption.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.model.Role;
import homework.books.model.User;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.books.storage.UserStorage;

import java.util.Scanner;


public class BookDEmo implements Command {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bokStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static UserStorage userStorage = new UserStorage();
    private static User currentUser = null;
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
           Command.printLoginCommand();

            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                default:
                    System.out.println("Invalid command, please try again");
            }
        }
    }

    private static void login() {
        System.out.println("please input , email,password ");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        currentUser = userStorage.getUserByEmail(emailPassword[0]);
        if (currentUser == null) {
            System.out.println("User does not exits!");

        } else {
            if (!currentUser.getPassword().equals(emailPassword[1])) {
                System.out.println("password is wrong!");
            } else {
                if (currentUser.getRole() == Role.ADMIN) {
                    loginAdmin();
                } else {
                    if (currentUser.getRole() == Role.USER) {
                        userLogin();
                    }
                }
            }
        }

    }




    private static void register() {
        System.out.println("please input name, surname,email,password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("please input correct user data");

        } else {
            if (userStorage.getUserByEmail(userData[2]) == null) {

                User user = new User();
                user.setName(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setRole(Role.USER);
                userStorage.add(user);
                System.out.println("User registered!");
            } else {
                System.out.println("User with" + userData[2] + "already exits");
            }
        }
    }
    private static void userLogin() {
        System.out.println("Welcome ," + currentUser.getName());
        boolean run = true;
        while (run) {
            classwork.students.command.Command.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

        }
    }
    public static void loginAdmin(){
        boolean run=true;
        while (run) {
            Command.printCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }

            switch (command) {
                case LOGOUT:
                    currentUser = null;
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
                    bookGenre();
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

    private static void bookGenre() {

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
                String countStr = scanner.nextLine();
                System.out.println("please input genre");
                String genre = scanner.nextLine();

                double price = Integer.parseInt(priceStr);
                int count = Integer.parseInt(countStr);
                Book book = new Book(title, author, price, count, genre,currentUser);
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
        Gender gender ;


        try {

            gender = Gender.valueOf(scanner.nextLine());
        } catch (IllegalArgumentException e) {

            System.out.println("no such option:try again");

        }
        return gender();
    }
}
