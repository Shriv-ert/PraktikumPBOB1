/* Nama File   : Tendik.java
 * Deskripsi   : Implementasi Tenaga Kependidikan dengan Bidang dan pensiun 55 tahun
 * Pembuat     : Shofwan Fikrul Huda
 * Tanggal     : 17 Maret 2026
 */
import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    /****************ATRIBUT******************/
    private String bidang;

    /****************METHOD******************/
    public Tendik(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gaji, String bidang) {
        super(nip, nama, tglLahir, tmt, gaji);
        this.bidang = bidang;
    }

    // INFO
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jabatan         : Tendik");
        System.out.println("Bidang          : " + bidang);

        Period mk = getMasaKerja();
        System.out.println("Masa Kerja      : " + mk.getYears() + " tahun " + mk.getMonths() + " bulan");

        LocalDate tglPensiun = tanggalLahir.plusYears(55).withDayOfMonth(1).plusMonths(1);
        System.out.println("Tanggal Pensiun : " + formatDate(tglPensiun));

        double tunjangan = 0.01 * mk.getYears() * gajiPokok;
        System.out.println("Gaji Pokok      : Rp " + String.format("%,.0f", gajiPokok));
        System.out.println("Tunjangan       : 1% x " + mk.getYears() + " x Rp " + String.format("%,.0f", gajiPokok) + " = Rp. " + String.format("%,.0f", tunjangan));
        System.out.println("-----------------------------------");
    }
}