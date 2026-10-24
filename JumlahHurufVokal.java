/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.Matriks;

/**
 *
 * @author HYPE AMD
 */
public class JumlahHurufVokal {
    public static void main(String[] args){
        String kalimat = "testing";
        int vokal = 0;
        
        for (int i = 0; i < kalimat.length(); i++) {
            char c = Character.toLowerCase(kalimat.charAt(i));
            if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o'){
                vokal++;
            }
        }
        System.out.println("Jumlah vokal: " + vokal);
    }
    
}
