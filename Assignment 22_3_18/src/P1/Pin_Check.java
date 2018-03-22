package P1;

@SuppressWarnings("serial")
public class Pin_Check extends Exception{
	public Pin_Check() {}
	public Pin_Check(String msg) {
		super(msg);
	}
	public void verify(int Pin_No) throws Pin_Check {
		try {
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
