package model_07363;
import entity_07363.muridEntity_07363;
import helper_07363.koneksiDb_07363;
import java.sql.*;
import java.util.ArrayList;

public class muridModel_07363 
{
    private String sql_Tasya;
    public Connection conn_Tasya = koneksiDb_07363.getconnection_07363();
    public ArrayList<muridEntity_07363> getMurid()
    {
    
        ArrayList<muridEntity_07363> ArrayListMurid = new ArrayList<>();
        try{
            Statement stat = conn_Tasya.createStatement();
            sql_Tasya = "SELECT * FROM murid";
            ResultSet rs = stat.executeQuery(sql_Tasya);
            while(rs.next()){
                muridEntity_07363 MuridEntity = new muridEntity_07363();
                MuridEntity.setNama_07363(rs.getString("nama"));
                MuridEntity.setNoabsen_07363(rs.getString("noabsen"));
                MuridEntity.setKelas_07363(rs.getString("kelas"));
                MuridEntity.setAlamat_07363(rs.getString("alamat"));
                ArrayListMurid.add(MuridEntity);
            }
            }
        catch(SQLException e)
        {
            System.out.println(e);
        }
            return ArrayListMurid;
        }
     public ArrayList<muridEntity_07363> getMurid(String noabsen)
    {
    
        ArrayList<muridEntity_07363> ArrayListMurid = new ArrayList<>();
        try{
            sql_Tasya = "SELECT * FROM murid where noabsen=?";
            PreparedStatement stat = conn_Tasya.prepareStatement(sql_Tasya);
            stat.setString(1, noabsen);
            ResultSet rs = stat.executeQuery();
            while(rs.next()){
                muridEntity_07363 MuridEntity = new muridEntity_07363();
                MuridEntity.setNama_07363(rs.getString("nama"));
                MuridEntity.setNoabsen_07363(rs.getString("noabsen"));
                MuridEntity.setKelas_07363(rs.getString("kelas"));
                MuridEntity.setAlamat_07363(rs.getString("alamat"));
                ArrayListMurid.add(MuridEntity);
            }
            }
        catch(SQLException e)
        {
            System.out.println(e);
        }
            return ArrayListMurid;
        }
    
    public void insert(String nama_Tasya, String noabsen_Tasya, String kelas_Tasya, String alamat_Tasya)
    {
        try
        {
            sql_Tasya= "INSERT INTO murid(nama,noabsen,kelas,alamat) values(?,?,?,?)";
            PreparedStatement stmnt = conn_Tasya.prepareStatement(sql_Tasya);
            stmnt.setString(1, nama_Tasya);
            stmnt.setString(2, noabsen_Tasya);
            stmnt.setString(3, kelas_Tasya);
            stmnt.setString(4, alamat_Tasya);
            int rows = stmnt.executeUpdate();
            System.out.println(rows + " data ditambahkan");
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void delete(String noabsen_Tasya)
    {
        try
        {
            sql_Tasya = "DELETE FROM murid WHERE noabsen=?";
            PreparedStatement stmnt = conn_Tasya.prepareStatement(sql_Tasya);
            stmnt.setString(1, noabsen_Tasya);
            int rows = stmnt.executeUpdate();
            System.out.println(rows + " data telah dihapus");
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public void updateNama(String nama_Tasya, String noabsen_Tasya)
    {
        try{
            sql_Tasya = "UPDATE murid SET nama=? WHERE noabsen=?";
            PreparedStatement stmnt = conn_Tasya.prepareStatement(sql_Tasya);
            stmnt.setString(1, nama_Tasya);           
            stmnt.setString(2, noabsen_Tasya);
            int rows = stmnt.executeUpdate();
            System.out.println(rows + " data berhasil diupdate");
        }catch(SQLException e){
            System.out.println("data gagal diupdate");
            System.out.println(e);
        }
    }
    
    public void updateKelas(String kelas_Tasya, String noabsen_Tasya)
    {
        try{
            sql_Tasya = "UPDATE murid SET kelas=? WHERE noabsen=?";
            PreparedStatement stmnt = conn_Tasya.prepareStatement(sql_Tasya);
            stmnt.setString(1, kelas_Tasya);           
            stmnt.setString(2, noabsen_Tasya);
            int rows = stmnt.executeUpdate();
            System.out.println(rows + " data berhasil diupdate");
        }catch(SQLException e){
            System.out.println("data gagal diupdate");
            System.out.println(e);
        }
    }
    
    public void updateAlamat(String alamat_Tasya,String noabsen_Tasya)
    {
        try{
            sql_Tasya= "UPDATE murid SET alamat=? WHERE noabsen=?";
            PreparedStatement stmnt = conn_Tasya.prepareStatement(sql_Tasya);
            stmnt.setString(1, alamat_Tasya);           
            stmnt.setString(2, noabsen_Tasya);
            int rows = stmnt.executeUpdate();
            System.out.println(rows + " data berhasil diupdate");
        }catch(SQLException e){
            System.out.println("data gagal diupdate");
            System.out.println(e);
        }
    }
}

