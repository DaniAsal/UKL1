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
public class Client implements User{

    private ArrayList<String> nama = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client() {
        addClient("Nanaka","Jl.Kurang Maju","084627461281");
        addClient("Nanaki","JL.Kurang Mundur","0812345698910");
        
    }

    /* Method addClient */
    public void addClient(String nama, String alamat, String telepon){
        setNama(nama);
        setAlamat(alamat);
        setTelepon(telepon);
    }

    public void setNama (String nama){
        this.nama.add(nama);
    }
    public void setAlamat (String alamat){
        this.alamat.add(alamat);
    }
    public void setTelepon (String telepon){
        this.telepon.add(telepon);
    }

    public String getNama(int idClient){
        return this.nama.get(idClient);
    }
    public String getAlamat (int idClient){
        return this.alamat.get(idClient);
    }
    public String getTelepon (int idClient){
        return this.telepon.get(idClient);
    }
    public int getClient(){
        return this.nama.size();
    }

    public int getSaldo(){
        return this.saldo.size();
    }
}
