package model_07363;

import entity_07363.pembeliEntity_07363;
import helper.KoneksiDB;
import java.sql.*;
import java.util.ArrayList;

public class pembeliModel_07363 {
    private static Connection conn = KoneksiDB.getconnection_07363();
    private static String sql;
    protected static ArrayList<pembeliEntity_07363> dataPembeli = new ArrayList();
    
    public void insertDataPembeli(String nama, String noTelp, String IDgame, String namaAkun){
        sql = "INSERT INTO pembeli(nama,noTelp,IDgame,namaAkun) VALUES(?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nama);
            ps.setString(2, noTelp);
            ps.setString(3, IDgame);
            ps.setString(4, namaAkun);
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public int getid(String nama){
        pembeliEntity_07363 pembeli = new pembeliEntity_07363();
        sql = "SELECT * FROM pembeli where nama=?";
        int id = 0;
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nama);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){        
               id = rs.getInt("id");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return id;
    }
    
    public pembeliEntity_07363 getPembeli(int id){
        pembeliEntity_07363 pembeli = new pembeliEntity_07363();
        sql = "SELECT * FROM pembeli where id=?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){        
                pembeli.setId(rs.getInt("id"));
                pembeli.setNama_tasya(rs.getString("nama"));
                pembeli.setNotelp_tasya(rs.getString("noTelp"));
                pembeli.setIDgame_tasya(rs.getString("IDgame"));
                pembeli.setNamaAkun_tasya(rs.getString("namaAkun"));
                dataPembeli.add(pembeli);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return pembeli;
    }

    public ArrayList<pembeliEntity_07363> getDataPembeli() {
        pembeliEntity_07363 pembeli = new pembeliEntity_07363();
        sql = "SELECT * FROM pembeli";
        try{
            Statement s = conn.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){        
                pembeli.setId(rs.getInt("id"));
                pembeli.setNama_tasya(rs.getString("nama"));
                pembeli.setNotelp_tasya(rs.getString("noTelp"));
                pembeli.setIDgame_tasya(rs.getString("IDgame"));
                pembeli.setNamaAkun_tasya(rs.getString("namaAkun"));
                dataPembeli.add(pembeli);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return dataPembeli;
    }
    
    public static pembeliEntity_07363 getDataPembelibyId(int id){
        pembeliEntity_07363 pembeli = new pembeliEntity_07363();
        sql = "SELECT * FROM pembeli WHERE id=?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                pembeli.setId(rs.getInt("id"));
                pembeli.setNama_tasya(rs.getString("nama"));
                pembeli.setNotelp_tasya(rs.getString("noTelp"));
                pembeli.setIDgame_tasya(rs.getString("IDgame"));
                pembeli.setNamaAkun_tasya(rs.getString("namaAkun"));
                dataPembeli.add(pembeli);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return pembeli;
    }
}
