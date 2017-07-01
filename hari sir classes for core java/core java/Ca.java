// } = + ] ' " //
class Ca{
	static int max(int[] y){
	int x=y[0];
	for(int i=1;i<y.length;i++){
		if(y[i]>x){
			x=y[i];}}
	return x;
	}
	public static void main(String[] args){
	int[] m=new int[]{2,7,8,9,10};
	int v=max(m);
	System.out.println("max value in given array is:"+v);}}


