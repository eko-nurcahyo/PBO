package Praktikum.Sesi12.quiz.no2;


public class Main {
    public static void main(String[] args) {
        Bayar transaksi = new Bayar("Alice", 10, 15000);
        transaksi.setData(101);
        
        System.out.println("Detail Gojek:");
        transaksi.tampil();
        
        System.out.println("\nProses Pembayaran:");
        transaksi.bayar();
    }
}