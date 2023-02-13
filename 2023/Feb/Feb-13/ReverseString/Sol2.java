

public class Sol2 {
    static String revStr(String S) {
        char[] rev= new char[ S.length()];

        for (int i = rev.length -1; i >=0; i--) {
            // int index = (i == rev.length)? 0: rev.length -i -1;
            
            // rev[index]= S.charAt(i);
            rev[rev.length -i -1] = S.charAt(i);
        }

        return new String(rev);
    }

    public static void main(String[] args) {
        String s = "ReversE";

        System.out.println( revStr(s) );
    }
}
