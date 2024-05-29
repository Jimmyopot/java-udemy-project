package challenges.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Range Rover Sport 2019");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferarri 269 GTS", 15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale", 16, 8, 8);
        runRace(ferrariHybrid);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
