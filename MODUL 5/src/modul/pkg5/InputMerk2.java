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
public class InputMerk2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String input;
        input = JOptionPane.showInputDialog("Masukan Harga :");
        long harga = Integer.valueOf(input).intValue();
        JOptionPane.showMessageDialog(null, harga);
    
}
}
