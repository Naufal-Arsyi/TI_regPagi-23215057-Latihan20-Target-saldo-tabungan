/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author Arsyi
 *
 * NAma  : Naufal Miftahul Arsyi
 * Kelas : Teknik Informatika
 * NIM   : 23215057
 * Deskripsi : program ini berfungsi untuk menampilkan Target saldo bunga perbulan
 */


import java.text.DecimalFormat;

public class TI_23215057_Latihan20{
    public static void main(String[] args) {
        double saldoAwal = 3500000; // Saldo awal
        double bunga = 8; // Bunga per bulan dalam persen
        double saldoTarget = 6000000; // Target saldo

        DecimalFormat df = new DecimalFormat("'Rp' #,##0");

        int bulan = 1;
        while (saldoAwal < saldoTarget) {
            saldoAwal += saldoAwal * (bunga / 100);
            System.out.println("Saldo di bulan ke-" + bulan + " = " + df.format(saldoAwal));
            bulan++;
        }
    }
}

