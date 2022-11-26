package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
  *
  * @author savioolicampos
  */

public class ConnectionDAO {
    public Connection connection() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/musicart";
            conn = DriverManager.getConnection(url, "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver não encontrado: Classe ConnectionDAO");
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro de SQL: Classe ConnectionDAO");
            System.out.println(ex.getMessage());
        }

        return conn;
    }
}