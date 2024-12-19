package Praktikum.Sesi4;

import java.util.Scanner;

public class ApakahKamuSukaAku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Operator dan Tipe Data
        System.out.println("Apakah kamu suka aku? (ya/tidak/mungkin)");
        String jawaban = scanner.nextLine(); // tipe data String

        // 2. If statement
        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.println("Aku juga suka kamu!");
        } else if (jawaban.equalsIgnoreCase("tidak")) {
            System.out.println("Oh, baiklah, tidak apa-apa.");
        } else if (jawaban.equalsIgnoreCase("mungkin")) {
            System.out.println("Aku akan menunggu jawaban pastimu!");
        } else {
            System.out.println("Aku tidak mengerti jawabanmu.");
        }

        switch (jawaban.toLowerCase()) {
            case "ya" -> System.out.println("Senang mendengarnya!");
            case "tidak" -> System.out.println("Terima kasih sudah jujur.");
            case "mungkin" -> System.out.println("Aku berharap itu menjadi 'ya' nanti.");
            default -> System.out.println("Jawaban tidak valid.");
        }
        
        // 3. Loop For (mengulangi pertanyaan)
        System.out.println("Berapa kali kamu ingin aku bertanya?");
        int jumlahPertanyaan = scanner.nextInt(); // tipe data integer
        scanner.nextLine(); // untuk menangkap newline setelah input int

        for (int i = 1; i <= jumlahPertanyaan; i++) {
            System.out.println("Apakah kamu suka aku? (ya/tidak/mungkin)");
            jawaban = scanner.nextLine();

            if (jawaban.equalsIgnoreCase("ya")) {
                System.out.println("Kamu jawab 'ya' di pertanyaan ke-" + i);
            } else {
                System.out.println("Jawabanmu di pertanyaan ke-" + i + " adalah: " + jawaban);
            }
        }

        // 3. Loop While (mengulangi hingga jawaban 'ya')
        System.out.println("Aku akan terus bertanya sampai kamu menjawab 'ya'.");
        while (!jawaban.equalsIgnoreCase("ya")) {
            System.out.println("Apakah kamu suka aku? (ya/tidak/mungkin)");
            jawaban = scanner.nextLine();
        }

        System.out.println("Akhirnya kamu menjawab 'ya'!");

        // 3. Loop Do-While (mengulangi minimal sekali)
        int hitungan = 1;
        do {
            System.out.println("Apakah kamu suka aku? (ya/tidak/mungkin)");
            jawaban = scanner.nextLine();
            System.out.println("Jawaban ke-" + hitungan + ": " + jawaban);
            hitungan++;
        } while (!jawaban.equalsIgnoreCase("ya"));

        System.out.println("Program selesai. Terima kasih!");
        scanner.close();
    }
    
}