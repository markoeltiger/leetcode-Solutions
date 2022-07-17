class Solution {
    public int pivotIndex(int[] nums) {
             int returnindex = -1 ;
            for(int i =0 ; i <nums.length ;i++){

                    int sum = 0;
                    for(int x = 0; x <=i ; x++){
                        sum = sum + nums[x];
                    }
                    if (i==0){
                     sum= 0;
                    System.out.println("si,"+sum);


                    }
                int sumx = 0;

                for(int x = nums.length-1; x >=i ; x--){
                    sumx = sumx + nums[x];

                }
      if (i== 0) {
          sumx=0;
          for (int x = nums.length - 1; x > i; x--) {
              sumx = sumx + nums[x];

          }

      }
                System.out.println(sum+"sum"+sumx);
                if (sum==sumx){
                    returnindex = i;
break;

                }
            }
    return returnindex;
    }
}