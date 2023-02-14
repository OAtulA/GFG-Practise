

public class StrReplace {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("My lovely text.");
        System.out.println("Original value: "+s);
        s.replace(2, 3, "Pagli");

        System.out.println("After replace: "+ s);

        // Gotcha So its simply gonna replace the specified index range;
        // When/if the regex string index range exceeds then its inserted there.
        // Thats it.
        // Nothing fancy.

    }
}
