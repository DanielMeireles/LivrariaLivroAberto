/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Usuario {
    private String nome;
    private String matricula;
    private String senha;

    public Usuario() {
        this.nome = "Admin";
        this.matricula = "AC2018";
        this.senha = "s1234";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean validaSenha(String senha){
        if (senha.length() != 5){
            return false;
        }
        return true;
    }
    
    public boolean validaMatricula(String matricula){
        if (matricula.length() != 6){
            return false;
        }
        return true;
    }
    
    public boolean efetuarLogin(String matricula, String senha){
        if(matricula.equalsIgnoreCase(this.matricula) && senha.equals(this.senha)){
            return true;
        }
        return false;
    }
}
