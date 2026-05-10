// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 06 Mei 2026
// Deskripsi : Berisi kelas MAnabul yang merupakan kelas untuk menguji kelas Anabul dan piaraan

package Koleksi_Kelas_Bentukan;

public class MAnabul {
    public static void main(String[] args) {
        // Membuat objek piaraan
        Piaraan budi = new Piaraan();
        // Membuat objek anjing
        Anabul a1 = new Anjing("Buddy");
        Anabul a2 = new Kucing("carlina", 1);
        Anabul a3 = new Burung("Rex");
        Anabul a4 = new KembangTelon("Telon", 2, "Indonesia");
        Anabul a5 = new Anggora("carol", 1, "Turki");
        // Menambahkan anabul ke dalam piaraan
        budi.enqueueAnabul(a1);
        budi.enqueueAnabul(a2);
        budi.enqueueAnabul(a3);
        budi.enqueueAnabul(a4);
        budi.enqueueAnabul(a5);
        // Menampilkan semua anabul dalam piaraan
        System.out.println("Daftar Anabul dalam Piaraan Budi:");
        budi.showAnabul();

        // Menampilkan nama anabul beserta jenisnya
        System.out.println("\nNama Anabul beserta Jenisnya:");
        budi.showJenisAnabul();

        // Menampilkan total bobot kucing dalam piaraan budi
        System.out.println("\nTotal Bobot Kucing dalam Piaraan Budi:");
        System.out.println(budi.bobotKucing());

        // Menghitung banyak kucing dalam piaraan budi
        System.out.println("\nBanyak Kucing dalam Piaraan Budi:");
        System.out.println(budi.countKucing());

        // Mengeluarkan anabul terakhir dari piaraan budi
        System.out.println("\nMengeluarkan Anabul terakhir dari Piaraan Budi...");
        budi.dequeueAnabul();

        // Menampilkan semua anabul dalam piaraan setelah pengeluaran
        System.out.println("\nDaftar Anabul dalam Piaraan Budi setelah pengeluaran:");
        budi.showAnabul();

        // Banyak anabul tersisa dalam piaraan budi        
        System.out.println("\nBanyak Anabul tersisa dalam Piaraan Budi:");
        System.out.println(budi.getNbElm());

        // Menampilkan Anabul pertama dalam piaraan budi
        System.out.println("\nAnabul pertama dalam Piaraan Budi:");
        Anabul firstAnabul = budi.getAnabul();
        System.out.println("Nama: " + firstAnabul.getNama());

        // Mengecek apakah anabul tertentu adalah anggota piaraan budi
        System.out.println("\nMengecek apakah anabul tertentu adalah anggota Piaraan Budi:");
        Anabul anabulToCheck = new Kucing("carlina", 1);
        if (budi.isMember(anabulToCheck)) {
            System.out.println(anabulToCheck.getNama() + " adalah anggota Piaraan Budi.");
        } else {
            System.out.println(anabulToCheck.getNama() + " bukan anggota Piaraan Budi.");   
        }

    }
}
