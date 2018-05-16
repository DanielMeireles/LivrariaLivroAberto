/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Venda {
    private static int numero=0;
    private Cliente cliente;
    private List<Item> lista;
    private float valorTotal;
    private Date dataVenda;

    public Venda() {
        numero++;
        lista = new ArrayList<Item>();
        dataVenda = new Date();
    }
    
    public void inserirItem(Item item)
    {
        lista.add(item);
    }
    
    public Item buscarItem(String codigo)
    {
        Item it = null;
        for(Item item: lista)
        {
            if(item.getLivro().getCodigo().equals(codigo)){
                it = item;
            }
        }
        return it;
    }
    
    public void removerItem(String codigo)
    {
        Item item = buscarItem(codigo);
        if(item != null){
            lista.remove(item);
        }
    }
    
    public float calcularValorTotal()
    {
        float soma = 0;
        for(Item item: lista){
            soma += item.getValorItem();
        }
        return soma;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Venda.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getLista() {
        return lista;
    }

    public void setLista(List<Item> lista) {
        this.lista = lista;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
}
