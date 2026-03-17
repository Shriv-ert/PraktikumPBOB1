/* Nama File   : DosenTamu.java
 * Deskripsi   : Implementasi Dosen Tamu dengan NIDK dan sisa masa kontrak
 * Pembuat     : Shofwan Fikrul Huda
 * Tanggal     : 17 Maret 2026
 */
import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    /****************ATRIBUT******************/
    private String nidk;
    private LocalDate tglBerakhirKontrak;

    /****************METHOD******************/
    // Konstruktor dengan parameter
    public DosenTamu(String nip, String nidk, String nama, LocalDate tglLahir, LocalDate tmt, double gaji, String fakultas, LocalDate tglBerakhir) {
        super(nip, nama, tglLahir, tmt, gaji, fakultas);
        this.nidk = nidk;
        this.tglBerakhirKontrak = tglBerakhir;
    }

    // INFO
    @Override
    public void printInfo() {
        System.out.println("NIP                     : " + nip);
        System.out.println("NIDK                    : " + nidk);
        System.out.println("Nama                    : " + nama);
        System.out.println("Tanggal Lahir           : " + formatDate(tanggalLahir));
        System.out.println("TMT                     : " + formatDate(tmt));
        System.out.println("Jabatan                 : Dosen Tamu");
        System.out.println("Fakultas                : " + fakultas);

        Period sisaKontrak = Period.between(LocalDate.now(), tglBerakhirKontrak);
        int totalBulan = (sisaKontrak.getYears() * 12) + sisaKontrak.getMonths();
        System.out.println("Masa Kontrak Berakhir   : " + totalBulan + " bulan lagi");

        double tunjangan = 0.025 * gajiPokok;
        System.out.println("Gaji Pokok              : Rp " + String.format("%,.0f", gajiPokok));
        System.out.println("Tunjangan               : 2,5% x Rp " + String.format("%,.0f", gajiPokok) + " = Rp. " + String.format("%,.0f", tunjangan));
        System.out.println("-----------------------------------");
    }
}