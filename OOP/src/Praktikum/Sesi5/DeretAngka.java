package Praktikum.Sesi5;

public class DeretAngka {
    public static void main(String[] args) {
        // Iterasi dari 1 sampai 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iterasi ke-" + i + ": ");
            // Cetak deret angka dari 1 sampai i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Pindah baris setelah setiap iterasi
        }
    }
}