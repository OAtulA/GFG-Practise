
/**
 * str_reverse
 */
public class str_reverse {

    //This is one of my most used method of StringBuffer.
    // I just love it

    public static void main(String[] args) {
        String s = "UllU";
        StringBuffer s2 = new StringBuffer(s);
        System.out.println("Initial StringBuffer: "+ s2);
        s2.reverse();

        System.out.println("StringBuffer now: "+ s2);
        System.out.println();

        // Since here we can't see any changes let's try something else.

        StringBuffer s3  = new StringBuffer("SOme more text in here.");
        System.out.println("Initial text: "+s3);
        s3.reverse();
        System.out.println("Operated StringBuffer: "+ s3);

    }
}