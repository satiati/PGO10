
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Toyota", "Yaris", 2015, 20000,700);
        Truck truck = new Truck("Volvo", "FH16780", 2022, 30000, 800, 2);

        System.out.println("car fuel efficiency: " + car.calculateFuelEfficiency() + " miles per gallon");
        System.out.println("truck fuel efficiency: " + truck.calculateFuelEfficiency() + " miles per gallon");
    }
}
