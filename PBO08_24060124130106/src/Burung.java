// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 05 Mei 2026
// Deskripsi : Berisi atribut dan method untuk kelas Burung yang merupakan turunan dari kelas Anabul
public class Burung extends Anabul {

    // Konstruktor
    public Burung() {
        super();
    }
    public Burung(String nama) {
        super(nama);
    }

    // Method
    public void Gerak() {
        System.out.println("Terbang");
    }

    public void Suara() {
        System.out.println("cuit");
    }
}
