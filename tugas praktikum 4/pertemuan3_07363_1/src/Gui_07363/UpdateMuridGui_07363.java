package Gui_07363;
import entity_07363.muridEntity_07363;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UpdateMuridGui_07363 extends ComponentGui_07363
{
    String nama, noabsen,kelas,alamat;
    public UpdateMuridGui_07363(String cek){
        initComponent(cek);
    }
    
    void initComponent(String cek){
        for(muridEntity_07363 muridEntities : AllObjectController_07363.murid_Tasya.getDataMurid(cek)) {
            this.noabsen = muridEntities.getNoabsen_07363();
            this.nama    = muridEntities.getNama_07363();
            this.kelas   = muridEntities.getKelas_07363();
            this.alamat  = muridEntities.getAlamat_07363();
        }
        
        setTitle("Ubah Data");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        btnback.setBounds(25, 20, 80, 25);
        btnback.setBackground(Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
        
        labelnoabsen.setBounds(25, 60, 100, 25);
        add(labelnoabsen);
        fieldnoabsen.setBounds(120, 60, 100, 25);
        fieldnoabsen.setText(noabsen);
        fieldnoabsen.setEditable(false);
        add(fieldnoabsen);
        
        labelnama.setBounds(25, 100, 40, 25);
        add(labelnama);
        fieldnama.setBounds(120, 100, 100, 25);
        fieldnama.setText(nama);
        fieldnama.setEditable(false);
        add(fieldnama);
        
        labelkelas.setBounds(25, 140, 40, 25);
        add(labelkelas);
        fieldkelas.setBounds(120, 140, 100, 25);
        fieldkelas.setText(kelas);
        fieldkelas.setEditable(false);
        add(fieldkelas);
        
        labelalamat.setBounds(25, 180, 40, 25);
        add(labelalamat);
        fieldalamat.setBounds(120, 180, 100, 25);
        fieldalamat.setText(alamat);
        fieldalamat.setEditable(false);
        add(fieldalamat);
        
        btnubahnama.setBounds(245, 100, 80, 25);
        btnubahkelas.setBounds(245, 140, 80, 25);
        btnubahalamat.setBounds(245, 180, 80, 25);
        add(btnubahnama);
        add(btnubahkelas);
        add(btnubahalamat);
        
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
            new ViewGui_07363().setVisible(true);
            dispose();
        });
        
        btnubahnama.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputnama = JOptionPane.showInputDialog("Massukkan Nama Baru");
                    if(inputnama.length() > 0){
                        AllObjectController_07363.murid_Tasya.updateNama(inputnama, cek);
                        fieldnama.setText(inputnama);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahkelas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputkelas = JOptionPane.showInputDialog("Masukan Kelas Baru");
                    if(inputkelas.length() > 0){
                        AllObjectController_07363.murid_Tasya.updateKelas(inputkelas, cek);
                        fieldkelas.setText(inputkelas);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahalamat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputalamat = JOptionPane.showInputDialog("Masukan Alamat Baru");
                    if(inputalamat.length() > 0){
                        AllObjectController_07363.murid_Tasya.updateAlamat(inputalamat, cek);
                        fieldalamat.setText(inputalamat);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
    }
}
