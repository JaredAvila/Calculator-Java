public class PokemonTest {
    public static void main(String[] args) {
        Pokedex myDex = new Pokedex();
        Pokemon charmy = myDex.createPokemon("Charmander", "Fire", 100);
        Pokemon squirt = myDex.createPokemon("Squritle", "Water", 100);
        Pokemon pika = myDex.createPokemon("Pikachu", "Electric", 100);
        charmy.attackPokemon(pika);
        pika.attackPokemon(squirt);
        myDex.listPokemon();
        
    }
}