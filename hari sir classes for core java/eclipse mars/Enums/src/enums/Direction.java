package enums;
//} = + ] ' "
public enum Direction {
	EAST(1),WEST(2),NORTH(3),SOUTH(4);
	int i;
	Direction(int i){
		this.i=i;
	}
	public int value(){
		return i;
	}

}
