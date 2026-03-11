/* Nama File   : Persegi.java
 * Deskripsi   : berisi atribut dan method dalam class Persegi
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 11 Maret 2026
 */
public class Persegi extends BangunDatar {
    /****************ATRIBUT******************/
    private double sisi;
    private int jmlSisiPersegi = 4; // jumlah sisi pada persegi selalu 4

    /****************METHOD******************/
    // konstruktor untuk membuat persegi tanpa parameter
    Persegi() {
        setJmlSisi(jmlSisiPersegi);
        sisi = 0;
    }
    // konstruktor untuk membuat persegi dengan parameter jumlah sisi, warna, border, dan sisi
    Persegi(String warna, String border, double sisi) {
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(jmlSisiPersegi);
    }

    //SELEKTOR
    // mengembalikan nilai sisi
    double getSisi() {
        return sisi;
    }

    //MUTATOR
    // mengeset sisi dengan nilai baru sisi
    void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // INFO
    // menampilkan informasi tentang persegi
    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    // FUNGSI LAIN
    // menghitung luas persegi
    double getLuas() {
        return sisi * sisi;
    }

    // menghitung keliling persegi
    double getKeliling() {
        return 4 * sisi;
    }

    // menghitung diagonal persegi
    double getDiagonal() {
        return sisi * Math.sqrt(2); // rumus diagonal persegi adalah sisi * akar(2)
    }


}
