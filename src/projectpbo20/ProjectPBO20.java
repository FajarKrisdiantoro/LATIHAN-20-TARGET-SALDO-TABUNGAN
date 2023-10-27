/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectpbo20;

/**
 *
 * @author LENOVO
 */
import java.text.NumberFormat;
import java.util.Locale;
public class ProjectPBO20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldoAwal = 3500000.0; // Saldo awal dalam Rupiah
        double bungaPerBulan = 8.0; // Bunga per bulan dalam persen
        double saldoTarget = 6000000.0; // Saldo target dalam Rupiah

        // Membuat objek untuk mengatur format Rupiah
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("Saldo Awal: " + formatRupiah.format(saldoAwal));
        System.out.println("Bunga per Bulan: " + bungaPerBulan + "%");
        System.out.println("Saldo Target: " + formatRupiah.format(saldoTarget));

        int bulan = 1;
        while (saldoAwal < saldoTarget && bulan <= 8) {
            double bunga = saldoAwal * (bungaPerBulan / 100);
            saldoAwal += bunga;
            System.out.println("Saldo Bulan ke-" + bulan + ": " + formatRupiah.format(saldoAwal));
            bulan++;
        }
    }
}