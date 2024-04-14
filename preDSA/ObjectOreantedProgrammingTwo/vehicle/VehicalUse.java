package ObjectOreantedProgrammingTwo.vehicle;

public class VehicalUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.print();

        Car1 c = new Car1();
        c.numGear = 10;
        c.colour = "Black";
        c.print();
    }
}