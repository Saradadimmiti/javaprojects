// } = + ] ' "//
//max of two numbers
import java.util.*;
public class At{
	public static void main(String[] args){
	int x,y,z,max;
	Scanner s=new Scanner(System.in);//to read data from console
	System.out.println("Enter  values for x,y,z:");
	x=s.nextInt();
	y=s.nextInt();
	z=s.nextInt();
	if(x>y){
		y=x;}
	if(z>y){
		max=z;}
	else{
		max=y;}
	System.out.println("max:"+max);}}




