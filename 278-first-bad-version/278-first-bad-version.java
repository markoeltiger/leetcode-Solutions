/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       int low = 1;
        int high = n;
   //binary search
        while(true){
            int mid = low + (high - low)/2;
 //2
            if((mid==n || mid==1) && isBadVersion(mid)==true) return mid;
 
            else if((isBadVersion(mid) == false) && (isBadVersion(mid+1) == true)) return mid+1;
 
            else if(isBadVersion(mid) == false) low = mid+1;
 
            else high = mid-1;
        
    }
}}