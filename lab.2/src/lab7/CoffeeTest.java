package lab7;

class CoffeTest {
    public static void main(String[] args) {
        int max_number = 10;
        int count = 0;
        CoffeeMaker mk = new CoffeeMaker();
        CoffeeDrinker d = new CoffeeDrinker();

        for (int i = 0; i < 15; i++) {
            Coffee c = mk.makeCofee();
            count++;
            System.out.println(count);
            c.setCount(count);
            try {
                d.drinkCoffee(c);
            } catch (NumberException e) {
                System.out.println("Exception:" + e.getMessage() + " nr=" + e.getCount());
            } catch (TemperatureException e) {
                System.out.println("Exception:" + e.getMessage() + " temp=" + e.getTemp());
            } catch (ConcentrationException e) {
                System.out.println("Exception:" + e.getMessage() + " conc=" + e.getConc());
            } finally {
                System.out.println("Throw the cofee cup.\n");
            }
        }
    }
}
