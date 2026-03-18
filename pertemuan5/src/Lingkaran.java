/* Nama File   : Lingkaran.java
 * Deskripsi   : berisi atribut dan method dalam class Lingkaran
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 18 Maret 2026
 */
public class Lingkaran extends BangunDatar implements IResize {
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
    @Override
    public double getLuas() {
        return PI * Math.pow(jariJari, 2);
    }
    // menghitung keliling lingkaran
    @Override
    public double getKeliling() {
        return 2 * PI * jariJari;
    }

    @Override
    public void zoomIn() {
        jariJari *= 1.1; // memperbesar jari-jari sebesar 10%
    }

    @Override
    public void zoomOut() {
        jariJari *= 0.9; // memperkecil jari-jari sebesar 10%
    }

    @Override
    public void zoom(int percent) {
        jariJari *= (percent / 100.0); // merubah ukuran sesuai input persentase
    }
}
