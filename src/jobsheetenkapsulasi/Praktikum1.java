/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetenkapsulasi;

/**
 *
 * @author User
 */
public class Praktikum1 {
    public static void main (String [] args){
    public int penumpang ;
    public int maxpenumpang;
    public Praktikum1(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //method utator
    public void addpenumpang (int penumpang, int counter){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp> maxpenumpang)
        {
            System.out.println("penumpang melebihi kuota");
        }
        else
        {
            this.penumpang=temp;
            counter++;
        }
    }
    public void getpenumpang (int password){
        if (password==24){
            System.out.println("Password Benar");
        }
        else
        {
            System.out.println("Password salah");
        }
    }
    public double getAverage(int counter){
        return penumpang/counter;
    }
    }
    

