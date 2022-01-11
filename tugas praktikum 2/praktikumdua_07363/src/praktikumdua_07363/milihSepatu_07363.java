package praktikumdua_07363;
public class milihSepatu_07363 
{
    private jenisSepatu_07363 jenisjenis;
    private int indexJenis_tasya;
    private String kodeSepatu_tasya;
    
    public milihSepatu_07363(jenisSepatu_07363 jenisjenis, int indexJenis_tasya, String kodeSepatu_tasya) {
        this.jenisjenis = jenisjenis;
        this.indexJenis_tasya = indexJenis_tasya;
        this.kodeSepatu_tasya = kodeSepatu_tasya;
    }

    public jenisSepatu_07363 getJenisjenis() {
        return jenisjenis;
    }

    public void setJenisjenis(jenisSepatu_07363 jenisjenis) {
        this.jenisjenis = jenisjenis;
    }

    public int getIndexJenis_tasya() {
        return indexJenis_tasya;
    }

    public void setIndexJenis_tasya(int indexJenis_tasya) {
        this.indexJenis_tasya = indexJenis_tasya;
    }

    public String getKodeSepatu_tasya() {
        return kodeSepatu_tasya;
    }

    public void setKodeSepatu_tasya(String kodeSepatu_tasya) {
        this.kodeSepatu_tasya = kodeSepatu_tasya;
    } 
}
