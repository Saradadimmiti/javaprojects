package contructor;

public class Car {
	
		final int number;
		Car(int n){
			number=n;}
		public static void main(String[] args){
			Car c1=new Car(1234);
			Car c2=new Car(5678);
			System.out.println("car number is:"+c1.number);
			System.out.println("car number is:"+c2.number);}}


