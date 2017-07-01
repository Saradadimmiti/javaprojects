package polymorphicreferences;
//} = + ] ' " //
public class PolyDemo {
	void doStuff(Animal a){
		a.eat();
	}
	public static void main(String[] args) {
		Animal[] animals={new Animal(),new Dog(),new Dog()};
		PolyDemo demo=new PolyDemo();
		demo.doStuff(animals[0]);
		demo.doStuff(animals[1]);
		demo.doStuff(animals[2]);
		
		
	}
		

}
