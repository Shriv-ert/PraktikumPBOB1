/* Nama File   : Pegawai.java
 * Deskripsi   : Berisi atribut dan method dasar untuk semua jenis pegawai
 * Pembuat     : Shofwan Fikrul Huda
 * Tanggal     : 17 Maret 2026
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    /****************ATRIBUT******************/
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    /****************METHOD******************/
    // Konstruktor tanpa parameter
    public Pegawai() {
    }

    // Konstruktor dengan parameter
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // SELEKTOR
    // Mengembalikan Nip
    public String getNip() { 
        return nip; 
    }

    // Mengembalikan Nama pegawai
    public String getNama() { 
        return nama; 
    }

    // Mengembalikan Gaji Pokok
    public double getGajiPokok() { 
        return gajiPokok; 
    }

    // MUTATOR
    // Mengeset Nip dengan nilai baru nip
    public void setNip(String nip) { 
        this.nip = nip; 
    }

    // Mengeset Nama dengan nilai baru nama
    public void setNama(String nama) { 
        this.nama = nama; 
    }

    // Mengeset Gaji Pokok dengan nilai baru gajiPokok
    public void setGajiPokok(double gajiPokok) { 
        this.gajiPokok = gajiPokok; 
    }

    // FUNGSI LAIN
    // Memformat tanggal ke format Indonesia (contoh: 5 Mei 1990)
    protected String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return date.format(formatter);
    }

    // Menghitung masa kerja dari TMT sampai sekarang
    protected Period getMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    // INFO
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatDate(tanggalLahir));
        System.out.println("TMT             : " + formatDate(tmt));
        System.out.println("Gaji Pokok      : " + gajiPokok);
    }
}