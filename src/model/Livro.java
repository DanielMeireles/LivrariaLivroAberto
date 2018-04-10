/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class Livro {
    private String codigo;
    private String titulo;
    private String fornecedor;
    private int quantidadeEstoque;
    private float valorUnitario;
    private Date dataPublicacao;

    public Livro() {
    }

    public Livro(String codigo, String titulo, String fornecedor, int quantidadeEstoque, float valorUnitario, Date dataPublicação) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fornecedor = fornecedor;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorUnitario = valorUnitario;
        this.dataPublicacao = dataPublicação;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Date getDataPublicação() {
        return dataPublicacao;
    }

    public void setDataPublicação(String dt) {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dataPublicacao = (Date) f.parse(dt);
        } catch (ParseException ex) {
            dataPublicacao = null;
        }
    }
    
    public void setDataPublicação(Date dt) {
        dataPublicacao = dt;
    }
    
    @Override
    public String toString(){
        
        String str = "Livro:";
        str = str + "\nCódigo: " + codigo;
        str = str + "\nTítulo: " + titulo;
        str = str + "\nTítulo: " + fornecedor;
        str = str + "\nQuantidade em estoque: " + quantidadeEstoque;
        str = str + "\nValor unitário: " + valorUnitario;
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        String dt = f.format(dataPublicacao);
        str = str + "\nData de publicação: " + dt;
        return str;
    }

    public boolean validaLivro(){
        return !codigo.equals("") && 
                !titulo.equals("") &&
                valorUnitario != 0.00 &&
                dataPublicacao != null;
    }
}
