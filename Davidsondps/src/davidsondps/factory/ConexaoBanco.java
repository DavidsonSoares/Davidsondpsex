/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package davidsondps.factory;

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

    private static class Conexao {

        public Conexao() {
        }

        private Connection getConexao() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
        
        
    }