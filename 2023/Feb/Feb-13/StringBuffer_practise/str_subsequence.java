public class str_subsequence {
    // here we are for subsequence

    public static void main(String[] args) {
         String s = "Emotional damage";

        StringBuffer s2 = new StringBuffer(s);

        System.out.println("Initially: "+s2);

        System.out.println("Now we have: "+ s2.subSequence(0, 6).toString());
    }
}
