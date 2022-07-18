class Solution {
    public boolean isSubsequence(String s, String t) {
        
        boolean isSubseq = false;
        String subseq= "";
        int lastindex = 0 ;
        for (int i = 0 ; i<s.length();i++){

            for (int x = 0 ;x<t.length();x++){
                if (s.charAt(i)==t.charAt(x)){
                  if (lastindex<x||lastindex==0){
                    subseq=subseq+s.charAt(i);
                    System.out.println(subseq);
                    lastindex = x ;
                  break;}
                }

            }
        }
        if (subseq.equals(s))return true;else return false;
    }
}