import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		BankOperation bankOperation = new BankOperation();
		Scanner sc = new Scanner(System.in);
		//bankOperation.depositMoney();

		System.out.println("Enter cardnumber");
		String cardNumber = sc.next();
		System.out.println("Enter pin");
		int pinNumber = sc.nextInt();
		boolean cardVerify = bankOperation.cardVerification(cardNumber, pinNumber);
		// System.out.println("Valid Cardnumber and Pin");

		if (cardVerify == true) {
			int currentBal = bankOperation.currentBalance = 50;
			System.out.println("Current Balance: " + currentBal);
			System.out.println("Enter amount to be deposit");
			bankOperation.amountToBeDeposit = sc.nextInt();
			
			int moneyDeposited= bankOperation.depositMoney();
			System.out.println("Balance is: " + moneyDeposited);
		} else {
			System.out.println("Check Card number or Pin");
		}

	}

}
