/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan41.massajenis;

/**
 *
 * @author 
 * NAMA     : Ari Sulistio
 * KELAS    : IF-1
 * NIM      : 10118030
 * Deskirpsi program : program ini berisi tentang perhitungan massa jenis kubus
 */
public class IF110118030Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("======Masa Jenis Kubus======");    
  
    Kubus kubus = new Kubus();
    kubus.setSisi(5);
    kubus.setMassa(250);
    System.out.println("Sisi : "+kubus.getSisi());
    System.out.println("Massa : "+kubus.getMassa());
        System.out.println("");
        System.out.println("=====Hasil Perhitungan======");
    
    System.out.println("Volume : "+kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : "
                +kubus.hitungMassaJenis
        (kubus.getMassa(),kubus.hitungVolume(kubus.getSisi())));
 }
    
}