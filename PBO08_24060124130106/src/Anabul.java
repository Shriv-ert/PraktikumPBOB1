// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 05 Mei 2026
// Deskripsi : Berisi kelas Anabul yang merupakan kelas Parent
    
public abstract class Anabul {
    // Atribut
    protected String nama;

    // Konstruktor
    public Anabul() {}
    public Anabul(String nama) {
        this.nama = nama;
    }

    // Selektor
    public String getNama() {
        return nama;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method
    protected abstract void Gerak();

    protected abstract void Suara();
}
