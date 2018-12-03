import java.text.DecimalFormat;
public class BankOfWentworthSavings extends BankOfWentworthAccount {
	DecimalFormat twoZeros = new DecimalFormat("0.00");
	double savingsBalance = 0;
	final double RATE = .05;
	
	public void deposit(int depositAmount) {
		savingsBalance += depositAmount;
		
	}
	public void withdraw(int withdrawlAmount) {
		savingsBalance -= withdrawlAmount;
	}
	public void annualPercentageYield(int years) {
		
		savingsBalance =  savingsBalance * Math.pow((1 + (RATE/12)), 12 * years);
	}
	public String getBalance() {
		
		if (savingsBalance < 20) {
			return("Warning! Low account balance: $" + twoZeros.format(savingsBalance));
		}
		else {
		return ("Your balance is $" + twoZeros.format(savingsBalance));
		}
	}
}
