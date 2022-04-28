package lab10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Controller implements ActionListener, Observer{

    ChronometerThread chrt;
    Chronometer chr;

    public Controller(ChronometerThread c, Chronometer chr) {
        this.chrt = c;
        this.chr = chr;
        chr.getStarop().addActionListener(this);
        chr.getReset().addActionListener(this);
        chrt.addObserver(this);
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        chr.getTextF().setText(chrt.h + ":" + chrt.min +":"+
                chrt.sec + ":"+ chrt.milisec);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(chr.getStarop())) {

            if(chrt.starebuton) {
                chrt.changeButtonState();
                chr.getStarop().setText("Start");
            }
            else {
                chr.getStarop().setText("Stop");
                chrt.changeButtonState();

            }

        }
        else if(e.getSource().equals(chr.getReset())) {
            chrt.milisec=0;
            chrt.sec=0;
            chrt.min=0;
            chrt.h=0;
            chr.getTextF().setText("0:0:0:0");
        }

    }

}
