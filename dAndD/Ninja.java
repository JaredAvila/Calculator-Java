public class Ninja extends Human {
    public Ninja() {
        this.stealth = 10;
    }
    public void steal(Human human) {
        System.out.println("I like stealin'! I like taking things!");
        human.health -= this.stealth;
        this.health += this.stealth;
    }

    public void runAway() {
        System.out.println("RUN AWAY!!!!!");
        this.health -= 10;
    }
}