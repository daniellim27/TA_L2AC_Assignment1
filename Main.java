import java.util.Scanner;

class Car {
    public String name;
    public int maxSpeed;
    public int yearOfManufacture;

    public Car(String name, int maxSpeed, int yearOfManufacture) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void printName() {
        System.out.println("Car name: " + name);
    }

    public void printMaxSpeed() {
        System.out.println("Maximum speed: " + maxSpeed);
    }

    public void printYearOfManufacture() {
        System.out.println("Year of manufacture: " + yearOfManufacture);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter car name: ");
        String name = scanner.nextLine();

        System.out.print("Enter maximum speed: ");
        int maxSpeed = scanner.nextInt();

        System.out.print("Enter year of manufacture: ");
        int yearOfManufacture = scanner.nextInt();

        Car car = new Car(name, maxSpeed, yearOfManufacture);

        car.printName();
        car.printMaxSpeed();
        car.printYearOfManufacture();
    }
}