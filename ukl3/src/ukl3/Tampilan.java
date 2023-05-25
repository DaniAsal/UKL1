/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukl3;

/**
 *
 * @author ZBook
 */
public class Tampilan {
    /* Method Tabel Client */
    public void laporan(Client c1){
        int va = c1.getClient();
        System.out.println("INGFO LAUNDRY");
        for(int i=0;i < va ;i++){
            System.out.println("Atas nama : "+c1.getNama(i)+"\nAlamat : " +c1.getAlamat(i)+"\nNomor : "+c1.getTelepon(i));
            System.out.println( );
        }
    }
    public void laporan(JenisLaundry jenis){
        int x =  jenis.getjenis();
        for(int i=0;i < x;i++){
            System.out.println( );
            System.out.println("Jenis Laundry : "+jenis.getjenis(i)+"\nHarganya : "+jenis.getharga(i)
                    +" \tBerapa lama : "+jenis.getdurasi(i));
            System.out.println( );
        }
    }
    public void laporan(Petugas p1){
        System.out.println("====================================================");
        System.out.print("\nPETUGAS : ");
            System.out.println(p1.getNama(0)+", "+p1.getAlamat(0)+", "+p1.getTelepon(0));
            System.out.println( );
    }
}