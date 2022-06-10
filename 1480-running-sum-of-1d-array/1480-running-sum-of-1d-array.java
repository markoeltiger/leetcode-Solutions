class Solution {
    public int[] runningSum(int[] nums) {
                int[]  newnums =new int[nums.length];
        newnums[0]=nums[0];
for (int i = 1 ; i <nums.length ;i++){
    for (int x =0 ;x <i+1;x++){
          newnums[i]=newnums[i]+nums[x];
    }
}
return newnums;
    }
}