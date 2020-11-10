public class Emas {
    private double berat;
    private int harga;

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int totalBayar() {
        return (int) (harga * berat);
    }
}
