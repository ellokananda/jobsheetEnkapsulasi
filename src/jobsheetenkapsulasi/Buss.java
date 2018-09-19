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
public class Buss {
    private int penumpang;
    private int maxPenumpang;
    
    //konstruktor kelas Bus
    public Buss (int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        penumpang = 5;
        
    }
    //method mutator untuk menambahkan penumpang
    public void addPenumpang (int penumpang){
        int temp ;
        temp = this.penumpang+penumpang;
        if (temp >= maxPenumpang){
            System.out.println("penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
            
        }
    }
}
