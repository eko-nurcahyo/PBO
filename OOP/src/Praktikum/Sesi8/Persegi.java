package Praktikum.Sesi8;

public class Persegi extends BangunDatar {
    public float sisi;

    @Override
    public float luas() {
        return sisi * sisi;
    }

    @Override
    public float keliling() {
        return 4 * sisi;
    }
}
