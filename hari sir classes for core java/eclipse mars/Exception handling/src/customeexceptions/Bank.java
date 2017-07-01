package customeexceptions;

import javax.xml.bind.ValidationException;

//} = + ] ' " //
public class Bank {
	public  void validatePin(int pin) throws InvalidPinException{
		if(pin<=0){
			throw new InvalidPinException("Invalid pin/provide valid pin");
		}
		
	}
	
	
}
