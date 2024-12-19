package Praktikum.quiz.no1;

class Dekan extends Dosen {
    private String fakultas;

    public Dekan(String nik, String nama, String fakultas) {
        super(nik, nama);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void viewDekan() {
        super.view();
        System.out.println("Fakultas: " + fakultas);
    }
}