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



    }
}
