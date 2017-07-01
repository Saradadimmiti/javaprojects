package abstractiondemo;
//} = + ] ' " //
public class TestShape {
	public static void main(String[] args) {
		Shape[] shapes={new Circle(),new Rectangle()};
		for (Shape shape : shapes) {
			shape.calculateArea();
			
		}
	}

}
