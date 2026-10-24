/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.Metho;

import java.util.Scanner;

/**
 *
 * @author HYPE AMD
 *
 *Tugas pengembangan (dikumpulkan di GC):
 *1. Tambahkan menu sisa bagi (%) dan pangkat (gunakan Math.pow di dalam method sendiri).
 *2. Tambahkan method tampilkanHasil(String operasi, double a, double b, double hasil) agar keluaran berbentuk 5.0 + 3.0 = 8.0.
 *3.Tambahkan perulangan agar program meminta ulang jika pilihan menu di luar 0 sampai 6.
 */
import java.util.Scanner;
public class TugasKalkulatorModular {
    // ===MODUL PROSES===
    static double tambah(double a, double b) { return a + b; }
    static double kurang(double a, double b) { return a - b; }
    static double kali(double a, double b) { return a * b; }
    static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Eror: pembagi dengan nol.");
            return Double.NaN;  //Nan = bukan angka
        }
        return a/b;
    }    
    // Method sisa bagi (%)
    static double modulus(double a, double b) {
        if (b == 0) {
            System.out.println("Error: sisa bagi dengan nol.");
            return Double.NaN;
        }
        return a % b;
    }
     // Method pangkat menggunakan Math.pow()
    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    static double hitung(int pilihan, double a, double b) {
        switch (pilihan) {
            case 1: return tambah(a,b);
            case 2: return kurang(a,b);
            case 3: return kali(a,b);
            case 4: return bagi(a,b);
            default: return 0;
            case 5: return modulus(a, b);
            case 6: return pangkat(a, b);
        }
    }
    //  MODUL  INPUT
    static int bacaInt(Scanner input, String pesan) {
        System.out.print(pesan);
        return input.nextInt();
    }
    static double bacaDouble(Scanner input, String pesan) {
        System.out.print(pesan);
        return input.nextDouble();
    }
    //   MODUL TAMPILAN
    static void tampilkanMenu() {
        System.out.println(" Kalkulator Modular");
        System.out.println("1. tambah");
        System.out.println("2. kurang");
        System.out.println("3. kali");
        System.out.println("4. bagi");
        System.out.println("0. keluar");
        System.out.println("5. sisa bagi (%)");
         System.out.println("6. Pangkat (^)");
    }
    // Menampilkan operasi dan hasil perhitungan
    static void tampilkanHasil(
            String operasi, double a, double b, double hasil) {
        System.out.println(a + " " + operasi + " " + b
                + " = " + hasil);
    }
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu();
             // Meminta ulang jika pilihan bukan 0 sampai 6
            do {
                pilihan = bacaInt(input, "Pilih menu (0-6): ");

                if (pilihan < 0 || pilihan > 6) {
                    System.out.println(
                            "Menu tidak valid! Pilih angka 0 sampai 6.");
                }
            } while (pilihan < 0 || pilihan > 6);

            if (pilihan >= 1 && pilihan <= 6) {
                double a = bacaDouble(input, "Angka pertama: ");
                double b = bacaDouble(input, "Angka kedua  : ");
                double hasil = hitung(pilihan, a, b);
                if (!Double.isNaN(hasil)) {
                    System.out.println("Hasil: " + hasil);{
                        String operasi;

                    switch (pilihan) {
                        case 1: operasi = "+";
                            break;
                        case 2: operasi = "-";
                            break;
                        case 3: operasi = "*";
                            break;
                        case 4: operasi = "/";
                            break;
                        case 5: operasi = "%";
                            break;
                        case 6: operasi = "^";
                            break;
                        default: operasi = "?";
                    }
                      tampilkanHasil(operasi, a, b, hasil);
                    }
                }
            }
            System.out.println();
        } while (pilihan != 0);

        System.out.println("Terima kasih.");
        input.close();
    }
}