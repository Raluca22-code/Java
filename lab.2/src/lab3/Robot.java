package lab3;

public class Robot {
    int x;
    Robot() {
        System.out.println("Default constructor");
        x = 1;
    }

    void change(int k ) {
        if(k >= 1)
            x += k;
    }

    //@Override
    public String toString(int x){

        return "x=" + x;
    }

}