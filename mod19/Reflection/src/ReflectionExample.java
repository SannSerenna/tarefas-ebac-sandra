public class ReflectionExample {
    public static void main(String[] args) {
        // Obter a classe anotada
        Class<MinhaClasse> minhaClasse = MinhaClasse.class;

        // Verificar se a annotation Tabela está presente na classe
        if (minhaClasse.isAnnotationPresent(Tabela.class)) {
            // Obter a annotation
            Tabela tabela = minhaClasse.getAnnotation(Tabela.class);

            // Imprimir o nome da tabela
            System.out.println("Nome da Tabela: " + tabela.nome());
        } else {
            System.out.println("Annotation Tabela não encontrada.");
        }
    }
}
