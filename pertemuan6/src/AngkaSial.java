/* Nama File   : ExeptionOnArray.java
 * Deskripsi   : Berisi class ExeptionOnArray untuk menguji exception pada array dalam Java
 * Pembuat     : Shofwan Fikrul Huda
 * NIM         : 24060124130106
 * Tanggal     : 26 Maret 2026
 */

public class AngkaSial {
   public void cobaAngkaSial(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException(); // Melempar exception jika angka yang dimasukkan adalah 13
        } else {
            System.out.println(angka + " bukan angka sial."); 
        }
    } 

    public static void main(String[] args) {
        AngkaSial angkaSial = new AngkaSial();
        try {
            angkaSial.cobaAngkaSial(10); // Mencoba dengan angka yang tidak sial
            angkaSial.cobaAngkaSial(13); // Mencoba dengan angka sial
            angkaSial.cobaAngkaSial(30);
        } catch (AngkaSialException e) {
            System.out.println(e.getMessage()); // Menangkap dan menampilkan pesan dari exception yang dilempar
            System.out.println("hati hati memasukkan angka sial!");
        } 
    }
}
