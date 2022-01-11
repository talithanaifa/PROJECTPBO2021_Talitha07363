package controller_07363;

import entity_07363.pembeliEntity_07363;
import entity_07363.produkEntity_07363;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class pembeliController_07363 {
    public void insertData(String nama, String noTelp, String IDgame, String namaAkun){
        objectModelController_07363.pembeli.insertDataPembeli(nama,noTelp,IDgame,namaAkun);
    }
    
    public ArrayList<pembeliEntity_07363> getDataPembeli(){
        return objectModelController_07363.pembeli.getDataPembeli();
    }
    public pembeliEntity_07363 getPembeli(int id){
        return objectModelController_07363.pembeli.getPembeli(id);
    }
    public int getId(String nama){
        return objectModelController_07363.pembeli.getid(nama);
    }
}