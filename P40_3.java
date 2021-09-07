import java.util.Scanner;
public class P40_3 {
     public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int x=0;
		do{
			x=a%b;
			a=b;
			b=x;
		}while(x!=0);
		System.out.println("The gcd is:"+a);
	}
}