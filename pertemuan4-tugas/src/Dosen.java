/* Nama File   : Dosen.java
 * Deskripsi   : Subclass dari Pegawai yang menambahkan atribut fakultas
 * Pembuat     : Shofwan Fikrul Huda
 * Tanggal     : 17 Maret 2026
 */
import java.time.LocalDate;

public class Dosen extends Pegawai {
    /****************ATRIBUT******************/
    protected String fakultas;

    /****************METHOD******************/
    // Konstruktor tanpa parameter
    public Dosen() {
    }

    // Konstruktor dengan parameter
    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // SELEKTOR
    // Mengembalikan Fakultas
    public String getFakultas() { 
        return fakultas; 
    }

    // MUTATOR
    // Mengeset Fakultas dengan nilai baru fakultas
    public void setFakultas(String fakultas) { this.fakultas = fakultas; }
}