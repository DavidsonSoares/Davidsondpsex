/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroaluno;
import java.sql.*;
/**
 *
 * @author Lab 01_00
 */
public class ConexaoBanco {
    
    
        public ConexaoBanco(){
        }
        private static Connection conn = null;
        private static  Statement db_Statement = null;
        
        public static Connection getInstanceConn()
        {
            try {
                 if (conn == null || conn.isClosed())
                 {    
                 conn = null;
                 Conexao conexao = new Conexao();
                 conn = conexao.getConexao();
                 conn.setAutoCommit(true);
                     Statement db_statement = conn.createStatement();
            }
            }     
                
            
                catch (Exception e) 
                {
            
                    System.out.println("0.Erro ao conectar com o banco.Erro:"+e.getMessage());
             
            
        }       
            return null;
        }
        public static Statement getInstanceStatement()throws Exception
        {
            if (db_Statement == null)
            {
                getInstanceConn();
            }
            return  db_Statement;
            }
        public static void CloseIntancConn() throws Exception
        {
            if(conn != null)
                if(! conn.isClosed())
                    conn.close();
            conn = null;
            db_Statement = null;
        }
        
        
    }
        



