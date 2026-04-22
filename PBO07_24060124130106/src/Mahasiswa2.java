public class Mahasiswa2 extends CivitasAkademika {
    // Atribut
    private int nim;
    private Dosen dosenWali;

    //konstruktor non parameter
    public Mahasiswa2() {}

    //konstruktor dengan parameter
    public Mahasiswa2(String nama, int nim, Dosen dosenWali) {
        super(nama);
        this.nim = nim;
        this.dosenWali = dosenWali;
    }

    // Selektor
    @Override
    public int getNomor() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    // Mutator
    public void setWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    // Method
    public void tampilDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Dosen Wali: " + dosenWali.getNama());
    }
}
