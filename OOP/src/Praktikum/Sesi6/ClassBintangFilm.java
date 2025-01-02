package Praktikum.Sesi6;

class BintangFilm {
    // Atribut
    private String nama;
    private Boolean pria;

    // Konstruktor
    BintangFilm(String nama, Boolean pria) {
        this.nama = nama;
        this.pria = pria;
    }

    // Method untuk mengisi atribut (ubah ke public jika diperlukan)
    public void Isikan(String nama, Boolean pria) {
        this.nama = nama; // `this` adalah objek saat ini
        this.pria = pria;
    }

    // Method untuk memperoleh nama
    String perolehNama() {
        return nama;
    }

    // Method untuk memperoleh jenis kelamin
    String perolehJenisKelamin() {
        return pria ? "Pria" : "Wanita";
    }
}

public class ClassBintangFilm {
    public static void main(String[] args) {
        // Membuat objek siA dan siB
        BintangFilm siA = new BintangFilm("Budi", true);
        BintangFilm siB = new BintangFilm("Hani", false);

        // Menampilkan data siA dan siB
        System.out.println("siA => " + siA.perolehNama() + ", " + siA.perolehJenisKelamin());
        System.out.println("siB => " + siB.perolehNama() + ", " + siB.perolehJenisKelamin());
    }
}
