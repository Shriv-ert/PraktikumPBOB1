/* Nama File   : Main.java
 * Deskripsi   : Driver class untuk menguji implementasi pewarisan pegawai
 * Pembuat     : Shofwan Fikrul Huda
 * Tanggal     : 17 Maret 2026
 */
import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        /****************OBYEK DOSEN TETAP******************/
        // Sesuai contoh: Andi, Lahir 5 Mei 1990, TMT 1 Jan 2015
        DosenTetap dosen1 = new DosenTetap(
            "9545647548", 
            "78647324", 
            "Andi", 
            LocalDate.of(1990, 5, 5), 
            LocalDate.of(2015, 1, 1), 
            5000000, 
            "Fakultas Sains dan Matematika"
        );

        /****************OBYEK DOSEN TAMU******************/
        // Contoh Dosen Tamu dengan kontrak berakhir 1 tahun lagi dari sekarang
        DosenTamu dosen2 = new DosenTamu(
            "8823471122", 
            "K9928341", 
            "Budi Utomo", 
            LocalDate.of(1985, 8, 12), 
            LocalDate.of(2023, 5, 10), 
            6000000, 
            "Fakultas Teknik",
            LocalDate.now().plusMonths(12) // Kontrak berakhir 12 bulan dari sekarang
        );

        /****************OBYEK TENDIK******************/
        // Contoh Tendik di bidang Akademik
        Tendik tendik1 = new Tendik(
            "197503012000031001", 
            "Siti Aminah", 
            LocalDate.of(1980, 2, 15), 
            LocalDate.of(2005, 3, 1), 
            4000000, 
            "Akademik"
        );

        /****************OUTPUT INFORMASI******************/
        System.out.println("=== DATA PEGAWAI PERGURUAN TINGGI ===\n");

        System.out.println("--- INFORMASI DOSEN TETAP ---");
        dosen1.printInfo();

        System.out.println("--- INFORMASI DOSEN TAMU ---");
        dosen2.printInfo();

        System.out.println("--- INFORMASI TENDIK ---");
        tendik1.printInfo();
    }
}