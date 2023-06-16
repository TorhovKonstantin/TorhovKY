package lab10;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return String.valueOf(year);
    }

    @Override
    public String toString() {
        return "{Книга='" + title + '\'' +
                ", Автор='" + author + '\'' +
                ", Год=" + year + "}" + '\n';
    }
}
