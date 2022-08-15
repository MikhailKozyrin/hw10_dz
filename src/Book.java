import java.util.Objects;

public class Book {
    private final String title;
    private int PublicationYear;
    private final Author author;


    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.PublicationYear = publicationYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return PublicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublicationYear(int publicationYear) {
        this.PublicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Название книги: " + title + ". Год публикации: " + PublicationYear + ". " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return PublicationYear == book.PublicationYear && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, PublicationYear, author);
    }
}
