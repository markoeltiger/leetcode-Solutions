class Solution {
      public   int numberOfSteps(int num) {
      int lastnum=num;
      int stepsCount=0;
      while (lastnum!=0){
          if (lastnum%2==0){
              lastnum=lastnum/2;
                stepsCount=stepsCount+1;
          }
          else {
              stepsCount=stepsCount+1;

              lastnum=lastnum-1;
          }

      }
     return stepsCount;

    }
}