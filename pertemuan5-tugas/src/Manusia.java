/* Nama File   : Manusia.java
 * Deskripsi   : Berisi atribut dan method dasar untuk semua jenis manusia
 * Pembuat     : Shofwan Fikrul Huda
 * NIM         : 24060124130106
 * Tanggal     : 25 Maret 2026
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public abstract class Manusia {
    /****************ATRIBUT******************/
    private String nama;
    private LocalDate tgl_mulai_kerja;
    private String alamat;
    private double pendapatan;
    private static int counterMns = 0;

    /****************METHOD******************/
    // Konstruktor tanpa parameter
    public Manusia() {
    }

    // Konstruktor dengan parameter
    public Manusia(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // SELEKTOR
    // Mengembalikan Nama
    public String getNama() { 
        return nama; 
    }

    // Mengembalikan Tanggal Mulai Kerja
    public LocalDate getTglMulaiKerja() { 
        return tgl_mulai_kerja;
    }

    // Mengembalikan Alamat
    public String getAlamat() { 
        return alamat;
    }

    // Mengembalikan Pendapatan
    public double getPendapatan() { 
        return pendapatan;
    }

    // Mengembalikan Counter Manusia
    public static int getCounterMns() {
        return counterMns;
    }

    // MUTATOR
    // Mengeset Nama dengan nilai baru nama
    public void setNama(String nama) { 
        this.nama = nama;
    }

    // Mengeset Tanggal Mulai Kerja dengan nilai baru tgl_mulai_kerja
    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) { 
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }

    // Mengeset Alamat dengan nilai baru alamat
    public void setAlamat(String alamat) { 
        this.alamat = alamat;
    }

    // Mengeset Pendapatan dengan nilai baru pendapatan
    public void setPendapatan(double pendapatan) { 
        this.pendapatan = pendapatan;
    }

    // FUNGSI LAIN
    // Memformat tanggal ke format Indonesia (contoh: 5 Mei 1990)
    protected String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
        return date.format(formatter);
    }

    //INFO
    // Mengembalikan informasi lengkap tentang manusia
    public void cetakInfo() {
        System.out.println("Nama                : " + nama);
        System.out.println("Tanggal Mulai Kerja : " + formatDate(tgl_mulai_kerja));
        System.out.println("Alamat              : " + alamat);
        System.out.println("Pendapatan          : " + pendapatan);
    }

    // ABSTRAKSI
    // Menghitung masa kerja dalam tahun
    public abstract int hitungMasaKerja(); // Menghitung masa kerja dalam tahun
}
