public interface PokemonInterface {
    public abstract Pokemon createPokemon(String name, String type, int health);
    public abstract String pokemonInfo(Pokemon pokemon);
    static void listPokemon() {}
}