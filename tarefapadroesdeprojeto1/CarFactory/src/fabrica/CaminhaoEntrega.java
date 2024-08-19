package fabrica;

public class CaminhaoEntrega implements Caminhao {
    @Override
    public void carregar() {
        System.out.println("Carregando com um caminhão de entrega.");
    }
}
