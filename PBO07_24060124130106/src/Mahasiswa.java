// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 22 April 2026
// Deskripsi : Berisi atribut dan method untuk kelas Mahasiswa

public class Mahasiswa {
    private String nama;
    private int nim;
    private String programStudi;

    // Konstruktor tanpa parameter
    public Mahasiswa(){
        this.nama = "n/a";
        this.nim = -999;
        this.programStudi = "n/a";
    }
    

    // Konstruktor dengan parameter
    public Mahasiswa(String nama, int nim, String programStudi) {
        this.nama = nama;
        this.nim = nim;
        this.programStudi = programStudi;
    }

    // Selektor
    public String getNama() {
        return nama;
    }
    public int getNim() {
        return nim;
    }
    public String getProgramStudi() {
        return programStudi;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setProgramStudi() {
        this.programStudi = "Kosong";
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public void setProgramStudi(Mahasiswa m) {
        this.programStudi = m.getProgramStudi();
    }
}
