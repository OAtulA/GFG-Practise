// Node is defined as
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }

}
class Solution
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void display(Node head)
    {
        //System.out.print("{");
        while(head!= null){
            System.out.print(head.data);
            head = head.next;
            if(head != null) System.out.print(" ");
        }
        //System.out.print("}");
    }
}
