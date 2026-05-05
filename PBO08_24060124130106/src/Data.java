// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 05 Mei 2026
// Deskripsi : Berisi kelas Data yang merupakan kelas generik untuk menyimpan data dengan tipe yang dapat ditentukan saat pembuatan objek

public class Data<G> {
    // atribut
    private G[] ruang; // array untuk menyimpan data dengan tipe generik
    private int banyak;

    // konstruktor
    @SuppressWarnings("unchecked")
    public Data(){
        this.ruang = (G[]) new Object[100];
        this.banyak = 0;
    }

    // Method untuk mengambil data dari array statis berdasarkan posisi yang ditentukan
    public G getIsi(int posisi) throws IndexOutOfBoundsException {
        int indeks = posisi - 1;
        if (indeks >= 0 && indeks < banyak) {
            return ruang[indeks];
        } else {
            throw new IndexOutOfBoundsException("Posisi tidak valid");
        }
    }

    // Method untuk menambahkan data ke dalam array statis dengan posisi yang ditentukan
    public void setIsi(int posisi, G isi){
        int index = posisi - 1;
        if (index >= 0 && index < banyak) {
            ruang[index] = isi;
        } else if (index == banyak) {
            ruang[index] = isi;
            banyak++;
        } else {
            throw new IndexOutOfBoundsException("Posisi tidak valid");
        }

        ruang[index] = isi;
    }

    public int getSize() {
        return banyak;
    }

}
