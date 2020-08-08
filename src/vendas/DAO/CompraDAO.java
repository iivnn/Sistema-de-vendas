package vendas.DAO;

import connection.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vendas.beans.Cliente;
import vendas.beans.Compra;
import vendas.beans.Produto;

public class CompraDAO {
    
    private Connection con = null;
    private PreparedStatement stmt = null;
    private ResultSet rs = null;

    public CompraDAO() {
        this.con = ConnectionFactory.getConnection();
    }
    
    
    public boolean newCodigo(int id){
        String query = "INSERT INTO codigo VALUES (DEFAULT, ?, ?)";
        boolean b = false;
        try {
            stmt = con.prepareStatement(query);
            Date d = new Date(new GregorianCalendar().getTimeInMillis());
            stmt.setString(1, d.toString());
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
    
    public int findLastCodigo(int id){
        String query = "SELECT id_codigo from codigo WHERE data_codigo = ? AND "
                    + "fk_cliente_codigo = ? ORDER BY `id_codigo` DESC LIMIT 1";
        int idCodigo = -1;
        try {
            stmt = con.prepareStatement(query);
            Date d = new Date(new GregorianCalendar().getTimeInMillis());
            stmt.setString(1, d.toString());
            stmt.setInt(2, id);
            rs = stmt.executeQuery();
            if(rs.next()){
                idCodigo = rs.getInt("id_codigo");
            }
        } catch (SQLException ex) {
            System.err.println("erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return idCodigo;
    }
    
    public void cancelCodigo(int id){
        String query = "DELETE FROM codigo WHERE id_codigo = ?";
        try {
            stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public void newCompra(Produto p , int id){
        String query = "INSERT INTO compra VALUES (DEFAULT, ?, ?, ?, ?)";
        try {
            stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.setInt(2, p.getId());
            stmt.setInt(3, p.getQnt());
            stmt.setDouble(4, p.getPreco());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public void updateQnt(Produto p){
        String query = "UPDATE produto SET qnt_produto = ? WHERE id_produto = ?";
        try {
            stmt = con.prepareStatement(query);
            stmt.setInt(1, p.getQnt());
            stmt.setInt(2, p.getId());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    
    public List<Compra> read(String data){
        List<Compra> compras = new ArrayList<>();
        String query = "SELECT cliente.id_cliente, cliente.nome_cliente, "
                + "codigo.id_codigo, codigo.data_codigo, compra.qtd_compra, "
                + "compra.preco_compra, produto.id_produto, produto.nome_produto "
                + "FROM `compra` INNER JOIN codigo INNER join cliente INNER JOIN "
                + "produto WHERE codigo.data_codigo = ? AND "
                + "codigo.id_codigo = compra.fk_codigo_compra AND "
                + "produto.id_produto = compra.fk_produto_compra AND "
                + "cliente.id_cliente = codigo.fk_cliente_codigo";

        try {
            stmt = con.prepareStatement(query);
            stmt.setString(1, data);
            rs = stmt.executeQuery();
            compras = createList();
        } catch (SQLException ex) {
            System.err.println("erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return compras;    
    }

    
    public List<Compra> read(int id){
        List<Compra> compras = new ArrayList<>();
        String query = "SELECT cliente.id_cliente, cliente.nome_cliente, "
                + "codigo.id_codigo, codigo.data_codigo, compra.qtd_compra, "
                + "compra.preco_compra, produto.id_produto, produto.nome_produto "
                + "FROM compra INNER JOIN codigo INNER join cliente INNER JOIN "
                + "produto WHERE codigo.id_codigo = ? AND codigo.id_codigo = "
                + "compra.fk_codigo_compra AND produto.id_produto = "
                + "compra.fk_produto_compra AND cliente.id_cliente = "
                + "codigo.fk_cliente_codigo";

        try {
            stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            compras = createList();
        } catch (SQLException ex) {
            System.err.println("erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return compras;    
    }

    
    public List<Compra> read(int id, boolean none){
        List<Compra> compras = new ArrayList<>();
        String query = "SELECT cliente.id_cliente, cliente.nome_cliente, "
                + "codigo.id_codigo, codigo.data_codigo, compra.qtd_compra, "
                + "compra.preco_compra, produto.id_produto, produto.nome_produto "
                + "FROM `compra` INNER JOIN codigo INNER join cliente INNER JOIN "
                + "produto WHERE codigo.fk_cliente_codigo = ? AND "
                + "codigo.id_codigo = compra.fk_codigo_compra AND "
                + "produto.id_produto = compra.fk_produto_compra AND "
                + "cliente.id_cliente = codigo.fk_cliente_codigo";

        try {
            stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            compras = createList();
        } catch (SQLException ex) {
            System.err.println("erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return compras;    
    }
    
    public List<Compra> createList(){
        List<Compra> compras = new ArrayList<>();
        try {
            while(rs.next()){
               Compra c  = new Compra();
               Cliente cl = new Cliente();
               Produto p = new Produto();
               cl.setId(rs.getInt("id_cliente"));
               cl.setNome(rs.getString("nome_cliente"));
               p.setId(rs.getInt("id_produto"));
               p.setNome(rs.getString("nome_produto"));
               p.setPreco(rs.getDouble("preco_compra"));
               p.setQnt(rs.getInt("qtd_compra"));
               c.setId(rs.getInt("id_codigo"));
               c.setData(rs.getDate("data_codigo"));
               c.setProduto(p);
               c.setCliente(cl);
               compras.add(c);
            }
        }catch (SQLException ex) {
            System.err.println("erro: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return compras;
    }
    
    
    
    
}
