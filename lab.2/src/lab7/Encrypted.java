package lab7;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;

public class Encrypted {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String choice = " ", fname = "";
        System.out.println("Choose between: encrypt/decrypt");
        choice = scanner.next();
        System.out.println("Write file name: ");
        fname = scanner.next();

        if (choice.compareTo("encrypt") == 0) {
            File file = new File("C:\\Users\\Raluca\\Documents\\SE Lab Bitbucket\\lab.2\\ex3.txt" + fname);

            BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter f_writer = new BufferedWriter(new FileWriter("C:\\Users\\Raluca\\Documents\\SE Lab Bitbucket\\lab.2\\encrypted.enc"));

            String st=br.readLine();
            char c;
            try {
                for (int i = 0; i < st.length(); i++){
                    f_writer.write((st.charAt(i)+1));
                }

                f_writer.close();
            }
            catch (IOException e) {
                System.out.print(e.getMessage());
            }

        }
        else{

            File file = new File("C:\\Users\\Raluca\\Documents\\SE Lab Bitbucket\\lab.2\\ex3.txt" + fname);
            BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter f_writer = new BufferedWriter(new FileWriter("C:\\Users\\Raluca\\Documents\\SE Lab Bitbucket\\lab.2\\decrypted.dec"));

            String st=br.readLine();
            char c;
            try {
                for (int i = 0; i < st.length(); i++){
                    f_writer.write((st.charAt(i)-1));
                }

                f_writer.close();
            }
            catch (IOException e) {
                System.out.print(e.getMessage());
            }

        }

    }

}