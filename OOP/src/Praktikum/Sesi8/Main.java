package Praktikum.Sesi8;

public class Main {
    public static void main(String[] args) {
        // Membuat objek
        Pegawai Manager = new Manager();
        Pegawai Kasir = new Kasir();
        Pegawai Koki = new Koki();
        Pegawai Pelayan = new Pelayan();
        Pegawai Satpam = new Satpam();

        // Menginisialisasi variabel menggunakan objek
        Manager.nama = "Wirya";
        Manager.id_pegawai = 1;
        Manager.gaji = "7 Juta";

        Kasir.nama = "Aldi";
        Kasir.id_pegawai = 2;
        Kasir.gaji = "2 Juta";

        Koki.nama = "Reza";
        Koki.id_pegawai = 3;
        Koki.gaji = "2 Juta";

        Pelayan.nama = "Dean";
        Pelayan.id_pegawai = 4;
        Pelayan.gaji = "2 Juta";

        Satpam.nama = "Aldi";
        Satpam.id_pegawai = 5;
        Satpam.gaji = "1 Juta";

        // Menampilkan data dan tugas
        Manager.menampilkan();
        ((Manager) Manager).tugas();

        Kasir.menampilkan();
        ((Kasir) Kasir).tugas();

        Koki.menampilkan();
        ((Koki) Koki).tugas();

        Pelayan.menampilkan();
        ((Pelayan) Pelayan).tugas();

        Satpam.menampilkan();
        ((Satpam) Satpam).tugas();
    }
}