package controller_07363;
import entity_07363.muridEntity_07363;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class muridController_07363 
{
    public ArrayList<muridEntity_07363> getDataMurid()
    {
        return AllObjectModel_07363.MuridModel_Tasya.getMurid();
    }
    public ArrayList<muridEntity_07363> getDataMurid(String noabsen)
    {
        return AllObjectModel_07363.MuridModel_Tasya.getMurid(noabsen);
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
    public DefaultTableModel daftarMurid(){
        DefaultTableModel dataDaftarMahasiswa = new DefaultTableModel();
        Object[] kolom = {"NOABSEN", "NAMA", "KELAS", "ALAMAT"};
        dataDaftarMahasiswa.setColumnIdentifiers(kolom);
        int size = getDataMurid().size();
        for(int i = 0; i < size; i++ ){
            Object[] data = new Object[4];
            data[0] = AllObjectModel_07363.MuridModel_Tasya.getMurid().get(i).getNoabsen_07363();
            data[1] = AllObjectModel_07363.MuridModel_Tasya.getMurid().get(i).getNama_07363();
            data[2] = AllObjectModel_07363.MuridModel_Tasya.getMurid().get(i).getKelas_07363();
            data[3] = AllObjectModel_07363.MuridModel_Tasya.getMurid().get(i).getAlamat_07363();
            dataDaftarMahasiswa.addRow(data);
        }
        return dataDaftarMahasiswa;
    }
}
