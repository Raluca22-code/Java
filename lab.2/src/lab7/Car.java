package lab7;
import java.util.*;
import java.io.*;
import java.io.Serializable;

public class Car {
       public static void main(String[] args) throws Exception{
           AutomobilCar c = new AutomobilCar();
       }
}

class AutomobilCar{
    Automobil createAutomobil(String name){
        Automobil a = new Automobil(name);
        System.out.println(a);
        return a;
    }

}

class Automobil implements Serializable{
    String name;
    private String model;
    transient int id;
    private int price;

    public Automobil(String n) {
        this.name = n;
        id = (int)(Math.random()*100);
    }
    LinkedList t = new LinkedList();
    public Automobil(){
        id = (int)(Math.random()*1000);
    }
    void addCar(Car c){
        t.addLast(c);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Automobil(String model, int price){
        this.model = model;
        this.price = price;
    }
    static Car load(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        Car t = (Car)in.readObject();
        return t;
    }

    @Override
    public String toString() {
        return "<"+model+" price="+price+">";
    }
}
