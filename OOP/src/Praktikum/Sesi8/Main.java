package Praktikum.Sesi8;

public class Main {
    public static void main(String[] args) {
        // Membuat objek persegi
        Persegi persegi = new Persegi();
        persegi.sisi = 2;

        // Membuat objek lingkaran
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        // Membuat objek persegi panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;

        // Membuat objek segitiga
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 12;
        segitiga.tinggi = 8;

        // Menampilkan hasil
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());

        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());

        System.out.println("Luas Segitiga: " + segitiga.luas());
        segitiga.keliling();
    }
}