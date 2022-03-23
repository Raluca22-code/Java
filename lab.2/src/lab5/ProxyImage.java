package lab5;

public class ProxyImage implements Image{

    private boolean img;
    private RotatedImage rotatedImage;
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName,boolean img){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(img==true){
            if(realImage == null){
                realImage = new RealImage(fileName);
            }
            realImage.display();
        }
        else{
            if(rotatedImage == null){
                rotatedImage = new RotatedImage(fileName,img);
            }
            rotatedImage.display();
        }

    }
}
