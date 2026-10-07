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

public class Bilangan {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;

        System.out.println("Masukkan angka:");
        n = input.nextInt();
        System.out.println("Bilangan 1 sampai " + n + ":");
        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("Bilangan genap:");
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Bilangan ganjil:");
        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
