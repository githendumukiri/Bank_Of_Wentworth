import java.text.DecimalFormat;
public class BankOfWentworthChecking extends BankOfWentworthAccount{
	DecimalFormat twoZeros = new DecimalFormat("0.00");
	double checkingBalance = 0;
	final int FEE = 39;
	
	public void deposit(int depositAmount) {	//deposit method
		checkingBalance += depositAmount;
		
	}
	public void withdraw(int withdrawlAmount) {	//withdraw method
		checkingBalance -= withdrawlAmount;
	}
	public void setAnnualFees(int years) {	//annual fee calculator
		
		checkingBalance = checkingBalance  - (FEE * years);
		
	}
	public String getBalance(){	//get balance method
		if (checkingBalance < 20) {
			return("Warning! Low account balance: $" + twoZeros.format(checkingBalance));	//low balance warning 
		}
		else {
		return ("Your balance is $" + twoZeros.format(checkingBalance));
		}
	}
}
