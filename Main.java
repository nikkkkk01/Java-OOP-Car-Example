package myPackage;

public class Main {

public static void main(String[] args) {

Car car1 = new Car();
car1.brand = "Lamborghini";
car1.year = 2020;

Car car2 = new Car();
car2.brand = "Ferrari";
car2.year = 2022;

car1.displayInfo();
car1.startEngine();

System.out.println();

car2.displayInfo();
car2.startEngine();
}
}
