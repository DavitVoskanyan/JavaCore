package homework.books.storage;


import homework.books.model.Book;

public class BookStorage {

    private Book[] array = new Book[10];
    private int size = 0;


    public void add(Book book) {
        if (size == array.length) {
            increaseArray();
        }


        array[size++] = book;
    }

    private void increaseArray() {
        Book[] temp = new Book[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[1];
        }
        array = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");

        }
    }


    public void priceRangeSearch(double minPrince, double maxPrice) {

        for (int i = 0; i < size; i++) {
            Book book = array[i];
            if (book.getPrice() >= minPrince && book.getPrice() <= maxPrice) {
                System.out.println(book);
            }
        }
    }

    public void bookAuthorName(String AuthorName) {
        for (int i = 0; i < size; i++) {
            if (array[i].AuthorName().equals(AuthorName)) {
                System.out.println(array[i]);
            }
        }
    }

    public void bookGenre(String genre) {
        for (int i = 0; i < size; i++) {
            if (array[i].getGenre().equals(genre)) {
                System.out.println(array[i]);
            }
        }

    }



}
