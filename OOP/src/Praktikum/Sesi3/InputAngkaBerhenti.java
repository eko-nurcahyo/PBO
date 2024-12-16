package Praktikum.Sesi3;

import java.util.Scanner;

public class InputAngkaBerhenti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan sebuah angka (masukkan 0 untuk berhenti): ");
            angka = scanner.nextInt();
        } while (angka != 0);

        System.out.println("Program berhenti karena Anda memasukkan angka 0.");   
        scanner.close();
    }
}