public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        Bicycle bicycle = new Bicycle("Santa Cruz", 2);
        Bicycle bicycle2 = new Bicycle("Schwinn Meridian", 3);

        Car car = new Car("Nissan Almera",4);
        Car car2 = new Car("Toyota Land Cruiser",4);

        Truck truck = new Truck("Scania", 6);
        Truck truck2 = new Truck("Sitrack", 8);

        System.out.println("______________________________");
        serviceStation.check(bicycle);
        serviceStation.check(bicycle2);
        System.out.println("______________________________");
        serviceStation.check(car);
        serviceStation.check(car2);
        System.out.println("______________________________");
        serviceStation.check(truck);
        serviceStation.check(truck2);
        System.out.println("______________________________");

    }
}
