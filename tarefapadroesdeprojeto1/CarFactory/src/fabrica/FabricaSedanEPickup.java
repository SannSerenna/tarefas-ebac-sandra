package fabrica;

public class FabricaSedanEPickup implements FabricaDeVeiculos {
    @Override
    public Carro criarCarro() {
        return new Sedan();
    }

    @Override
    public Caminhao criarCaminhao() {
        return new CaminhaoPickup();
    }
}
