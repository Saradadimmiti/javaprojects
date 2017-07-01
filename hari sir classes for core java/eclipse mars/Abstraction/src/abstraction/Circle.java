package abstraction;
//} = + ] ' " //
public class Circle extends Shape{
	int radius;
	static final double PI=3.14;
	public Circle(int r){
		radius=r;
	}
	
	void calculateArea(){
		
		double area=PI*radius*radius;
		System.out.println("Area of Circle:"+area);
	}
	
}

