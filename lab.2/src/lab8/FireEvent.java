package lab8;

class FireEvent  extends Event{
    private final boolean smoke;

    FireEvent(boolean smoke) {
        super(EventType.FIRE);
        this.smoke = smoke;



    }

    boolean isSmoke() {
        return smoke;
    }

    @Override
    public String toString() {

        if(isSmoke()) {
            return "FireEvent" + "smoke=" + smoke +" "+new Alarm().toString()+ " " +new GsmUnit().toString();
        }
        else
            return "FireEvent{" + "smoke=" + smoke +'}';
    }
}
