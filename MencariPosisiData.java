/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

/**
 *
 * @author HYPE AMD
 */
import java.util.Scanner;

public class MencariPosisiData {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int[] nilai = {80, 75, 90, 85, 70};

    int cari = 90;
    int posisi = -1;

    for (int i = 0; i < nilai.length; i++) {
        if (nilai[i] == cari) {
            posisi = i;
            break;
        }
    }

    if (posisi != -1) {
        System.out.println("Data ditemukan pada indeks " + posisi);
    } else {
        System.out.println("Data tidak ditemukan");
    }
}
}