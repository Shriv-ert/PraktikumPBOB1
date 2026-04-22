// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 22 April 2026
// Deskripsi : Berisi aplikasi untuk kelas Mahasiswa

public class MainMahasiswa {
    public static void main(String[] args) {
        
        // realisasi mahasiswa konstruktor tanpa parameter
        System.out.println("Realisasi Mahasiswa dengan Konstruktor Tanpa Parameter:");
        Mahasiswa mhs1 = new Mahasiswa();
        System.out.println("Mahasiswa 1:");
        System.out.println("Nama           : " + mhs1.getNama());
        System.out.println("NIM            : " + mhs1.getNim());
        System.out.println("Program Studi  : " + mhs1.getProgramStudi() + "\n");

        // realisasi mahasiswa konstruktor dengan parameter
        System.out.println("Realisasi Mahasiswa dengan Konstruktor Dengan Parameter:");
        Mahasiswa mhs2 = new Mahasiswa("Muhammad abdi", 12342, "Teknik Informatika");
        System.out.println("Mahasiswa 2:");
        System.out.println("Nama            : " + mhs2.getNama());
        System.out.println("NIM             : " + mhs2.getNim());
        System.out.println("Program Studi   : " + mhs2.getProgramStudi() + "\n");

        // realisasi mahasiswa dengan mutator
        System.out.println("Realisasi Mahasiswa dengan Mutator:");
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNama("Shofwan Fikrul Huda");
        mhs3.setNim(24060);
        mhs3.setProgramStudi("Teknik Informatika");
        System.out.println("Mahasiswa 3:");
        System.out.println("Nama            : " + mhs3.getNama());
        System.out.println("NIM             : " + mhs3.getNim());
        System.out.println("Program Studi   : " + mhs3.getProgramStudi() + "\n");

        // realisasi mahasiswa dengan mutator setProgramStudi yang menerima parameter Mahasiswa
        System.out.println("Realisasi Mahasiswa dengan Mutator setProgramStudi yang Menerima Parameter Mahasiswa:");
        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNama("Abdul Azis");
        mhs4.setNim(24060);
        mhs4.setProgramStudi(mhs2);
        System.out.println("Mahasiswa 4:");
        System.out.println("Nama            : " + mhs4.getNama());
        System.out.println("NIM             : " + mhs4.getNim());
        System.out.println("Program Studi   : " + mhs4.getProgramStudi() + "\n");
    }
}
