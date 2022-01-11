package model_07363;

import entity_07363.pembeliEntity_07363;
import entity_07363.produkEntity_07363;
import entity_07363.transaksiEntity_07363;
import helper.KoneksiDB;
import java.sql.*;
import java.util.ArrayList;

public class transaksiModel_07363 {
    private Connection conn = KoneksiDB.getconnection_07363();
    private String sql;
    protected ArrayList<produkEntity_07363> dataProduk = new ArrayList();
    protected ArrayList<transaksiEntity_07363> dataTransaksi = new ArrayList();
    public void insertTransakasi(int idpembeli, int idproduk){
        sql = "INSERT INTO transaksi(pembeli,produk) VALUES(?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, idpembeli);
            ps.setInt(2, idproduk);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void insertProduk(produkEntity_07363 produk){
        sql = "INSERT INTO produk(nominal,namaproduk,harga) VALUES(?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produk.getNominal_tasya());
            ps.setString(2, produk.getNamaProduk_tasya());
            ps.setString(3, produk.getHarga_tasya());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public int getId(String produk){
        sql = "SELECT * FROM produk WHERE namaproduk=?";
        int id=0;
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, produk);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                id = rs.getInt("id");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return id;
    }
    
    public produkEntity_07363 getProduk(int index){
        produkEntity_07363 produk = new produkEntity_07363();
        sql = "SELECT * FROM produk where id=?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, index);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                produk.setId_tasya(rs.getInt("id"));
                produk.setNominal_tasya(rs.getString("nominal"));
                produk.setNamaProduk_tasya(rs.getString("namaproduk"));
                produk.setHarga_tasya(rs.getString("harga"));
                dataProduk.add(produk);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return produk;
    }
    
    public transaksiEntity_07363 showData(int index){
        transaksiEntity_07363 transaksi = new transaksiEntity_07363();
        sql = "SELECT * FROM transaksi WHERE nomortrs=?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, index);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                transaksi.setNomortrx_tasya(rs.getInt("nomortrx"));
                transaksi.setStatustrx_tasya(true);
                transaksi.setPembeli_tasya(pembeliModel_07363.getDataPembelibyId(rs.getInt("pembeli")));
                transaksi.setProduk_tasya(getProduk(rs.getInt("produk")));
                dataTransaksi.add(transaksi);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return transaksi;
    }
    
    public void deleteData(int id){
        sql = "DELETE FROM transaksi where nomortrx=?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int row =  ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deleteProduk(int id){
        sql = "DELETE FROM produk where id=?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int row =  ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void deletePembeli(int id){
        sql = "DELETE FROM pembeli where id=?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            int row =  ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<produkEntity_07363> getDataProduk() {
        produkEntity_07363 produk = new produkEntity_07363();
        sql = "SELECT * FROM produk";
        try{
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                produk.setId_tasya(rs.getInt("id"));
                produk.setNominal_tasya(rs.getString("nominal"));
                produk.setNamaProduk_tasya(rs.getString("namaproduk"));
                produk.setHarga_tasya(rs.getString("harga"));
                dataProduk.add(produk);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return dataProduk;
    }

    public ArrayList<transaksiEntity_07363> getDataTransaksi() {
        ArrayList<transaksiEntity_07363> listtransaksi = new ArrayList<>();
        sql = "SELECT * FROM transaksi";
        try{
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                transaksiEntity_07363 transaksi = new transaksiEntity_07363();
                transaksi.setNomortrx_tasya(rs.getInt("nomortrx"));
                transaksi.setStatustrx_tasya(true);
                transaksi.setPembeli_tasya(pembeliModel_07363.getDataPembelibyId(rs.getInt("pembeli")));
                transaksi.setProduk_tasya(getProduk(rs.getInt("produk")));
                listtransaksi.add(transaksi);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return listtransaksi;
    }
    
    
}
