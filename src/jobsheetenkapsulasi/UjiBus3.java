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
public class UjiBus3 {
    public static void main (String [] abc){
        UjiBus3 bus = new UjiBus3(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang (2);//tambah 2 penumpang
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang (1);//tambah 1 penumpang
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang (2);//tambah 2 penumpang
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang (2);//tambah 2 penumpang
        Bus.cetakpenumpang();
    }

    private UjiBus3(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
