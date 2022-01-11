package Gui_07363;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class ViewGui_07363 extends ComponentGui_07363{

    JTable tabelmahasiswa = new JTable();
    JScrollPane spmahasiswa = new JScrollPane(tabelmahasiswa);
    JTextField textpilih = new JTextField();
    String kode;
    
    public ViewGui_07363() {
        initComponent();
    }
    
    void initComponent(){
        setTitle("PROGRAM VERIF SISWA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        spmahasiswa.setBounds(20, 50, 500, 350);
        tabelmahasiswa.setModel(AllObjectController_07363.murid_Tasya.daftarMurid());
        add(spmahasiswa);
        
        btndelete.setBounds(540, 50, 110, 25);
        btndelete.setFocusPainted(false);
        btndelete.setBorder(null);
        btndelete.setBackground(Color.black);
        btndelete.setForeground(Color.white);
        add(btndelete);
        
        btnubah.setBounds(540, 95, 110, 25);
        btnubah.setFocusPainted(false);
        btnubah.setBorder(null);
        btnubah.setBackground(Color.black);
        btnubah.setForeground(Color.white);
        add(btnubah);
        
        btnback.setBounds(25, 20, 80, 25);
        btnback.setBackground(Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
        
        
        tabelmahasiswa.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i = tabelmahasiswa.getSelectedRow();
                textpilih.setText(AllObjectController_07363.murid_Tasya.daftarMurid().getValueAt(i, 0).toString());
            }
        });
        
        btnubah.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                kode = textpilih.getText();
                UpdateMuridGui_07363 updateMuridGui = new UpdateMuridGui_07363(kode);
                updateMuridGui.setVisible(true);
                dispose();
            }
        });
        
        btndelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                kode = textpilih.getText();
                AllObjectController_07363.murid_Tasya.delete(kode);
                tabelmahasiswa.setModel(AllObjectController_07363.murid_Tasya.daftarMurid());
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
