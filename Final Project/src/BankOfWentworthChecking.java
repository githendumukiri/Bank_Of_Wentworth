
public class BankOfWentworthChecking extends BankOfWentworthAccount{
	double checkingBalance = 0;
	final int FEE = 39;
	
	public void deposit(int depositAmount) {
		checkingBalance += depositAmount;
		
	}
	public void withdraw(int withdrawlAmount) {
		checkingBalance -= withdrawlAmount;
	}
	public void setAnnualFees(int years) {
		
		checkingBalance = checkingBalance  - (FEE * years);
		
	}
	public String getBalance(){
		if (checkingBalance < 20) {
			return("Warning! Low account balance: $" + checkingBalance);
		}
		else {
		return ("$" + checkingBalance);
		}
	}
}
