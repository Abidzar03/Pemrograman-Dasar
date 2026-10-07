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

public class Faktoriall {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, faktorial;
        String teks;

        faktorial = 1;
        System.out.println("Masukkan angka:");
        n = input.nextInt();
        teks = Integer.toString(n) + "! = ";
        for (i = n; i >= 1; i--) {
            faktorial = faktorial * i;
            if (i == 1) {
                teks = teks + i;
            } else {
                teks = teks + i + "x";
            }
        }
        System.out.println(teks);
        System.out.println(Integer.toString(n) + "! = " + faktorial);
    }
}
