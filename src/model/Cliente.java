/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Daniel
 */
public class Cliente {
    private String CPF;
    private String nome;
    private String estadoCivil;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Cliente(String CPF, String nome, String estadoCivil, String telefone, String email) {
        this.CPF = CPF;
        this.nome = nome;
        this.estadoCivil = estadoCivil;
        this.telefone = telefone;
        this.email = email;
        endereco = new Endereco();
    }

    public Cliente(Endereco endereco) {
        this.endereco = endereco;
    }

    public Cliente() {
        endereco = new Endereco();
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString(){
        String str = "Dados do Cliente:";
        str = str + "\nCPF: " + CPF;
        str = str + "\nNome: " + nome;
        str = str + "\nEstado Civil: " + estadoCivil;
        str = str + "\nTelefone: " + telefone;
        str = str + "\ne-mail: " + email;
        str = str + "\n\nEndereço:";
        str = str + "\nCEP: " + endereco.getCEP();
        str = str + "\nLogradouro: " + endereco.getLogradouro();
        str = str + "\nComplemento: " + endereco.getComplemento();
        str = str + "\nCidade: " + endereco.getCidade();
        str = str + "\nEstado: " + endereco.getEstado();
        return str;
    }
    
    public boolean validaCliente(){
        return !CPF.equals("   .   .   -  ") && 
                !nome.equals("") &&
                !estadoCivil.equals("") &&
                !telefone.equals("(  )     -    ") &&
                !email.equals("") &&
                endereco.validaEndereco();
    }
}
