package abstraction;
//} = + ] ' " //
public class TestShape {
	public static void main(String[] args) {
		Shape[] shapes={new Circle(8),new Rectangle(3,4)};
		for (Shape shape : shapes) {
			shape.calculateArea();
			shape.fullfillColour();
			
		}
	}

}
