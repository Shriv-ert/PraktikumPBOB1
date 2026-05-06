// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 06 Mei 2026
// Deskripsi : Berisi kelas MTeman yang merupakan kelas untuk menguji kelas Teman

package Koleksi_Kelas_Dasar;

public class MTeman {
    public static void main(String[] args) {
        // Membuat objek Teman
        Teman t1 = new Teman();
        // Menambahkan nama teman
        t1.addNama("Andi");
        t1.addNama("Budi");
        t1.addNama("Lani");
        // Menampilkan jumlah teman
        System.out.println("Jumlah teman: " + t1.getNbElm());
        // Menampilkan nama teman ke-2
        System.out.println("Teman ke-2: " + t1.getNama(1));
        // Mengubah nama teman ke-2
        t1.setNama(1, "Cici");
        // Menampilkan nama teman ke-2 setelah diubah
        System.out.println("Teman ke-2 setelah diubah: " + t1.getNama(1));
        // Mengecek apakah "Andi" adalah teman
        System.out.println("Apakah Andi adalah teman? " + t1.isMember("Andi"));
        // Delete teman nama "Andi"
        t1.delNama("Andi");
        // Menampilkan jumlah teman setelah penghapusan
        System.out.println("Jumlah teman setelah penghapusan: " + t1.getNbElm());
        // Banyak teman bernama "Cici"
        System.out.println("Banyak teman bernama Cici: " + t1.countNama("Cici"));
    }
}
