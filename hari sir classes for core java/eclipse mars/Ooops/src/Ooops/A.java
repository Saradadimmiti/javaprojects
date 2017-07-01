package Ooops;
//} = + ] ' "
 class B {
	double cost;
	String name;
	void start(){
		System.out.println("vehicle is started");
	}
	void stop(){
		System.out.println("vehicle is stopped");
	}
 }
	class A extends B{
		void onOrOfMusic(){
			System.out.println("music on/off");
		
	}
		public static void main(String[] args) {
			A x=new A();
			x.name="swift";
			x.cost=900000.0;
			x.start();
			x.onOrOfMusic();
			x.stop();
			System.out.println("name is"+x.name);
			System.out.println("cost is"+x.cost);
		}

}
