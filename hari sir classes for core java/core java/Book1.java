// } = + ] ' " //
//parameterized constructor
class Book1{
	 Book1(int cost,String name){  //A constructor
	 System.out.println(cost);
	 System.out.println(name);
	}
	public static void main(String[] args){
		Book1 b1=new Book1(500,"java");
		Book1 b2=new Book1(700,"javahome");

	}   }    // here public is optional
	//o/p:500
		//java
		//700
		//javahome