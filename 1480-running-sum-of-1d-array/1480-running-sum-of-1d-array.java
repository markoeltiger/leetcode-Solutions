class Solution {
    public int[] runningSum(int[] nums) {
    int [] newarr = new int [nums.length];
            for(int i = 0 ; i <nums.length ;i++){
                if (i ==0){
                   newarr[0]=nums[0];
                } else {
                    int sum = 0;
                    for(int x = 0; x <=i ; x++){
                        sum = sum + nums[x];
                        newarr[i]=sum;
                    }

                }


            }
      return newarr;
    }
}