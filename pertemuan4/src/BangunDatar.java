/* Nama File   : BangunDatar.java
 * Deskripsi   : berisi atribut dan method dalam class BangunDatar
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 11 Maret 2026
 */

public class BangunDatar {
    /****************ATRIBUT******************/
    private int jmlSisi;
    private String warna;
    private String border;

    /****************METHOD******************/
    // konstruktor untuk membuat bangun datar tanpa parameter
    BangunDatar() {
        jmlSisi = 0;
        warna = null;
        border = null;
    }
    // konstruktor untuk membuat bangun datar dengan parameter jumlah sisi, warna, dan border
    BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }
    
    //SELEKTOR
    // mengembalikan nilai jumlah sisi
    int getJmlSisi() {
        return jmlSisi;
    }
    // mengembalikan nilai warna
    String getWarna() {
        return warna;
    }
    // mengembalikan nilai border
    String getBorder() {
        return border;
    }

    //MUTATOR
    // mengeset jumlah sisi dengan nilai baru jumlahSisi
    void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }
    // mengeset warna dengan nilai baru warna
    void setWarna(String warna) {
        this.warna = warna;
    }
    // mengeset border dengan nilai baru border
    void setBorder(String border) {
        this.border = border;
    }

    // INFO
    // menampilkan informasi tentang bangun datar
    void printInfo() {
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}

