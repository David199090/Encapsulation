// Демонстрація використання інкапсуляції на прикладі автомобіля
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Porsche");

        car.printCarInfo();

        car.startEngine();

        car.accelerate(50);
        car.printCarInfo();

        car.brake(30);
        car.printCarInfo();

        car.stopEngine();
        car.printCarInfo();
    }
}