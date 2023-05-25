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
public class JenisLaundry extends Petugas{
    private ArrayList<String> Jenislaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasi = new ArrayList<Integer>();
    Scanner input = new Scanner(System.in);

    public JenisLaundry() {
        addJenis("Cuci",1500,25);
        addJenis("Cuci & Setrika",3000, 40);
    }

    public void addJenis(String Jenislaundry, int harga, int durasi){
        setjenis(Jenislaundry);
        setharga(harga);
        setdurasi(durasi);
    }

    public void Nota(){
        System.out.print("Jenis Laundry : ");
        String Laundry = input.nextLine();
        Jenislaundry.add(Laundry);
        System.out.print("Harga Laundry : ");
        int Harga = input.nextInt();
        harga.add(Harga);
        System.out.print("Durasi Laundry : ");
        int Durasi = input.nextInt();
        durasi.add(Durasi);
    }

    public void setjenis (String Jenislaundry){
        this.Jenislaundry.add(Jenislaundry);
    }
    public void setharga (int harga){
        this.harga.add(harga);
    }
    public void setdurasi (int durasi){
        this.durasi.add(durasi);
    }

    public String getjenis(int idJenis){
        return this.Jenislaundry.get(idJenis);
    }
    public int getharga (int idJenis){
        return this.harga.get(idJenis);
    }
    public int getdurasi (int idJenis){
        return this.durasi.get(idJenis);
    }
    public int getjenis(){
        return this.Jenislaundry.size();
    }
}
