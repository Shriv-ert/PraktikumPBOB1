/* Nama File   : MPersegi.java
 * Deskripsi   : berisi class MPersegi untuk menjalankan program Persegi
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 17 Maret 2026
 */
public class MPersegi {
    public static void main(String[] args) {
        // membuat objek persegi dengan konstruktor tanpa parameter
        Persegi persegi1 = new Persegi();
        System.out.println("Informasi Persegi 1:");
        persegi1.printInfo();

        // membuat objek persegi dengan konstruktor dengan parameter
        Persegi persegi2 = new Persegi("Merah", "Tebal", 5);
        System.out.println("\nInformasi Persegi 2:");
        persegi2.printInfo();

        // mengubah sisi persegi2 dan menampilkan informasi lagi
        persegi2.setSisi(10);
        System.out.println("\nInformasi Persegi 2 setelah mengubah sisi:");
        persegi2.printInfo();

        // menghitung diagonal persegi2
        System.out.println("\nDiagonal Persegi 2: " + persegi2.getDiagonal());

        // menghitung luas dan keliling persegi2
        System.out.println("Luas Persegi 2: " + persegi2.getLuas());
        System.out.println("Keliling Persegi 2: " + persegi2.getKeliling());

        // menghitung diagonal persegi2 setelah mengubah sisi
        System.out.println("Diagonal Persegi 2 setelah mengubah sisi: " + persegi2.getDiagonal());
    }
}
