import java.util.Scanner;

public class anyBaseToAnyBase {


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int b1 =scn.nextInt();
		int b2 =scn.nextInt();
		int dngg=getValueInAny(n,b1,b2);
		
		System.out.println(dngg);	
	}
	
	public static int getValueInAny(int n,int b1,int b2) {
		  int dec=getValueInDecimal( n, b1);
		  int val=getValueInBase(dec,b2);
		  
		return val;
			}
	
	public static int getValueInDecimal(int n,int b1) {
		  int rv=0;
		  int p=1;
		  while(n>0) {
			  int dig=n%10;
			  n=n/10; 
			  rv=rv+dig*p;
			  p=p*b1;
			 
		  }
		  return rv;
		  }
		  
		  public static int getValueInBase(int dec, int b2) {
				int rv=0;
				int p=1;
				while(dec>0) {
					int dig = dec%b2;
					dec=dec/b2;
					rv=rv+dig*p;
					p=p*10;
				}
				
				return rv;
			}

}
