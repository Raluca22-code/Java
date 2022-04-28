package lab10;

import java.util.Observable;

class ChronometerThread extends Observable implements Runnable{

    Object obj = new Object();

    boolean starebuton = false;

    int milisec = 0;
    int sec = 0;
    int min = 0;
    int h = 0;

    ChronometerThread(){
        new Thread(this).start();
    }

    @Override
    public void run() {

        while(true) {
            if(starebuton) {
                synchronized (this) {
                    milisec++;
                    if(milisec>999) {
                        sec++;
                        milisec=0;
                    }
                    if(sec>59) {
                        min++;
                        sec=0;
                    }
                    if(min>59) {
                        h++;
                        min=0;
                    }
                    this.notify();
                }
            }else {
                synchronized(obj) {
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



            this.notifyObservers(milisec);
            this.setChanged();
        }
    }

    public void changeButtonState() {
        starebuton = !starebuton;
        if(starebuton) {
            synchronized (obj) {
                obj.notify();
            }
        }
    }
}