package entity_07363;

public class pembeliEntity_07363 extends manusiaEntity_07363
{
    protected String IDgame_tasya;
    protected String namaAkun_tasya;

    public pembeliEntity_07363(String IDgame_tasya, String namaAkun_tasya, String nama_tasya, String notelp_tasya) {
        super(nama_tasya, notelp_tasya);
        this.IDgame_tasya = IDgame_tasya;
        this.namaAkun_tasya = namaAkun_tasya;
    }

    public pembeliEntity_07363() {
    }

    public String getnama_tasya() {
        return nama_tasya;
    }
    
    public String getnotelp_tasya() {
        return notelp_tasya;
    }
    
    public String getIDgame_tasya() {
        return IDgame_tasya;
    }

    public void setIDgame_tasya(String IDgame_tasya) {
        this.IDgame_tasya = IDgame_tasya;
    }

    public String getNamaAkun_tasya() {
        return namaAkun_tasya;
    }

    public void setNamaAkun_tasya(String namaAkun_tasya) {
        this.namaAkun_tasya = namaAkun_tasya;
    }
}
