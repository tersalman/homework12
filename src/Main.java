public class Main {

    public static void main(String[] args) {

        Author duma = new Author("Duma ","Aleksandr");

        Author jackLondon = new Author("London ", "jack");

        Book grafMonteKristo = new Book("grafMonteKristo",duma,1844);

        Book seaWolf = new Book("Sea Wolf", jackLondon, 1904);


        seaWolf.setPublishingYear(1914);

        System.out.println(grafMonteKristo.getAuthorName().allAuthorName());

    }

}