package Praktikum.Sesi11.LatihanSoal1;

public class OperasiPerkalian extends OperasiBilangan {
    @Override
    protected void set_C() {
        this.c = this.a * this.b;
    }
}