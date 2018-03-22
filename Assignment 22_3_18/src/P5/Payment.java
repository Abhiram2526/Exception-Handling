package P5;

import P2.Balance;

@SuppressWarnings("serial")
public class Payment extends Exception {
	public Payment() {}
	public Payment(String msg) {
		super(msg);
	}
	public Balance x;
	public Payment(Balance x) {
		this.x=x;
	}
	public void Pay(float amt) throws Payment {
		try {
			if(amt>x.bal) {
				throw new Payment("INSUFFICIENT BALANCE");
			}
			else {
				System.out .println("Amount Deposite="+amt);
				x.bal=x.bal+amt;
				x.display();
				System.out .println("Transection Completed");
			}
		}
		catch(Payment WD) {
			throw WD;//Rethrow
		}
    }

}




