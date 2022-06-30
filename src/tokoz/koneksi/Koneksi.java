package tokoz.koneksi;

import java.sql.*;
import javax.swing.JOptionPane;

/* @author 201221008, 201221010, 201221015, 201221018 */

public class Koneksi {
    private static Connection conn;
    
    public static Connection getKoneksi() {
        String host = "jdbc:mysql://localhost/toko-z",
               user = "root",
               pass = "";
        try {
            conn = (Connection)DriverManager.getConnection(host, user, pass);
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return conn;
    }
}