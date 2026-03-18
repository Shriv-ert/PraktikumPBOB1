/* Nama File   : Main.java
 * Deskripsi   : berisi class Main untuk menjalankan program BangunDatar, Persegi, dan Lingkaran
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 18 Maret 2026
 */
public class Main {
    public static void main(String[] args) {
        
        // HARUS DIKOMENTAR KARENA BANGUN DATAR ADALAH ABSTRACT CLASS
        //BangunDatar B1 = new BangunDatar();
        BangunDatar P1 = new Persegi();
        Persegi P2 = new Persegi("Merah", "Tebal", 10);
        BangunDatar L1 = new Lingkaran("Merah", "Tebal", 14);
        Lingkaran L2 = new Lingkaran("Biru", "Tipis", 14);

        // perbesar ukuran persegi P2 sebesar 10%
        P2.zoomIn();
        System.out.println("Luas Persegi P2 setelah zoom in: " + P2.getLuas());
        // perkecil ukuran lingkaran L1 sebesar 10%
        // L1.zoomOut(); TIDAK BISA KARENA L1 BERTIPE BANGUN DATAR, SEHINGGA TIDAK MEMILIKI METHOD ZOOMOUT
        System.out.println("Luas Lingkaran L1 setelah zoom out: " + L1.getLuas());
        // ubah ukuran lingkaran L2 menjadi 150% dari ukuran semula
        L2.zoom(150);
        System.out.println("Luas Lingkaran L2 setelah zoom 150%: " + L2.getLuas());
   }
    
}
