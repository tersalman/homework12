import java.util.Objects;

public class Author {
   private String authorName;
   private String authorLastName;

    public Author(String lastName, String name) {
        this.authorLastName = lastName;
        this.authorName = name ;
    }

    public  String allAuthorName() {
       String allAuthorName = this.authorLastName + this.authorName;
       return allAuthorName;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    @Override
    public String toString() {
    return authorLastName + " " + authorName;
    }

    @Override
    public boolean equals(Object comparingName) {
        if (this == comparingName) return true;
        if (comparingName == null || getClass() != comparingName.getClass()) return false;
        Author author = (Author) comparingName;
        return Objects.equals(authorName, author.authorName) && Objects.equals(authorLastName, author.authorLastName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName, authorLastName);
    }
}
