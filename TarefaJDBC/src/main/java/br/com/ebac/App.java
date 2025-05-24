package br.com.ebac;

import br.com.ebac.dao.ClienteDao;
import br.com.ebac.model.Cliente;

public class App {
    public static void main(String[] args) {
        ClienteDao dao = new ClienteDao();

        Cliente cliente = new Cliente();
        cliente.setNome("João da Silva");
        cliente.setCpf("12345678901");

        dao.cadastrar(cliente);

        Cliente buscado = dao.buscarPorId(cliente.getId());
        System.out.println("Buscado: " + buscado.getNome());

        buscado.setNome("João Silva Atualizado");
        dao.atualizar(buscado);

        dao.excluir(buscado.getId());
    }
}
