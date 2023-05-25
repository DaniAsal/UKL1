/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukl3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ZBook
 */
public class Transaksi extends Client {

    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    private ArrayList<Integer> idJenislaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();

   
    int pembayaran = 0;
    int hasil = 0;
    int saldo = getSaldo();

    Scanner input = new Scanner(System.in);
    private boolean JenisLaundry;

    public void InfoClient() {
        System.out.print("Info Client   : ");
        int ID = input.nextInt();
        System.out.print("Jenis Laundry : ");
        int jenislaundry = input.nextInt();
        System.out.print("Jumlah Laundry : ");
        int jumlahLaundry = input.nextInt();
        System.out.print("Saldo anda    : ");
        saldo = input.nextInt();
        this.idClient.add(ID);
        this.idJenislaundry.add(jenislaundry);
        this.banyak.add(jumlahLaundry);
    }

    public void InfoClient(Client c1, JenisLaundry jenis) {
        System.out.println(" ======================= NGINFO ====================");
        System.out.println("Atas nama : "+ c1.getNama(0)+"\t\tDi Alamat : "+c1.getAlamat(0)+" "
                +"\nNomor Telepon : "+ c1.getTelepon(0)+"\tJumlah Saldo : "+ saldo);
        System.out.println( );
        pembayaran = jenis.getharga(0);
        hasil = saldo - pembayaran;
        
        if (hasil < 0) {
            System.out.println("Uang anda tidak cukup");
        }
         else if (hasil > 0) {
              System.out.println("Pembayaran berhasil, Saldo anda menjadi : "+hasil);               
         } 
        
        System.out.println("====================================================");
  }
}
