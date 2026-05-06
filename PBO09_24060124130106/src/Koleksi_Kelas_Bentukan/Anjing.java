// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 05 Mei 2026
// Deskripsi : Berisi kelas Anjing yang merupakan subclass dari kelas Anabul
package Koleksi_Kelas_Bentukan;

public class Anjing extends Anabul {
    // Konstruktor
    public Anjing() {
        super();
    }

    public Anjing(String nama) {
        super(nama);
    }


    public void Gerak() {
        System.out.println("Melata");
    }

    public void Suara() {
        System.out.println("Guk guk");
    }
}
