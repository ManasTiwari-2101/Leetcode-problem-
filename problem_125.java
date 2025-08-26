class Solution {
    public boolean isPalindrome(String s) {
        int l=s.length();
        String o="";
        for(int i=0;i<l;i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                o+=Character.toLowerCase(c);
            }
        }
        String m="";
        for(int i=o.length()-1;i>=0;i--){
            m+=o.charAt(i);
        }
        return o.equals(m);
    }
}
