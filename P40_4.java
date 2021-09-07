public class P40_4 {
    public static void main(String[] args) {
    	char str[]= {'a','b','c','c','a','b','a','b','b'};
    	int k=1;
    	char a,b;
    	for(int i=0;i<str.length;i++) {
    		if(str[i]!='$') {
    			System.out.print(str[i]);
    		}
    		else continue;
    		a=str[i];
    		for(int j=0;j<str.length;j++) {
    			if(i==j) continue;
    			b=str[j];
    			if(a==b) {
    				k++;
    				str[j]='$';
    			}
    		}
    		System.out.println("---"+k);
    		k=1;
    	}
    }
}
