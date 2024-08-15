import java.util.Scanner;

/**
 * Esta classe calcula a média de quatro notas fornecidas pelo usuário.
 */
public class CalculadoraMedia {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Array para armazenar as notas
        double[] notas = new double[4];

        // Leitura das 4 notas
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcula a média das notas
        double media = calcularMedia(notas);

        // Exibe o resultado
        System.out.println("A média das notas é: " + media);

        // Fecha o scanner
        scanner.close();
    }

    /**
     * Calcula a média das notas fornecidas.
     *
     * @param notas Array com as notas.
     * @return A média das notas.
     */
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
