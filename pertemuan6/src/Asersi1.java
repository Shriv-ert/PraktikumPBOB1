/* Nama File   : Asersi1.java
 * Deskripsi   : Berisi class Asersi untuk menguji asersi dalam Java
 * Pembuat     : Shofwan Fikrul Huda
 * NIM         : 24060124130106
 * Tanggal     : 26 Maret 2026
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        assert (x > 0) : "Nilai x harus lebih besar dari 0";
        System.out.println("Nilai x: " + x);
    }
}