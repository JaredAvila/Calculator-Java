public abstract class AbstractPokemon implements PokemonInterface {
    public abstract Pokemon createPokemon(String name, String type, int health);
    public String pokemonInfo(Pokemon pokemon){
        return "New pokemon named: " + this.name + " Type: " + this.type + " Health: " + this.health;
    }
}