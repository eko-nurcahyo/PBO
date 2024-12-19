package Praktikum.Sesi8;

public class Segitiga extends BangunDatar {
    public float alas;
    public float tinggi;

    @Override
    public float luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public float keliling() {
        System.out.println("Keliling segitiga tidak dapat dihitung tanpa panjang sisi miring");
        return 0;
    }
}