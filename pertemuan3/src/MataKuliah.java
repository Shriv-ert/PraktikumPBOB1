/* Nama File   : MataKuliah.java
 * Deskripsi   : berisi atribut dan method dalam class MataKuliah
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 04 Maret 2026
 */
public class MataKuliah {
    /****************ATRIBUT******************/
    private String idMatkul;
    private String nama;
    int sks; 
    /****************METHOD******************/   
    //konstruktor non parameter
    MataKuliah(){
        idMatkul = null;
        nama = null;
        sks = 0;
    }
    //konstruktor parameter
    MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }
    //selektor idMatkul
    String getIdMatkul(){
        return idMatkul;
    }
    //selektor nama
    String getNamaMatkul(){
        return nama;
    }
    //selektor sks
    int getSks(){
        return sks;
    }
    // mutator idMatkul
    void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }
    // mutator nama
    void setNamaMatkul(String nama){
        this.nama = nama;
    }
    // mutator sks
    void tambahSks(int sks){
        this.sks++;
    }
}
