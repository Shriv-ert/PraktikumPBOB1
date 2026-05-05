// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 05 Mei 2026
// Deskripsi : Berisi kelas Anggora yang merupakan subclass dari kelas Kucing

public class Anggora extends Kucing {
    private String asal;
    // Konstruktor
    public Anggora() {
        super();
    }
    public Anggora(String nama, int bobot, String asal) {
        super(nama, bobot);
        this.asal = asal;
    }
    // Selektor
    public String getAsal() {
        return asal;
    }
    // Mutator
    public void setAsal(String asal) {
        this.asal = asal;
    }
    // Method
    @Override
    public void Gerak() {
        System.out.println("anggora lari");
    }
    @Override
    public void Suara() {
        System.out.println("anggora nya~~");
    }

    
}
