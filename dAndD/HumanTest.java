public class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();
        Wizard gandalf = new Wizard();
        Ninja stormShadow = new Ninja();
        Samurai jaredAvila = new Samurai();
        Samurai homer = new Samurai();
        Samurai bart = new Samurai();

        human1.attck(human2);
        gandalf.fireball(human1);
        gandalf.heal(human2);
        stormShadow.steal(human1);
        stormShadow.runAway();
        jaredAvila.deathBlow(gandalf);
        bart.meditate();
        homer.meditate();
        human1.getStats();
        human2.getStats();
        gandalf.getStats();
        stormShadow.getStats();
        jaredAvila.getStats();
        jaredAvila.meditate();
        jaredAvila.getStats();
        System.out.println(jaredAvila.howMany());
        
    }
}