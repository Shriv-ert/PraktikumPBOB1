/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

/**
 *
 * @author vert
 */
public class Program {
    static MysqlMahasiswaService mhsService = new MysqlMahasiswaService();
    public static void main(String[] args) {
        List<Mahasiswa> listMhs = new ArrayList<>();
        System.out.println("Menambahkan data mahasiswa...");

        // insert
        System.out.println("Insert data mahasiswa...");
        Mahasiswa mhs1 = new Mahasiswa(2345, "Vert");
        mhsService.add(mhs1);
        System.out.println("Berhasil menambahkan data mahasiswa: " + mhs1);
        mhsService.getAll();

        // update
        System.out.println("Update data mahasiswa...");
        Mahasiswa mhsUpdate = mhsService.getById(2345);
        System.out.println("Data mahasiswa sebelum diupdate: " + mhsUpdate);
        mhsUpdate.setNama("Vertika");
        mhsService.update(mhsUpdate);
        System.out.println("Data mahasiswa setelah diupdate: " + mhsService.getById(2345));

        // delete
        System.out.println("Delete data mahasiswa...");
        mhsService.delete(2345);
        System.out.println("Data mahasiswa setelah dihapus: " + mhsService.getById(2345));
        mhsService.getAll();
        
    }
}
