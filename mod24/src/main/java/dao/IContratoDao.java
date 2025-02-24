package dao;

public interface IContratoDao {
    void salvar();
    String buscar(int id);
    void excluir(int id);
}
