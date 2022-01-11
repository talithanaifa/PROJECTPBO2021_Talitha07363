package praktikumdua_07363;

public class karyawanGudang_07363
{
    private String password_tasya, nama_tasya;
    
    public karyawanGudang_07363(String password_tasya, String nama_tasya)
    {
        this.nama_tasya=nama_tasya;
        this.password_tasya=password_tasya;
    }
    public String getNama_tasya() {
        return nama_tasya;
    }

    public void setNama_tasya(String nama_tasya) {
        this.nama_tasya = nama_tasya;
    }
    
    public void setPassword_tasya(String password_tasya) {
        this.password_tasya = password_tasya;
    }

    public String getPassword_tasya() {
        return password_tasya;
    }
}
