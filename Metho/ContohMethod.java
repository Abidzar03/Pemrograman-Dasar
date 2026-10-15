/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.Metho;

/**
 *
 * @author HYPE AMD
 */
public class ContohMethod {
    static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        double luas = luasPersegiPanjang(5, 3);
        System.out.println("Luas persegi pnjang: " + luas);   // Luas: 15.0
    }
}

