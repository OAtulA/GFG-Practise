public class StrAppend {
    public static void main(String[] args) {
        
        StringBuffer s = new StringBuffer();
        
        // Practised the most basic variant of append
        for (int i = (int)'A'; i <= (int)'Z'; i++) {
            s.append( (char)i);
        }
        System.out.println("Final String: "+s);


    }
}
