/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan41.massajenis;

/**
 *
 * @author
 * NAMA         : Dedi Cahya
 * NIM          : 10118901
 * Kelas        : PBO11K
 * Deskripsi Program : Mencari nilai massa jenis sebuah kubus dengan konsep orientasi objek
 */
public class PBO11K10118901Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus k = new Kubus();
        k.setSisi(5);
        k.setMassa(250);
        
        System.out.println("====== Massa Jenis Kubus ======");
        System.out.println("Sisi        : "+ k.getSisi());
        System.out.println("Massa       : "+ k.getMassa());
        System.out.println("");
        System.out.println("====== Hasil Perhitungan ======");
        System.out.println("Volume      : "+ k.hitungVolume());
        System.out.println("Massa Jenis : "+ k.hitungMassajenis(k.getMassa(),k.hitungVolume()));
    }
    
}
