// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 05 Mei 2026
// Deskripsi : Berisi atribut dan method untuk kelas Kucing yang merupakan subclass dari kelas Anabul
package Koleksi_Kelas_Bentukan;
public class Kucing extends Anabul {
    protected int bobot;
    // Konstruktor
    public Kucing() {
        super();
    }
    public Kucing(String nama, int bobot) {
        super(nama);
        this.bobot = bobot; // bobot dalam kg
    }

    // Selektor
    public int getBobot() {
        return bobot;
    }
    // Mutator
    public void setBobot(int bobot) {
        this.bobot = bobot;
    }
    // Method
    public void Gerak() {
        System.out.println("Melata");
    }

    public void Suara() {
        System.out.println("meong");
    }

    




}
