class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
         if (hasDuplicates(nums)) {
       return true
    }
    else {
       return false
    }
            
    }
    fun  hasDuplicates(arr:IntArray): Boolean {
    return arr.size != arr.distinct().count();
}
}