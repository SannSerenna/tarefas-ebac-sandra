package service;

import dao.IContratoDao;

public class ContratoService implements IContratoService {

    private final IContratoDao contratoDao;

    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    @Override
    public void salvar() {
        contratoDao.salvar();
    }

    @Override
    public String buscar(int id) {
        return contratoDao.buscar(id);
    }

    @Override
    public void excluir(int id) {
        contratoDao.excluir(id);
    }
}
