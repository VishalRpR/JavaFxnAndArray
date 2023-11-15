import java.util.Scanner;

public class digifeque {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int pn= scn.nextInt();
		int total=digitfreq(n,pn);
		display(total);
		
	    
	   

	}
	
	public static void display(int count) {
		 System.out.println(count);
	}
	
	public static int digitfreq(int n, int pn) {
		int count = 0;
	    while(n!=0) {
	    	
	    	int num= n%10;
	    	if(num==pn) {
	    		count++;
	    		n=n/10;
	    	}else {
	    		n=n/10;
	    	}
	    }
		
		
		
		return count;
		
	}

}
