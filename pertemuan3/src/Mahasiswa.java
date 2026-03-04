/* Nama File   : Mahasiswa.java
 * Deskripsi   : berisi atribut dan method dalam class Mahasiswa
 * Pembuat     : Shofwan Fikrul Huda 24060124130106
 * Tanggal     : 04 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    /****************ATRIBUT******************/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private int counterMatkul = 0;;
    /****************METHOD******************/
    //konstruktor non parameter
    Mahasiswa(){
        nim = null;
        nama = null;
        prodi = null;
        listMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
        counterMatkul++;
    }
    //konstruktor parameter
    Mahasiswa(String nim, String nama, String prodi, ArrayList<MataKuliah> listMatkul, Dosen dosenWali, Kendaraan kendaraan){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = listMatkul;
        this.dosenWali = dosenWali;
        this.kendaraan = kendaraan;
        this.counterMatkul++;
    }
    // selektor nim
    String getNim(){
        return nim;
    }
    // selektor nama
    String getNamaMhs(){
        return nama;
    }
    // selektor prodi
    String getProdiMhs(){
        return prodi;
    }
    // selektor listMatkul
    ArrayList<MataKuliah> getListMatkul(){
        return listMatkul;
    }
    // selektor dosenWali
    Dosen getDosenWali(){
        return dosenWali;
    }
    // selektor kendaraan
    Kendaraan getKendaraan(){
        return kendaraan;
    }
    // mutator nim
    void setNim(String nim){
        this.nim = nim;
    }
    // mutator nama
    void setNamaMhs(String nama){
        this.nama = nama;
    }
    // mutator prodi
    void setProdiMhs(String prodi){
        this.prodi = prodi;
    }
    // mutator listMatkul
    void setListMatkul(ArrayList<MataKuliah> listMatkul){
        this.listMatkul = listMatkul;
    }
    // mutator dosenWali
    void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }


}
