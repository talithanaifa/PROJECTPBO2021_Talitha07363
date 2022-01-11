package controller_07363;

import entity_07363.adminEntity_07363;


public class adminController_07363 {
    public void insertData(String nama,String password,String noTelp){
         objectModelController_07363.admin.insertDataAdmin(new adminEntity_07363(nama,password,noTelp));
    }
    public int cekData(String nama, String password){
        return objectModelController_07363.admin.cekData(nama, password);
    }
}
