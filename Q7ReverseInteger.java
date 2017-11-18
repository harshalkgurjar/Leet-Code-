package random;
/*
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class Q7ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X=-6469;
		System.out.println(reverse(X));
	}
	
	private static int reverse(int x) {
		// TODO Auto-generated method stub
		int xRev=0;
		int prevXRev;
		while(x!=0){
			prevXRev=xRev;
			xRev=10*xRev+ (x%10);
			// check for overflow
			if(((xRev - x%10)/10) != prevXRev) {
				return 0;
			}
			x/=10;		
		}
		return xRev;
	}

}
