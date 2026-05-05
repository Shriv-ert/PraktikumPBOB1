// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 05 Mei 2026
// Deskripsi : Berisi kelas MainAnabul untuk menguji kelas-kelas turunan dari Anabul
public class MainAnabul {
    public static void main(String[] args) {

        // Realisasi objek kucing
        System.out.println("Realisasi objek kucing");
        Anabul kocheng = new Kucing("kocheng", 5);
        System.out.println("Nama kucing : " + kocheng.getNama());
        kocheng.Gerak();
        kocheng.Suara();


        // Realisasi objek anjing
        System.out.println("\n" + "Realisasi objek anjing");
        Anabul anjeng = new Anjing("inu");
        System.out.println("Nama anjing : " + anjeng.getNama());
        anjeng.Gerak();
        anjeng.Suara();

        // Realisasi objek burung
        System.out.println("\n" + "Realisasi objek burung");
        Anabul burong = new Burung("manuk");
        System.out.println("Nama burung : " + burong.getNama());
        burong.Gerak();
        burong.Suara();

        // Realisasi objek Kucing Anggora
        System.out.println("\n" + "Realisasi objek kucing Anggora");
        Anabul anggor = new Anggora("Anggonya", 4, "Turki");
        System.out.println("Nama kucing Anggora : " + anggor.getNama());
        anggor.Gerak();
        anggor.Suara();

        // Realisasi objek kucing kembang telon
        System.out.println("\n" + "Realisasi objek kucing kembang telon");
        Anabul telon = new KembangTelon("Kembang Telon", 3, "Indonesia");
        System.out.println("Nama kucing kembang telon : " + telon.getNama());
        telon.Gerak();
        telon.Suara();

        // Contoh penggunaan metode generik Tukar
        System.out.println("\n" + "Contoh penggunaan metode generik Tukar");
        OperatorGenerik OG = new OperatorGenerik();
        Datum<Anabul> d1 = new Datum<>(); d1.setIsi(new Kucing());
        Datum<Anabul> d2 = new Datum<>(); d2.setIsi(new Anjing());
        // Sebelum ditukar
        System.out.println("d1 Sebelum ditukar:");
        d1.getIsi().Gerak();
        d1.getIsi().Suara();
        System.out.println("d2 Sebelum ditukar:");
        d2.getIsi().Gerak();
        d2.getIsi().Suara();
        // Tukar isi d1 dan d2 
        OG.Tukar(d1, d2);
        // Setelah ditukar
        System.out.println("d1 Setelah ditukar:");
        d1.getIsi().Gerak();
        d1.getIsi().Suara();
        System.out.println("d2 Setelah ditukar:");
        d2.getIsi().Gerak();
        d2.getIsi().Suara();


        // Contoh penggunaan metode generik Bobot2 (jumlah bobot dua kucing)
        // Anggora dan KembangTelon disimpan sebagai Anabul di atas, jadi lakukan cast ke Kucing
        Kucing k1 = (Kucing) anggor;
        Kucing k2 = (Kucing) telon;
        int totalBobot = Kucing.Bobot2(k1, k2);
        System.out.println("\nTotal bobot kedua kucing: " + totalBobot + " kg"); 


        // Realisasi kelas Data ddengan datum hewan peliharaan

        Data<Datum<Anabul>> dataHewanPeliharaan = new Data<>();
        Datum<Anabul> datum1 = new Datum<>();
        datum1.setIsi(kocheng);
        dataHewanPeliharaan.setIsi(1, datum1);
        Datum<Anabul> datum2 = new Datum<>();
        datum2.setIsi(anjeng);
        dataHewanPeliharaan.setIsi(2, datum2);
        Datum<Anabul> datum3 = new Datum<>();
        datum3.setIsi(anggor);
        dataHewanPeliharaan.setIsi(3, datum3);
        Datum<Anabul> datum4 = new Datum<>();
        datum4.setIsi(telon);
        dataHewanPeliharaan.setIsi(4, datum4);

        // Cek banyak data yang tersimpan
        System.out.println("\nBanyak data hewan peliharaan: " + dataHewanPeliharaan.getSize());

        // Tampilkan nama dan jenis hewan peliharaan yang tersimpan
        for (int i = 1; i <= dataHewanPeliharaan.getSize(); i++) {
            Datum<Anabul> datum = dataHewanPeliharaan.getIsi(i);
            Anabul hewan = datum.getIsi();
            System.out.println("Hewan peliharaan ke-" + i + ": " + hewan.getNama() + " (" + hewan.getClass().getSimpleName() + ")");
        }
        

        
    }
}
