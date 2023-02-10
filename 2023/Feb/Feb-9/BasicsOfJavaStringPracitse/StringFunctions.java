import java.io.*;

public class StringFunctions {
    public static void main(String[] args)throws IOException {
        String s1 = "Aman Nayak";
        System.out.println("Initial value> "+ s1);
        System.out.println("After replacing \'a\' with \'b\' "+ s1.replace("a", "b") );
        System.out.println("Original String now: "+s1);
        String s2 = s1.replace("a", "b");
        System.out.println();
        System.out.println("Original String now: "+s1);
        System.out.println("String 2 now : "+s2);

        // The below is the output of the following code
        /* {
            Initial value> Aman Nayak
            After replacing 'a' with 'b' Ambn Nbybk
            Original String now: Aman Nayak

            Original String now: Aman Nayak
            String 2 now : Ambn Nbybk
        }

 */    }
}
