public class PhoneTest {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 100, "Ring-a-ling-ding-ding-dong", "Verizon");
        IPhone iphoneX = new IPhone("X", 75, "Ring-Crash", "AT&T");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());

        iphoneX.displayInfo();
        System.out.println(iphoneX.ring());
        System.out.println(iphoneX.unlock());
    }
}