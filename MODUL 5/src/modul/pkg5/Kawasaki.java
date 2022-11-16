/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg5;

/**
 *
 * @author usert
 */
public class Kawasaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    SepedaMotor mtr = new SepedaMotor();
        mtr.inputMerk("Kawasaki");
        mtr.inputTipe("H2 - 950cc");
        mtr.inputTangki(10);
        mtr.inputHarga(20000000);
        System.out.println("Rincian Motor : ");
        System.out.println("Merk : "+ mtr.tampilMerk());
        System.out.println("Tipe : "+ mtr.tampilTipe());
        System.out.println("Tangki : "+ mtr.tampilTangki());
        System.out.println("Harga : "+ mtr.tampilHarga());
    }
}
    
    
