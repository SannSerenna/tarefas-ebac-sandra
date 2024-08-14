//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criar um objeto Cachorro
        Cachorro meuCachorro = new Cachorro("Rex", 5, "Labrador");

        // Usar os métodos da classe Cachorro
        meuCachorro.apresentar();
        meuCachorro.latir();
        meuCachorro.correr();

        }
    }