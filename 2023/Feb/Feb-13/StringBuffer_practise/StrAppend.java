import java.io.*;
public class StrAppend {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer();

        // Practised the most basic variant of append
        for (int i = (int)'A'; i <= (int)'Z'; i++) {
            s.append( (char)i);
        }
        System.out.println("Final String: "+s);
        
        //Empty the StringBuffer.
        s = new StringBuffer("");

        // Appending the input
        {
        System.out.println("Enter some text: ");
        String Line1 = input.readLine();
        System.out.println("s now: "+s);
        s.append(Line1);
        System.out.println("Enter some more text: ");
        
        
        String line2 =  input.readLine();
        s.append( line2);
        System.out.println();
        System.out.println("First variable: "+ Line1);
        System.out.println();
        System.out.println("Second variable: "+ line2);
        System.out.println();
        System.out.println("String Buffer after addittion: "+ s.toString());
        }





    }
}
