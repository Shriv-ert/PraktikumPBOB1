// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 22 April 2026
// Deskripsi : Berisi atribut dan method untuk kelas Kucing yang merupakan subclass dari kelas Anabul
public class Kucing extends Anabul {
    
    // Konstruktor
    public Kucing() {
        super();
    }
    public Kucing(String nama) {
        super(nama);
    }

    // Method
    public void Gerak() {
        System.out.println("Melata");
    }

    public void Suara() {
        System.out.println("meong");
    }
    
}
