/* Nama File   : Asersi1.java
 * Deskripsi   : Berisi class Asersi untuk menguji asersi dalam Java
 * Pembuat     : Shofwan Fikrul Huda
 * NIM         : 24060124130106
 * Tanggal     : 26 Maret 2026
 */
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        assert (jariJari > 0.0) : "Jari-jari tidak boleh nol atau negatif"; // Asersi untuk memastikan jari-jari lebih besar dari 0
        this.jariJari = jariJari;
    }


    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0.0;
        Lingkaran lingkaran = new Lingkaran(jariJari);
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
    }
}
/* jawab pertanyaan */
/*
pemvalidasian data menggunakan asersi di dalam main method berkemungkinan jika dibuat objek lingkaran baru. 
objek tersebut akan akan melewati asersi cek yang dibuat. solusinya taruh asersi didalam method konstruktor lingkaran, sehingga setiap objek yang dibuat akan melewati asersi cek.
*/
