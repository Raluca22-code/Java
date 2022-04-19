package lab9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Counter extends JFrame {

    JButton bPress;
    JTextField tCounter;

    Counter() {
        setTitle("Press the button");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(500, 500);
        setVisible(true);
    }

    public void init() {
        this.setLayout(null);
        int width = 100;
        int height = 100;

        bPress = new JButton("Press me!");
        bPress.setBounds(200, 100, width, height);
       // bPress.addActionListener(new BtnListener());

        add(bPress);
        add(tCounter);
    }

    public static class Counters implements ActionListener
    {
        // Initialize the counter
        private int i = 0;

        // label to display the counter value
        private JLabel label;
        // Increment button
        private JButton plus;
        // Decrement button
        private JButton moins;

        public JPanel getPanel() {
            // Create the panel
            JPanel panel = new JPanel();

            // Add increment button to JPanel
            plus = new JButton("+");
            plus.addActionListener(this);
            panel.add(plus);

            // Add the counter to JPanel
            label = new JLabel("" + i);
            panel.add(label);

            return panel;
        }

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == plus) {
                i++;
                label.setText("" + i);
            }

        }
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setTitle("Click Counter");
            frame.setSize(new Dimension(250, 80));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create the panel
            Counters counter = new Counters();
            JPanel counterPanel = counter.getPanel();

            // Add the panel to the center of the window
            Container content = frame.getContentPane();
            content.add(counterPanel, BorderLayout.CENTER);

            // Show the window
            frame.setVisible(true);
        }
    }


}
