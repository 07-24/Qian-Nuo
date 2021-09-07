import java.util.Random;
public class P40_6 {

	public static void main(String[] args) {
        Random r = new Random();
        int arr[]=new int[20];
        int i=0;
        int max=0;
        int min;
        double sum=0;
        double aver;
        for(i=0;i<20;i++)
        {
        	arr[i]=r.nextInt(383)+76;
        }
        for(i=0;i<20;i++) {
        	if(max<arr[i]) max=arr[i];
        }
        min=arr[0];
        for(i=0;i<20;i++) {
        	if(min>arr[i]) min=arr[i];
        }
        for(i=0;i<20;i++) {
        	sum=sum+arr[i];
        }
        aver=sum/20;
        System.out.println("The array is");
        for(i=0;i<20;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println("\nmax="+max);
        System.out.println("min="+min);
        System.out.println("sum="+sum);
        System.out.println("average="+aver);
	}

}