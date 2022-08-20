package homework.books.storage;


import homework.books.exeption.AuthorNotFoundException;
import homework.books.model.Author;

public class AuthorStorage {
    private Author[] array = new Author[10];
    private int size = 0;


    public void add(Author Author) {
        if (size == array.length) {
            increaseArray();
        }


        array[size++] = Author;
    }

    private void increaseArray() {
        Author[] temp = new Author[array.length + 10];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");

        }
    }


    public void bookAuthorAuthor(String AuthorAuthor) {
        for (int i = 0; i < size; i++) {
            if (array[i].AuthorAuthor().equals(AuthorAuthor)) {
                System.out.println(array[i]);
            }
        }

    }

    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }

            size--;
            System.out.println("lesson deleted");
        } else
            System.out.println("Index out of bounds");
    }

    public int getSize() {

        return size;
    }

    public Author getAuthorByIndex(int authorIndex) throws AuthorNotFoundException {

        int index = 0;
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            throw new AuthorNotFoundException("author with" + index + "index does not exists");
        }

    }

}
