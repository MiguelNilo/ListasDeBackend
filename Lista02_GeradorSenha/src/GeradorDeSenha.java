import java.util.Random;

public class GeradorDeSenha {

    public static void main(String[] args) {
        char[] caracteres = new char[62];
        int indice = 0;

        for (char c = 'A'; c <= 'Z'; c++) {
            caracteres[indice++] = c;
        }

        for (char c = 'a'; c <= 'z'; c++) {
            caracteres[indice++] = c;
        }

        for (char c = '0'; c <= '9'; c++) {
            caracteres[indice++] = c;
        }

        char[] senhaArray = new char[8];
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length);
            senhaArray[i] = caracteres[indiceAleatorio];
        }

        String senha = new String(senhaArray);
        System.out.println("Senha gerada: " + senha);
    }
}
