public class Calculator implements CalculatorInterface{
    private Double Op1;
    private Double Op2;
    private char Opn;

    public Calculator() {
    }

    public void setOp1(Double op1) {
        this.Op1 = op1;
    }

    public void setOp2(Double op2) {
        this.Op2 = op2;
    }

    public void setOpn(char opn) {
        this.Opn = opn;
    }

    public Double getOp1() {
        return this.Op1;
    }

    public Double getOp2() {
        return this.Op2;
    }

    public char getOpn() {
        return this.Opn;
    }
    public void perfomrOperation() {
        if (this.Opn == '+') {
            System.out.println(this.Op1+this.Op2);
        } else {
            System.out.println(this.Op1-this.Op2);
        }
    }
    public Double getResults() {
        if (this.Opn == '+') {
            return this.Op1+this.Op2;
        } else {
            return this.Op1-this.Op2;
        }
    }
}