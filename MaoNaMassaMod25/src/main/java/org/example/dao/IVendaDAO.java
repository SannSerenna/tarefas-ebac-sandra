package org.example.dao;

import org.example.dao.generic.IGenericDAO;
import org.example.domain.Venda;
import org.example.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends org.example.dao.IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;

    Boolean cadastrar(Venda venda);

    Venda consultar(String codigo);

    void alterar(Venda venda);
}