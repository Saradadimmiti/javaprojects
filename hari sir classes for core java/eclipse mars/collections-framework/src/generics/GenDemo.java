package generics;
//} = + ] ' " //
public class GenDemo<E> {
	E e;
	public void setE(E e){
		this.equals(e);
	}
	public E get(){
		return e;
	}
	public static void main(String[] args) {
		GenDemo<Integer> gen=new GenDemo<>();
		gen.setE(1234);
		Integer x=gen.get();
		GenDemo<String> gen2=new GenDemo<>();
		gen2.setE("java");
		String y=gen2.get();
	}

}
