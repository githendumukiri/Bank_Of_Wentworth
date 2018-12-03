import java.util.Scanner;
public class Driver {


	public static void main(String[] args) {
		int depositAmount, withdrawlAmount;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		BankOfWentworthAccount account = new BankOfWentworthAccount();	//creates an instance of an account
		BankOfWentworthChecking checking = new BankOfWentworthChecking();	//creates an instance of a checking account
		BankOfWentworthSavings savings = new BankOfWentworthSavings();	//creates an instance of a checking account
		
		System.out.println("Welcome to the Wentworthth banking app! \nYour Account number is " + account.getAccountNumber());	//assigns random account number to user
		System.out.println("Enter your intial deposit: ");
		depositAmount = scan.nextInt();
		checking.deposit(depositAmount);	
	
		while(true) {	//loop to check user input
			
			System.out.println("Would you like to open a savings account, yes or no?");
			String answer = scan.next();
			
			if (answer.equalsIgnoreCase("yes")) {	//create a savings account
				
				System.out.println("Enter your intial deposit (nearest dollar): ");
				depositAmount = scan.nextInt();
				savings.deposit(depositAmount);
				while(true) {
					
					System.out.println("Would you like to make more changes, yes or no?");	//make changes
					answer = scan.next();
					if (answer.equalsIgnoreCase("yes")) {
						
						while (true) {	//loop to check user input and navigate would be U.I
							System.out.println("Would you like to access your checking, savings, or return?");
							answer = scan.next();
							
							if (answer.equalsIgnoreCase("Checking")) {	//changes to checking
								
								while(true) {
									System.out.println("Deposit, Withdraw, Balance, or Return");
									answer = scan.next();
									if (answer.equalsIgnoreCase("deposit")) {	//deposit for checking
										
										System.out.println("Enter deposit amount (nearest dollar)");
										depositAmount = scan.nextInt();
										checking.deposit(depositAmount);
										System.out.println(checking.getBalance());
										}
									else if (answer.equalsIgnoreCase("withdraw")) {	//withdraw for checking
										
										System.out.println("Enter withdrawl amount (nearest dollar)");
										withdrawlAmount = scan.nextInt();
										checking.withdraw(withdrawlAmount);
										System.out.println(checking.getBalance());
									}
									else if (answer.equalsIgnoreCase("balance")) {	//balance for checking
										
										System.out.println(checking.getBalance());
									}
									else if (answer.equalsIgnoreCase("Return")) {	//return to previous screen
										
										break;
									}
									else {	//invalid input case
										
										System.out.println("Invalid input, please enter Deposit, Withdraw, Balance, or Return");
										continue;
									}
								}
							}
							else if (answer.equalsIgnoreCase("Savings")) {	//changes to savings 
								
								while(true) {	//loop to check user input and navigate would be U.I
									System.out.println("Deposit, Withdraw, Balance, or Return");
									answer = scan.next();
									if (answer.equalsIgnoreCase("deposit")) {	//deposit for savings
										
										System.out.println("Enter deposit amount (nearest dollar)");
										depositAmount = scan.nextInt();
										savings.deposit(depositAmount);
										System.out.println(savings.getBalance());
										}
									else if (answer.equalsIgnoreCase("withdraw")) {	//withdraw for savings
										
										System.out.println("Enter withdrawl amount (nearest dollar)");
										withdrawlAmount = scan.nextInt();
										savings.withdraw(withdrawlAmount);
										System.out.println(savings.getBalance());
									}
									else if (answer.equalsIgnoreCase("balance")) {	//balance for savings 
										
										System.out.println(savings.getBalance());
									}
									else if (answer.equalsIgnoreCase("return")) {	//return to previous screen
										
										break;
									}
									else {	//invalid input case
										
										System.out.println("Invalid input, please enter Deposit, Withdraw, Balance, or Return");
										continue;
									}
								}
							}
							else if (answer.equalsIgnoreCase("return")) {
								
								break;	//Returns to outer loop 
							}
						}
						
					}
					else if (answer.equalsIgnoreCase("no")) {
						System.exit(1);	//exit successfully
					}
					else {
						System.out.println("Invalid input.");	//invalid input
						continue;
					}
				}
			}
			else if (answer.equalsIgnoreCase("no")) {	//no savings account path
				while (true) {	//loop to check user input and navigate would be U.I
					
					System.out.println("Would you like to make any changes to your checking account, yes or no?");
					answer = scan.next();
					if (answer.equalsIgnoreCase("yes")) {
						
						while(true) {
							System.out.println("Deposit, Withdraw, Balance, or Return");
							answer = scan.next();
							if (answer.equalsIgnoreCase("deposit")) {	//deposit for checking
								
								System.out.println("Enter deposit amount (nearest dollar)");
								depositAmount = scan.nextInt();
								checking.deposit(depositAmount);
								System.out.println(checking.getBalance());
								}
							else if (answer.equalsIgnoreCase("withdraw")) {	//withdraw for checking
								
								System.out.println("Enter withdrawl amount (nearest dollar)");
								withdrawlAmount = scan.nextInt();
								checking.withdraw(withdrawlAmount);
								System.out.println(checking.getBalance());
							}
							else if (answer.equalsIgnoreCase("balance")) {	//balance for checking
								
								System.out.println(checking.getBalance());
							}
							else if (answer.equalsIgnoreCase("return")) {	//return to previous screen
								
								break; //Returns to outer loop 
							}
							else {	//invalid user input
								
								System.out.println("Invalid input, please enter Deposit, Withdraw, Balance, or Return");
								continue;
							}
						}
					}
					else if (answer.equalsIgnoreCase("no")) {
						
						System.exit(1); //Successful termination
					}
					else {	//invalid user input
						
						System.out.println("Invalid input.");
						continue;
					}
				}
			}
			else {	//invalid user input
				
				System.out.println("Invalid input.");
				continue;
			}
	
		}
		
	}
}
