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

public class MaksimumMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
            int[] nilai = {80, 75, 90, 85, 70};
            
            int max = nilai[0];
            int min = nilai[0];
            
            for (int i = 1; i < nilai.length; i++) {
                if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        System.out.println("Nilai terbesar = " + max);
        System.out.println("Nilai terkecil = " + min);
        }
    }