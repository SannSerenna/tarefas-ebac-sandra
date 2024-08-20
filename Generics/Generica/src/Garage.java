// Garage.java
import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Carro> {
    private List<T> carros;

    public Garage() {
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void exibirCarros() {
        for (T carro : carros) {
            System.out.println(carro.getNome());
            carro.exibirDetalhes();
        }
    }
}
