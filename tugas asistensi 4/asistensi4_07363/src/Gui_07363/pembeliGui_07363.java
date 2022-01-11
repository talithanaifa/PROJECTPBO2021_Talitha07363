package Gui_07363;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;


public class pembeliGui_07363 extends ComponentGui_07363
{

    public pembeliGui_07363() {
        initComponent();
    }
        
    void initComponent(){
        setTitle("Registrasi Pembeli ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        labelIDgame.setBounds(35, 100, 70, 25);
        add(labelIDgame);
        labelnama.setBounds(35, 150, 75, 25);
        add(labelnama);
        labelnamaAkun.setBounds(35, 200, 75, 25);
        add(labelnamaAkun);
        labelnoTelp.setBounds(35, 250, 70, 25);
        add(labelnoTelp);
        labelnominal.setBounds(35, 300, 70, 25);
        add(labelnominal);
        labelnamaProduk.setBounds(35, 350, 80, 25);
        add(labelnamaProduk);
        labelharga.setBounds(35, 400, 80, 25);
        add(labelharga);
        
        fieldIDGame.setBounds(120, 100, 150, 25);
        add(fieldIDGame);
        fieldnama.setBounds(120, 150, 150, 25);
        add(fieldnama);
        fieldnamaAkun.setBounds(120, 200, 150, 25);
        add(fieldnamaAkun);
        fieldnoTelp.setBounds(120, 250,150, 25);
        add(fieldnoTelp);
        fieldnominal.setBounds(120, 300, 150, 25);
        add(fieldnominal);
        fieldproduk.setBounds(120, 350, 150, 25);
        add(fieldproduk);
        fieldharga.setBounds(120, 400, 150, 25);
        add(fieldharga);
        
        btnadd.setBounds(120, 450, 150, 25);
        btnadd.setBorder(null);
        btnadd.setBackground(Color.black);
        btnadd.setForeground(Color.white);
        btnadd.setFocusPainted(false);
        btnadd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btnadd);
        
        btnback.setBounds(30, 50, 80, 25);
        btnback.setBorder(null);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
        btnback.setFocusPainted(false);
        add(btnback);
        
        btnadd.addActionListener(e ->{
                String idgame = fieldIDGame.getText();
                String nama = fieldnama.getText();
                String namaAkun = fieldnamaAkun.getText();
                String noTelp = fieldnoTelp.getText();
                String nominal = fieldnominal.getText();
                String produk = fieldproduk.getText();
                String harga = fieldharga.getText();
                if(idgame.length()!=0&& namaAkun.length() !=0&& nama.length() != 0 && noTelp.length() != 0 && nominal.length() != 0 && produk.length() != 0&& harga.length() != 0){
                    AllObjectController_07363.pembeli_Tasya.insertData(nama, noTelp, idgame, namaAkun);
                    AllObjectController_07363.transaksi_Tasya.insertProduk(nominal, produk, harga);
                    int idPembeli = AllObjectController_07363.pembeli_Tasya.getId(nama);
                    int idProduk = AllObjectController_07363.transaksi_Tasya.getId(produk);
                    AllObjectController_07363.transaksi_Tasya.insertData(idPembeli, idProduk);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah");
                    new MenuGui_07363().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                    kosong();
                }
        });
        
        btnback.addActionListener(e ->{
            new MenuGui_07363().setVisible(true);
            dispose();
        });
        btnback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnback.setForeground(Color.black);
                btnback.setBackground(Color.red);
            }
                        
            @Override
            public void mouseExited(MouseEvent e){
                btnback.setForeground(Color.white);
                btnback.setBackground(Color.black);
            }
            
        });
        
        btnadd.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnadd.setForeground(Color.black);
                btnadd.setBackground(Color.green);
            }
                        
            @Override
            public void mouseExited(MouseEvent e){
                btnadd.setForeground(Color.white);
                btnadd.setBackground(Color.black);
            }
            
        });
        
    }
}
