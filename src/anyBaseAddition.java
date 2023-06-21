import java.util.Scanner;

public class anyBaseAddition {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int b = scn.nextInt();
		int n1 =scn.nextInt();
		int n2 = scn.nextInt();
		int d =valueOfAddition(b,n1,n2);
		System.out.println(d);
	}
	
	
	public static int valueOfAddition(int b, int n1 ,int n2) {
		int rv=0;
		int c=0;
		int p=1;
		while(n1>0 || n2>0 || c>0) {
			int d1=n1%10;
			int d2=n2%10;
			n1=n1/10;
			n2=n2/10;
			int ds=d1+d2+c;
			c=ds/b;
			ds=ds%b;
			rv=rv+ds*p;
			
			p=p*10;
			
		}
		
		
		return rv;
	}

}
