package enums;

import java.util.Scanner;

//} = + ] ' "

public class C {
	public static void main(String[] args) {
		System.out.println("Enter direction");
		Scanner scn=new Scanner(System.in);
		Directions d=Directions.valueOf(scn.next());
		switch(d){
		case EAST:
		System.out.println("Move East");
		break;
		case WEST:
		System.out.println("Move West");
		break;
		case NORTH:
		System.out.println("Move North");
		break;
		case SOUTH:
		System.out.println("Move South");
		
		}
	} 

}

