// } = + ] ' " //
class Cd{
	static void isPrime(int x){
	boolean t=true;
	for(int i=2;i<x;i++){
		if(x%i==0){
			t=false;
			break;}}
	if(t){
		System.out.println(x+"is prime number");}
	else{
		System.out.println(x+ "is not prime number");}
		}
	public static void main(String[] args){
	int y=111119;
		isPrime(y);}}