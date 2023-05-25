/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ukl3;

import java.util.Scanner;

/**
 *
 * @author ZBook
 */
public class Ukl3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){

        Transaksi transaksi = new Transaksi();
        JenisLaundry jenis = new JenisLaundry();
        Client client = new Client();
        Tampilan tampilan = new Tampilan();
        Petugas petugas = new Petugas();
            
            
            System.out.println("========== SELAMAT DATANG ==========");
            Scanner input = new Scanner(System.in);
            System.out.println("1. Pelanggan");
            System.out.println("2. Exit");
            System.out.print("Masuk sebagai : ");
            int pil = input.nextInt();         

                if (pil == 1) {                    
                    tampilan.laporan(jenis);
                    transaksi.InfoClient();
                    transaksi.InfoClient(client, jenis);
                    tampilan.laporan(petugas);
                    
                }          
                else if (pil == 2) {
                    System.out.println("SELESAI");        
                } 
                else{
                    System.out.println("ERROR");
                }           
        }
    }


    

