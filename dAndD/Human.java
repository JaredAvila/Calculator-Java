public class Human {
    public int strength;
    public int stealth;
    public int intelligence;
    public int health;

    public void attck(Human victim) {
        victim.health = victim.health - this.strength;
        System.out.println("You got knocked the f*** out, man! ");

    }

    public Human() {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }
    public void getStats() {
        System.out.println(this.getClass() + ": stats -------------\nHealth: " + this.health + " Strength: " + this.strength + " Intelligence: " + " Stealth: " + this.stealth);
    }
}