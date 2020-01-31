package classandobjectsA1;

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest(){
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += monthlyInterest;
        return monthlyInterest;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static void modifyInterestRate(double _annualInterestRate){
        annualInterestRate = _annualInterestRate;
    }

    @Override
    public String toString() {
        return Double.toString(savingsBalance) + " $";
    }
}
