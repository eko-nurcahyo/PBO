package Praktikum.quiz.no1;

public class Main {
    public static void main(String[] args) {
        Rektor rektor = new Rektor("123456", "Dr. Eko", 2023);
        Dekan dekan = new Dekan("789101", "Dr. Eja", "Teknik");

        System.out.println("Data Rektor:");
        rektor.viewRektor();

        System.out.println("\nData Dekan:");
        dekan.viewDekan();
    }
}