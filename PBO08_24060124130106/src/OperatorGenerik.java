// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 05 Mei 2026
// Deskripsi : Berisi kelas OperatorGenerik  yang memiliki metode generik untuk menukar isi dari dua objek Datum dengan tipe data yang sama
public class OperatorGenerik {
    // Method untuk menukar isi dari dua objek Datum dengan tipe data yang sama
    public <G> void Tukar(Datum<G> a, Datum<G> b) {
        G temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }
}
