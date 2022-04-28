package lab10;

import java.util.ArrayList;
import java.util.Observable;

public class Space2D extends Observable{

    static ArrayList<Robot> roboti = new ArrayList<>();
    static Robot[][] poz = new Robot[100][100];

    public void listAdd() {
        for(int i = 0; i<10; i++) {
            roboti.add(new Robot());
        }
    }
    static public void addRobo() {
        for(int i = 0; i<100; i++) {
            for(int j = 0; j<100; j++) {
                for(Robot r : roboti) {
                    if(i == r.getX() && j == r.getY()) {
                        poz[i][j] = r;
                    }
                }
            }
        }
    }

    public void displayMoves() {
        for(Robot r : roboti) {
            r.start();
        }
    }

    public static void main(String[] args) {

        Space2D s = new Space2D();
        s.listAdd();
        s.displayMoves();
    }
}


