public class Main
{
	public static void main(String[] args) {
		senha Senha01 = new senha(5);
		Senha01.gerar();
		System.out.print("----------------------------\n");
		jogador Jogador01 = new jogador(2);
		Jogador01.gerar();
        System.out.print("----------------------------\n");
        pokemon Pokemon01 = new pokemon(3);
        Pokemon01.gerar();
	}
	
}