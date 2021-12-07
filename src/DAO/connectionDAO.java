package DAO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDAO {

    public Connection connectDB () {

        Connection conn = null;

        try {
            String url = "jdbc:mysql//localhost:3306:Project1?user=root&password=MelissaJackQueline1??";
            conn = DriverManager.getConnection(url);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "connectionDAO" + e.getMessage());
        }

        return conn;
    }
}
