/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;


/**
 *
 * @author Daniel
 */
public class ClienteDao
{
    private List<Cliente> lista = null;
    
    public ClienteDao()
    {
        lista = new ArrayList<Cliente>();
    }
    
    public void inserirCliente(Cliente cliente)
    {
        lista.add(cliente);
    }
    
    public Cliente buscarCliente(String cpf)
    {
        for(Cliente c: lista)
        {
            if(cpf.equals(c.getCPF()))
            {
                return c;
            }
        }
        return null;
    }
    
    public void removerCliente(String cpf)
    {
        Cliente c = buscarCliente(cpf);
        if(c != null)
        {
            lista.remove(c);
        }
    }
    
    public void alterarCliente(Cliente c)
    {
        Cliente aux = buscarCliente(c.getCPF());
        if(aux != null)
        {
            int i = lista.indexOf(aux);
            lista.set(i, c);
        }
    }
    
    public List<Cliente> todosClientes()
    {
        return lista;
    }
}
