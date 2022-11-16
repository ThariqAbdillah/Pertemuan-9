/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg5;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author usert
 */
public class latihan4beraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    latihan4 brg = new latihan4();
        brg.input(JOptionPane.showInputDialog("Kode Barang"),
                JOptionPane.showInputDialog("Nama Barang"),
                parseInt(JOptionPane.showInputDialog("HPP")),
                parseInt(JOptionPane.showInputDialog("Harga Jual")),
                parseInt(JOptionPane.showInputDialog("Stok")));
        brg.Pembelian(parseInt(JOptionPane.showInputDialog("Masukan Jumlah Beli")));
        
        brg.hitungLaba ();
        
    }
    
}
