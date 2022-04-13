package lab8;


public class ControlUnit {
    private static ControlUnit control;
    private ControlUnit()
    {
    }
    public static ControlUnit getControl()
    {
        if(control==null)
            control=new ControlUnit();
        return control;
    }
}
