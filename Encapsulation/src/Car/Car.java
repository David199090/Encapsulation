// Клас для демонстрації інкапсуляції на прикладі автомобіля
public class Car {

    private String model;
    private int speed;
    private boolean engineStatus;

    public Car(String model) {
        this.model = model;
        this.speed = 0; // Початкова швидкість 0
        this.engineStatus = false; // Двигун вимкнений
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            System.out.println("Модель не може бути порожньою!");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int increment) {
        if (increment > 0) {
            speed += increment;
        } else {
            System.out.println("Швидкість не може бути зменшена таким чином!");
        }
    }

    public void brake(int decrement) {
        if (decrement > 0 && speed - decrement >= 0) {
            speed -= decrement;
        } else {
            System.out.println("Швидкість не може бути від'ємною!");
        }
    }

    public boolean isEngineStatus() {
        return engineStatus;
    }

    public void startEngine() {
        if (!engineStatus) {
            engineStatus = true;
            System.out.println("Двигун запущено.");
        } else {
            System.out.println("Двигун вже працює.");
        }
    }

    public void stopEngine() {
        if (engineStatus) {
            engineStatus = false;
            System.out.println("Двигун вимкнено.");
        } else {
            System.out.println("Двигун вже вимкнений.");
        }
    }

    public void printCarInfo() {
        System.out.println("Модель: " + model + ", Швидкість: " + speed + " км/год, Двигун працює: " + engineStatus);
    }
}
