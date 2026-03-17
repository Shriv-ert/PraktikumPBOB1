/* Nama File   : DosenTetap.java
 * Deskripsi   : Implementasi Dosen Tetap dengan NIDN dan perhitungan pensiun 65 tahun
 * Pembuat     : Shofwan Fikrul Huda
 * Tanggal     : 17 Maret 2026
 */
import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    /****************ATRIBUT******************/
    private String nidn;

    /****************METHOD******************/
    // Konstruktor dengan parameter
    public DosenTetap(String nip, String nidn, String nama, LocalDate tglLahir, LocalDate tmt, double gaji, String fakultas) {
        super(nip, nama, tglLahir, tmt, gaji, fakultas);
        this.nidn = nidn;
    }

    // INFO
    @Override
    public void printInfo() {
        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + formatDate(tanggalLahir));
        System.out.println("TMT             : " + formatDate(tmt));
        System.out.println("Jabatan         : Dosen Tetap");
        System.out.println("Fakultas        : " + fakultas);

        Period mk = getMasaKerja();
        System.out.println("Masa Kerja      : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");

        LocalDate tglPensiun = tanggalLahir.plusYears(65).withDayOfMonth(1).plusMonths(1);
        System.out.println("Tanggal Pensiun : " + formatDate(tglPensiun));

        double tunjangan = 0.02 * mk.getYears() * gajiPokok;
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.0f", gajiPokok));
        System.out.println("Tunjangan       : 2% x " + mk.getYears() + " x Rp " + String.format("%,.0f", gajiPokok) + " = Rp. " + String.format("%,.0f", tunjangan));
        System.out.println("-----------------------------------");
    }
}