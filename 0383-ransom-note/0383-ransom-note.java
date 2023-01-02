class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder str = new StringBuilder(magazine); 
        StringBuilder rn = new StringBuilder(ransomNote);
     
        for(int i =0; i < ransomNote.length();i++) 
        { 
            if(str.indexOf(ransomNote.substring(i,i+1))!=-1)
            {
                 str.deleteCharAt(str.indexOf(ransomNote.substring(i,i+1))); 
                 rn.deleteCharAt(rn.indexOf(ransomNote.substring(i,i+1)));   
            }
              
        }
        
        return rn.length()==0;
        
    }
     
    
}