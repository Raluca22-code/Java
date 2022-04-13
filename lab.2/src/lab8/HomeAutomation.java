package lab8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HomeAutomation {
    public static void main(String[] args) throws IOException {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\Raluca\\Documents\\SE Lab Bitbucket\\lab.2\\lab7.txt"));

            //test using an annonimous inner class
            Home h = new Home() {
                protected void setValueInEnvironment(Event event) {
                    System.out.println("New event in environment " + event);
                    try {
                        out.write("New event in environment " + event+"\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                protected void controllStep() {
                    System.out.println("Control step executed");
                    try {
                        out.write("Control step executed"+"\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            };
            h.simulate();
            out.close();
        } catch(IOException e)
        {
            e.printStackTrace();
        }
    }

}
