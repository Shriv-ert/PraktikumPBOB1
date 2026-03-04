/* Nama File   : Dosen.java
 * Deskripsi   : berisi atribut dan method dalam class Dosen
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 04 Maret 2026
 */
public class Dosen {
    /****************ATRIBUT******************/
    private String nip;
    private String nama;
    private String prodi;
    /****************METHOD******************/
    // konstruktor non parameter
    Dosen(){
        nip = null;
        nama = null;
        prodi = null;
    }
    // konstruktor parameter
    Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
    // selektor nip
    String getNip(){
        return nip;
    }
    // selektor nama
    String getNamaDosen(){
        return nama;
    }
    //selektor prodi
    String getProdiDosen(){
        return prodi;
    }
    // mutator nip
    void setNip(String nip){
        this.nip = nip;
    }
    // mutator nama
    void setNamaDosen(String nama){
        this.nama = nama;
    }
    // mutator prodi
    void setProdiDosen(String prodi){
        this.prodi = prodi;
    }
}
