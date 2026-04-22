// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 22 April 2026
// Deskripsi : Berisi kelas 

public abstract class CivitasAkademika {
    // Atribut
    protected String nama;

    // Konstruktor non parameter
    public CivitasAkademika() {}

    // Konstruktor dengan parameter
    public CivitasAkademika(String nama) {
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
    // Method abstrak
    protected abstract int getNomor();
}
