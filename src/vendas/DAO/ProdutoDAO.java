package vendas.DAO;

import connection.factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import vendas.beans.Produto;

public class ProdutoDAO {
    
   private Connection con = null;
   private PreparedStatement stmt = null;
   private ResultSet rs = null;

    public ProdutoDAO() {
        this.con = ConnectionFactory.getConnection();
    }
    

    public List<Produto> read(){
        List<Produto> produtos = new ArrayList<>();
        String query = "SELECT * FROM produto";
       try {
           stmt = con.prepareStatement(query);
           rs = stmt.executeQuery();
           produtos = cretateList();
       }catch (SQLException ex) {
           System.err.println("erro: " + ex);
       }finally{
           ConnectionFactory.closeConnection(con,stmt,rs);
       }
       return produtos;
    }//todos
    
    
    public List<Produto> read(int id){
        List<Produto> produtos = new ArrayList<>();
        String query = "SELECT * FROM produto WHERE id_produto = ?";
       try {
           stmt = con.prepareStatement(query);
           stmt.setInt(1, id);
           rs = stmt.executeQuery();
           produtos = cretateList();
       } catch (SQLException ex) {
           System.err.println("erro: " + ex);
       }finally{
           ConnectionFactory.closeConnection(con,stmt,rs);
       }
       return produtos;
    }//id
    
    
    public List<Produto> read(String nome){
        List<Produto> produtos = new ArrayList<>();
        String query = "SELECT * FROM produto WHERE nome_produto LIKE ?";
       try {
           stmt = con.prepareStatement(query);
           stmt.setString(1, "%"+nome+"%");
           rs = stmt.executeQuery();
           produtos = cretateList();
       } catch (SQLException ex) {
           System.err.println("erro: " + ex);
       }finally{
           ConnectionFactory.closeConnection(con,stmt,rs);
       }
       return produtos;
    }//nome
    
    
    public List<Produto> read(int qnt, char op){
        List<Produto> produtos = new ArrayList<>();
        String query = "SELECT * FROM produto WHERE qnt_produto ";
        query += op + " ?";
       try {
           stmt = con.prepareStatement(query);
           stmt.setInt(1, qnt);
           rs = stmt.executeQuery();
           produtos = cretateList();
       } catch (SQLException ex) {
           System.err.println("erro: " + ex);
       }finally{
           ConnectionFactory.closeConnection(con,stmt,rs);
       }
       return produtos;
    }//quantidade
    
    
    public List<Produto> read(double preco, char op){
        List<Produto> produtos = new ArrayList<>();
        String query = "SELECT * FROM produto WHERE preco_produto ";
        query += op + " ?";
       try {
           stmt = con.prepareStatement(query);
           stmt.setDouble(1, preco);
           rs = stmt.executeQuery();
           produtos = cretateList();
       } catch (SQLException ex) {
           System.err.println("erro: " + ex);
       }finally{
           ConnectionFactory.closeConnection(con,stmt,rs);
       }
       return produtos;
    }//preco

    
    public List<Produto> read(String nome, int qnt, char op){
        List<Produto> produtos = new ArrayList<>();
        String query = "SELECT * FROM produto WHERE nome_produto LIKE ? AND qnt_produto";
        query += op + " ?";
       try {
           stmt = con.prepareStatement(query);
           stmt.setString(1, "%"+nome+"%");
           stmt.setInt(2, qnt);
           rs = stmt.executeQuery();
           produtos = cretateList();
       } catch (SQLException ex) {
           System.err.println("erro: " + ex);
       }finally{
           ConnectionFactory.closeConnection(con,stmt,rs);
       }
       return produtos;
    }//nome + quantidade
    
    
    public List<Produto> read(String nome, double preco, char op){
        List<Produto> produtos = new ArrayList<>();
        String query = "SELECT * FROM produto WHERE nome_produto LIKE ? AND preco_produto";
        query += op + " ?";
       try {
           stmt = con.prepareStatement(query);
           stmt.setString(1, "%"+nome+"%");
           stmt.setDouble(2, preco);
           rs = stmt.executeQuery();
           produtos = cretateList();
       } catch (SQLException ex) {
           System.err.println("erro: " + ex);
       }finally{
           ConnectionFactory.closeConnection(con,stmt,rs);
       }
       return produtos;
    }//nome + preco
    
    
    public List<Produto> read(int qnt, double preco, char op, char op2){
        List<Produto> produtos = new ArrayList<>();
        String query = "SELECT * FROM produto WHERE qnt_produto ";
        query += op + " ? AND preco_produto ";
        query += op2 + " ?";
       try {
           stmt = con.prepareStatement(query);
           stmt.setInt(1, qnt);
           stmt.setDouble(2, preco);
           rs = stmt.executeQuery();
           produtos = cretateList();
       } catch (SQLException ex) {
           System.err.println("erro: " + ex);
       }finally{
           ConnectionFactory.closeConnection(con,stmt,rs);
       }
       return produtos;
    }//preco + quantidade
    
    
    public List<Produto> read(String nome, int qnt, char op, double preco, char op2){
        List<Produto> produtos = new ArrayList<>();
        String query = "SELECT * FROM produto WHERE nome_produto LIKE ? AND qnt_produto ";
        query += op + " ? AND preco_produto ";
        query += op2 + " ?";
       try {
           stmt = con.prepareStatement(query);
           stmt.setInt(2, qnt);
           stmt.setString(1, "%"+nome+"%");
           stmt.setDouble(3, preco);
           rs = stmt.executeQuery();
           produtos = cretateList();
       } catch (SQLException ex) {
           System.err.println("erro: " + ex);
       }finally{
           ConnectionFactory.closeConnection(con,stmt,rs);
       }
       return produtos;
    }//nome + quantidade + preco
    
    
    public List<Produto> cretateList(){
        List<Produto> produtos = new ArrayList<>();
       try {
           while(rs.next()){
               Produto p = new Produto();
               p.setId(rs.getInt("id_produto"));
               p.setNome(rs.getString("nome_produto"));
               p.setQnt(rs.getInt("qnt_produto"));
               p.setPreco(rs.getDouble("preco_produto"));
               produtos.add(p);
           }
       } catch (SQLException ex) {
           System.err.println("erro: " + ex);
       }finally{
           ConnectionFactory.closeConnection(con,stmt,rs);
       }
       return produtos;
    }
    
    
    
    
    
    
   
   
   
   
}
