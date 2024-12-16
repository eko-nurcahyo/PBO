package Praktikum.Sesi5;

class Mobil {
    public String merk;           
    protected int tahunProduksi;  
    private double harga;         

    // Constructor
    public Mobil(String merk, int tahunProduksi, double harga) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    // Getter untuk atribut private harga
    public double getHarga() {
        return harga;
    }

    // Setter untuk atribut private harga
    public void setHarga(double hargaBaru) {
        if (hargaBaru > 0) {  
            this.harga = hargaBaru;
        } else {
            System.out.println("Harga harus lebih besar dari 0.");
        }
    }

    // Metode untuk menampilkan informasi mobil
    public void tampilkanInfoMobil() {
        System.out.printf("Merk: %s\n", merk);
        System.out.printf("Tahun Produksi: %d\n", tahunProduksi);
        System.out.printf("Harga: %.2f\n", harga);
    }
}

public class MobilCek {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil1 = new Mobil("Toyota", 2022, 300000000);

        // Mengakses atribut public
        System.out.println("Merk Mobil: " + mobil1.merk);

        // Mengakses atribut protected
        System.out.println("Tahun Produksi Mobil: " + mobil1.tahunProduksi);

        // Mengakses atribut private menggunakan getter
        System.out.printf("Harga Mobil: %.2f\n", mobil1.getHarga());

        // Mengubah nilai atribut private menggunakan setter
        mobil1.setHarga(350000000);
        System.out.printf("Harga Mobil Setelah Diubah: %.2f\n", mobil1.getHarga());

        // Menampilkan informasi lengkap mobil
        mobil1.tampilkanInfoMobil();
    }
}