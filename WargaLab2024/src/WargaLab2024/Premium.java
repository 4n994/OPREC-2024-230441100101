/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WargaLab2024;

/**
 *
 * @author Erlangga Satrya H
 */
public class Premium extends penyewaanKamar{
    
    String jenisKamar;
    
    
    Premium(String nama,int umur,int sewaKamar){
        super(nama,umur,sewaKamar);
    } 
    
    public void cetak(){
        System.out.println("==============");
        System.out.println("Jenis Kamar : " + jenisKamar);
        System.out.println("Nama Tamu :" + tamu);
        System.out.println("Lama Menginap :");
        System.out.println("Total harga sebelum diskon : ");
        System.out.println("Diskon :");
        System.out.println("Total harga setelah diskon :");
        System.out.println("==============");
        
}
}
}
