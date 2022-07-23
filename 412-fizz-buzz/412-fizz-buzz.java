class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> fizzy = new ArrayList<String>();
        for (int i = 1 ; i<=n;i++){
         if (i%3==0&&i%5==0){fizzy.add("FizzBuzz");
                System.out.println("FizzBuzz");}
         else  if (i%3==0){fizzy.add("Fizz");
        System.out.println("Fizz");}
        else if (i%5==0){fizzy.add("Buzz");
        System.out.println("Buzz");}
      
        else {
            fizzy.add(i+"");
            System.out.println(i);
        }

        }

   return fizzy; 
    }
}