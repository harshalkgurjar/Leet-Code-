/*
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Q9PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5765765;
		//System.out.println(isWithExtraSpacePalindrome(a));
		System.out.println(isPalindrome(a));
	}

	private static boolean isPalindrome(int x) {
		// TODO Auto-generated method stub
		// negative number cannot be palindrome
		// also if last digit is zero then it cannot be a palindrome
		if(x<0 || (x!=0 && x%10==0)){
			return false;
		}
		//compare first half of digit with next half
		int xRev=0;
		while(x>xRev){
			xRev=10*xRev + x%10;
			x/=10;
		}
		return (x==xRev || x==xRev/10);
	}
}
