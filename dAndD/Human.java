public class Human {
    public int strength;
    public int stealth;
    public int intelligence;
    public int health;

    public void attck(Human victim) {
        victim.health = victim.health - this.strength;
    }

    public Human() {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }
    public void getStats() {
        System.out.println("Health: " + this.health + " Strength: " + this.strength + " Intelligence: " + " Stealth: " + this.stealth);
    }
}