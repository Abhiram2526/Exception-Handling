package P4;
import P2.Balance;
@SuppressWarnings({ "serial" })
public class Deposite extends Exception {
		
		public Deposite() {}
		public Deposite(String msg) {
			super(msg);
		}
		public Balance x;
		public Deposite(Balance x) {
			this.x=x;
		}
		public void Deposited(int amt) throws Deposite {
			try {
				if(amt>x.bal) {
					throw new Deposite("INSUFFICIENT BALANCE");
				}
				else {
					System.out .println("Amount Deposite="+amt);
					x.bal=x.bal+amt;
					x.display();
					System.out .println("Transection Completed");
				}
			}
			catch(Deposite WD) {
				throw WD;//Rethrow
			}
	    }

 }

