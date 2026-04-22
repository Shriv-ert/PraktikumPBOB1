

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
