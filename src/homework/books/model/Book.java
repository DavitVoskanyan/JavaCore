package homework.books.model;

public class Book {
    private String title;
    private String AuthorAuthor;
    private double price;
    private int count;
    private String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorAuthor() {
        return AuthorAuthor;
    }

    public void setAuthorAuthor() {
        this.setAuthorAuthor();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + AuthorAuthor + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", genre='" + genre + '\'' +
                '}';
    }

    public Book(String title, String AuthorAuthor, double price, String count, String genre) {
        this.title = title;
        this.AuthorAuthor= AuthorAuthor;
        this.price = price;
        this.count = Integer.parseInt(count);
        this.genre = genre;
    }

    public Object AuthorAuthor() {
        return null;
    }

    public Object AuthorName() {

return null;
    }
}
