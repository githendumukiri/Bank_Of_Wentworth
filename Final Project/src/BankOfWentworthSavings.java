import java.text.DecimalFormat;
public class BankOfWentworthSavings extends BankOfWentworthAccount {
	DecimalFormat twoZeros = new DecimalFormat("0.00");
	double savingsBalance = 0;
	final double RATE = .05;
	
	public void deposit(int depositAmount) {	//deposit method
		savingsBalance += depositAmount;
		
	}
	public void withdraw(int withdrawlAmount) {	//withdraw method
		savingsBalance -= withdrawlAmount;
	}
	public void annualPercentageYield(int years) {	//APY method
		
		savingsBalance =  savingsBalance * Math.pow((1 + (RATE/12)), 12 * years);	//compounding interest equation
	}
	public String getBalance() {	//getBalance method
		
		if (savingsBalance < 20) {
			return("Warning! Low account balance: $" + twoZeros.format(savingsBalance));	//low account balance warning
		}
		else {
		return ("Your balance is $" + twoZeros.format(savingsBalance));
		}
	}
}
