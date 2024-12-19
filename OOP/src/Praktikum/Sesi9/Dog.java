package Praktikum.Sesi9;

// Subclass
class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name); // Memanggil constructor dari superclass
    }

    // Override method speak
    @Override
    public void speak() {
        System.out.println(name + " says Woof");
    }
}