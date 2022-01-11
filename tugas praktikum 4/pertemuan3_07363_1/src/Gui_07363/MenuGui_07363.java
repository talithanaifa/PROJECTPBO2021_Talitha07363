package Gui_07363;
import java.awt.*;
import javax.swing.*;

public class MenuGui_07363 extends ComponentGui_07363{

    public MenuGui_07363() {
        initComponent();
    }
        
    void initComponent(){
        setTitle("Register Siswa");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        btnview.setBounds(150, 150, 120, 120);
        btnview.setFocusPainted(false);
        btnview.setBackground(Color.red);
        btnview.setForeground(Color.white);
        btnview.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btnview);
        
        btnadd.setBounds(300, 150, 120, 120);
        btnadd.setFocusPainted(false);
        btnadd.setBackground(Color.red);
        btnadd.setForeground(Color.white);
        btnadd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btnadd);
        
        btnview.addActionListener(e ->{
            new ViewGui_07363().setVisible(true);
            dispose();
        });
        
        btnadd.addActionListener(e ->{
            new RegisterGui_07363().setVisible(true);
            dispose();
        });
        
    }
}
