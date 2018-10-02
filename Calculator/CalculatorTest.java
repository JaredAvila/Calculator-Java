public class CalculatorTest {
    public static void main(String[] args) {
        Calculator one = new Calculator();
        one.setOp1(3.0);
        one.setOp2(2.0);
        one.setOpn('-');
        one.perfomrOperation();
    }
}