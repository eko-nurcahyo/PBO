package Praktikum.Sesi6;

public class PersegiPanjang extends BangunDatar {
    public float panjang;
    public float lebar;

    @Override
    public float luas() {
        return panjang * lebar;
    }

    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}