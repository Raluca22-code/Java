package lab9;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class X_0 extends JFrame  {
    static int count=0;
    int toggle=0;
    JButton board1,board2,board3,board4,board5,board6,board0,board7,board8;
    JButton[] board=new JButton[9];
    JTextArea ta;

    X_0()
    {
        this.setLayout(null);
        board1=new JButton("");
        board1.setBounds(20,20,50,50);
        board2=new JButton("");
        board2.setBounds(70,20,50,50);
        board3=new JButton("");
        board3.setBounds(120,20,50,50);
        board4=new JButton("");
        board4.setBounds(20,70,50,50);
        board5=new JButton("");
        board5.setBounds(70,70,50,50);
        board6=new JButton("");
        board6.setBounds(120,70,50,50);
        board7=new JButton("");
        board7.setBounds(20,120,50,50);
        board8=new JButton("");
        board8.setBounds(70,120,50,50);
        board0=new JButton("");
        board0.setBounds(120,120,50,50);
        board0.addActionListener(new Xor0());
        board1.addActionListener(new Xor0());
        board2.addActionListener(new Xor0());
        board3.addActionListener(new Xor0());
        board4.addActionListener(new Xor0());
        board5.addActionListener(new Xor0());
        board6.addActionListener(new Xor0());
        board7.addActionListener(new Xor0());
        board8.addActionListener(new Xor0());
        ta= new JTextArea();
        ta.setBounds(20,300,250,30);

        add(board1);
        add(board2);
        add(board3);
        add(board4);
        add(board5);
        add(board6);
        add(board7);
        add(board8);
        add(board0);
        add(ta);
        setSize(500, 400);
        setVisible(true);


    }
    class Xor0 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            toggle^=1;
            if(toggle==0 && e.getSource()==board1)
                X_0.this.board1.setText("0");
            if(toggle==1 && e.getSource()==board1)
                X_0.this.board1.setText("1");
            if(toggle==0 && e.getSource()==board0)
                X_0.this.board0.setText("0");
            if(toggle==1 && e.getSource()==board0)
                X_0.this.board0.setText("1");
            if(toggle==0 && e.getSource()==board2)
                X_0.this.board2.setText("0");
            if(toggle==1 && e.getSource()==board2)
                X_0.this.board2.setText("1");
            if(toggle==0 && e.getSource()==board3)
                X_0.this.board3.setText("0");
            if(toggle==1 && e.getSource()==board3)
                X_0.this.board3.setText("1");
            if(toggle==0 && e.getSource()==board4)
                X_0.this.board4.setText("0");
            if(toggle==1 && e.getSource()==board4)
                X_0.this.board4.setText("1");
            if(toggle==0 && e.getSource()==board5)
                X_0.this.board5.setText("0");
            if(toggle==1 && e.getSource()==board5)
                X_0.this.board5.setText("1");
            if(toggle==0 && e.getSource()==board6)
                X_0.this.board6.setText("0");
            if(toggle==1 && e.getSource()==board6)
                X_0.this.board6.setText("1");
            if(toggle==0 && e.getSource()==board7)
                X_0.this.board7.setText("0");
            if(toggle==1 && e.getSource()==board7)
                X_0.this.board7.setText("1");
            if(toggle==0 && e.getSource()==board8)
                X_0.this.board8.setText("0");
            if(toggle==1 && e.getSource()==board8) {
                X_0.this.board8.setText("1");
            }
            if ((!board0.getText().equals("0") || !board1.getText().equals("0") || !board5.getText().equals("0")) && (!board0.getText().equals("0") || (board6.getText() != "0") || !board3.getText().equals("0")) &&
                    (!board0.getText().equals("0") || !board7.getText().equals("0") || !Objects.equals(board8.getText(), "0")) && ((board1.getText() != "0") || !board2.getText().equals("0") || (board3.getText() != "0")) &&
                    (!board4.getText().equals("0") || board1.getText() != "0" || !Objects.equals(board7.getText(), "0"))
            ) {
                if(count>=8)
                {
                    ta.append("Game over!");
                }
                else {
                    if ((board0.getText() != "1" || board1.getText() != "1" || board5.getText() != "1") && (board0.getText() != "1" || board6.getText() != "1" || board3.getText() != "1") &&
                            (!board0.getText().equals("1") || board7.getText() != "1" || board8.getText() != "1") && (board1.getText() != "1" || board2.getText() != "1" || board3.getText() != "1") &&
                            (board4.getText() != "1" || board1.getText() != "1" || board7.getText() != "1")
                    ) {
                        return;
                    }
                    ta.append("Player 1 has won!");
                }
            } else {
                ta.append("Player 0 has won!");
            }

        }
    }



}
