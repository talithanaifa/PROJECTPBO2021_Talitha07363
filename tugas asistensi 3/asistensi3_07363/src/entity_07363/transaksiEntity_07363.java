package entity_07363;

public class transaksiEntity_07363 
{
    protected int nomortrx_tasya;
    protected boolean statustrx_tasya;
    public pembeliEntity_07363 pembeli_tasya;
    public produkEntity_07363 produk_tasya;

    public transaksiEntity_07363(pembeliEntity_07363 pembeli, produkEntity_07363 produk) {
        this.pembeli_tasya = pembeli;
        this.produk_tasya = produk;
    }

    public transaksiEntity_07363() {
    }

    public void transaksiEntity_07363 (){};
    
    public int getNomortrx_tasya() {
        return nomortrx_tasya;
    }

    public boolean getStatustrx_tasya() {
        return statustrx_tasya;
    }

    public pembeliEntity_07363 getPembeli() {
        return pembeli_tasya;
    }

    public produkEntity_07363 getProduk() {
        return produk_tasya;
    }
    
     public void setNomortrx_tasya(int nomortrx_tasya) {
        this.nomortrx_tasya = nomortrx_tasya;
    }

    public void setStatustrx_tasya(boolean statustrx_tasya) {
        this.statustrx_tasya = statustrx_tasya;
    }

    public void setPembeli_tasya(pembeliEntity_07363 pembeli_tasya) {
        this.pembeli_tasya = pembeli_tasya;
    }

    public void setProduk_tasya(produkEntity_07363 produk_tasya) {
        this.produk_tasya = produk_tasya;
    }
   
    
}

