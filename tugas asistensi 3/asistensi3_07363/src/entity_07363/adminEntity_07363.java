package entity_07363;

public class adminEntity_07363 extends manusiaEntity_07363
{
    protected String id_tasya;
    protected String password_tasya;

    public adminEntity_07363(String password_tasya, String nama_tasya, String notelp_tasya) {
        super(nama_tasya, notelp_tasya);
        this.password_tasya = password_tasya;
    }
    public void adminEntity_07363 (){};
    
    public String getnama_tasya() {
        return nama_tasya;
    }

    public String getId_tasya() {
        return id_tasya;
    }

    public void setId_tasya(String id_tasya) {
        this.id_tasya = id_tasya;
    }

    public String getPassword_tasya() {
        return password_tasya;
    }

    public void setPassword_tasya(String password_tasya) {
        this.password_tasya = password_tasya;
    }
    
    
    
    
    
}
