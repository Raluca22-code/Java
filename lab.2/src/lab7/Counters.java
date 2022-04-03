package lab7;
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Counters {
    private final char lookFor;
    private FileReader file = new FileReader("C:\\Users\\Raluca\\Documents\\SE Lab Bitbucket\\lab.2\\lab7.txt");


    Counters(FileReader file, char lookFor) throws IOException {

        this.file = file;
        this.lookFor = lookFor;

    }

    //the function for reading from the file.txt

    private String readFile() throws IOException {

        String everything;
        try (BufferedReader br = new BufferedReader(file)) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();

            }
            everything = sb.toString();
        }
        return everything;
    }

    // to count the character you specified

    private int count(String line) {
        int count = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == lookFor) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a character: ");
        char c = sc.next().charAt(0);

        FileReader file = new FileReader("C:\\Users\\Raluca\\Documents\\SE Lab Bitbucket\\lab.2\\lab7.txt");

        Counters cl1 = new Counters(file, c);

        System.out.println("The number of " + c +  " in string is: " + cl1.count(cl1.readFile()));

    }
}

//File input: Now I've done my best, I know it wasn't much