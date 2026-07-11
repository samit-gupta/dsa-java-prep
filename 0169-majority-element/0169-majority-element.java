class Solution {
    public int majorityElement(int[] nums) {
        int freq=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(freq==0){
                max=nums[i];
            }
            if(max==nums[i]){
                freq++;
            }
            else{
                freq--;
            }
        }
        return max;
    }
}