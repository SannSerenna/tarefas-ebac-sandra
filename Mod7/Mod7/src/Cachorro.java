/**
 * A classe Cachorro representa um cachorro com propriedades básicas e comportamentos simples.
 * Propriedades:
 * - nome: o nome do cachorro.
 * - idade: a idade do cachorro em anos.
 * - raca: a raça do cachorro.
 * Métodos:
 * - latir(): Imita o som que um cachorro faz.
 * - correr(): Simula o comportamento de um cachorro correndo.
 * - apresentar(): Exibe uma mensagem com o nome e a idade do cachorro.
 */
public class Cachorro {
    // Propriedades da classe Cachorro
    private String nome;
    private int idade;
    private String raca;

    /**
     * Construtor da classe Cachorro.
     *
     * @param nome o nome do cachorro
     * @param idade a idade do cachorro em anos
     * @param raca a raça do cachorro
     */
    public Cachorro(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    /**
     * Método para o cachorro latir.
     */
    public void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    /**
     * Método para o cachorro correr.
     */
    public void correr() {
        System.out.println(nome + " está correndo!");
    }

    /**
     * Método para apresentar o cachorro.
     */
    public void apresentar() {
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos e sou da raça " + raca + ".");
    }

    // Métodos getters e setters para acessar e modificar as propriedades

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
