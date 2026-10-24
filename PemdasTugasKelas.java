/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.Matriks;

/**
 *
 * @author HYPE AMD
 */
import java.util.Scanner;
public class PemdasTugasKelas {
    static Scanner scanner = new Scanner(System.in);
    static String[] Prodi = {"Sistem Informasi", "Teknik Lingkungan", "Matematika"};
    static String[] Kelas = {"A", "B", "C"};

    public static void main(String[] args) {
        System.out.println("(DATA MAHASISWA)");
            int[] ukuran = inputUkuranArray();
            String[][][] dataMahasiswa = new String[ukuran[0]][ukuran[1]][ukuran[2]];
        System.out.println("\n(INPUT DATA MAHASISWA)");
            inputData(dataMahasiswa);
        System.out.println("\n(HASIL DATA MAHASISWA)");
            tampilkanData(dataMahasiswa);
    }

    static int[] inputUkuranArray() {
        System.out.print("Masukkan jumlah Program Studi (Maks 3) : ");
            int prodi = scanner.nextInt();        
        System.out.print("Masukkan jumlah Kelas per Prodi (Maks 3) : ");
            int kelas = scanner.nextInt();
        System.out.print("Masukkan jumlah Mahasiswa per Kelas       : ");
            int mhs = scanner.nextInt();
        scanner.nextLine(); 
        return new int[]{prodi, kelas, mhs};
    }

    static void inputData(String[][][] data) {
        for (int i = 0; i < data.length; i++) {
            String namaProdi = (i < Prodi.length) ? Prodi[i] : "Prodi Ke-" + (i + 1);
            System.out.println("\n[ Program Studi : " + namaProdi + " ]");
            for (int j = 0; j < data[i].length; j++) {
                String namaKelas = (j < Kelas.length) ? Kelas[j] : "Kelas " + (char)('A' + j);
                System.out.println("  --- Kelas " + namaKelas + " ---");
                for (int k = 0; k < data[i][j].length; k++) {
                    System.out.print("  Masukkan nama mahasiswa ke-" + (k + 1) + ": ");
                    data[i][j][k] = scanner.nextLine();
                }
            }
        }
    }

    static void tampilkanData(String[][][] data) {
        for (int i = 0; i < data.length; i++) {
            String namaProdi = (i < Prodi.length) ? Prodi[i] : "Prodi Ke-" + (i + 1);
            for (int j = 0; j < data[i].length; j++) {
                String namaKelas = (j < Kelas.length) ? Kelas[j] : "Kelas " + (char)('A' + j);
                for (int k = 0; k < data[i][j].length; k++) {
                    String namaAsli = data[i][j][k];
                    String namaKapital = namaAsli.toUpperCase();
                    System.out.println("Prodi: " + namaProdi + " | Kelas: " + namaKelas + " | Nama: " + namaAsli );
                    System.out.println("   - Format Kapital : " + namaKapital);
                }
            }
        }
    }
}    