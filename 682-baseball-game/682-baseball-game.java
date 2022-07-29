class Solution {
    public int calPoints(String[] ops) {
           int result = 0;

        LinkedList<String> scores = new LinkedList<String>();

        if (ops.length==1){result = Integer.parseInt(ops[0]);}
        else {
            for (int i = 0; ops.length > i; i++) {
            //    if (i==0){scores.add(ops[i]);}
                if (ops[i].equals("C")){scores.removeLast();}
                else if (ops[i].equals("D")){
                    int mydouble =Integer.parseInt(scores.getLast());
                    scores.add(mydouble*2+"");}

                else if (ops[i].equals("+")){    int mysize = scores.size();
                    System.out.println(mysize+"mysje");   int plus = Integer.parseInt(scores.get(mysize-2) )+Integer.parseInt(scores.getLast());
            scores.add(plus+"");
                }
                else {
                    System.out.println("here"+ops[i]);
                    scores.add(ops[i]);
                }
            }

        }
        int currentvalue = 0;
        for (int i = 0 ; i<scores.size();i++){
            currentvalue=Integer.parseInt(scores.get(i));
            result=result+currentvalue;
        }
return result;
    }
}