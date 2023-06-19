import java.util.Scanner;

public class digitsFrequency {


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d =scn.nextInt();
		int f =getdigitfrequency(n,d);
		System.out.println(f);
		
		}
	
	
	public static int getdigitfrequency(int n,int d){
		
		int count=0;
		while(n>0) {
			int q=n%10;
			n=n/10;
			
			if(q==d) {
				count++;
			}
		}
		
		return count;
	}

}
