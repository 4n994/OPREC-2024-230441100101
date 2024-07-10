package WargaLab2024;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erlangga Satrya H
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sewa = new Scanner(System.in);
        
        boolean runProgram = true;
        while(runProgram){
            System.out.println("===================");
            System.out.println("    Sewa Kamar");
            System.out.println("===================");
            System.out.println("Pilih Tipe Kamar Yang Anda Inginkan! ");
            System.out.println("1. Reguler (Kapasitas : 1 Orang)");
            System.out.println("   Harga : Rp. 100.000");
            System.out.println("2. Double Reguler (Kapasitas : 2 Orang)");
            System.out.println("Harga : Rp. 200.000");
            System.out.println("3. Premium (Kapasitas : 2 Orang)");
            System.out.println("Harga : Rp. 250.000");
            System.out.println("4. Deluxe (Kapasitas : 2 Orang)");
            System.out.println("Harga : Rp. 350.000");
            System.out.println("5. Super Premium (Kapasitas : 2 Orang)");
            System.out.println("Harga : Rp.500.000");
            System.out.println("");
            
            int pilihan = sewa.nextInt();
            sewa.nextLine();
            
            switch(pilihan){
            case 1:
                System.out.println("Masukkan Nama Anda : ");
                String nama1 = sewa.nextLine();
                System.out.println("Masukkan Umur Anda : ");
                int umur1 = sewa.nexInt();
                sewa.nextLine();
                System.out.println("Sewa Berapa Lama (Hari) : ");
                int lama1 = sewa.nextInt();
                System.out.println("=============================");
                System.out.println("");
                System.out.println("=============================");
                
                Reguler sewaKamar = new Reguler(nama1,umur1,lama1);
                
            case 2:
                System.out.println("Masukkan Nama Anda : ");
                String nama2 = sewa.nextLine();
                System.out.println("Masukkan Umur Anda : ");
                int umur2 = sewa.nexInt();
                sewa.nextLine();
                System.out.println("Sewa Berapa Lama (Hari) : ");
                int lama2 = sewa.nextInt();
                sewa.nextLine();
                System.out.println("=============================");
                System.out.println("");
                System.out.println("=============================");
                
                DoubleReguler sewaKamar = new DoubleReguler(nama2,umur2,lama2);
                
            case 3:
                System.out.println("Masukkan Nama Anda : ");
                String nama3 = sewa.nextLine();
                System.out.println("Masukkan Umur Anda : ");
                int umur3 = sewa.nexInt();
                sewa.nextLine();
                System.out.println("Sewa Berapa Lama (Hari) : ");
                int lama3 = sewa.nextInt();
                sewa.nextLine();
                System.out.println("=============================");
                System.out.println("");
                System.out.println("=============================");
                
                Premium sewaKamar = new Premium(nama3,umur3,lama3);
                
            case 4: 
                System.out.println("Masukkan Nama Anda : ");
                String nama4 = sewa.nextLine();
                System.out.println("Masukkan Umur Anda : ");
                int umur4 = sewa.nexInt();
                sewa.nextLine();
                System.out.println("Sewa Berapa Lama (Hari) : ");
                int lama4 = sewa.nextInt();
                sewa.nextLine();
                System.out.println("=============================");
                System.out.println("");
                System.out.println("=============================");
                
                Deluxe sewaKamar = new Deluxe(nama4,umur4,lama4);
                
            case 5:
                System.out.println("Masukkan Nama Anda : ");
                String nama5 = sewa.nextLine();
                System.out.println("Masukkan Umur Anda : ");
                int umur5 = sewa.nexInt();
                sewa.nextLine();
                System.out.println("Sewa Berapa Lama (Hari) : ");
                int lama5 = sewa.nextInt();
                sewa.nextLine();
                System.out.println("=============================");
                System.out.println("");
                System.out.println("=============================");
                
                SuperPremium sewaKamar = new SuperPremium(nama5,umur5,lama5);
                
            default:
                System.out.println("Masukkan ");
//                return runProgram = false;
////                System.out.println(""Pilihan Tidak Valid);
        }
            
            if(RunProgram){
                System.out.println("ingin menambah lagi");
                String tambah = sewa.nextLine();
                if(!tambah.equalsIgnoreCase("y")){
                    runProgram = false;
                }
            }
            
            
        }
    }
}
