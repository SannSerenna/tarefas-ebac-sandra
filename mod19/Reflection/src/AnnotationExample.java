public class AnnotationExample {
    public static void main(String[] args) {
        Class<MinhaClasse> minhaClasse = MinhaClasse.class;

        if (minhaClasse.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = minhaClasse.getAnnotation(Tabela.class);
            System.out.println("Nome da Tabela: " + tabela.nome());
        } else {
            System.out.println("Annotation Tabela não encontrada.");
        }
    }
}
