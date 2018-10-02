public class Wizard extends Human {
    public void heal(Human human) {
        human.health = human.health + this.intelligence;
        System.out.println("Smoke these special herbs, they have healing properties.");
    }
    public void fireball(Human human) {
        human.health = human.health - this.intelligence * 3;
        System.out.println("YUGA FLAME!!!");
    }

    public Wizard() {
        this.health = 50;
        this.intelligence = 8;
    }
}