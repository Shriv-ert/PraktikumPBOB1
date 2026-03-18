/* Nama File   : BangunDatar.java
 * Deskripsi   : berisi atribut dan method dalam abstrak class BangunDatar
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 18 Maret 2026
 */

public abstract class BangunDatar  {
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

    //PREDIKAT
    // apakah luasnya sama dengan luas bangun datar lain
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    // Tambahan fingsi abstract
    // menghitung luas bangun datar
    public abstract double getLuas();

    // menghitung keliling bangun datar
    public abstract double getKeliling();

    // INFO
    // menampilkan informasi tentang bangun datar
    void printInfo() {
        System.out.println("Jumlah Sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }
}

