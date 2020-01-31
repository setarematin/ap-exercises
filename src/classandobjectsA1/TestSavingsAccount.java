package classandobjectsA1;

public class TestSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(0.04);
        for(int i =1; i <= 12; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        System.out.println(saver1);
        System.out.println(saver2);
        SavingsAccount.modifyInterestRate(0.05);
        for(int i =1; i <= 12; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        System.out.println(saver1);
        System.out.println(saver2);
    }
}
