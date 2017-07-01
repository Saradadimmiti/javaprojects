package innerclass;
//} = + ] ' " //
public class F {
	public static void main(String[] args) {
		G g=new G(){
			public void welcome(){
				System.out.println("Welcome----");
			}
			
		};
		g.welcome();
	}

}
