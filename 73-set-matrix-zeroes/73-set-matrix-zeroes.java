class Solution {
  public void setZeroes(int[][] na) {
       int high =0,width=0;
ArrayList<Integer> indexes = new ArrayList<Integer>();
        ArrayList<Integer> indexes2 = new ArrayList<Integer>();
        for (int i = 0; i < na.length; i++) {
            for (int j = 0; j < na[i].length; j++) {
                if (na[i][j] == 0) {
                 high=i ; width= j;
                 indexes.add(high);
                 indexes2.add(width);
                }
             }
        }

        for (int i = 0; i < na.length; i++) {

            for (int j = 0; j < na[i].length; j++) {
                for (int x = 0 ; x<indexes.size();x++){

                    na[indexes.get(x)][j]=0;

                    na[i][indexes2.get(x)]=0;
                }


            }
        }
    }
}