package Gui_07363;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class viewGui_07363 extends ComponentGui_07363
{

    JTable tabelgame = new JTable();
    JScrollPane spgame = new JScrollPane(tabelgame);
    JTextField textpilih = new JTextField();
    JTextField textpilih2 = new JTextField();
    JTextField textpilih3 = new JTextField();
    String kode;
    
    public viewGui_07363() {
        initComponent();
    }
    
    void initComponent(){
        setTitle("PROGRAM VOUCHER GAME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        spgame.setBounds(20, 50, 1000, 350);
        tabelgame.setModel(AllObjectController_07363.transaksi_Tasya.daftarGame());
        tabelgame.setDefaultEditor(Object.class, null);
        add(spgame);
        
        btndelete.setBounds(1050, 50, 110, 25);
        btndelete.setFocusPainted(false);
        btndelete.setBorder(null);
        btndelete.setBackground(Color.black);
        btndelete.setForeground(Color.white);
        add(btndelete);
        
        btnback.setBounds(25, 20, 80, 25);
        btnback.setBackground(Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
        
        
        tabelgame.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i = tabelgame.getSelectedRow();
                textpilih.setText(AllObjectController_07363.transaksi_Tasya.daftarGame().getValueAt(i, 9).toString());
                textpilih2.setText(AllObjectController_07363.transaksi_Tasya.daftarGame().getValueAt(i, 3).toString());
                textpilih3.setText(AllObjectController_07363.transaksi_Tasya.daftarGame().getValueAt(i, 7).toString());
            }
        });
                
        btndelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                kode = textpilih.getText();
                String nama = textpilih2.getText();
                String namaproduk = textpilih3.getText();
                int idPembeli = AllObjectController_07363.pembeli_Tasya.getId(nama);
                int idProduk = AllObjectController_07363.transaksi_Tasya.getId(namaproduk);
                AllObjectController_07363.transaksi_Tasya.deletePembeli(idPembeli);
                AllObjectController_07363.transaksi_Tasya.deleteProduk(idProduk);
                AllObjectController_07363.transaksi_Tasya.deleteTransaksi(Integer.parseInt(kode));
                tabelgame.setModel(AllObjectController_07363.transaksi_Tasya.daftarGame());
                JOptionPane.showMessageDialog(null, "Berhasil HAPUS DATA");
            }
        });
        
        btnback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnback.setForeground(Color.yellow);
            }
            @Override
            public void mouseExited(MouseEvent e){
                btnback.setForeground(Color.black);
            }
        });
        
        btnback.addActionListener(e ->{
            dispose();
            new MenuGui_07363().setVisible(true);
        });
    }
}
