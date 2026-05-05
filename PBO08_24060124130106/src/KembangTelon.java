// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 05 Mei 2026
// Deskripsi : Berisi kelas KembangTelon yang merupakan kelas kosong untuk keperlu

public class KembangTelon extends Kucing {
    // Atribut
    private String Asal;

    // Konstruktor
    public KembangTelon() {
        super();
    }
    public KembangTelon(String nama, int bobot, String Asal) {
        super(nama, bobot);
        this.Asal = Asal;
    }

    // Selektor
    public String getAsal() {
        return Asal;
    }
    // Mutator
    public void setAsal(String Asal) {
        this.Asal = Asal;
    }
    // Method
    @Override
    public void Gerak() {
        System.out.println("kembang telon lari atas pagar");
    }
    @Override
    public void Suara() {
        System.out.println("kembang telon nyaroo~~");
    }
}
