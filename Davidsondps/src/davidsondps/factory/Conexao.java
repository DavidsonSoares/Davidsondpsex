/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package davidsondps.factory;

import davidsondps.factory.ConexaoBanco;
import java.sql.*;

public class Conexao{
    String driver = "com.mysql.jdbv.Drive";
    String banco = "davidsondps";
    String host = "localhost";
    String stringDeConexao = "jdbc:mysql://"+ host + ":3306" + banco + "?serverTimezone=UTC";
    String usuario = "root";
    String senha = "Senha123";
    
    public  Connection conexao;
    
    public  Conexao()
    {
    
    }
     public  Connection getConxao()
     {
         try 
         {
         Class.forName(driver);
         return DiverManager.getConnection(this.stringDeConexao,usuario,senha);
         
         } 
         catch (Exception e)
         {
             System.out.println(e.getMessage());
             return conexao;
         }
     }
        public  ResultSet getResultSet(String sentenca)
        {
            try
            {
                Statement stm = new ConexaoBanco().getInstanceStatement();
                ResultSet rs = stm.executeQuery(sentenca);
                return rs;
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                return null;
                
            }
            }
         
        public  String atualizarBanco(String sentenca)
        {
            try
            {
                Statement stm = new ConexaoBanco().getInstanceStatement();
                stm.executeUpdate(sentenca);
                return "1";
            }
            catch (SQLException e)
            {
                return  e.getMessage();
            }
            catch (Exception ex)
            {
                return ex.getMessage();
                
            }
            }

    Connection getConexao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class DiverManager {

        private static Connection getConnection(String stringDeConexao, String usuario, String senha) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public DiverManager() {
        }
    }
}
        

