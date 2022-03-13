package lab4;

public class TestBook2 {

    public static void main(String[] args){
        Author[] firstAuthor = new Author[3];
        Author secondAuthor = new Author("Raluca Nemes","nemesra7uca555@gmail.com", 'f' );
        firstAuthor[1] = secondAuthor;
        System.out.println(secondAuthor);

        Author thirdAuthor = new Author("Nagy Timea","nagytimea@gmail.com", 'f');
        firstAuthor[2] = thirdAuthor;
        System.out.println(thirdAuthor);


        Book2 anotherBook = new Book2("Title:", firstAuthor, 34);
        //firstAuthor.printAuthors(); ?????


    }
}
