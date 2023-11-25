/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author GUI
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DB {
    private Connection conexao;
    private static DB instancia;

    private DB() throws SQLException {
        conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/sracai", "root", "root");
    }

    public Connection getConnection() {
        return conexao;
    }

    public static DB getInstancia() throws SQLException {
        if (instancia == null)
            instancia = new DB();
        return instancia;
    }
}
