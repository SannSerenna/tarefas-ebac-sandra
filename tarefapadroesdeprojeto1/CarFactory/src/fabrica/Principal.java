package fabrica;

public class Principal {
    public static void main(String[] args) {
        FabricaDeVeiculos fabrica1 = new FabricaSedanEPickup();
        Carro carro1 = fabrica1.criarCarro();
        Caminhao caminhao1 = fabrica1.criarCaminhao();
        carro1.dirigir();
        caminhao1.carregar();

        FabricaDeVeiculos fabrica2 = new FabricaSUVEEntrega();
        Carro carro2 = fabrica2.criarCarro();
        Caminhao caminhao2 = fabrica2.criarCaminhao();
        carro2.dirigir();
        caminhao2.carregar();
    }
}
