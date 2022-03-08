package lab3;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x1, int y1){
        this.x = x1;
        this.y = y1;
    }

    public int getX(){
        return x;
    }

    public void setX(int x1){
        this.x = x1;
    }

    public int getY(){
        return y;
    }

    public void setY(int y1){
        this.y = y1;
    }
    public void setXY(int x1, int y1){
        this.x = x1;
        this.y = y1;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint another){
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}

