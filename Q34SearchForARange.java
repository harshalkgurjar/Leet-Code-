package linkedIn;

public class Q34SearchForARange.java {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={1,1,1,1,4,4,4,5,5,5,5,6,7,8,8,9,9,9,9,9,9,10};
		int target=9;
		int outputIndex[]=new int [2];
		outputIndex=searchRange(nums, target);
		
		System.out.println(outputIndex[0]+" "+outputIndex[1]);
	}
	/*
	* Binary search
	* 1) look for first occurence
	*		initialize left=0, right to length-1
	*		middle = (left+right)/2
	*		if target element is middle then mark this index
	*		look for any occurence on left side
	* 2) look for last occurence in list
	*		initialize left=firstOccurenceIndex, right to length-1
	*		middle = (left+right)/2
	*		if target element is middle then mark this index
	*		look for any occurence on right side	
	*/
	private static int[] searchRange(int[] nums, int target) {
		// TODO Auto-generated method stub
		int left=0;
		int right=nums.length-1;
		int output[]=new int[2];
		output[0]=searchFirstIndexRange(nums, target,left,right);
		if(output[0]==-1){
			output[1]=-1;
			return output;
		}
		output[1]=searchLastIndexRange(nums, target,output[0],right);
		return output;
	}

	private static int searchLastIndexRange(int[] nums, int target, int left, int right) {
		// TODO Auto-generated method stub
		System.out.println("Left: "+left+"Right: "+right);
		if(left>right){	
			return -1;
		}
		int lastIndex=-1;
		int middle=(left+right+1)/2;
		if(nums[middle]==target){
			System.out.println("Middle equals target");
			lastIndex=middle;
			left=middle+1;
			int temp=searchLastIndexRange(nums, target, left, right);
			if(temp>lastIndex){
				lastIndex=temp;
			}
			return lastIndex;
		}
		else if(target<nums[middle]){
			System.out.println(" target less than middle");
			right=middle-1;
			int temp=searchLastIndexRange(nums, target, left, right);
			if(temp>lastIndex){
				lastIndex=temp;
				return lastIndex;
			}
		}
		else if(target>nums[middle]){
			System.out.println("Target greater than middle");
			left=middle+1;
			int temp=searchLastIndexRange(nums, target, left, right);
			if(temp>lastIndex){
				lastIndex=temp;
				return lastIndex;
			}
		}
		return -1;
	}

	private static int searchFirstIndexRange(int[] nums, int target, int left, int right) {
		// TODO Auto-generated method stub
		if(left>right){
			return -1;
		}
		int firstIndex=-1;
		int middle=(left+right+1)/2;
		if(nums[middle]==target){
			firstIndex=middle;
			right=middle-1;
			int temp=searchFirstIndexRange(nums, target, left, right);
			if(temp<firstIndex && temp>=0){
				firstIndex=temp;
			}
			return firstIndex;
		}
		else if(target<nums[middle]){
			right=middle-1;
			firstIndex=searchFirstIndexRange(nums, target, left, right);
			if(firstIndex>=0){
				return firstIndex;
			}
		}
		else if(target>nums[middle]){
			left=middle+1;
			firstIndex=searchFirstIndexRange(nums, target, left, right);
			if(firstIndex>=0){
				return firstIndex;
			}
		}
		return -1;
	}

}
