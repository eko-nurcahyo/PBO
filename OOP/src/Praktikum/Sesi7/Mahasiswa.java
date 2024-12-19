package Praktikum.Sesi7;

class Mahasiswa {
    public String nama;          // Public: can be accessed from anywhere
    protected int usia;          // Protected: can be accessed within the package
    private String jurusan;      // Private: only accessible within this class
  
    // Constructor
    public Mahasiswa(String nama, int usia, String jurusan) {
        this.nama = nama;
        this.usia = usia;
        this.jurusan = jurusan;
    }
  
    // Getter for the private attribute 'jurusan'
    public String getJurusan() {
        return jurusan;
    }
  
    // Setter for the private attribute 'jurusan'
    public void setJurusan(String jurusanBaru) {
        this.jurusan = jurusanBaru;
    }
  
    // Method to display information
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Jurusan: " + jurusan);
    }
  }
  
  // Main tester class to run the program
  class MhsTester {
    public static void main(String[] args) {
        // Create an object of Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Andi", 21, "Teknik Informatika");
  
        // Access public attribute
        System.out.println("Nama Mahasiswa: " + mahasiswa1.nama);  // Output: Andi
  
        // Access protected attribute (can be accessed within the same package)
        System.out.println("Usia Mahasiswa: " + mahasiswa1.usia);  // Output: 21
  
        // Access private attribute using getter
        System.out.println("Jurusan Mahasiswa: " + mahasiswa1.getJurusan());  // Output: Teknik Informatika
  
        // Modify the private attribute using setter
        mahasiswa1.setJurusan("Sistem Informasi");
        System.out.println("Jurusan Mahasiswa Setelah Diubah: " + mahasiswa1.getJurusan());  // Output: Sistem Informasi
  
        // Display complete information of the student
        mahasiswa1.tampilkanInfo();
    }
  }
