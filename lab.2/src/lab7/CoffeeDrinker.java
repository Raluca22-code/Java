package lab7;

class CoffeeDrinker{
    void drinkCoffee(Coffee c) throws TemperatureException, ConcentrationException, NumberException {
        if(c.getCount()>5)
            throw new NumberException(c.getCount(),"We are out of coffee");
        if(c.getTemp()>60)
            throw new TemperatureException(c.getTemp(),"Cofee is to hot!");
        if(c.getConc()>50)
            throw new ConcentrationException(c.getConc(),"Cofee concentration to high!");


        System.out.println("Drink cofee:"+c);
    }
}

