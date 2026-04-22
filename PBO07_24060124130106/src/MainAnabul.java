// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 22 April 2026
// Deskripsi : Berisi kelas MainAnabul untuk menguji kelas-kelas turunan dari Anabul
public class MainAnabul {
    public static void main(String[] args) {

        // Realisasi objek kucing
        System.out.println("Realisasi objek kucing");
        Anabul Kucing = new Kucing("kocheng");
        System.out.println("Nama kucing : " + Kucing.getNama());
        Kucing.Gerak();
        Kucing.Suara();


        // Realisasi objek anjing
        System.out.println("\n" + "Realisasi objek anjing");
        Anabul Anjing = new Anjing("inu");
        System.out.println("Nama anjing : " + Anjing.getNama());
        Anjing.Gerak();
        Anjing.Suara();

        // Realisasi objek burung
        System.out.println("\n" + "Realisasi objek burung");
        Anabul Burung = new Burung("manuk");
        System.out.println("Nama burung : " + Burung.getNama());
        Burung.Gerak();
        Burung.Suara();
    }
}
