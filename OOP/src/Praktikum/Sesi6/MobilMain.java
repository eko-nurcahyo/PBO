package Praktikum.Sesi6;

public class MobilMain {
    
    // Membuat kelas Mobil
    static class Mobil {
        // Atribut atau variabel instance
        String merk;
        String warna;
        int tahunProduksi;

        // Konstruktor: digunakan untuk menginisialisasi objek dengan nilai awal
        Mobil(String merk, String warna, int tahunProduksi) {
            this.merk = merk;
            this.warna = warna;
            this.tahunProduksi = tahunProduksi;
        }

        // Method untuk menampilkan informasi mobil
        void tampilkanInfo() {
            System.out.println("Merk: " + merk);
            System.out.println("Warna: " + warna);
            System.out.println("Tahun Produksi: " + tahunProduksi);
        }

        // Method untuk menghidupkan mesin mobil
        void hidupkanMesin() {
            System.out.println("Mesin " + merk + " hidup!");
        }

        // Method untuk mematikan mesin mobil
        void matikanMesin() {
            System.out.println("Mesin " + merk + " mati.");
        }
    }

    public static void main(String[] args) {
        // Membuat objek mobil pertama dengan memanggil konstruktor
        Mobil mobil1 = new Mobil("Toyota", "Hitam", 2020);

        // Membuat objek mobil kedua
        Mobil mobil2 = new Mobil("Honda", "Merah", 2018);

        // Memanggil method untuk menampilkan informasi mobil
        System.out.println("Informasi Mobil 1:");
        mobil1.tampilkanInfo();
        
        // Menghidupkan dan mematikan mesin mobil1
        mobil1.hidupkanMesin();
        mobil1.matikanMesin();

        // Memanggil method untuk menampilkan informasi mobil
        System.out.println("\nInformasi Mobil 2:");
        mobil2.tampilkanInfo();
        
        // Menghidupkan dan mematikan mesin mobil2
        mobil2.hidupkanMesin();
        mobil2.matikanMesin();
    }
}