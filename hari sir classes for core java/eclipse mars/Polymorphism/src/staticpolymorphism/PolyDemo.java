package staticpolymorphism;
//} = + ] ' " //
public class PolyDemo {
	void doStuff(Animal a){
		a.eat();
		if(a instanceof Dog){
			Dog d=new Dog();
			d.shout();
		}
	}
	public static void main(String[] args) {
		Animal[] animals={new Animal(),new Dog(),new Dog(),new Animal()};
	PolyDemo demo=new PolyDemo();
	demo.doStuff(animals[0]);
	demo.doStuff(animals[1]);
	demo.doStuff(animals[2]);
	demo.doStuff(animals[3]);
	}
}
	


