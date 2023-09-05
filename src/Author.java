public class Author {
   private String AuthorName;
   private String AuthorLastName;

    public Author(String lastName, String name) {
        this.AuthorLastName = lastName;
        this.AuthorName = name ;
    }

    public  String allAuthorName() {
       String allAuthorName = this.AuthorLastName + this.AuthorName;
       return allAuthorName;
    }

    public String getAuthorLastName() {
        return this.AuthorLastName;
    }

    public String getAuthorName() {
        return this.AuthorName;
    }

}
