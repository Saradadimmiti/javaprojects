package Ooops6;
//} = + ] ' "
 class Book {
	public Book(){
		System.out.println("Book");
	}

}
class JavaBook extends Book{
	public JavaBook(){
	System.out.println("JavaBook");	
	}
	public static void main(String[] args) {
		new JavaBook();
	}
}
