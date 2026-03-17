/* Nama File   : MLingkaran.java
 * Deskripsi   : berisi class MLingkaran untuk menjalankan program Lingkaran
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 17 Maret 2026
 */
public class MLingkaran {
    public static void main(String[] args) {
        // membuat objek lingkaran dengan konstruktor tanpa parameter
        Lingkaran lingkaran1 = new Lingkaran();
        System.out.println("Informasi Lingkaran 1:");
        lingkaran1.printInfo();

        // membuat objek lingkaran dengan konstruktor dengan parameter
        Lingkaran lingkaran2 = new Lingkaran("Biru", "Tipis", 7);
        System.out.println("\nInformasi Lingkaran 2:");
        lingkaran2.printInfo();

        // mengubah jari-jari lingkaran2 dan menampilkan informasi lagi
        lingkaran2.setJariJari(10);
        System.out.println("\nInformasi Lingkaran 2 setelah mengubah jari-jari:");
        lingkaran2.printInfo();

        // menghitung luas dan keliling lingkaran2
        System.out.println("\nLuas Lingkaran 2: " + lingkaran2.getLuas());
        System.out.println("Keliling Lingkaran 2: " + lingkaran2.getKeliling());
    }
    
}
