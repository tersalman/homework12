import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Author duma = new Author("Duma ","Aleksandr");

        Author jackLondon = new Author("London ", "jack");

        Book grafMonteKristo = new Book("GrafMonteKristo",duma,1844);

        Book grafMonteKristo1 = new Book("GrafMonteKristo",duma,1220);

        Book seaWolf = new Book("Sea Wolf", jackLondon, 1904);


        seaWolf.setPublishingYear(1914);

        System.out.println(seaWolf.toString());

        System.out.println(grafMonteKristo.getAuthorName().allAuthorName());

        System.out.println(grafMonteKristo.toString());

        System.out.println(grafMonteKristo.equals(grafMonteKristo1));

        System.out.println(seaWolf.hashCode());

        System.out.println(duma.equals(jackLondon));
    }

}