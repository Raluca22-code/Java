package lab8;

import java.io.IOException;
import java.util.Random;

abstract class Home {
    private final Random r = new Random();

    protected abstract void setValueInEnvironment(Event event) throws IOException;
    protected abstract void controllStep() throws IOException;

    private Event getHomeEvent() {
        //randomly generate a new event;
        int k = r.nextInt(100);
        if (k < 30)
            return new NoEvent();
        else if (k < 60) {
            return new FireEvent(r.nextBoolean());

        }
        else {
            return new TemperatureEvent(r.nextInt(50));
        }
    }

    public void simulate() throws IOException {
        int k = 0;
        int SIMULATION_STEPS = 10;
        while(k < SIMULATION_STEPS){
            Event event = this.getHomeEvent();
            setValueInEnvironment(event);
            controllStep();

            try {
                Thread.sleep(300);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

            k++;
        }
    }
}
