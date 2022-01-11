package controller_07363;

import entity_07363.pembeliEntity_07363;
import entity_07363.produkEntity_07363;
import entity_07363.transaksiEntity_07363;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class transaksiController_07363 {
    public void insertData(int pembeli, int produk){
        objectModelController_07363.transaksi.insertTransakasi(pembeli,produk);
    }
    public void insertProduk(String nominal, String produk, String harga){
        objectModelController_07363.transaksi.insertProduk(new produkEntity_07363(nominal,produk,harga));
    }
    public ArrayList<produkEntity_07363> getDataProduk(){
        return objectModelController_07363.transaksi.getDataProduk();
    }
    public ArrayList<transaksiEntity_07363> getDataTransaksi(){
        return objectModelController_07363.transaksi.getDataTransaksi();
    }
    public void deleteTransaksi(int nomortrx){
        objectModelController_07363.transaksi.deleteData(nomortrx);
    }
    public void deletePembeli(int id){
        objectModelController_07363.transaksi.deletePembeli(id);
    }
    public void deleteProduk(int id){
        objectModelController_07363.transaksi.deleteProduk(id);
    }
    public produkEntity_07363 getProduk(int id){
        return objectModelController_07363.transaksi.getProduk(id);
    }
    public int getId(String produk){
        return objectModelController_07363.transaksi.getId(produk);
    }
    public DefaultTableModel daftarGame(){
        DefaultTableModel dataDaftarGame = new DefaultTableModel();
        Object[] kolom = {"ID","ID GAME", "NAMA AKUN", "NAMA", "NO TELP","ID PRODUK","NOMINAL", "NAMA PRODUK", "HARGA","NO TRX","STATUS"};
        dataDaftarGame.setColumnIdentifiers(kolom);
        int size = getDataTransaksi().size();
        for(int i = 0; i < size; i++ ){
            Object[] data = new Object[11];
            data[0] = AllObjectModel_07363.transaksiModel_Tasya.getDataTransaksi().get(i).getPembeli().getId();
            data[1] = AllObjectModel_07363.transaksiModel_Tasya.getDataTransaksi().get(i).getPembeli().getIDgame_tasya();
            data[2] = AllObjectModel_07363.transaksiModel_Tasya.getDataTransaksi().get(i).getPembeli().getNamaAkun_tasya();
            data[3] = AllObjectModel_07363.transaksiModel_Tasya.getDataTransaksi().get(i).getPembeli().getnama_tasya();
            data[4] = AllObjectModel_07363.transaksiModel_Tasya.getDataTransaksi().get(i).getPembeli().getnotelp_tasya();
            data[5] = AllObjectModel_07363.transaksiModel_Tasya.getDataTransaksi().get(i).getProduk().getId_tasya();
            data[6] = AllObjectModel_07363.transaksiModel_Tasya.getDataTransaksi().get(i).getProduk().getNominal_tasya();
            data[7] = AllObjectModel_07363.transaksiModel_Tasya.getDataTransaksi().get(i).getProduk().getNamaProduk_tasya();
            data[8] = AllObjectModel_07363.transaksiModel_Tasya.getDataTransaksi().get(i).getProduk().getHarga_tasya();
            data[9] = AllObjectModel_07363.transaksiModel_Tasya.getDataTransaksi().get(i).getNomortrx_tasya();
            data[10] = AllObjectModel_07363.transaksiModel_Tasya.getDataTransaksi().get(i).getStatustrx_tasya();
            
            dataDaftarGame.addRow(data);
        }
        return dataDaftarGame;
    }
}
