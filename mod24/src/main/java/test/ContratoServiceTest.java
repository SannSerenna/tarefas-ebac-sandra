package test;

import dao.IContratoDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.ContratoService;
import service.IContratoService;

import static org.mockito.Mockito.*;

public class ContratoServiceTest {

    private IContratoDao contratoDaoMock;
    private IContratoService contratoService;

    @BeforeEach
    public void setup() {
        contratoDaoMock = mock(IContratoDao.class);
        contratoService = new ContratoService(contratoDaoMock);
    }

    @Test
    public void testSalvarContrato() {
        contratoService.salvar();
        verify(contratoDaoMock, times(1)).salvar();
    }

    @Test
    public void testBuscarContrato() {
        when(contratoDaoMock.buscar(1)).thenReturn("Contrato encontrado");
        String resultado = contratoService.buscar(1);
        Assertions.assertEquals("Contrato encontrado", resultado);
    }

    @Test
    public void testExcluirContrato() {
        contratoService.excluir(1);
        verify(contratoDaoMock, times(1)).excluir(1);
    }
}
