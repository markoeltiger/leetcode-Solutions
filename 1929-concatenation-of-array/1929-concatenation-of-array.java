class Solution {
    public int[] getConcatenation(int[] nums) {
              int [] newx=new int[nums.length*2];
 

        for (int i = 0 ;i<newx.length;i++){

           if (i < nums.length)
               newx[i]=nums[i];
          else {
              int m = i- nums.length;
               newx[i] = nums[m];
           }
        }
    return newx;
    }
}