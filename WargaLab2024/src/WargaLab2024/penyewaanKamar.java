package WargaLab2024;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erlangga Satrya H
 */
public abstract class penyewaanKamar {
//    String tipeKamar;
//    int hargaKamar;
//    String namaPenyewa;
    String nama;
    int umur;
    int sewaKamar;
    
    penyewaanKamar(String nama,int umur,int sewaKamar){
        this.nama = nama;
        this.umur = umur;
        this.sewaKamar = sewaKamar;
        
        abstract void cetak();
        abstract void diskon();
        
    }
}
