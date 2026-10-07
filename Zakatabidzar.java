/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zakatabidzar;

/**
 *
 * @author HYPE AMD
 */

import java.util.*;
import java.lang.Math;
public class Zakatabidzar {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double harta, nisab, zakat;

        System.out.println("masukkan total harta");
        harta = input.nextDouble();
        System.out.println("masukkan nilai nisab: ");
        nisab = input.nextDouble();
        if (harta >= nisab) {
            zakat = harta * 0.025;
            System.out.println("zakat yang harus dibayar: " + zakat);
        } else {
            System.out.println("harta belum mencapai nisab.");
        }
    }
}

