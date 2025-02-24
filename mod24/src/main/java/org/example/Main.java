package org.example;

import dao.ContratoDao;
import service.ContratoService;
import service.IContratoService;

public class Main {
    public static void main(String[] args) {
        service.IContratoService contratoService = new ContratoService(new ContratoDao());

        contratoService.salvar();
        System.out.println(contratoService.buscar(1));
        contratoService.excluir(1);
    }
}