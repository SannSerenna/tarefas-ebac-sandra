package fabrica;

public class CaminhaoPickup implements Caminhao {
    @Override
    public void carregar() {
        System.out.println("Carregando com um caminhão pickup.");
    }
}
