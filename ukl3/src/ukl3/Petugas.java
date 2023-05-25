/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukl3;

import java.util.ArrayList;

/**
 *
 * @author ZBook
 */
public class Petugas implements User{
    
    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Petugas (){
        this.nama.add("Ibana");
        this.alamat.add("Jl.Madasa");
        this.telepon.add("084718891022");
        this.jabatan.add(0);
    }

    public void setNama(String nama) {
        this.nama.add(nama);
    }
    public void setAlamat(String adrress) {
        this.alamat.add(adrress);
    }
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    public String getNama(int idpetugas) {
        return this.nama.get(idpetugas);}
    public String getAlamat(int idpetugas) {
        return this.alamat.get(idpetugas);
    }
    public String getTelepon(int idpetugas) {
        return this.telepon.get(idpetugas);
    }
    public int getPetugas(){
        return this.nama.size();
    }

}
