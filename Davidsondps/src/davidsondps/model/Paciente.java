/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package davidsondps.model;

/**
 *
 * @author Davidson
 */
public class Paciente {
    
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
     * @return the Idade
     */
    public int getIdade() {
        return Idade;
    }

    /**
     * @param Idade the Idade to set
     */
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    /**
     * @return the Nome
     */
    public Varchar getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(Varchar Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Cpf
     */
    public Varchar getCpf() {
        return Cpf;
    }

    /**
     * @param Cpf the Cpf to set
     */
    public void setCpf(Varchar Cpf) {
        this.Cpf = Cpf;
    }
    private int idPaciente;
    private int Idade;
    private Varchar Nome;
    private Varchar Cpf;

    private static class Varchar {

        public Varchar() {
        }
    }
    
}
