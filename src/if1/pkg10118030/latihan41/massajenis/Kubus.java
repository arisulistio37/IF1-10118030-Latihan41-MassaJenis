/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118030.latihan41.massajenis;

/**
 *
 * @author Ari Sulistio
 */
public class Kubus {

private int sisi;
private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int hitungVolume(int parSisi){
    int volume = sisi*sisi*sisi;
    return volume;    
    }
    public int hitungMassaJenis(int parMassa, int volume ){
    
    return massa/volume;    
    }
}