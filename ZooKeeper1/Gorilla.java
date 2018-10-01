public class Gorilla extends Mamal {
    public void throwSomething() {
        System.out.println("The gorilla threw something at you!");
        this.energyLevel -= 5;
    }
    public void eatBanana() {
        System.out.println("The gorilla ate a banana and is extremely satiated.");
        this.energyLevel += 10;
    }
    public void climb() {
        System.out.println("Gorilla is climbing. Be careful!");
        this.energyLevel -= 10;
    }
}