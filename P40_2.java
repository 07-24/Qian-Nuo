public class P40_2 {
	public static void main(String[] args) {
		int count=0;
		long a1=1;
		long a2=1;
		while(count<20) {
			System.out.print(a1+","+a2+",");
			a1=a2+a1;
			a2=a1+a2;
			count++;
			count++;
		}
		System.out.print("......");
	}
}