class Solution {
    public int fib(int n) {
            HashMap<Integer, Integer> map = new HashMap<>();
        if(map.containsKey(n)) return map.get(n);
                if(n==0) return 0;
        if(n <= 2) return 1 ;
        map.put( n,fib(n-1) + fib(n-2));
        return map.get(n);
    }
}