 // https://leetcode.com/problems/majority-element/solution/
 // HashMap 
 public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; ++i){
            int count = map.getOrDefault(nums[i], 0);
            if((count+1) > nums.length/2) 
                return nums[i];
            else map.put(nums[i], count+1);
        }
      
        return -1;
    }
}
