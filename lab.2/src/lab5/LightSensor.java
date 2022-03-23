package lab5;

import java.util.concurrent.ThreadLocalRandom;
public class LightSensor {
    private int lightSensor;
    LightSensor(){
        super();
    }

    public int readValue(){
        lightSensor = ThreadLocalRandom.current().nextInt(0, 101);;
        return lightSensor;
    }
}