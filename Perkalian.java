/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konsepdasarstrukturkontrol;

/**
 *
 * @author HYPE AMD
 */
import java.util.*;
import java.lang.Math;

public class Perkalian {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int angka, i, hasil;

        System.out.println("Masukkan angka:");
        angka = input.nextInt();
        for (i = 1; i <= 10; i++) {
            hasil = angka * i;
            System.out.println(Integer.toString(angka) + " x " + i + " = " + hasil);
        }
    }
}
