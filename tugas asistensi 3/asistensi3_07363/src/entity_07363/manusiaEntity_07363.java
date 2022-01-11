package entity_07363;

public class manusiaEntity_07363 
{
    protected int id;
    protected String nama_tasya;
    protected String notelp_tasya;

     public manusiaEntity_07363(String nama_tasya, String notelp_tasya) {
        this.nama_tasya = nama_tasya;
        this.notelp_tasya = notelp_tasya;
    }

    public manusiaEntity_07363() {
    }
    
    public String getNama_tasya() {
        return nama_tasya;
    }

    public void setNama_tasya(String nama_tasya) {
        this.nama_tasya = nama_tasya;
    }

    public String getNotelp_tasya() {
        return notelp_tasya;
    }

    public void setNotelp_tasya(String notelp_tasya) {
        this.notelp_tasya = notelp_tasya;
    }    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
