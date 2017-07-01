// } = + ] ' " //
public class Max{
static int max(int[] data){
	int max=data[0];
for(int j=1;j<data.length;j++){
	if(max<data[j]){
		max=data[j];}}
return max;}
		public static void main(String[]args){
			int[] myArray={1,3,5,6,8};
			System.out.println("max value is:"+max(myArray));}}