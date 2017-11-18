package random;
/*
 * Given a roman numeral, convert it to an integer.
*  Input is guaranteed to be within the range from 1 to 3999.
 */

public class Q13RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String roman="MCMXCVI";
		System.out.println(romanToInt(roman));
	}
	public static int romanToInt(String s) {
        s=s.toUpperCase();
        int len=s.length();
        int intArr[]=new int[len];
        for(int i=0;i<len;i++){
        switch (s.charAt(i)){
            case 'M':
                intArr[i]=1000;
                break;
            case 'D':
                intArr[i]=500;
                break;
            case 'C':
                intArr[i]=100;
                break;
            case 'L':
                intArr[i]=50;
                break;
            case 'X' :
                intArr[i]=10;
                break;
            case 'V':
                intArr[i]=5;
                break;
            case 'I':
                intArr[i]=1;
                break;
        }
    }
    int num=0;
    for(int i=0;i<len-1;i++){
        if(intArr[i]<intArr[i+1])
            num-=intArr[i];
        else
            num+=intArr[i];
    }
    num+=intArr[len-1];
    return num;
    }
}
