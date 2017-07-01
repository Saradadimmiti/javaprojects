package Ooops6;
//} = + ] ' "
public class Y {
	Y(String name){
	System.out.println(name);	
	}
}
class Z extends Y{
	Z(){
		System.out.println("java");
		//implicit super constructor Y() is undefined.must explicitly invokes another constructor
		super("");
		//calling a  constructor is must be first
		
}
}	
