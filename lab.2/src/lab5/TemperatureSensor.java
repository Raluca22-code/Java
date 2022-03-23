package lab5;

import java.util.concurrent.ThreadLocalRandom;

public class TemperatureSensor {
    private int tempSensor;
    TemperatureSensor(){
        super();
    }

    public int readValue(){
        tempSensor= ThreadLocalRandom.current().nextInt(0, 101);;
        return tempSensor;
    }

}