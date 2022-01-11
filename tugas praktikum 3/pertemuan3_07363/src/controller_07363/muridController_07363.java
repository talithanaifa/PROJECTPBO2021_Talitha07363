package controller_07363;
import entity_07363.muridEntity_07363;
import java.util.ArrayList;

public class muridController_07363 
{
    public ArrayList<muridEntity_07363> getDataMurid()
    {
        return AllObjectModel_07363.MuridModel_Tasya.getMurid();
    }
    
    public void insert(String nama, String noabsen, String kelas, String alamat)
    {
        AllObjectModel_07363.MuridModel_Tasya.insert(nama, noabsen, kelas, alamat);
    }
    
    public void delete(String noabsen)
    {
        AllObjectModel_07363.MuridModel_Tasya.delete(noabsen);
    }
     
    public void updateNama(String nama, String noabsen)
    {
        AllObjectModel_07363.MuridModel_Tasya.updateNama(nama, noabsen);
    }
    
    public void updateKelas(String kelas, String noabsen)
    {
        AllObjectModel_07363.MuridModel_Tasya.updateKelas(kelas, noabsen);
    }
    
    public void updateAlamat(String alamat, String noabsen)
    {
        AllObjectModel_07363.MuridModel_Tasya.updateAlamat(alamat, noabsen);
    }   
}
