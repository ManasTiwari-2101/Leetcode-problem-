// First Approach which i learned 
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int c=0;
        for(int num:map.keySet()){
            if(map.containsKey(num+1)){
                int len=map.get(num)+map.get(num+1);
                c=Math.max(c,len);
            }
        }
        return c;
    }
}
// Optimal Approach is by using sliding windows O(nlogn)
class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < nums.length; right++) {
            // shrink window if difference > 1
            while (nums[right]-nums[left]>1) {
                left++;
            }
            if (nums[right]-nums[left]== 1) {
                maxLen = Math.max(maxLen, right-left+1);
            }
        }
        return maxLen;
    }
}
