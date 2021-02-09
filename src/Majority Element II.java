class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i : nums){
            int count = map.getOrDefault(i, 0);
            if(count+1 > nums.length/3 && !list.contains(i)){
                list.add(i);
            }else{
                map.put(i, count+1);
            }
        }
        
        return list;
        
    }
}
