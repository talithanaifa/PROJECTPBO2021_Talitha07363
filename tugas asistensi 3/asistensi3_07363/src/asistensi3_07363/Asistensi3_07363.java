package asistensi3_07363;

import controller_07363.adminController_07363;
import controller_07363.pembeliController_07363;
import controller_07363.transaksiController_07363;
import entity_07363.pembeliEntity_07363;
import entity_07363.produkEntity_07363;
import entity_07363.transaksiEntity_07363;
import java.util.Scanner;

public class Asistensi3_07363 {
    private static Scanner scan = new Scanner(System.in);
    public static adminController_07363 admin= new adminController_07363();
    public static pembeliController_07363 pembeli= new pembeliController_07363();
    public static transaksiController_07363 transaksi= new transaksiController_07363();
    public static void main(String[] args) 
    {
        int pil;
        do{
            System.out.println("""
                               1. Beli
                               2. Show Data
                               3. Hapus Data
                               4. Exit
                               """);
            System.out.print("Masukan Pilihan:");
            pil=scan.nextInt();
            switch (pil){
                case 1 :
                    scan.nextLine();
                    System.out.print("Nama        = ");
                    String nama = scan.nextLine();
                    System.out.print("NoTelp      = ");
                    String noTelp = scan.nextLine();
                    System.out.print("ID Game     = ");
                    String IDGame = scan.nextLine();
                    System.out.print("nama Akun   = ");
                    String namaAkun = scan.nextLine();
                    pembeli.insertData(nama, noTelp, IDGame, namaAkun);
                    System.out.print("nominal     = ");
                    String nominal = scan.nextLine();
                    System.out.print("produk      = ");
                    String produk = scan.nextLine();
                    System.out.print("harga       = ");
                    String harga = scan.nextLine();
                    transaksi.insertProduk(nominal, produk, harga);
                    int idPembeli = pembeli.getId(nama);
                    int idProduk = transaksi.getId(produk);
                    transaksi.insertData(idPembeli , idProduk);
                    break;
                    
                case 2:
                    showData_07363();
                    break;    
                    
                case 3:
                    System.out.println("masukkan id pembeli : ");
                    int id_Pembeli = scan.nextInt();
                    System.out.println("masukkan id Produk : ");
                    int id_Produk = scan.nextInt();
                    System.out.println("masukkan nomor transaksi : ");
                    int nomorrtrx = scan.nextInt();
                    transaksi.deletePembeli(id_Pembeli);
                    transaksi.deleteProduk(id_Produk);
                    transaksi.deleteTransaksi(nomorrtrx);
                    break;
                    
            }
        }while (pil<4);
       
    }
    
    static void showData_07363()
    {
        System.out.println("===============================================");
        System.out.println("                DATA TRANSAKSI");
        System.out.println("===============================================");
        for(transaksiEntity_07363 transaksiEntity : transaksi.getDataTransaksi()){
            System.out.println("id              = " + transaksiEntity.getPembeli().getId());
            System.out.println("nama            = " + transaksiEntity.getPembeli().getNama_tasya());
            System.out.println("noTelp          = " + transaksiEntity.getPembeli().getNotelp_tasya());
            System.out.println("id game         = " + transaksiEntity.getPembeli().getIDgame_tasya());
            System.out.println("nama akun       = " + transaksiEntity.getPembeli().getNamaAkun_tasya());
            System.out.println("id produk       = " + transaksiEntity.getProduk().getId());
            System.out.println("nominal         = " + transaksiEntity.getProduk().getNominal_tasya());
            System.out.println("nama produk     = " + transaksiEntity.getProduk().getNamaProduk_tasya());
            System.out.println("harga           = " + transaksiEntity.getProduk().getHarga_tasya());
            System.out.println("nomor transaksi = " + transaksiEntity.getNomortrx_tasya());
            if(transaksiEntity.getStatustrx_tasya()==true){
                System.out.println("transaksi       = Berhasil");
            }else{
                System.out.println("transaksi       = Belum Terbayar");
            }
            System.out.println("===============================================");
        }
    }
}
