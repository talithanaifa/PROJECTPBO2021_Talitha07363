package entity_07363;

public class produkEntity_07363 
{
    protected int id;
    protected String nominal_tasya;
    protected String namaProduk_tasya;
    protected String harga_tasya;

    public produkEntity_07363(String nominal_tasya, String namaProduk_tasya, String harga_tasya) {
        this.nominal_tasya = nominal_tasya;
        this.namaProduk_tasya = namaProduk_tasya;
        this.harga_tasya = harga_tasya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public produkEntity_07363() {
    }

    public String getNominal_tasya() {
        return nominal_tasya;
    }

    public void setNominal_tasya(String nominal_tasya) {
        this.nominal_tasya = nominal_tasya;
    }

    public String getNamaProduk_tasya() {
        return namaProduk_tasya;
    }

    public void setNamaProduk_tasya(String namaProduk_tasya) {
        this.namaProduk_tasya = namaProduk_tasya;
    }

    public String getHarga_tasya() {
        return harga_tasya;
    }

    public void setHarga_tasya(String harga_tasya) {
        this.harga_tasya = harga_tasya;
    }
}
