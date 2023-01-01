class Solution {
    public int maximumWealth(int[][] accounts) {
      int richestCustomer =0;
        for (int i = 0 ; i< accounts.length;i++){
            int [] currentAccount = accounts[i];
            if (getSumOfArray(currentAccount)>richestCustomer){
                richestCustomer=getSumOfArray(currentAccount);
            }
        }
        return richestCustomer;
    }
        public int getSumOfArray(int [] array){
        int sum = 0;
        for (int i =0 ; i<array.length;i++){
            sum=sum+array[i];
        }
        return sum;
    }
}