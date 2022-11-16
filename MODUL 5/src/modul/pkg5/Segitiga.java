/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg5;
import javax.swing.*;
/**
 *
 * @author usert
 */
public class Segitiga {
    String alas ,tinggi;
    public void input(){
        alas = JOptionPane.showInputDialog("Masukan Alas");
        tinggi = JOptionPane.showInputDialog("Masukan Tinggi");
    }
    
    public double hitung(){
        Long a = Long.parseLong(alas);
        Long t = Long.parseLong(tinggi);
        return (0.5*a*t);
        
    }
    
    public void hasil(){
        JOptionPane.showMessageDialog(null,"0,5*"+alas+"="+hitung());
    }
    
    
}
