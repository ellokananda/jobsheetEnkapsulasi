/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetenkapsulasi;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class test {
     public static void main(String[] args) {
        double jarijari;
        
        Scanner sc = new Scanner(System.in);
        
        Bola bl = new Bola();
        System.out.println("Hitung Luas Permukaan dan Volume Bola");
        bl.showDiameter();
        bl.showLuasPermukaan();
        bl.showVolume();
       
        System.out.println("Memasukkan jari jari :");
        jarijari = sc.nextDouble();
        
        bl.setJarijari(jarijari);
        
        System.out.println("Hasil Hitung Luas Permukaan dan Volume");
        bl.showDiameter();
        bl.showLuasPermukaan();
        bl.showVolume();
    }
    
}
