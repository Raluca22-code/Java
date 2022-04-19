package lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FileDisplayer extends JFrame {

    JButton bPress;
    JTextField tFilename;
    JTextField tContents;
    JLabel lfname,lcontents;

    File dir = new File(".");
    List<String> list = Arrays.asList(Objects.requireNonNull(dir.list(
            (dir, name) -> name.endsWith(".txt")
    )));

    FileDisplayer() {
        setTitle("Press the button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(500, 500);
        setVisible(true);
    }

    public void init() {
        this.setLayout(null);
        int width = 150;
        int height = 20;

        lfname = new JLabel("Filename: ");
        lfname.setBounds(150, 150, width, height);

        lcontents = new JLabel("Contents: ");
        lcontents.setBounds(150, 200, width, height);

        bPress = new JButton("Display file");
        bPress.setBounds(200, 100, width, height);
        bPress.addActionListener(new FileDisplayer.BtnListener());

        tFilename = new JTextField();
        tFilename.setBounds(200, 150, width, height);

        tContents = new JTextField();
        tContents.setBounds(200, 200, width, height*2);

        add(bPress);
        add(tFilename);
        add(tContents);
        add(lfname);
        add(lcontents);
    }

    public static void main(String[] args) {
        FileDisplayer bc = new FileDisplayer();
    }

    class BtnListener implements ActionListener {
        String fname="";
        String content ="";

        public void actionPerformed(ActionEvent e) {
            if (!Objects.equals(FileDisplayer.this.tFilename, "")) {
                fname = FileDisplayer.this.tFilename.getText();
            }

            if (list.contains(fname)) {
                try {
                    content =  Files.readString(Path.of(fname), StandardCharsets.US_ASCII);
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                FileDisplayer.this.tContents.setText(content);
            }
        }
    }


}

