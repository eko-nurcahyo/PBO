package Praktikum.Sesi12.quiz.no2;

class Bayar extends Gojek {
    private int jarak;
    private int total;
    private String nama;

    public Bayar(String nama, int jarak, int harga) {
        this.nama = nama;
        this.jarak = jarak;
        this.harga = harga;
        this.total = jarak * harga;  // Calculate total cost based on distance
    }

    public void bayar() {
        System.out.println("Pembayaran oleh: " + nama);
        System.out.println("Total biaya: " + total);
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Nama: " + nama);
        System.out.println("Jarak: " + jarak);
        System.out.println("Total: " + total);
    }

    @Override
    public void setData(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }
}

