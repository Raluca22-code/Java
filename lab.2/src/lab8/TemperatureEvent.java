package lab8;

class TemperatureEvent extends Event {
    private  final int vlaue;

    TemperatureEvent(int vlaue) {
        super(EventType.TEMPERATURE);
        this.vlaue = vlaue;
    }

    int getVlaue() {
        return vlaue;
    }

    @Override
    public String toString() {
        if(getVlaue()>23)
            return "TemperatureEvent " + "value=" + vlaue +" "+ new CoolingUnit().toString();
        else
            return "TemperatureEvent " + "value=" + vlaue +" "+new HeatingUnit().toString();
    }

}
