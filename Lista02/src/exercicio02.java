import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class exercicio02 {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Martin");      // Grêmio
        nomes.add("Germán");    // Fluminense
        nomes.add("Róger");     // Corinthians
        nomes.add("Raphael");   // Palmeiras

        List<String> sobrenomes = new ArrayList<>();
        sobrenomes.add("Braithwaite");   // Grêmio
        sobrenomes.add("Cano");     // Fluminense
        sobrenomes.add("Guedes");   // Corinthians
        sobrenomes.add("Veiga");    // Palmeiras

        List<String> posicoes = new ArrayList<>();
        posicoes.add("atacante");   // Suárez
        posicoes.add("atacante");   // Cano
        posicoes.add("atacante");   // Guedes
        posicoes.add("meia");       // Veiga

        List<String> times = new ArrayList<>();
        times.add("Grêmio");
        times.add("Fluminense");
        times.add("Corinthians");
        times.add("Palmeiras");

        Random random = new Random();

        int indiceAleatorio = random.nextInt(nomes.size());

        String nome = nomes.get(indiceAleatorio);
        String sobrenome = sobrenomes.get(indiceAleatorio);
        String posicao = posicoes.get(indiceAleatorio);
        String time = times.get(indiceAleatorio);

        int idade = random.nextInt(21) + 20;

        System.out.println(nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + ". Atualmente defende o " + time + ".");
    }
}