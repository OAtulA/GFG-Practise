public class str_subsequence {
    // here we are for subsequence

    public static void main(String[] args) {
         String s = "Emotional damage";

        StringBuffer s2 = new StringBuffer(s);

        System.out.println("Initially: "+s2);

        System.out.println("Now we have: "+ s2.subSequence(0, 6).toString());

        System.out.println();
        String msg = "Here we go again: "        ;
        System.out.print(msg);
        System.out.println(s2.subSequence(0, 6).toString());

        System.out.println();
        System.out.println("Let\'s go one more time: ");
        System.out.println(s2.subSequence(0, 6));

        Object m = s2.subSequence(0, 6);
        m  += "fins";
        System.out.println("Lets have some fun: "+m);
    }
}
