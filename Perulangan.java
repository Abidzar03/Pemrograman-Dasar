/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.konsepdasarstrukturkontrol;

/**
 *
 * @author HYPE AMD
 */
public class Perulangan {
    //perulangan for
    public static void main(String[] args) {    
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
    //perulangan while
    int j = 1;
        while (j <= 10) {
        System.out.println(j);
        if(j==15){
        break;
        }
        j++;
        }
    //Perulangan  do-while
    int angka;
    
    do {
        System.out.println("Program dijalankan");
        angka = 0;
        } while (angka != 0);
        }
    }
}