/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg5;
import java.io.*;
/**
 *
 * @author usert
 */
public class InputMerk1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws I0Exception, I0Exception, IOException {
        // TODO code application logic here
    BufferedReader input = new BufferedReader (
                new InputStreamReader(System.in));
        String merk;
        System.out.print("Masukan Merk  : ");
        merk = input.readLine();
        System.out.println("Merk motor ini adalah " + merk);
    }
}
    

