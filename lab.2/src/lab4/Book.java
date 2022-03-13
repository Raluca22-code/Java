package lab4;

public class Book {
    private String name;
    Author author;
    private double price;
    private int qtyInStock = 0;

    public Book(String name, Author author, double price){
        this.author = author;
        this.name = name;
        this.price = price;

    }
    public Book(String name, Author author, double price, int qtyInStock){
        this.author = author;
        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName(){

        return "the name of the book is: " + this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public Author getAuthor(){
        return this.author;
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

        return name + " by " + author.toString();
    }


}
