public class Samurai extends Human {
    private static int counter = 0;
    public Samurai() {
        counter++;
        this.health = 200;
    }
    public void deathBlow(Human human) {
        System.out.println("Judo CHOP!");
        human.health = 0;
        this.health -= this.health / 2;
    }

    public void meditate() {
        System.out.println("Clarity of mind...");
        this.health = 200;
    }
    public Integer howMany() {
        return counter;
    }
}