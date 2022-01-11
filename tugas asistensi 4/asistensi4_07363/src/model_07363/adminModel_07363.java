package model_07363;

import entity_07363.adminEntity_07363;
import helper.KoneksiDB;
import java.sql.*;

public class adminModel_07363 
{
    private Connection conn = KoneksiDB.getconnection_07363();
    private String sql;
    
    public void insertDataAdmin(adminEntity_07363 admin){
        sql = "INSERT INTO admin(nama,password,noTelp) VALUES(?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, admin.getNama_tasya());
            ps.setString(2, admin.getPassword_tasya());
            ps.setString(3, admin.getNotelp_tasya());
            ResultSet rs = ps.executeQuery();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public int cekData(String nama, String password){
        int cek = 0;
        sql = "SELECT * FROM admin WHERE nama = ? and password = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nama);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                cek = rs.getInt("id");
            }else{
                cek = 0;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return cek;
    }
}
