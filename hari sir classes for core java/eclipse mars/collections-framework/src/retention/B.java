package retention;
//} = + ] ' " //
@Author(name="Sita",age=24)
public class B {
	public static void main(String[] args) throws Exception {
		Class<?> clss=Class.forName("retention.B");
	Author clz=clss.getAnnotation(Author.class);
	System.out.println("Name:"+clz.name());
	System.out.println("Age:"+clz.age());
		
		
	}

}

