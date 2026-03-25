/* Nama File   : Pengusaha.java
 * Deskripsi   : Berisi atribut dan method dasar untuk pengusaha
 * Pembuat     : Shofwan Fikrul Huda
 * NIM         : 24060124130106
 * Tanggal     : 25 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Pengusaha extends Manusia implements Pajak {
    /****************ATRIBUT******************/
    private String npwp;
    private static int counterPengusaha = 0;
    private static final double TARIF_PAJAK = 0.15; // Tarif pajak untuk pengusaha

    /****************METHOD******************/
    // Konstruktor tanpa parameter
    public Pengusaha() {
        super();
    }

    // Konstruktor dengan parameter
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    // SELEKTOR
    // Mengembalikan NPWP
    public String getNpwp() { 
        return npwp; 
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // MUTATOR
    // Mengeset NPWP dengan nilai baru npwp
    public void setNpwp(String npwp) { 
        this.npwp = npwp; 
    }

    // INFO
    // Mengembalikan informasi lengkap tentang pengusaha
    @Override
    public void cetakInfo(){
        System.out.println("Nama                : " + getNama());
        System.out.println("NPWP                : " + getNpwp());
        System.out.println("Tanggal Mulai Kerja : " + formatDate(getTglMulaiKerja()));
        System.out.println("Alamat              : " + getAlamat());
        System.out.println("Pendapatan          : " + getPendapatan());   
    }

    // ABSTRACT METHOD
    // Implementasi method hitungMasaKerja untuk pengusaha
    @Override
    public int hitungMasaKerja() { //(now - tgl mulai kerja) + digit ke 13 NIM
        LocalDate now = LocalDate.now();
        Period period = Period.between(getTglMulaiKerja(), now);
        int masaKerja = period.getYears() + 0; // Tambahkan digit ke-13 NIM (0 dalam hal ini)
        return masaKerja;
    }

    // INTERFACE METHOD
    // Implementasi method hitungPajak untuk pengusaha
    @Override
    public double hitungPajak() {
        return getPendapatan() * TARIF_PAJAK;
    }
}