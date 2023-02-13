

class Solution {
    static String revStr(String S) {
        StringBuffer s1 =  new StringBuffer(S);
        return s1.reverse().toString();
    }

    public static void main(String[] args) {
        
        String s ="ReversE";
        System.out.println( revStr(s));
    }
}