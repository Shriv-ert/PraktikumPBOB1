// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 05 Mei 2026
// Deskripsi : Berisi kelas Datum yang merupakan kelas generik untuk menyimpan data dengan tipe yang dapat ditentukan saat pembuatan objek

public class Datum<G> {
    //Atribut
    private G isi;

    //Selektor
    public G getIsi() {
        return isi;
    }
    
    //Mutator
    public void setIsi(G isi) {
        this.isi = isi;
    }

}
