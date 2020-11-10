import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program menghitung biaya emas kawin
 * berbasis OOP
 */

public class Main {
    public static void main(String[] args) {
        Emas emas = new Emas();
        emas.setBerat(15.7);
        emas.setHarga(570000);

        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("id", "ID"));
        System.out.println("===Program Menghitung Harga Emas===");
        System.out.println("Berat Emas: " + emas.getBerat());
        System.out.println("Harga Emas per Gram: " + "Rp." + numberFormat.format(emas.getHarga()));
        System.out.println("Total Bayar: " + "Rp." + numberFormat.format(emas.totalBayar()));
    }
}
