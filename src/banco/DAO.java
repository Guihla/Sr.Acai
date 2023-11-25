/*package banco;
import java.sql.*;
import javax.swing.JOptionPane;
import model.Cliente;

public class DAO {
    private static PreparedStatement preparedStatement = null;
    private static ResultSet resultSet = null;
    
   DB banco;
    
    private static String CADASTRAR_CLIENTE = "INSERT INTO CLIENTE" + "(id_Cliente, Nome, Endereco, Telefone, Bairro, Qtd_Compras)" + "VALUES (NULL, ?, ?, ?, ?, ?)";
    private static String CONSULTAR_CLIENTE = "SELECT * FROM CLIENTE" + "WHERE Nome = ?";
    private static String ATUALIZAR_CLIENTE = " UPDATE CLIENTE " + "Nome = ?, Endereco = ?, Telefone = ?, Bairro = ?, Qtd_Compras = ?" + "WHERE Nome = ?";
    private static String EXCLUIR_CLIENTE = " DELETE FROM CLIENTE " + "WHERE Nome = ?";
    private static String CONSULTAR_USUARIO = " SELECT USUARIO, SENHA " + "FROM USUARIO" + "WHERE USUARIO = ?" + "SND SENHA = ?";
    
    public DAO(){
        
    }
    
    public void cadastrarCliente(Cliente cliente) throws SQLException{
        
        banco = DB.getInstancia();
        Connection connection = banco.getConnection();
        
        String query = CADASTRAR_CLIENTE;
        
        try{
            preparedStatement = connection.prepareStatement(query);
            int i = 0;
        
            preparedStatement.setString(i++, cliente.getNome());
            preparedStatement.setString(i++, cliente.getEndereco());
            preparedStatement.setString(i++, cliente.getTelefone());
            preparedStatement.setString(i++, cliente.getBairro());
            preparedStatement.setInt(i++, cliente.getQtd_Compras());
        
            connection.commit();
        
            JOptionPane.showMessageDialog(null, "Cliente cadastrado!");
        }catch(SQLException e){
        }
        
    }
    
    public Cliente listarCliente(String Nome) throws Exception{
        banco = DB.getInstancia();
        Connection connection = banco.getConnection();
        
        Cliente cliente;
        String query = CONSULTAR_CLIENTE;
        
        try{
            preparedStatement = connection.prepareStatement(query);
            int i = 0;
            preparedStatement.setString(i++, Nome);
            
            resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                cliente = new Cliente(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
            }
        }catch(SQLException e){
        //e.printStackTrace();
    }
        return;
    }
}*/