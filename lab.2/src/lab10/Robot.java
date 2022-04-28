package lab10;

import java.util.Random;

public class Robot extends Thread{

    private int x;
    private int y;
    Thread t;
    static int n = 0;

    Robot(){
        n++;

        this.x = n;
        this.y = n;
        this.t = new Thread();

        System.out.println("Robot " + (this.getId()-10)/2+ " at position: " + this.getX() + " " + this.getY()+" has been created.");
    }


    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }


    public void move() {
        Random r = new Random();
        Random rand = new Random();
        int coord = r.nextInt(100);
        int pas = rand.nextInt(100);
        if(coord<50) {
            if(pas<50) {
                if(getX()==0)
                    setX(getX()+1);
                else
                    setX(getX()-1);
            }
            else {
                if(getX()==99)
                    setX(getX()-1);
                else
                    setX(getX()+1);
            }
        }
        else {
            if(pas<50) {
                if(getY()==0)
                    setY(getY()+1);
                else
                    setY(getY()-1);
            }
            else {
                if(getY()==99)
                    setY(getY()-1);
                setY(getY()+1);
            }
        }
    }


    @Override
    public void run() {
        while (true) {
            this.move();
            for (Robot r : Space2D.roboti)
                if ((this.getId() - 10) / 2 != (r.getId() - 10) / 2 && this.getX() == r.getX() && this.getY() == r.getY()) {
                    System.out.println("Robot " + (this.getId() - 10) / 2 + " at position: " + this.getX() + " " + this.getY());
                    System.out.println("Robots " + (this.getId() - 10) / 2 + " and " + (r.getId() - 10) / 2 + " have been destroyed, because they colided!");

                    this.stop();
                    r.stop();
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }
}
