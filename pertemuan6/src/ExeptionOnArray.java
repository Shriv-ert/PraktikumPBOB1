/* Nama File   : ExeptionOnArray.java
 * Deskripsi   : Berisi class ExeptionOnArray untuk menguji exception pada array dalam Java
 * Pembuat     : Shofwan Fikrul Huda
 * NIM         : 24060124130106
 * Tanggal     : 26 Maret 2026
 */
public class ExeptionOnArray {
    public static void main(String[] args) {
        // Instansiasi objek array interger
        int[] array = new int[5];
        try {
            array[3] = 10;
            array[5] = 20; // Ini akan menyebabkan ArrayIndexOutOfBoundsException karena indeks 5 tidak ada dalam array
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace(); // Menampilkan stack trace dari exception yang terjadi
        } finally {
            System.out.println("clean up code...");
        }
    }
}
