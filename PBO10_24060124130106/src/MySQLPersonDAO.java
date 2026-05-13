// Nama : Shofwan Fikrul Huda
// NIM : 24060124130106
// Tanggal : 13 Mei 2026
// Deskripsi:
import java.sql.*;

public class MySQLPersonDAO implements PersonDao {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        // membuat koneksi ke database
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root", "12345");
        // membuat statement SQL
        String query = "INSERT INTO person(name) VALUES('" + name + "')";
        System.out.println("Executing query: " + query);
        Statement stmt = con.createStatement();
        stmt.executeUpdate(query);
        // menutup koneksi
        con.close();    
    }
}
