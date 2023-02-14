

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

        /* 
         * Here the replace unlike string isn't about the string to be rplaced
         * But about the index to be replaced.
         * 
         * If we were to replace some substring occurence.
         * We can do it by traversing to find the indexOf()
         * Then we can keep replacing at those index.
         * 
         * Alternatively, we can convert and store it as string
         * and then perform the replace operation.
         */
    }
}
