package retention;
//} = + ] ' " //
@Auth(name={"Sita","Rama","RAghu"},age=24)
public class C {
	public static void main(String[] args) throws Exception {
		Class<?> clss=Class.forName("retention.C");
	Auth clz=clss.getAnnotation(Auth.class);
	for (String name : clz.name()) {
		System.out.println("Name:"+name);	
	}
	
	System.out.println("Age:"+clz.age());
		
		
	}

}

