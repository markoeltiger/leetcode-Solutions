class Solution {
    public String defangIPaddr(String address) {
                String newip ="";
        for (int i = 0 ; i < address.length();i++){
            if (address.charAt(i)!='.'){
            newip=newip+address.charAt(i);
            }
            else {
                newip=newip+"[.]";
            }
        }
    return newip;
    }
}