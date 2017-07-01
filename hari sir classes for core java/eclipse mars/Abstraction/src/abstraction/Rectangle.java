package abstraction;
//} = + ] ' " //
public class Rectangle extends Shape {
	int length;
	int width;
	public Rectangle(int l,int w){
		length=l;
		width=w;
	}
	void calculateArea(){
		int area=length*width;
		System.out.println("Area of Rectangle is :"+area);
	}
	

}
