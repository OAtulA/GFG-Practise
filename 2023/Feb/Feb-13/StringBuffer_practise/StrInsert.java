import java.io.*;;

public class StrInsert {
    
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        StringBuffer s = new StringBuffer("Wo hoho  Gill");
        System.out.print("Enter a first name: ");
        String Line1 =  input.readLine();
        int position = "Wo hoho ".length();
        s.insert( position, Line1 );
        System.out.println();
        System.out.println("THis is final thing:  "+s);

    }
}
