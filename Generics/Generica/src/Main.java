// Main.java
public class Main {
    public static void main(String[] args) {
        // Criação da garagem para carros
        Garage<Carro> minhaGaragem = new Garage<>();

        // Adicionando carros à garagem
        minhaGaragem.adicionarCarro(new HondaCivic());
        minhaGaragem.adicionarCarro(new FordMustang());

        // Exibindo detalhes dos carros na garagem
        minhaGaragem.exibirCarros();
    }
}