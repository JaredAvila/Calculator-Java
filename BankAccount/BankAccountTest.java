public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount();
        BankAccount person2 = new BankAccount();

        person1.addMoneyChecking(120.00);
        person2.addMoneySavings(100.00);
        person1.getCreditAmount();
        person2.getCreditAmount();
        person2.getSavingsAmount();
        person1.withdrawChecking(20.00);
        person1.getCreditAmount();
        person2.withdrawSavings(120.00);
        person2.getSavingsAmount();
        System.out.println(BankAccount.getTotalAccounts());
        System.out.println(BankAccount.getAccountsTotal());
        
    }
}