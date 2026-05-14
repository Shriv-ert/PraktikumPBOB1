/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utils;

import java.sql.*;

/**
 *
 * @author vert
 */
public class MysqlUtility {
    private static Connection connection;
    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root", "12345");
                if(connection != null) {
                    System.out.println("Koneksi berhasil!");
                }
            } catch (ClassNotFoundException e) {
                System.out.println("Driver tidak ditemukan: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Koneksi gagal: " + e.getMessage());
            }
        }
        return connection;
    }
}
