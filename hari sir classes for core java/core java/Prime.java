// } = + ] ' " //
class Prime{
static void isPrime(int x){
boolean isPrime=true;
for(int i=2;i<x;i++){
	if(x%i==0){
	isPrime=false;
	break;}}
	if(isPrime){
	System.out.println(x+" is a prime number");}
	else{
	System.out.println(x+" is not a prime number");}}
	public static void main (String[] args){
		int y=12;
		isPrime(13);
		isPrime(y);
	}}