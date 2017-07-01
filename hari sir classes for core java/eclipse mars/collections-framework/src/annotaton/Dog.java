package annotaton;

public class Dog extends Animal{
	@Override
	void eatsomething(){ // should be override with eatSomething
		System.out.println("Dog eating somethings");
	}

}
