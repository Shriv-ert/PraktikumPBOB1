// Nama : Shofwan Fikrul Huda
// NIM  : 24060124130106
// Tanggal : 06 Mei 2026
// Deskripsi : Berisi kelas Teman yang merupakan kelas untuk menyimpan nama-nama teman dalam sebuah list
package Koleksi_Kelas_Dasar;

import java.util.*;
public class Teman {
    // ATRIBUT
    private int nbElm;
    private List<String> lNama;

    // KONSTRUKTOR
    public Teman() {
        this.nbElm = 0;
        this.lNama = new ArrayList<String>();
    }

    // SELEKTOR
    public int getNbElm() {
        return nbElm;
    }

    public String getNama(int indeks) {
        if(indeks >=0 && indeks < nbElm) { // cek indeks valid
            return lNama.get(indeks);
        } else {
            throw new IndexOutOfBoundsException("Indeks di luar batas");
        }
    }

    // MUTATOR
    public void addNama(String nama) {
        lNama.add(nama);
        nbElm = nbElm + 1;
    }

    public void setNama(int indeks, String nama){
        if(indeks >=0 && indeks < nbElm) { // cek indeks valid
            lNama.set(indeks, nama);
        } else {
            throw new IndexOutOfBoundsException("Indeks di luar batas");
        }
    }

    // PREDIKAT
    public boolean isMember(String nama) {
        for(String n : lNama) { // iterasi setiap nama dalam list (foreach)
            if(n.equals(nama)) {
                return true;
            }
        }
        return false;
    }

    // PROSEDUR

    // prosedur mengahapus (seluruh)nama dari list
    public void delNama(String nama) {
        while (isMember(nama)) {
            lNama.remove(nama);
            nbElm = nbElm - 1;
        }
    }

    public void gantiNama(String nama, String namaBaru) {
        for(int i = 0; i < nbElm; i++) { // iterasi setiap indeks dalam list
            if(lNama.get(i).equals(nama)) {
                lNama.set(i, namaBaru);
            }
        }
    }

    public void showTeman(){
        
    }

    // FUNGSI
    // fungsi untuk menghitung jumlah kemunculan nama dalam list
    public int countNama(String nama) {
        int count = 0;
        for(String n : lNama) { // iterasi setiap nama dalam list (foreach)
            if(n.equals(nama)) {
                count = count + 1;
            }
        }
        return count;
    }



}
