// Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }    
}


public class Solution
{
    public static void main(String[] args) {
        
        Node head=  new Node(1);
        Node tail = head;
        for (int i = 2; i < 6; i++) {
            Node n = new Node(i);
            if(head.equals(tail) ){
                tail = new Node(i);
                head.next = tail;
            }
            else{
                tail.next= n;
                tail = n;
            }
                
        }

        int ans=  Solution.getMiddle(head);
        System.out.println("Ans: "+ ans);

    }

    public static int getMiddle(Node head)
    {
        int count =0, ans =-1;
        
        Node itr = head;
        
        while(itr.next !=  null){
            itr = itr.next;
            count++;
        }
        System.out.println("num of elements: "+count);
        itr = head;
        for(int i =0; i< count/2 ; i++ )
        {
            
            itr =itr.next;            
        }
        ans = itr.data;
        
        
        return ans;
    }

}
