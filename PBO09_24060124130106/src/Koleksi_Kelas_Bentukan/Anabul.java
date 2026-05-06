// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 06 Mei 2026
// Deskripsi : Berisi kelas Anabul yang merupakan kelas Parent
package Koleksi_Kelas_Bentukan;
    
public abstract class Anabul {
    // Atribut
    protected String panggilan;

    // Konstruktor
    public Anabul() {}
    public Anabul(String panggilan) {
        this.panggilan = panggilan;
    }

    // Selektor
    public String getNama() {
        return panggilan;
    }

    // Mutator
    public void setNama(String nama) {
        this.panggilan = nama;
    }

    // Method
    protected abstract void Gerak();

    protected abstract void Suara();
}
