// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 06 Mei 2026
// Deskripsi : Berisi kelas Piaraan yang merupakan kelas untuk mengelola koleksi anabul
package Koleksi_Kelas_Bentukan;
import java.util.*;
public class Piaraan {
    // ATRIBUT
    private int nbElm;
    private LinkedList<Anabul> lAnabul;
    
    // KONSTRUKTOR
    public Piaraan() {
        this.nbElm = 0;
        this.lAnabul = new LinkedList<Anabul>(); // Error ketika menggunakan Queue
    }

    // SELEKTOR
    // Mengembalikan banyak anabul dalam list
    public int getNbElm() {
        return nbElm;
    }

    public Anabul getAnabul() {
        return lAnabul.getFirst();
    }

    // MUTATOR
    public void enqueueAnabul(Anabul anabul){
        lAnabul.addLast(anabul); // Menambahkan anabul ke akhir list(tail)
        nbElm = nbElm + 1;
    }

    public void dequeueAnabul() {
        if(nbElm > 0) { // cek apakah masih ada anabul dalam list
            lAnabul.removeFirst(); // Menghapus anabul pertama (head) dari list
            nbElm = nbElm - 1;
        } else {
            throw new NoSuchElementException("Tidak ada anabul untuk dikeluarkan");
        }
    }
    // PREDIKAT 
    public boolean isMember(Anabul anabul){
        for (Anabul a : lAnabul) { // iterasi setiap anabul dalam list (foreach)
            if(a.equals(anabul)){
                return true;
            }            
        }
        return false;
    }

    // PROSEDUR
    // Menampilkan semua anabul dalam list
    public void showAnabul() {
        for (Anabul a : lAnabul) { // iterasi setiap anabul dalam list (foreach)
            System.out.println("Nama: " + a.getNama());
        }
    }

    // Menampilkan nama anabul beserta jenisnya
    public void showJenisAnabul(){
        for (Anabul a : lAnabul) {
            if (a instanceof Kucing) {
                System.out.println(a.getNama() + " adalah Kucing");
            } else if (a instanceof Anjing) { // Jika ada subclass lain selain Kucing, bisa ditambahkan di sini
                System.out.println(a.getNama() + " adalah Anjing");
            } else if (a instanceof Burung) {
                System.out.println(a.getNama() + " adalah Burung");
            } else {
                System.out.println(a.getNama() + " adalah jenis anabul lainnya"); // Harusnya tidak ada karena subclass hanya ada kucing anjing burung.
            }
        }
    }

    // FUNGSI
    public int countKucing(){
        // Kamus lokal
        int count = 0;
        // Algoritma
        for (Anabul a : lAnabul) {
            if (a instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public int bobotKucing() {
        // Kamus lokal
        int totalBobot = 0;
        // Algoritma
        for (Anabul a : lAnabul) {
            if (a instanceof Kucing) {
                Kucing k = (Kucing) a; // Downcasting dari Anabul ke Kucing
                totalBobot += k.getBobot(); // Menambahkan bobot kucing ke total
            }
        }
        return totalBobot;
    }






}
