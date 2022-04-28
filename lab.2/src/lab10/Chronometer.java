package lab10;

import javax.swing.*;

public class Chronometer extends JFrame{

    JButton starop;
    JButton reset;
    JTextField textF;


    Chronometer(){
        setTitle("Cronometru");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializare();
        setSize(500,500);
        setVisible(true);
    }

    public void initializare() {
        this.setLayout(null);

        int width = 100; int height = 50;

        textF = new JTextField();
        textF.setBounds(175, 100, width, 30);
        textF.setEditable(false);

        starop = new JButton("Start");
        starop.setBounds(100, 170, width, height);

        reset = new JButton("Reset");
        reset.setBounds(250, 170, width, height);

        add(textF);
        add(starop);add(reset);

    }

    public JButton getStarop() {
        return starop;
    }

    public void setStarop(JButton starop) {
        this.starop = starop;
    }

    public JButton getReset() {
        return reset;
    }

    public void setReset(JButton reset) {
        this.reset = reset;
    }

    public JTextField getTextF() {
        return textF;
    }

    public void setTextF(JTextField textF) {
        this.textF = textF;
    }


}
