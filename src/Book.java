import java.util.Objects;

public class Book {
private final String bookName;
private final Author authorName;
private int publishingYear;

    public Book(String bookName,Author authorName,int publishingYear) {
        this.bookName=bookName;
        this.authorName=authorName;
        this.publishingYear=publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }
    public Author getAuthorName() {
        return this.authorName;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
    @Override
    public String toString() {
       return bookName + ", "+ authorName.toString()+ ", "+ publishingYear ;
    }


//    comparing books on a names
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName,authorName,publishingYear);
    }
}
