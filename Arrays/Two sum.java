//Optimised solution2
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i=1;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]+nums[j-i]==target)
                return new int[]{j,j-i};
            }
        }
    return null;
    }
}
//Brute force solution
/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}*/
//Optimised solution1
/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> diffMap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int diff=target-nums[i];
            if(diffMap.containsKey(diff))
                return new int[] {diffMap.get(diff),i};
            diffMap.put(nums[i],i);   
        }
        return new int[]{};
    }
}*/