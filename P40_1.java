import java.util.Scanner;
public class P40_1 {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your year of birth:");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int s=0;
		for(int i=0;i<=100;i++) {
		    if(year%4==0&&year%100!=0||year%400==0) {
			    s=s+1;
			}year++;
		}
		System.out.println("He can have"+s+"leap years in his life");
	}
}