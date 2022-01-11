package helper_07363;
import java.sql.Connection;
import java.sql.DriverManager;

public class koneksiDb_07363 
{
    public static Connection getconnection_07363(){
        Connection conn_Tasya = null;
        String driver_Tasya = "com.mysql.cj.jdbc.Driver";
        String url_Taya = "jdbc:mysql://localhost:3306/db_pertemuan3_07363";
        String user_Tasya = "root";
        String pass_Tasya = "";
        try{
            Class.forName(driver_Tasya);
            conn_Tasya = DriverManager.getConnection(url_Taya,user_Tasya,pass_Tasya);
            System.out.println("Berhasil Koneksi Database");
        }catch(Exception e){
            System.out.println("Gagal Koneksi Database");
            e.printStackTrace();
        }
        return conn_Tasya;
    }
}
