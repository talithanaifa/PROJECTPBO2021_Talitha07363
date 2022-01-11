package Gui_07363;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ComponentGui_07363 extends JFrame {
    protected JButton btnview = new JButton("Lihat Data");
    protected JButton btnadd = new JButton("Tambah Data");
    protected JButton btnback = new JButton("<< BACK");
    protected JButton btndelete = new JButton("Delete");
    
    protected JLabel labelIDgame = new JLabel("IDGame");
    protected JLabel labelnamaAkun = new JLabel("Nama Akun");
    protected JLabel labelnama = new JLabel("Nama");
    protected JLabel labelnoTelp = new JLabel("No Telp");
    protected JLabel labelnominal = new JLabel("Nominal");
    protected JLabel labelnamaProduk = new JLabel("Nama Produk");
    protected JLabel labelharga = new JLabel("Harga");
    
    protected JTextField fieldnama = new JTextField();
    protected JTextField fieldnoTelp = new JTextField();
    protected JTextField fieldIDGame = new JTextField();
    protected JTextField fieldnamaAkun = new JTextField();
    protected JTextField fieldnominal = new JTextField();
    protected JTextField fieldproduk = new JTextField();
    protected JTextField fieldharga = new JTextField();
    void kosong(){
        fieldnama.setText(null);
        fieldnoTelp.setText(null);
        fieldIDGame.setText(null);
        fieldnamaAkun.setText(null);
        fieldnominal.setText(null);
        fieldnominal.setText(null);
        fieldproduk.setText(null);
        fieldharga.setText(null);
    }
}

