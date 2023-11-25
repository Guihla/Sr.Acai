package model;

import banco.DB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cliente {
    private int id_Cliente;
    private String Nome;
    private String Telefone;
    private String Rua;
    private int Numero;
    private String Bairro;
    private int Qtd_Compras;

    public boolean Existe(String Nome) throws SQLException{
        DB banco = DB.getInstancia();
        Connection connection = banco.getConnection();
        String ConsultaSQL = " select * from cliente where Nome = ?";
        ResultSet rs;
        
        try {            
            PreparedStatement Query1 = connection.prepareStatement(ConsultaSQL);
            Query1.setString(1, Nome);
            rs = Query1.executeQuery();
            if (rs.next()) {
                this.Nome = rs.getString("Nome");//pega do banco de dados e coloca na variável
                this.Rua= rs.getString("Rua");
                this.Numero = rs.getInt("Numero");
                this.Bairro = rs.getString("Bairro");
                this.Telefone = rs.getString("Telefone");
                this.Qtd_Compras = rs.getInt("Qtd_Compras");
            }
            else return false;
        } catch (java.sql.SQLException e) {
            System.out.println("Erro " + e.getMessage());
            return false;
        }   
        return true;
    }
    
    public boolean Salvar() throws SQLException{
        DB banco = DB.getInstancia();
        Connection connection = banco.getConnection();
        String InsereSQL = " insert into cliente (id_Cliente, Nome, Rua, Numero, Telefone, Bairro, Qtd_Compras) values (NULL, ?, ?, ?, ?, ?, ?)";
        ResultSet rs;
        
        try {
            PreparedStatement Query1 = connection.prepareStatement(InsereSQL);
            //Query1.setInt(1, Codigo);
            rs = Query1.executeQuery();
                
            
        } catch (java.sql.SQLException e) {
            System.out.println("Erro " + e.getMessage());
            return false;
        }   
        return true;
    } 

    public int getId_Cliente() {
        return id_Cliente;
    }

    public String getNome() {
        return Nome;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getRua() {
        return Rua;
    }

    public int getNumero() {
        return Numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public int getQtd_Compras() {
        return Qtd_Compras;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public void setQtd_Compras(int Qtd_Compras) {
        this.Qtd_Compras = Qtd_Compras;
    }  
}
