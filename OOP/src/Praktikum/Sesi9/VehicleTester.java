package Praktikum.Sesi9;

public class VehicleTester {
    public static void main(String[] args) {
        // Membuat objek Car
        Car car = new Car("Toyota", 4);

        // Memanggil method displayInfo
        car.displayInfo("Sedan");
        // Output:
        // Brand: Toyota
        // Type: Sedan, Doors: 4
    }
}