package Praktikum.Sesi9;

import java.util.Scanner;

// Interface untuk semua jenis akun
interface AkunBank {
    void tarikSaldo(double jumlah); // Metode untuk menarik saldo
    void setorSaldo(double jumlah); // Metode untuk menyetor saldo
    void tampilkanSaldo();          // Metode untuk menampilkan saldo
}

// Abstract Class sebagai template untuk jenis akun
abstract class AkunDasar implements AkunBank {
    protected String namaPemilik;
    protected double saldo;

    // Constructor
    public AkunDasar(String namaPemilik, double saldoAwal) {
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    @Override
    public void tampilkanSaldo() {
        System.out.println("Pemilik: " + namaPemilik + ", Saldo: Rp" + saldo);
    }

    public abstract void infoAkun();
}

// Final Class untuk Akun Tabungan
final class AkunTabungan extends AkunDasar {
    private double bunga;

    // Constructor
    public AkunTabungan(String namaPemilik, double saldoAwal, double bunga) {
        super(namaPemilik, saldoAwal);
        this.bunga = bunga;
    }

    @Override
    public void tarikSaldo(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Berhasil menarik Rp" + jumlah + " dari akun tabungan.");
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }

    @Override
    public void setorSaldo(double jumlah) {
        saldo += jumlah;
        System.out.println("Berhasil menyetor Rp" + jumlah + " ke akun tabungan.");
    }

    @Override
    public void infoAkun() {
        System.out.println("Akun Tabungan dengan bunga: " + bunga + "% per tahun.");
    }
}

// Main Class
public class Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Perbankan Digital!");
        System.out.print("Masukkan nama pemilik akun: ");
        String namaPemilik = scanner.nextLine();

        System.out.print("Masukkan saldo awal: ");
        double saldoAwal = scanner.nextDouble();

        System.out.print("Masukkan bunga (%): ");
        double bunga = scanner.nextDouble();

        // Membuat objek akun tabungan
        AkunTabungan akun = new AkunTabungan(namaPemilik, saldoAwal, bunga);

        // Menampilkan informasi akun
        akun.infoAkun();
        akun.tampilkanSaldo();

        // Melakukan transaksi
        System.out.print("Masukkan jumlah setor: ");
        double setor = scanner.nextDouble();
        akun.setorSaldo(setor);
        akun.tampilkanSaldo();

        System.out.print("Masukkan jumlah tarik: ");
        double tarik = scanner.nextDouble();
        akun.tarikSaldo(tarik);
        akun.tampilkanSaldo();

        System.out.println("Terima kasih telah menggunakan layanan kami.");
        scanner.close();
    }
}