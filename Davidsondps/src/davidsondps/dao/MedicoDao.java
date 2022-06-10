/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package davidsondps.dao;

import davidsondps.factory.Conexao;
import davidsondps.gui.Medico;
import java.util.ArrayList;



public class MedicoDao extends Conexao {
    
    public String CadastroMedico (Medico medico)
            
    {
    try
    {
        String sentenca;
        sentenca = "INSERT INTO MEDICO VALUES(NULL,'" + medico.getNome() +
                medico.getEspecialidade() +  "','" + medico.getIdade () + 
                medico.getCrm () + "')";
                
                return this.atualizarBanco(sentenca);
                        }
    catch (Exception e)
    {
        return e.getMessage();
        
     
    }
    }


    public String atualizarMedico (Medico medico){
    try
    {
        String sentenca;
        sentenca = "UPDATE  MEDICO SET NOME ='" + medico.getNome() +
                "' ,CPF = '" +  medico.getCpf () + "',ESPECIALIDADE ='" + medico.getEspecialidade () +
                "' , CRM = '" + medico.getCrm();
                return this.atualizarBanco(sentenca);
                        }
    catch (Exception e)
    {
        return e.getMessage();
    }
    
 }
 public String excluirMedico (Medico medico)
            
    {
    try
    {
        String sentenca;
        String idMedico = null;
        sentenca = "DELETE FROM MEDICO WHERE IDPACIENTE =" + idMedico;
                
                
                return this.atualizarBanco(sentenca);
                        }
    catch (Exception e)
    {
        return e.getMessage();

}
}

public ArrayList listarMedico()
{
    try
    {
        ArrayList medicos = new ArrayList();
       String sentenca =" SELECT * FROM MEDICO ORDER BY NOME";
       var rs = this.getResultSet(sentenca);
        while (rs.next())
        {
        Medico medico = new Medico();
        medico.setIdMedico(rs.getInt("IDMEDICO"));
        medico.setNome(rs.getString("NOME"));
        medico.setCpf(rs.getString("CPF"));
        medico.setEspecialidade(rs.getString("ESPECIALIDADE"));
        medicos.add(medico);
        }
        return medicos;
        
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
        return null;
    }
}
}
