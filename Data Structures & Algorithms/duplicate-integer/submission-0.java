class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int arr : nums){
            map.put(arr,map.getOrDefault(arr,0) + 1);
        }
        for(int num : map.keySet()){
            if(map.get(num)>1){
                return true;
            }
        }
        return false;
    }
}