package MainMaster;
import P1.Pin_Check;
import P2.Balance;
import P3.WithDraw;
import P4.Deposite;
import P5.Payment;
import java.util.*;

@SuppressWarnings({ "serial" })
public class Bank extends Exception {
	public Bank() {}
	public Bank(String msg) {
		super(msg);
	}
	public static void main(String[] args) {
		try(Scanner s=new Scanner(System.in)){
			
				System.out.print("ENter the Pin_Number =>");
				int Pin_No=s.nextInt();
				if(!(Pin_No>=1111 && Pin_No<=9999)) {
					throw new Bank("Invalid Pin_No");
				}
				Pin_Check pc=new Pin_Check();
				pc.verify(Pin_No);
				System.out.print("Enter the Choice =>");
				System.out.println("1. Widrawal \n2. Payment\n3. Deposite ");
				int choice=s.nextInt();
				switch(choice) {
				case 1://Withdrawal
					System.out.println("Enter the amount =>");
					int amt1=s.nextInt();
					if(amt1<10 || amt1%100!=0) {
						throw new Bank("Invalid Ammount");
					}
					else {
						Balance b1=new Balance();
						WithDraw w1=new WithDraw(b1);
						w1.withdrwal(amt1);
					}
					break;
				case 2://Payment
					System.out.println("Enter the amount =>");
					float amt2=s.nextFloat();
					if(amt2<=0) {
						throw new Bank("Invalid Ammount");
					}
					else {
						Balance b1=new Balance();
						Payment p1=new Payment(b1);
						p1.Pay(amt2);
					}
					break;
				case 3://Deposite
					System.out.println("Enter the amount =>");
					int amt3=s.nextInt();
					if(amt3<0 || amt3%100!=0) {
						throw new Bank("Invalid Ammount");
					}
					else {
						Balance b1=new Balance();
						Deposite p1=new Deposite(b1);
						p1.Deposited(amt3);
					}
					break;
				default:
					throw new Bank("Invalid Ammount");
				}//End of Inner Switch
			
			
		}
		catch(Bank | Pin_Check | WithDraw | Deposite | Payment B) {
			System.out.println(B.getMessage());
		}
		catch(InputMismatchException ime) {
			System.out.println("Enter Integers only");
		}

	}

}
