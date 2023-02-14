/**
 * StrDelete
 */
public class StrDelete {

    public static void main(String[] args) {
        String s1 = "Punnu at Jhansi";

        StringBuffer s = new StringBuffer(s1);

        System.out.println("Original string: "+s);

        s.delete(0, 0);
        System.out.println("Now string; "+ s);
        s.delete(0, "Punnu ".length());
        System.out.println("Here we go again in StringBuffer; "+ s);
    }
}