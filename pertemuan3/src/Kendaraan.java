/* Nama File   : Kendaraan.java
 * Deskripsi   : berisi atribut dan method dalam class Kendaraan
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 04 Maret 2026
 */
public class Kendaraan {
    /****************ATRIBUT******************/
    private String noPlat;
    private String jenis;
    /****************METHOD******************/
    //konstruktor non parameter
    Kendaraan(){
        noPlat = null;
        jenis = null;
    }
    //konstruktor parameter
    Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }
    // selektor noPlat
    String getNoPlat(){
        return noPlat;
    }
    //selektor jenis
    String getJenisKendaraan(){
        return jenis;
    }
    // mutator noPlat
    void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }
    // mutator jenis
    void setJenisKendaraan(String jenis){
        this.jenis = jenis;
    }
}
