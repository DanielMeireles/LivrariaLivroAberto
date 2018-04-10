/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Livro;

/**
 *
 * @author Daniel
 */
public class LivroDao {
    private List<Livro> lista = null;

    public LivroDao() {
        lista = new ArrayList<Livro>();
    }
    
    public void adicionarLivro(Livro livro)
    {
        lista.add(livro);
    }
    
    public Livro buscarLivro(String codigo)
    {
        for(Livro l: lista)
        {
            if(codigo.equals(l.getCodigo()))
            {
                return l;
            }
        }
        return null;
    }
    
    public void removerLivro(String codigo)
    {
        Livro l = buscarLivro(codigo);
        if(l != null)
        {
            lista.remove(l);
        }
    }
    
    public void alterarLivro(Livro livro)
    {
        Livro l = buscarLivro(livro.getCodigo());
        if(l != null)
        {
            int i = lista.indexOf(l);
            lista.set(i, livro);
        }
    }
    
    public List<Livro> todosLivros()
    {
        return lista;
    }
}
