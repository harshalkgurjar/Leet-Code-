class Q1TwoSum {
	/*
	* Copy array to hashmap<value, indexOfValue>
	* Iterate through ech element in array
	*	if hashmap contains target-element 
	*		return hashmap.get(target-element);
	*
	* if not found then return -1
	*/
    public int[] twoSum(int[] nums, int target) {
        int len=nums.length;
        int outputIndex[]=new int[2];
        //build Map of number , index
        Map<Integer,Integer> valueAndIndexMap=new HashMap<Integer,Integer>();
        for(int i=0;i<len;i++){
            valueAndIndexMap.put(nums[i],i);
        }
        // for every element in array look if target - element is present in array 
        for(int i=0;i<len;i++){
            if(valueAndIndexMap.containsKey(target-nums[i]) && valueAndIndexMap.get(target-nums[i])!=i){
                outputIndex[0]=i;
                outputIndex[1]=valueAndIndexMap.get(target-nums[i]);
            }
        }
        return outputIndex;
    }
	public static void main(String args[]){
		int arr={1,2,3,7,9,4,55};
		int target=12;
		int twoNumbers=new int[2];
		twoNumbers=Q1TwoSum(arr,target);
		System.out.println(twoNumbers[0]+" "+twoNumbers[1]);
	}
}