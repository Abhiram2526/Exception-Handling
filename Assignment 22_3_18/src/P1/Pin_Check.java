package P1;

//import MainMaster.Bank;
import java.util.*;
@SuppressWarnings("serial")
public class Pin_Check extends Exception{
	public Pin_Check() {}
	public Pin_Check(String msg) {
		super(msg);
	}
	public void verify() throws Pin_Check {
		try(Scanner s=new Scanner(System.in)){
			System.out.print("ENter the Pin_Number =>");
			int Pin_No=s.nextInt();
			if(!(Pin_No>=1111 && Pin_No<=9999)) {
				throw new Pin_Check("Invalid Pin_No");
			}
			switch(Pin_No) {
			case 1111:
				break;
			default://Exception
				throw new Pin_Check("Pin code does not exist");
			}//End of Switch
		}//End of try
		catch(Pin_Check cp) {
			throw cp;//Reethrow
		}
	}
	
	

}
