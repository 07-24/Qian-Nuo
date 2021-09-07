public class P40_5 {
	public static void main(String[] args) {
		int arr[]= {1,15,5,48,71,3,6,88,7,10,21};
		int i=0;
		double sum=0,aver=0;
		for(i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		aver=sum/arr.length;
		for(i=0;i<arr.length;i++) {
			if(arr[i]>ave) {
				System.out.println(arr[i]);
			}
		}
	}
}