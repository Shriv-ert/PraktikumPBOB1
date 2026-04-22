public class Dosen extends CivitasAkademika {
    // Atribut
    private int nip;

    // Konstruktor non parameter
    public Dosen() {}

    // Konstruktor dengan parameter
    public Dosen(String nama, int nip) {
        super(nama);
        this.nip = nip;
    }

    // Selektor
    @Override
    public int getNomor() {
        return nip;
    }
    public String getNama() {
        return nama;
    }
    
}
