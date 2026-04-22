

public class Seminar {
    // Atribut
    static CivitasAkademika[] peserta = new CivitasAkademika[100];
    static int countPeserta = 0;

    // Method

    // Method untuk registrasi peserta seminar.
    public static void registrasi(CivitasAkademika peserta) {
        if (countPeserta < 100) { // Apabila jumlah peserta belum mencapai 100, maka peserta dapat didaftarkan.
            Seminar.peserta[countPeserta] = peserta;
            countPeserta++;
        } else { // Apabila jumlah peserta sudah mencapai 100, maka seminar tidak dapat menerima peserta lagi.
            System.out.println("Maaf, seminar sudah penuh.");
        }
    }

    
    // Method untuk menampilkan daftar peserta seminar.
    public static void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar:");
        for (int i = 0; i < countPeserta; i++) {
            System.out.println((i + 1) + ". " + peserta[i].nama + " - Nomor: " + peserta[i].getNomor());
        }
    }

    // Method untuk menghitung jumlah peserta yang merupakan mahasiswa.
    public static int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < countPeserta; i++) {
            if (peserta[i] instanceof Mahasiswa2) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        // Membuat 2 objek Dosen
        Dosen dosen1 = new Dosen("Dr. Andi", 12345);
        Dosen dosen2 = new Dosen("Dr. Budi", 67890);

        // Membuat 5 objek Mahasiswa2
        Mahasiswa2 mhs1 = new Mahasiswa2("Sumi", 1001, dosen1);
        Mahasiswa2 mhs2 = new Mahasiswa2("Bappe", 1002, dosen1);
        Mahasiswa2 mhs3 = new Mahasiswa2("Cumanto", 1003, dosen2);
        Mahasiswa2 mhs4 = new Mahasiswa2("Dapid", 1004, dosen2);

        // Mhasiswa dengan mutator setDosenWali
        Mahasiswa2 mhs5 = new Mahasiswa2("Eko", 1005, null);
        mhs5.setWali(dosen1);

        // Menampilkan data mahasiswa
        mhs1.tampilDataMahasiswa();

        // Registrasi peserta seminar
        registrasi(dosen1);
        registrasi(dosen2);
        registrasi(mhs1);
        registrasi(mhs2);
        registrasi(mhs3);
        registrasi(mhs4);
        registrasi(mhs5);

        // Menampilkan daftar peserta
        tampilPeserta();

        // Menampilkan jumlah mahasiswa
        System.out.println("Jumlah mahasiswa: " + countMahasiswa());
    }
}
