package vendas.DAO;

import connection.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
