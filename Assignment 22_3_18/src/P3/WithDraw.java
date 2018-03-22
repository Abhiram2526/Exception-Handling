package P3;
import P2.Balance;
@SuppressWarnings({ "serial" })
public class WithDraw extends Exception {
	
	public WithDraw() {}
	public WithDraw(String msg) {
		super(msg);
	}
	public Balance x;
	public WithDraw(Balance x) {
		this.x=x;
	}
	public void withdrwal(int amt) throws WithDraw {
		try {
			if(amt>x.bal) {
				throw new WithDraw("INSUFFICIENT BALANCE");
			}
			else {
				System.out .println("Amount Withdrawn="+amt);
				x.bal=x.bal-amt;
				x.display();
				System.out .println("Transection Completed");
			}
		}
		catch(WithDraw WD) {
			throw WD;//Rethrow
		}
	}

}
