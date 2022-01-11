package Gui_07363;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterGui_07363 extends ComponentGui_07363
{

    public RegisterGui_07363(){
        initComponent();
    }
    
    void initComponent(){
        setTitle("Register Siswa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        labelregister.setBounds(120, 50, 70, 25);
        add(labelregister);
        labelnoabsen.setBounds(35, 95, 75, 25);
        add(labelnoabsen);
        fieldnoabsen.setBounds(130, 95, 130, 25);
        add(fieldnoabsen);
        
        labelnama.setBounds(35, 140, 80, 25);
        add(labelnama);
        fieldnama.setBounds(130, 140, 130, 25);
        add(fieldnama);
        
        labelkelas.setBounds(35, 185, 80, 25);
        add(labelkelas);
        fieldkelas.setBounds(130, 185, 130, 25);
        add(fieldkelas);
        
        labelalamat.setBounds(35, 230, 80, 25);
        add(labelalamat);
        fieldalamat.setBounds(130, 230, 130, 25);
        add(fieldalamat);
        
        btnregister.setBounds(80, 300, 140, 25);
        btnregister.setBorder(null);
        btnregister.setBackground(Color.black);
        btnregister.setForeground(Color.white);
        btnregister.setFocusPainted(false);
        add(btnregister);
        
        btnback.setBounds(80, 350, 140, 25);
        btnback.setBorder(null);
        btnback.setBackground(Color.black);
        btnback.setForeground(Color.white);
        btnback.setFocusPainted(false);
        add(btnback);
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
        
        btnregister.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnregister.setForeground(Color.black);
                btnregister.setBackground(Color.green);
            }
                        
            @Override
            public void mouseExited(MouseEvent e){
                btnregister.setForeground(Color.white);
                btnregister.setBackground(Color.black);
            }
            
        });
        
        
        btnregister.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nama = fieldnama.getText();
                String noabsen = fieldnoabsen.getText();
                String kelas = fieldkelas.getText();
                String alamat = fieldalamat.getText();
                if(nama.length() != 0 && noabsen.length() != 0 && kelas.length() != 0 && alamat.length() != 0){
                    AllObjectController_07363.murid_Tasya.insert(nama, noabsen, kelas, alamat);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Ditambah");
                    new MenuGui_07363().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                    kosong();
                }
            }
        });
    }
}
