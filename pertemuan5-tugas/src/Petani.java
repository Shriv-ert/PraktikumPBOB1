/* Nama File   : Petani.java
 * Deskripsi   : Berisi atribut dan method dasar untuk petani
 * Pembuat     : Shofwan Fikrul Huda
 * NIM         : 24060124130106
 * Tanggal     : 25 Maret 2026
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class Petani extends Manusia implements Pajak {
    /****************ATRIBUT******************/
    private String asal_kota;
    private static int counterPetani = 0;

    /****************METHOD******************/
    // Konstruktor tanpa parameter
    public Petani() {
        super();
    }

    // Konstruktor dengan parameter
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // SELEKTOR
    // Mengembalikan Asal Kota
    public String getAsalKota() { 
        return asal_kota; 
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    // MUTATOR
    // Mengeset Asal Kota dengan nilai baru asal_kota
    public void setAsalKota(String asal_kota) { 
        this.asal_kota = asal_kota; 
    }

    // INFO
    // Mengembalikan informasi lengkap tentang petani
    @Override
    public void cetakInfo(){
        System.out.println("Nama                : " + getNama());
        System.out.println("Asal Kota           : " + getAsalKota());
        System.out.println("Tanggal Mulai Kerja : " + formatDate(getTglMulaiKerja()));
        System.out.println("Alamat              : " + getAlamat());
        System.out.println("Pendapatan          : " + getPendapatan());   
    }

    // ABSTRACT METHOD
    @Override
    public int hitungMasaKerja() { //(now - tgl muulai kerja) + digit ke 12 NIM
        LocalDate now = LocalDate.now();
        Period period = Period.between(getTglMulaiKerja(), now);
        int masaKerja = period.getYears() + 1; // Tambahkan digit ke-12 NIM (1 dalam hal ini)
        return masaKerja;
    }

    // INTERFACE METHOD
    // Implementasi method hitungPajak untuk petani
    @Override
    public double hitungPajak() {
        return 0; // Petani tidak dikenakan pajak
    }
}