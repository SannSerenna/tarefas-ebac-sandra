package dao;

import java.util.HashMap;
import java.util.Map;

public class ContratoDao implements IContratoDao {
    private Map<Integer, String> bancoDeDados = new HashMap<>();

    @Override
    public void salvar() {
        System.out.println("Contrato salvo com sucesso!");
    }

    @Override
    public String buscar(int id) {
        return bancoDeDados.getOrDefault(id, "Contrato não encontrado");
    }

    @Override
    public void excluir(int id) {
        bancoDeDados.remove(id);
        System.out.println("Contrato excluído!");
    }
}
