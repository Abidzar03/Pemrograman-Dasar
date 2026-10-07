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

public class PolaDinamis {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tinggi, i, j, k;

        System.out.println("Masukkan tinggi:");
        tinggi = input.nextInt();
        for (i = 1; i <= tinggi; i++) {
            for (j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
