package Praktikum.Sesi7;

public class AnimalTester {
    public static void main(String[] args) {
        // Membuat objek dari subclass Dog
        Dog dog = new Dog("Buddy");

        // Memanggil metode speak
        dog.speak(); // Output: Buddy says Woof
    }
}