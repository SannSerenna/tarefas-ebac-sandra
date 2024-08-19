package fabrica;

public class FabricaSUVEEntrega implements FabricaDeVeiculos {
    @Override
    public Carro criarCarro() {
        return new SUV();
    }

    @Override
    public Caminhao criarCaminhao() {
        return new CaminhaoEntrega();
    }
}
