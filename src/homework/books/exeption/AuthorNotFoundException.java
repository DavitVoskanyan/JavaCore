package homework.books.exeption;

public class AuthorNotFoundException extends Exception {
    public AuthorNotFoundException() {
    }

    public AuthorNotFoundException(String message) {
        super(message);
    }
}


