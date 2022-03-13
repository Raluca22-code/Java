package lab4;

public class TestBook {
    public static void main(String[] args){
        Author writer  = new Author("Raluca", "nemesra7uca555@gmail.com", 'f' );
        Book carte1 = new Book("Programming",writer, 16.22);

        Author var1 = carte1.getAuthor();
        String var2 = carte1.getName();
        double var3 = carte1.getPrice();
        int var4 = carte1.getQtyInStock();
        carte1.setQtyInStock(5);


        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);


    }
}
