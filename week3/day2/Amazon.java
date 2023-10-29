package week3.day2;

public class Amazon extends CanaraBank implements Payments{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Amazon a = new Amazon();
a.cardPayments();
a.cashOnDelivery();
a.internetBanking();
a.upiPayments();
a.recordPaymentDetails();
		
	}

	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Print Cash on Delivery");
		
	}

	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("UPI Payment part");

	}

	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("Card Payment part");
	
	}

	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Internet banking part");

	}
	
	

}
