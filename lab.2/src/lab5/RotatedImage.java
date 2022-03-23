package lab5;

public class RotatedImage implements Image{
    private String fileName;
    private boolean img;
    public RotatedImage(String fileName,boolean img){
        this.fileName = fileName;
        this.img=img;
    }

    public void display() {
        System.out.println("Display rotated " + fileName);
    }
}