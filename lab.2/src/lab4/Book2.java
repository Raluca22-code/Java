package lab4;

public class Book2 {
    private String name;
    private Author[] authors = new Author[3];
    private double price;
    private int qtyInStock = 0;
    private int i = 0;

    public Book2(String name, Author authors[], double price){
        this.name = name;
        for(i=0;i<3;i++)
            this.authors[i] = authors[i];
        this.price = price;
        qtyInStock = 0;

    }
    public Book2(String name, Author authors[], double price, int qtyInStock){
        this.name = name;
        for(i=0;i<3;i++)
            this.authors[i] = authors[i];
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName(){

        return "the name of the book is: " + this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public Author[] getAuthor(){
        return this.authors;
    }
    public void setPrice(double price1){
        price = price1;

    }
    public int getQtyInStock(){
        return this.qtyInStock;
    }
    public void setQtyInStock(int available){
        qtyInStock = available;
    }
    @Override
    public String toString(){

        return name + " by " + authors[i].toString();
    }
    public void printAuthors(){
        for(i=0;i<3;i++){
            System.out.println(authors[i]);
        }
    }
}
