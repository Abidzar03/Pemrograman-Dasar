/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.Matriks;

/**
 *
 * @author HYPE AMD
 */
public class StudiKasus1 {
    public static void main(String[] args){
        String[][][] dataMahasiswa ={
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
        
       System.out.println("=== DATA MAHASISWA ===");
        for (int prodi = 0; prodi < dataMahasiswa.length; prodi++) {
            System.out.println("Program Studi ke-" + (prodi + 1));
            
            for (int kelas = 0; kelas < dataMahasiswa[prodi].length; kelas++) {
                System.out.print("  Kelas " + (kelas + 1) + " : ");
                
                for (int mahasiswa = 0; mahasiswa < dataMahasiswa[prodi][kelas].length; mahasiswa++) {
                    System.out.print(dataMahasiswa[prodi][kelas][mahasiswa]);
                    if (mahasiswa < dataMahasiswa[prodi][kelas].length - 1) {
                        System.out.print(", "); 
                    }
                }
                System.out.println();
            }
        }
    }
}
