package Praktikum.Sesi7;

class Car extends Vehicle {
    int doors;

    // Constructor
    public Car(String brand, int doors) {
        super(brand); // Memanggil constructor dari superclass
        this.doors = doors;
    }

    // Overloading method displayInfo
    public void displayInfo(String type) {
        super.displayInfo(); // Memanggil method dari superclass
        System.out.println("Type: " + type + ", Doors: " + doors);
    }
}