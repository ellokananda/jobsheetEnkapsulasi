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
public class Bola {
     private double jarijari;
    public void setJarijari(double newJarijari) 
    {
        jarijari = newJarijari;
    }
    public double getJarijari()
    {
        return jarijari;
    }
    public void showDiameter()
    {
        double diameter = 2*jarijari;
        System.out.println("Diameter :"+ diameter);
    }
    public void showLuasPermukaan()
    {
        double LuasPermukaan = 4*Math.PI*Math.pow(jarijari, 2);
        System.out.println("LuasPermukaan : "+ LuasPermukaan);
    }
    public void showVolume()
    {
        double volume = 4/3*Math.PI*Math.pow(jarijari, 3);
        System.out.println("Volume :"+ volume);
    }
    
    
}
