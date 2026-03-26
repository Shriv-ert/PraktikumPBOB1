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
        }
        System.out.println(angka + " bukan angka sial."); 
        
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
}/*jawaban pertanyaan */
/*
jika terjadi exception baris ke 13 tidak akan dieksekusi. saat kondisi if terpenuhi sebuah exception akan dilempar
dan fungsi akan langsung berhenti sehingga tidak mengeksekusi baris 13.

Baris ke 21 akan dieksekusi. setelah exception dilempar pada baris ke 13, program akan langsung mencari blok catch yang sesuai untuk menangani exception tersebut. 
Dalam hal ini, blok catch yang menangani AngkaSialException akan dieksekusi, sehingga baris ke 21 akan dijalankan untuk menampilkan pesan dari exception yang terjadi.
*/
