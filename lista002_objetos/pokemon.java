import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class pokemon{
    int num;
    public pokemon(int num){
        this.num = num;
    }
    
    public void gerar(){
        Map<String, String> pokemons = new HashMap<>();

        pokemons.put("Bulbasaur", "Grama/Veneno");
        pokemons.put("Ivysaur", "Grama/Veneno");
        pokemons.put("Venusaur", "Grama/Veneno");
        pokemons.put("Charmander", "Fogo");
        pokemons.put("Charmeleon", "Fogo");
        pokemons.put("Charizard", "Fogo/Voador");
        pokemons.put("Squirtle", "Água");
        pokemons.put("Wartortle", "Água");
        pokemons.put("Blastoise", "Água");
        pokemons.put("Caterpie", "Inseto");
        pokemons.put("Metapod", "Inseto");
        pokemons.put("Butterfree", "Inseto/Voador");
        pokemons.put("Weedle", "Inseto/Veneno");
        pokemons.put("Kakuna", "Inseto/Veneno");
        pokemons.put("Beedrill", "Inseto/Veneno");
        pokemons.put("Pidgey", "Normal/Voador");
        pokemons.put("Pidgeotto", "Normal/Voador");
        pokemons.put("Pidgeot", "Normal/Voador");
        pokemons.put("Rattata", "Normal");
        pokemons.put("Raticate", "Normal");
        pokemons.put("Spearow", "Normal/Voador");
        pokemons.put("Fearow", "Normal/Voador");
        pokemons.put("Ekans", "Veneno");
        pokemons.put("Arbok", "Veneno");
        pokemons.put("Pikachu", "Elétrico");
        pokemons.put("Raichu", "Elétrico");
        pokemons.put("Sandshrew", "Terra");
        pokemons.put("Sandslash", "Terra");
        pokemons.put("Nidoran♀", "Veneno");
        pokemons.put("Nidorina", "Veneno");
        pokemons.put("Nidoqueen", "Veneno/Terra");
        pokemons.put("Nidoran♂", "Veneno");
        pokemons.put("Nidorino", "Veneno");
        pokemons.put("Nidoking", "Veneno/Terra");
        pokemons.put("Clefairy", "Normal");
        pokemons.put("Clefable", "Normal");
        pokemons.put("Vulpix", "Fogo");
        pokemons.put("Ninetales", "Fogo");
        pokemons.put("Jigglypuff", "Normal");
        pokemons.put("Wigglytuff", "Normal");
        pokemons.put("Zubat", "Veneno/Voador");
        pokemons.put("Golbat", "Veneno/Voador");
        pokemons.put("Oddish", "Grama/Veneno");
        pokemons.put("Gloom", "Grama/Veneno");
        pokemons.put("Vileplume", "Grama/Veneno");
        pokemons.put("Paras", "Inseto/Grama");
        pokemons.put("Parasect", "Inseto/Grama");
        pokemons.put("Venonat", "Inseto/Veneno");
        pokemons.put("Venomoth", "Inseto/Veneno");
        pokemons.put("Diglett", "Terra");
        pokemons.put("Dugtrio", "Terra");
        pokemons.put("Meowth", "Normal");
        pokemons.put("Persian", "Normal");
        pokemons.put("Psyduck", "Água");
        pokemons.put("Golduck", "Água");
        pokemons.put("Mankey", "Lutador");
        pokemons.put("Primeape", "Lutador");
        pokemons.put("Growlithe", "Fogo");
        pokemons.put("Arcanine", "Fogo");
        pokemons.put("Poliwag", "Água");
        pokemons.put("Poliwhirl", "Água");
        pokemons.put("Poliwrath", "Água/Lutador");
        pokemons.put("Abra", "Psíquico");
        pokemons.put("Kadabra", "Psíquico");
        pokemons.put("Alakazam", "Psíquico");
        pokemons.put("Machop", "Lutador");
        pokemons.put("Machoke", "Lutador");
        pokemons.put("Machamp", "Lutador");
        pokemons.put("Bellsprout", "Grama/Veneno");
        pokemons.put("Weepinbell", "Grama/Veneno");
        pokemons.put("Victreebel", "Grama/Veneno");
        pokemons.put("Tentacool", "Água/Veneno");
        pokemons.put("Tentacruel", "Água/Veneno");
        pokemons.put("Geodude", "Pedra/Terra");
        pokemons.put("Graveler", "Pedra/Terra");
        pokemons.put("Golem", "Pedra/Terra");
        pokemons.put("Ponyta", "Fogo");
        pokemons.put("Rapidash", "Fogo");
        pokemons.put("Slowpoke", "Água/Psíquico");
        pokemons.put("Slowbro", "Água/Psíquico");
        pokemons.put("Magnemite", "Elétrico/Aço");
        pokemons.put("Magneton", "Elétrico/Aço");
        pokemons.put("Farfetch'd", "Normal/Voador");
        pokemons.put("Doduo", "Normal/Voador");
        pokemons.put("Dodrio", "Normal/Voador");
        pokemons.put("Seel", "Água");
        pokemons.put("Dewgong", "Água/Gelo");
        pokemons.put("Grimer", "Veneno");
        pokemons.put("Muk", "Veneno");
        pokemons.put("Shellder", "Água");
        pokemons.put("Cloyster", "Água/Gelo");
        pokemons.put("Gastly", "Fantasma/Veneno");
        pokemons.put("Haunter", "Fantasma/Veneno");
        pokemons.put("Gengar", "Fantasma/Veneno");
        pokemons.put("Onix", "Pedra/Terra");
        pokemons.put("Drowzee", "Psíquico");
        pokemons.put("Hypno", "Psíquico");
        pokemons.put("Krabby", "Água");
        pokemons.put("Kingler", "Água");
        pokemons.put("Voltorb", "Elétrico");
        pokemons.put("Electrode", "Elétrico");
        pokemons.put("Exeggcute", "Grama/Psíquico");
        pokemons.put("Exeggutor", "Grama/Psíquico");
        pokemons.put("Cubone", "Terra");
        pokemons.put("Marowak", "Terra");
        pokemons.put("Hitmonlee", "Lutador");
        pokemons.put("Hitmonchan", "Lutador");
        pokemons.put("Lickitung", "Normal");
        pokemons.put("Koffing", "Veneno");
        pokemons.put("Weezing", "Veneno");
        pokemons.put("Rhyhorn", "Terra/Pedra");
        pokemons.put("Rhydon", "Terra/Pedra");
        pokemons.put("Chansey", "Normal");
        pokemons.put("Tangela", "Grama");
        pokemons.put("Kangaskhan", "Normal");
        pokemons.put("Horsea", "Água");
        pokemons.put("Seadra", "Água");
        pokemons.put("Goldeen", "Água");
        pokemons.put("Seaking", "Água");
        pokemons.put("Staryu", "Água");
        pokemons.put("Starmie", "Água/Psíquico");
        pokemons.put("Mr. Mime", "Psíquico");
        pokemons.put("Scyther", "Inseto/Voador");
        pokemons.put("Jynx", "Gelo/Psíquico");
        pokemons.put("Electabuzz", "Elétrico");
        pokemons.put("Magmar", "Fogo");
        pokemons.put("Pinsir", "Inseto");
        pokemons.put("Tauros", "Normal");
        pokemons.put("Magikarp", "Água");
        pokemons.put("Gyarados", "Água/Voador");
        pokemons.put("Lapras", "Água/Gelo");
        pokemons.put("Ditto", "Normal");
        pokemons.put("Eevee", "Normal");
        pokemons.put("Vaporeon", "Água");
        pokemons.put("Jolteon", "Elétrico");
        pokemons.put("Flareon", "Fogo");
        pokemons.put("Porygon", "Normal");
        pokemons.put("Omanyte", "Pedra/Água");
        pokemons.put("Omastar", "Pedra/Água");
        pokemons.put("Kabuto", "Pedra/Água");
        pokemons.put("Kabutops", "Pedra/Água");
        pokemons.put("Aerodactyl", "Pedra/Voador");
        pokemons.put("Snorlax", "Normal");
        pokemons.put("Articuno", "Gelo/Voador");
        pokemons.put("Zapdos", "Elétrico/Voador");
        pokemons.put("Moltres", "Fogo/Voador");
        pokemons.put("Dratini", "Dragão");
        pokemons.put("Dragonair", "Dragão");
        pokemons.put("Dragonite", "Dragão/Voador");
        pokemons.put("Mewtwo", "Psíquico");
        pokemons.put("Mew", "Psíquico");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<String> nomesPokemon = new ArrayList<>(pokemons.keySet());

        for (int rep = 0; rep < this.num; rep++) {
            String nomeAleatorio = nomesPokemon.get(random.nextInt(nomesPokemon.size()));

            String tipoCorrespondente = pokemons.get(nomeAleatorio);

            int nivelAleatorio = random.nextInt(100) + 1;

            System.out.println(nomeAleatorio + " é um Pokémon do tipo " + tipoCorrespondente + " de nível " + nivelAleatorio + ".");
        }

        scanner.close();
    }
}