package connection.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/venda";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("erro na conexão", ex);
        }
    }
    
    
    public static void closeConnection(Connection con){
        if(con!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("erro: " + ex);
            }
        }
    }
    
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        if(stmt!=null){
            try{
                con.close();
            }catch(SQLException ex){
                System.err.println("erro: " + ex);
            }
        }
        closeConnection(con);
    }
    
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        if(rs!=null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("erro: " + ex);
            }
        }
        closeConnection(con,stmt);
    }
    
    
    
}
