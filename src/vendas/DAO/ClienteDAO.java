package vendas.DAO;

import connection.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import vendas.beans.Cliente;


public class ClienteDAO {
    private Connection con = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    public ClienteDAO() {
        this.con = ConnectionFactory.getConnection();
    }
    
    public boolean create(String nome){
        String query = "INSERT INTO cliente VALUES(DEFAULT, ?)";
        boolean b = false;
        try {
            stmt = con.prepareStatement(query);
            stmt.setString(1, nome);
            stmt.executeUpdate();
            b = true;
        } catch (SQLException ex) {
            System.err.println("erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return b;
    }
    
    public boolean update(int id, String nome){
        String query = "UPDATE cliente SET nome_cliente = ? WHERE cliente.id_cliente = ?";
        boolean b = false;
        try {
            stmt = con.prepareStatement(query);
            stmt.setString(1, nome);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            b = true;
        } catch (SQLException ex) {
            System.err.println("erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return b;
    }
    
    public List<Cliente> readAll(){
        String query = "SELECT * FROM  cliente";
        List<Cliente> clientes = new ArrayList<>();
        try {
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getInt("id_cliente"));
                c.setNome(rs.getString("nome_cliente"));
                clientes.add(c);
            }
        } catch (SQLException ex) {
            System.err.println("erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return clientes;
    }
    
    
    @SuppressWarnings("empty-statement")
    public List<Cliente> read(String nome, String id){
        String query;
        if(nome==null){nome = "";};
        List<Cliente> clientes = new ArrayList<>();
        if(id==null){
            query = "SELECT * FROM cliente WHERE  nome_cliente LIKE ?";
            try {
                stmt = con.prepareStatement(query);
                stmt.setString(1, "%"+nome+"%");
                rs = stmt.executeQuery();
                while(rs.next()){
                    Cliente c = new Cliente();
                    c.setId(rs.getInt("id_cliente"));
                    c.setNome(rs.getString("nome_cliente"));
                    clientes.add(c);
                }
            } catch (SQLException ex) {
                System.err.println("erro: " + ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }    
        }else{
            query = "SELECT * FROM cliente WHERE id_cliente = ? AND nome_cliente LIKE ?"; 
            try {
                stmt = con.prepareStatement(query);
                stmt.setInt(1, Integer.parseInt(id));
                stmt.setString(2, "%"+nome+"%");
                rs = stmt.executeQuery();
                while(rs.next()){
                    Cliente c = new Cliente();
                    c.setId(rs.getInt("id_cliente"));
                    c.setNome(rs.getString("nome_cliente"));
                    clientes.add(c);
                }
                
            } catch (SQLException ex) {
                System.err.println("erro: " + ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
        } 
        return clientes;
    }
 
}
