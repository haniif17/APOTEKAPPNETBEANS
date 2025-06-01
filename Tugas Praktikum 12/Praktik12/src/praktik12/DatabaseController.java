/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik12; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class DatabaseController {

    // Konfigurasi Database
    // Pastikan MySQL server kamu berjalan
    private static final String URL = "jdbc:mysql://localhost:3306/db_apoteksyahdana"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    private static Date lastUpdateTimestamp = new Date();
    
    public static void setLastUpdateTimestamp(Date timestamp){
      DatabaseController.lastUpdateTimestamp = timestamp;  
    }
    
    public static Date getLastUpdateTimestamp(){
        return lastUpdateTimestamp;
    }
    
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Memuat driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Membuat koneksi ke database
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi ke database berhasil!");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver JDBC tidak ditemukan: " + e.getMessage() + "\nPastikan MySQL Connector/J sudah ditambahkan ke Libraries.", "Error Koneksi", JOptionPane.ERROR_MESSAGE);
            System.err.println("Driver JDBC tidak ditemukan: " + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal membuat koneksi ke database: " + e.getMessage() + "\nPastikan MySQL server berjalan dan konfigurasi (URL, User, Password) sudah benar.", "Error Koneksi", JOptionPane.ERROR_MESSAGE);
            System.err.println("Gagal membuat koneksi ke database: " + e.getMessage());
            e.printStackTrace();
        }
        return connection;
    }

    
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Koneksi database ditutup.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal menutup koneksi database: " + e.getMessage(), "Error Tutup Koneksi", JOptionPane.ERROR_MESSAGE);
                System.err.println("Gagal menutup koneksi database: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    
    public static void main(String[] args) {
        Connection conn = DatabaseController.getConnection();
        if (conn != null) {
            DatabaseController.closeConnection(conn);
        }
    }
}