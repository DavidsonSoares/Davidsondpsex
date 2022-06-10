/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package davidsondps.dao;

import davidsondps.factory.Conexao;
import davidsondps.gui.Paciente;
import java.util.ArrayList;


/**
 *
 * @author Davidson
 */
public class PacienteDAO extends Conexao {
    
    public String CadastroPaciente (Paciente paciente)
            
    {
    try
    {
        String sentenca;
        sentenca = "INSERT INTO PACIENTE VALUES(NULL,'" + paciente.getNome() +
                paciente.getCpf() +  "','" + paciente.getIdade () + "')";
                
                return this.atualizarBanco(sentenca);
                        }
    catch (Exception e)
    {
        return e.getMessage();
        
     
    }
    }


                  public String atualizarPaciente (Paciente paciente)
 {
    try
    {
        String sentenca;
        sentenca = "UPDATE  PACIENTE SET NOME ='" + paciente.getNome() +
                "' ,CPF = '" +  paciente.getCpf () + "',IDADE ='" +
paciente.getIdade();
                return this.atualizarBanco(sentenca);
                        }
    catch (Exception e)
    {
        return e.getMessage();
    }
    
 }
 public String excluirPaciente (Paciente paciente)
            
    {
    try
    {
        String sentenca;
        String idPaciente = null;
        sentenca = "DELETE FROM PACIENTE WHERE IDPACIENTE =" + idPaciente;
                
                
                return this.atualizarBanco(sentenca);
                        }
    catch (Exception e)
    {
        return e.getMessage();

}
}

public ArrayList listarPaciente()
{
    try
    {
        ArrayList pacientes = new ArrayList();
       String sentenca =" SELECT * FROM PACIENTE ORDER BY NOME";
       var rs = this.getResultSet(sentenca);
        while (rs.next())
        {
        Paciente paciente = new Paciente();
        paciente.setIdPaciente(rs.getInt("IDPACIENTE"));
        paciente.setNome(rs.getString("NOME"));
        paciente.setCpf(rs.getString("CPF"));
        paciente.setIdade(rs.getString("IDADE"));
        pacientes.add(paciente);
        }
        return pacientes;
        
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
        return null;
    }
}

    private static class pacientes {

        private static void add(Paciente paciente) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public pacientes() {
        }
    }

}





