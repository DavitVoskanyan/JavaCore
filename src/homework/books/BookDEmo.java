package homework.books;

import java.util.Scanner;

public class BookDEmo {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bokStorage = new BookStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 Add Book");
            System.out.println("please input 2 Print All Books");
            System.out.println("please input 3 Print Books by AuthorName");
            System.out.println("please input 4 Print Books by Genre");
            System.out.println("please input 5 Print books by price range");
            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addBook();
                    break;
                case 2:
                    bokStorage.print();
                    break;
                case 3:
                    authorName();

                    break;
                case 4:
                    BookGenre();
                    break;
                case 5:
                    price();
                    break;
                default:
                    System.out.println("Invalid command , please try again ");
            }
        }
    }

    private static void authorName() {
        System.out.println("please input authorName");
        String authorName =scanner.nextLine();
        bokStorage.bookAuthorNAme(authorName);
    }

    private static void price() {
        bokStorage.print();
        System.out.println("please input price range");
        double price = Integer.parseInt(scanner.nextLine());
        System.out.println("please input maxPrice");
        double maxPrice = Integer.parseInt(scanner.nextLine());
        bokStorage.price(price, maxPrice);

    }

    private static void BookGenre() {
        bokStorage.print();
        System.out.println("please input by Genre ");
        String genre =scanner.nextLine();
bokStorage.bookGenre(genre);
    }

    public static void addBook() {
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
    }
}