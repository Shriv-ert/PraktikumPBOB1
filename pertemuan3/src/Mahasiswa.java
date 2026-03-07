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
    private int counterMatkul = 0;
    /****************METHOD******************/
    //konstruktor non parameter
    Mahasiswa(){
        nim = null;
        nama = null;
        prodi = null;
        listMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }
    //konstruktor parameter
    Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        listMatkul = new ArrayList<>();
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
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
    //selektor counterMatkul
    int getCounterMatkul(){
        return counterMatkul;
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
    // mutator kendaraan
    void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }
    // menambah matkuliah ke listMatkul
    void addMatKul(MataKuliah matkul){
        if(counterMatkul <= 50){
            listMatkul.add(matkul);
            counterMatkul++;
        } else {
            System.out.println("Mata kuliah yang diambil sudah mencapai batas maksimal");
        }
    }
    // menampilkan jumlah mata kuliah yang diambil
    int getJumlahMatKul(){
        return counterMatkul;
    }
    // menampilkan jumlah sks yang diambil
    int getJumlahSKS(){
        int totalSks = 0;
        for(MataKuliah matkul : listMatkul){
            totalSks += matkul.getSks();
        }
        return totalSks;
    }
    // menamoilkan informasi mahasiswa
    void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
    // menampilkan informasi detail mahasiswa
    void printDetailMhs(){
        printMhs();
        System.out.println("Dosen Wali: " + dosenWali.getNamaDosen());
        System.out.println("Kendaraan: " + kendaraan.getJenisKendaraan() + " dengan nomor plat " + kendaraan.getNoPlat());
        System.out.println("Mata Kuliah yang diambil:");
        for(MataKuliah matkul : listMatkul){
            System.out.println("- " + matkul.getNamaMatkul() + " (" + matkul.getSks() + " SKS)");
        }
    }


}
