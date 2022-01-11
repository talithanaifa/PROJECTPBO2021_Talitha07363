package Gui_07363;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ComponentGui_07363 extends JFrame {
    protected JButton btnview = new JButton("Lihat Data");
    protected JButton btnadd = new JButton("Insert Data");
    protected JButton btnregister = new JButton("REGISTRASI");
    protected JButton btnubah = new JButton("UBAH");
    protected JButton btnback = new JButton("<< BACK");
    protected JButton btndelete = new JButton("DELETE");
    
    protected JLabel labelregister = new JLabel("REGISTER");
    protected JLabel labelid = new JLabel("ID");
    protected JLabel labelnama = new JLabel("Nama");
    protected JLabel labelnoabsen = new JLabel("No absen");
    protected JLabel labelkelas = new JLabel("Kelas");
    protected JLabel labelalamat = new JLabel("Alamat");
    
    protected JTextField fieldnama = new JTextField();
    protected JTextField fieldnoabsen = new JTextField();
    protected JTextField fieldkelas = new JTextField();
    protected JTextField fieldalamat = new JTextField();
    
    protected JButton btnubahnama = new JButton("Ubah");
    protected JButton btnubahkelas = new JButton("Ubah");
    protected JButton btnubahalamat = new JButton("Ubah");
   
    void kosong(){
        fieldnama.setText(null);
        fieldnoabsen.setText(null);
        fieldkelas.setText(null);
        fieldalamat.setText(null);
    }
}
