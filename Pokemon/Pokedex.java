public class Pokedex extends AbstractPokemon {
    private List<Pokemon> pokedex = new ArrayList<Pokemon>();
    public Pokemon createPokemon(String name, String type, int health) {
        pokemon = new Pokemon(name, type, health);
        Pokedex.add(pokemon);        
        return pokemon;
    }
    public listPokemon() {
        for (String poke : pokedex) {
            System.out.println(poke);
        }
    }
}