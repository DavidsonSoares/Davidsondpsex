/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package davidsondps.model;

/**
 *
 * @author Davidson
 */
public class Consulta {
    
    /**
     * @return the idConsulta
     */
    public int getIdConsulta() {
        return idConsulta;
    }

    /**
     * @param idConsulta the idConsulta to set
     */
    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    /**
     * @return the idMedico
     */
    public int getIdMedico() {
        return idMedico;
    }

    /**
     * @param idMedico the idMedico to set
     */
    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    /**
     * @return the idPaciente
     */
    public int getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * @return the Convenio
     */
    public varchar getConvenio() {
        return Convenio;
    }

    /**
     * @param Convenio the Convenio to set
     */
    public void setConvenio(varchar Convenio) {
        this.Convenio = Convenio;
    }
    private int idConsulta;
    private int idMedico;
    private int idPaciente;
    private varchar Convenio;

    private static class varchar {

        public varchar() {
        }
    }
    
}
