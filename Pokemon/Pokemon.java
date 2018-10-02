import java.util.*;

public class Pokemon{
    //member vaiables
    private int count = 0;
    public String name;
    public int health;
    public String type;

    //Getters and Setters

    public void getName(){
        System.out.println(this.name);
    }

    public void getHealth(){
        System.out.println(this.health);
    }

    public void getType(){
        System.out.println(this.type);
    }

    public void setHealth(int health){
        this.health = health;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    //constructors

    public Pokemon(String name, String type, int health) {
        this.name = name;
        this.type = type;
        this.health = health;
        count++;
        System.out.println("created from Pokemon Class");
    }

    //methods

    

    public void attackPokemon(Pokemon poke) {
        poke.health -= 10;
    }

}