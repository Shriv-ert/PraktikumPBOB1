/* Nama File   : Lingkaran.java
 * Deskripsi   : berisi atribut dan method dalam class Lingkaran
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 11 Maret 2026
 */
public class Lingkaran extends BangunDatar {
    /****************ATRIBUT******************/
    private double jariJari;
    private static final double PI = Math.PI; // konstanta untuk nilai pi
    private static int jmlSisiLingkaran = 0; // jumlah sisi pada lingkaran selalu 0

     // konstruktor untuk membuat lingkaran dengan parameter jumlah sisi, warna, border, dan jari-jari
    /****************METHOD******************/
    // konstruktor untuk membuat lingkaran tanpa parameter
    Lingkaran() {
        setJmlSisi(jmlSisiLingkaran); // lingkaran tidak memiliki sisi
        jariJari = 0;
    }
    Lingkaran(String warna, String border, double jariJari) {
        super(jmlSisiLingkaran, warna, border); // memanggil konstruktor superclass untuk mengatur warna, border, dan jumlah sisi
        this.jariJari = jariJari;
    }

    // SELECTOR
    // mengembalikan jari jari lingkaran
    public double getJariJari() {
        return jariJari;
    }

    // MUTATOR
    // mengatur jari jari lingkaran
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    // FUNCTION
    // menghitung luas lingkaran
    public double getLuas() {
        return PI * Math.pow(jariJari, 2);
    }
    // menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * PI * jariJari;
    }
}
