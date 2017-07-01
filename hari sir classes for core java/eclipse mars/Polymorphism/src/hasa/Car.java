package hasa;
//} = + ] ' " //
public class Car  {
	Engine eng=new Engine();
	void start(){
		eng.startEngine();
			System.out.println("car started... ");}
		void stop(){
			eng.stopEngine();
				System.out.println("car stopped... ");	
		}
		public static void main(String[] args) {
			Car c=new Car();
			c.start();
			c.stop();
		}
		
}
