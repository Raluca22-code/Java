package lab3;

public class Flower{
    static int number = 0;
    int petal;

    Flower(){
        System.out.println("Flower has been created!");
    }

    static void Flower_number()
    {
        System.out.println("number of flowers " + number);
    }

    public static void main(String[] args) {
        Flower[] garden = new Flower[5];
        for(int i =0; i<5; i++){
            Flower f = new Flower();
            garden[i] = f;
            number++;
        }
        Flower_number();
    }
}