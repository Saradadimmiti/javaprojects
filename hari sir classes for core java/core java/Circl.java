// } = + ] ' " //
//using constructor for initializing instance variables
class Circl{
	int radius;
	static final double PI=3.14;
	Circl(int r){
		radius=r;}
	void area(){
		double a=PI*radius*radius;
		System.out.println("Area is:"+a); }

	public static void main(String[] args){
		Circl c1=new Circl(6);
		Circl c2=new Circl(8);
		c1.area();
		c2.area();}}
		//o/p:113.039999999
		  // 200.96