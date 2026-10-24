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

public class TugasKelas {

    // Menyimpan data mahasiswa dalam array 3 Dimensi
    static String[][][] dataMahasiswa = {
        {
            {"adit", "sopo", "jarwo", "Denis", "eca"},     
            {"Fajar", "Gita", "Hadi", "Indra", "Joko"},     
            {"Kiki", "Lia", "Mira", "Nina", "Oki"}          
        },
        {
            {"Putra", "Qori", "Rani", "Sari", "Tomi"},      
            {"Umar", "Vina", "Wira", "Xena", "Yudi"},       
            {"Zaki", "Ayu", "Bayu", "Caca", "Deni"}         
        },
        {
            {"Edo", "Fani", "Gilang", "Hana", "Iqbal"},     
            {"Jihan", "Kevin", "Luna", "Maman", "Nia"},     
            {"Oni", "Panji", "Qila", "Rizky", "Sifa"}
        }
    };

    // Label untuk Program Studi dan Kelas
    static String[] prodi = {"Sistem Informasi", "Teknik Lingkungan", "Teknik Sipil"};
    static String[] kelas = {"A", "B", "C"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        System.out.println("=== SISTEM INFORMASI ABSENSI MAHASISWA ===");
        tampilkanSemuaData(); // Memanggil method untuk menampilkan data awal

        // Looping untuk mencari data berkali-kali
        do {
            System.out.print("\nMasukkan nama mahasiswa yang ingin dicari (Absen): ");
            String namaCari = scanner.nextLine();

            cariMahasiswa(namaCari); // Memanggil method pencarian

            System.out.print("\nCari mahasiswa lain? (y/n): ");
            pilihan = scanner.nextLine();

        } while (pilihan.equalsIgnoreCase("y")); // Operasi string: mengabaikan huruf besar/kecil

        System.out.println("Terima kasih telah menggunakan sistem absensi.");
        scanner.close();
    }

    // Method 1: Untuk menampilkan seluruh data mahasiswa
    static void tampilkanSemuaData() {
        System.out.println("\n[ Daftar Seluruh Mahasiswa ]");
        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println("Program Studi: " + prodi[i]);
            for (int j = 0; j < dataMahasiswa[i].length; j++) {
                System.out.print("  Kelas " + kelas[j] + " : ");
                for (int k = 0; k < dataMahasiswa[i][j].length; k++) {
                    System.out.print(dataMahasiswa[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }

    // Method 2: Untuk mencari dan menampilkan hasil pencarian beserta operasi String
    static void cariMahasiswa(String targetNama) {
        boolean ditemukan = false;

        for (int i = 0; i < dataMahasiswa.length; i++) {
            for (int j = 0; j < dataMahasiswa[i].length; j++) {
                for (int k = 0; k < dataMahasiswa[i][j].length; k++) {
                    
                    // Operasi String 1: equalsIgnoreCase (Membandingkan tanpa mempedulikan huruf besar/kecil)
                    if (dataMahasiswa[i][j][k].equalsIgnoreCase(targetNama)) {
                        
                        // Operasi String 2: toUpperCase (Mengubah nama menjadi huruf kapital semua)
                        String namaKapital = dataMahasiswa[i][j][k].toUpperCase();
                        
                        // Operasi String 3: length (Menghitung jumlah huruf pada nama)
                        int jumlahHuruf = dataMahasiswa[i][j][k].length();

                        System.out.println("\n--- MAHASISWA DITEMUKAN ---");
                        System.out.println("Nama Asli     : " + dataMahasiswa[i][j][k]);
                        System.out.println("Nama Kapital  : " + namaKapital);
                        System.out.println("Jumlah Huruf  : " + jumlahHuruf + " Karakter");
                        System.out.println("Program Studi : " + prodi[i]);
                        System.out.println("Kelas         : " + kelas[j]);
                        
                        ditemukan = true;
                        break;
                    }
                }
            }
        }

        if (!ditemukan) {
            System.out.println("Maaf, mahasiswa dengan nama '" + targetNama + "' tidak ditemukan dalam sistem.");
        }
    }
}

