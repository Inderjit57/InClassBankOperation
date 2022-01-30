
//Create two classes Main class and Bank operation class.
//Create two methods, one to deposit money into the account and another one which will verify the card no and pin. 
//Call the cardVerification method in depositMoney method before depositing the money

public class BankOperation {
	String card = "12345";
	int pin = 4321;
	boolean isCardAndPinValid = false;

	int newBalance;
	int currentBalance;
	int amountToBeDeposit;

	boolean cardVerification(String cardNum, int cardPin) {
		if (card.equals(cardNum) && pin == cardPin) {
			return (isCardAndPinValid = true);
		}
		return isCardAndPinValid;
	}

	int depositMoney() {
		cardVerification(card, pin);
		if (cardVerification(card, pin)) {
			newBalance = currentBalance + amountToBeDeposit;
			return newBalance;
		}
		return 0;

	}
}
