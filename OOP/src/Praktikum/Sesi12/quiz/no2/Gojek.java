package Praktikum.Sesi12.quiz.no2;


class Gojek implements Transportasi {
    protected int harga;
    protected int id;

    @Override
    public void tampil() {
        System.out.println("Harga: " + harga);
        System.out.println("ID: " + id);
    }

    @Override
    public void setData(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
}
