public class Car {
    int gear;
    
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public String changeGear(int gearNumber) {
        return "Gear changed to " + gearNumber;
    }
}


Car car1 = new Car();

