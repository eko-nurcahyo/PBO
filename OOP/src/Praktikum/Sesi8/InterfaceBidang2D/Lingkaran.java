package Praktikum.Sesi8.InterfaceBidang2D;

public class Lingkaran implements Bidang2D {
    public double radius;

    @Override
    public double getKeliling() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getLuas() {
        return Math.PI * radius * radius;
    }
}
