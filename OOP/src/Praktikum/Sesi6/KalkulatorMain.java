package Praktikum.Sesi6;

class Kalkulator {
    // Atribut (operan1 dan operan2)
    public double operan1;
    public double operan2;

    // Metode untuk mengisi operan1
    public void isiOperan1(double x) {
        this.operan1 = x;
    }

    // Metode untuk mengisi operan2
    public void isiOperan2(double x) {
        this.operan2 = x;
    }

    // Metode untuk menambah operan1 dan operan2
    public double tambah() {
        return operan1 + operan2;
    }

    // Metode untuk mengurangi operan1 dari operan2
    public double kurang() {
        return operan1 - operan2;
    }

    // Metode untuk mengalikan operan1 dan operan2
    public double kali() {
        return operan1 * operan2;
    }

    // Metode untuk membagi operan1 dengan operan2
    public double bagi() {
        if (operan2 != 0) {
            return operan1 / operan2;
        } else {
            System.out.println("Error: Pembagian dengan nol");
            return Double.NaN; // Mengembalikan NaN (Not a Number) untuk pembagian dengan nol
        }
    }

    // Metode untuk menghitung perpangkatan operan1 dengan operan2
    public double pangkat() {
        return Math.pow(operan1, operan2);
    }
}

public class KalkulatorMain {
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();

        // Mengisi nilai
        calc.isiOperan1(10.0);
        calc.isiOperan2(4.0);

        // Menampilkan hasil operasi
        System.out.println("Operan1 + Operan2 = " + calc.tambah());
        System.out.println("Operan1 - Operan2 = " + calc.kurang());
        System.out.println("Operan1 * Operan2 = " + calc.kali());
        System.out.println("Operan1 / Operan2 = " + calc.bagi());
        System.out.println("Operan1 ^ Operan2 = " + calc.pangkat());
    }
}