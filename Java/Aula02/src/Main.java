public class Main {
    public static void main(String[] args){
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Pun: Maverick");

        int anoDoLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDoLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) /3; // Média calculada diretamente na atribuição
        // Comentário de uma linha.
        /* Comentário
           de múltiplas
           linhas.
         */
        System.out.println("Média dos filmes: " + media);
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println("Sinopse: " + sinopse);

        int classificacao = (int) (media / 2); // Casting de double para int
        System.out.println("Classificação indicativa: " + classificacao + " estrelas.");
    }
}
