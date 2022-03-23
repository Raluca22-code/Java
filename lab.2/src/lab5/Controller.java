package lab5;

public class Controller {
    private int i = 0;
    LightSensor light = new LightSensor();
    TemperatureSensor temp = new TemperatureSensor();

    public void control(){
        System.out.println("The values of the light sensor are ");
        for(i=1;i<=20;i++){
            System.out.println( light.readValue());
        }

        System.out.println("The values of the temperature sensor are ");
        for(i=1;i<=20;i++){
            System.out.println(temp.readValue());
        }
    }
}