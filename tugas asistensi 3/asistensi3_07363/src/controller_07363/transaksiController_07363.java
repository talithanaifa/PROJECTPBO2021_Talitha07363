package controller_07363;

import entity_07363.pembeliEntity_07363;
import entity_07363.produkEntity_07363;
import entity_07363.transaksiEntity_07363;
import java.util.ArrayList;

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
}
