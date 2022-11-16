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
public class latihan3 {
    private String kodebarang, namabarang;
    private int HPP, stok, jumlahjual, stoksekarang, totalbayar, laba;
    private long hargajual;
    void inputKodeBarang (String kodebarang) {
        this.kodebarang = kodebarang;
    }
    void inputNamaBarang (String namabarang) {
        this.namabarang = namabarang;
    }
    void inputHPP(int HPP) {
        this.HPP = HPP;
    }
    void inputStok(int stok) {
        this.stok = stok;
    }
    void inputJumlahJual(int jumlahjual) {
        this.jumlahjual = jumlahjual;
    }
    void inputHargaJual(long hargajual) {
        this.hargajual = hargajual;
    }
    public String tampilKodeBarang(){
        return kodebarang;
    }
    public String tampilNamaBarang(){
        return namabarang;
    }
    public int tampilHPP(){
        return HPP;
    }
    public int tampilStok(){
        return stok;
    }
    public int tampilJumlahJual(){
        return jumlahjual;
    }
    public long tampilHargaJual(){
        return hargajual;
    }
    void inputStokSekarang(int stoksekarang){
        this.stoksekarang = stok - jumlahjual;
    }
    void inputTotalBayar(int totalbayar) {
        this.totalbayar = (int) (hargajual * jumlahjual);
    }
    void inputLaba(int laba) {
        this.laba = (int) ((this.jumlahjual * this.hargajual) - (this.HPP * this.jumlahjual));
    }
    public int tampilStokSekarang() {
        return stoksekarang;
    }
    public int tampilTotalBayar() {
        return totalbayar;
    }
    public int tampilLaba() {
        return laba;
    }
}
    

