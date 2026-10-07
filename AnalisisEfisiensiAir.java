/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.analisisefisiensiair;

/**
 *
 * @author HYPE AMD
 */
import java.util.*;
import java.lang.Math;

public class AnalisisEfisiensiAir {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double kebutuhanSebelum, persenPenghematan, jumlahPenghematan, kebutuhanSesudah;

        kebutuhanSebelum = input.nextDouble();
        persenPenghematan = 0.15;
        jumlahPenghematan = kebutuhanSebelum * 0.15;
        kebutuhanSesudah = kebutuhanSebelum - jumlahPenghematan;
        System.out.println("kebutuhanSebelum: " + kebutuhanSebelum + " liter");
        System.out.println("jumlahPenghematan: " + jumlahPenghematan + " liter");
        System.out.println("kebutuhanSesudah: " + kebutuhanSesudah + " liter");
    }
}
