import java.util.Random;
import java.lang.Double;

public class BankAccount {
    private static int counter = 0;
    private static Double totalAmounts = 0.00;
    private int accountNumber;
    private Double checkingBal;
    private Double savingsBal;

    public BankAccount() {
        counter++;
        this.accountNumber = this.createAccountNum();
        this.checkingBal = 0.00;
        this.savingsBal = 0.00;
    }
    private int createAccountNum() {
        Random accountNum = new Random();
        return accountNum.nextInt(11);

    }


    //gets ------------------------------------------------------------

    public static Double getAccountsTotal() {
        return totalAmounts;
    }

    public static int getTotalAccounts() {
        return counter;
    }

    public Double getCreditAmount() {
        return this.checkingBal;
    }

    public Double getSavingsAmount() {
        return this.savingsBal;
    }


    // account actions --------------------------------------------------------------


    public void addMoneyChecking(Double money) {
        this.checkingBal += money;
        totalAmounts += money;
        System.out.println("Money has been deposited. Have a nice day.");
    }

    public void addMoneySavings(Double money) {
        this.savingsBal += money;
        totalAmounts += money;
        System.out.println("Money has been deposited. Have a nice day.");
    }

    public void withdrawChecking(Double money) {
        if (Double.compare(money, this.getCreditAmount()) < 1) {
            this.checkingBal -= money;
            totalAmounts -= money;
            System.out.print("Baby I got your money, don't you worry!");
        } else {
            System.out.println("You don't have enough money. Try a smaller amount.");
        }
        
    }

    public void withdrawSavings(Double money) {
        if (Double.compare(money, this.getSavingsAmount()) < 1) {
            this.savingsBal -= money;
            totalAmounts -= money;
            System.out.print("Baby I got your money, don't you worry!");
        } else {
            System.out.println("You don't have enough money. Try a smaller amount.");
        }
        
    }

}