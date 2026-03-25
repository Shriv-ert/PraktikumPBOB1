/* Nama File   : PNS.java
 * Deskripsi   : Berisi atribut dan method dasar untuk PNS
 * Pembuat     : Shofwan Fikrul Huda
 * NIM         : 24060124130106
 * Tanggal     : 25 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class PNS extends Manusia implements Pajak {
    /****************ATRIBUT******************/
    private String nip;
    private static int counterPNS = 0;
    private static final double TARIF_PAJAK = 0.10; // Tarif pajak untuk PNS

    /****************METHOD******************/
    // Konstruktor tanpa parameter
    public PNS() {
        super();
    }

    // Konstruktor dengan parameter
    public PNS(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // SELEKTOR
    // Mengembalikan NIP
    public String getNip() { 
        return nip; 
    }

    // Mengembalikan Counter PNS
    public static int getCounterPNS() {
        return counterPNS;
    }

    // MUTATOR
    // Mengeset NIP dengan nilai baru nip
    public void setNip(String nip) { 
        this.nip = nip; 
    }

    // INFO
    // Mengembalikan informasi lengkap tentang PNS
    @Override
    public void cetakInfo(){
        System.out.println("Nama                : " + getNama());
        System.out.println("NIP                 : " + getNip());
        System.out.println("Tanggal Mulai Kerja : " + formatDate(getTglMulaiKerja()));
        System.out.println("Alamat              : " + getAlamat());
        System.out.println("Pendapatan          : " + getPendapatan());   
    }

    // ABSTRACT METHOD
    @Override
    public int hitungMasaKerja() { //(now - tgl mulai kerja) + digit ke 14 NIM
        LocalDate now = LocalDate.now();
        Period period = Period.between(getTglMulaiKerja(), now);
        int masaKerja = period.getYears() + 4; // Tambahkan digit ke-14 NIM (4 dalam hal ini)
        return masaKerja;
    }

    // INTERFACE METHOD
    // Implementasi method hitungPajak untuk PNS
    @Override
    public double hitungPajak() {
        return getPendapatan() * TARIF_PAJAK;
    }

}