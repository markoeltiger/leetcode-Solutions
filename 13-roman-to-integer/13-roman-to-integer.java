class Solution {
    public int romanToInt(String s) {
               int num=0;
       for (int i =0 ; i <s.length();i++){
           char curent =s.charAt(i);
          switch (curent){
              case 'I':
                 num++;
                  break;

              case 'V':
                  if (i>0  && s.charAt(i-1)=='I'){  num=num+3;
                      break;}else {
                  num=num+5;
                  break;}
              case 'X':
                  if (i>0  && s.charAt(i-1)=='I'){  num=num+8;
                      break;}else {
                  num=num+10;
                  break;}
              case 'L':
                  if (i>0  && s.charAt(i-1)=='X'){  num=num+30;
                      break;}else {
                  num=num+50;
                  break;}
              case 'C':
                  if (i>0  && s.charAt(i-1)=='X'){  num=num+80;
                      break;}else {
                  num=num+100;
                  break;}
              case 'D':
                  if (i>0  && s.charAt(i-1)=='C'){  num=num+300;
                      break;}else {
                  num=num+500;
                  break;}
                  case 'M':
                      if (i>0  && s.charAt(i-1)=='C'){  num=num+800;
                          break;}else {
                  num=num+1000;
                  break;}

          }
       System.out.println(s.charAt(i));

       }
       System.out.println(num);

       return num;
    }
}