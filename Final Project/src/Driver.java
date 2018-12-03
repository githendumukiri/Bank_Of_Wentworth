import java.util.Scanner;
public class Driver {

	private Object checking;

	public static void main(String[] args) {
		int depositAmount, withdrawlAmount, years;
		
		Scanner scan = new Scanner(System.in);
		BankOfWentworthAccount account = new BankOfWentworthAccount();
		BankOfWentworthChecking checking = new BankOfWentworthChecking();
		BankOfWentworthSavings savings = new BankOfWentworthSavings();
		
		System.out.println("Welcome to the Wentworthth banking app! \nYour Account number is " + account.getAccountNumber());
		System.out.println("Enter your intial deposit: ");
		depositAmount = scan.nextInt();
		checking.deposit(depositAmount);
	
		while(true) {
			
			System.out.println("Would you like to open a savings account, yes or no?");
			String answer = scan.next();
			
			if (answer.equalsIgnoreCase("yes")) {
				
				System.out.println("Enter your intial deposit (nearest dollar): ");
				depositAmount = scan.nextInt();
				savings.deposit(depositAmount);
				while(true) {
					
					System.out.println("Would you like to make more changes, yes or no?");
					answer = scan.next();
					if (answer.equalsIgnoreCase("yes")) {
						
						while (true) {
							System.out.println("Would you like to access your checking, savings, or return?");
							answer = scan.next();
							
							if (answer.equalsIgnoreCase("Checking")) {
								
								while(true) {
									System.out.println("Deposit, Withdraw, Balance, or Return");
									answer = scan.next();
									if (answer.equalsIgnoreCase("deposit")) {
										
										System.out.println("Enter deposit amount (nearest dollar)");
										depositAmount = scan.nextInt();
										checking.deposit(depositAmount);
										System.out.println(checking.getBalance());
										}
									else if (answer.equalsIgnoreCase("withdraw")) {
										
										System.out.println("Enter withdrawl amount (nearest dollar)");
										withdrawlAmount = scan.nextInt();
										checking.withdraw(withdrawlAmount);
										System.out.println(checking.getBalance());
									}
									else if (answer.equalsIgnoreCase("balance")) {
										
										System.out.println(checking.getBalance());
									}
									else if (answer.equalsIgnoreCase("Return")) {
										
										break;
									}
									else {
										
										System.out.println("Invalid input, please enter Deposit, Withdraw, Balance, or Return");
										continue;
									}
								}
							}
							else if (answer.equalsIgnoreCase("Savings")) {
								
								while(true) {
									System.out.println("Deposit, Withdraw, Balance, or Return");
									answer = scan.next();
									if (answer.equalsIgnoreCase("deposit")) {
										
										System.out.println("Enter deposit amount (nearest dollar)");
										depositAmount = scan.nextInt();
										savings.deposit(depositAmount);
										System.out.println(savings.getBalance());
										}
									else if (answer.equalsIgnoreCase("withdraw")) {
										
										System.out.println("Enter withdrawl amount (nearest dollar)");
										withdrawlAmount = scan.nextInt();
										savings.withdraw(withdrawlAmount);
										System.out.println(savings.getBalance());
									}
									else if (answer.equalsIgnoreCase("balance")) {
										
										System.out.println(savings.getBalance());
									}
									else if (answer.equalsIgnoreCase("return")) {
										
										break;
									}
									else {
										
										System.out.println("Invalid input, please enter Deposit, Withdraw, Balance, or Return");
										continue;
									}
								}
							}
							else if (answer.equalsIgnoreCase("return")) {
								
								break;
							}
						}
						
					}
					else if (answer.equalsIgnoreCase("no")) {
						System.exit(1);
					}
					else {
						System.out.println("Invalid input.");
						continue;
					}
				}
			}
			else if (answer.equalsIgnoreCase("no")) {
				while (true) {
					
					System.out.println("Would you like to make any changes to your checking account, yes or no?");
					answer = scan.next();
					if (answer.equalsIgnoreCase("yes")) {
						
						while(true) {
							System.out.println("Deposit, Withdraw, Balance, or Return");
							answer = scan.next();
							if (answer.equalsIgnoreCase("deposit")) {
								
								System.out.println("Enter deposit amount (nearest dollar)");
								depositAmount = scan.nextInt();
								checking.deposit(depositAmount);
								System.out.println(checking.getBalance());
								}
							else if (answer.equalsIgnoreCase("withdraw")) {
								
								System.out.println("Enter withdrawl amount (nearest dollar)");
								withdrawlAmount = scan.nextInt();
								checking.withdraw(withdrawlAmount);
								System.out.println(checking.getBalance());
							}
							else if (answer.equalsIgnoreCase("balance")) {
								
								System.out.println(checking.getBalance());
							}
							else if (answer.equalsIgnoreCase("return")) {
								
								break;
							}
							else {
								
								System.out.println("Invalid input, please enter Deposit, Withdraw, Balance, or Return");
								continue;
							}
						}
					}
					else if (answer.equalsIgnoreCase("no")) {
						
						System.exit(1);
					}
					else {
						
						System.out.println("Invalid input.");
						continue;
					}
				}
			}
			else {
				
				System.out.println("Invalid input.");
				continue;
			}
		}
		
	}

}
