public class Cheru {
	public static void main(String args[]) {
	    int[] a=new int[] {48,5,89,80,81,23,45,16,2};
		int temp=0,j=0;
		for(int i=1;i<a.length;i++){
			temp=a[i];
			j=i-1;
			while(j>=0&&temp<a[j]){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			
		}	
		for(int i=0;i<a.length;i++)
		    System.out.print(a[i]+",");
	}
}