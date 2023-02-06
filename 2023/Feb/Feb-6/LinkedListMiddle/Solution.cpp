/* Link list Node
 */
#include <bits/stdc++.h>
struct Node
{
    int data;
    Node *next;

    Node(int x)
    {
        data = x;
        next = NULL;
    }
};

class Solution
{
public:
    /* Should return data of middle node. If linked list is empty, then  -1*/
    int getMiddle(Node *head)
    {
        Node *fast = head, *slow = head;
        if(!head) return -1;
        bool even = false;
        while (fast->next != nullptr && fast->next->next != nullptr)
        {
            fast = fast->next->next;
            if(! fast) even = true;
            slow = slow->next;
        }
        
        int ans ;
        if(!even)

        ans = slow->next->data;
        else 
        ans = slow->data;

        return ans;
        
    }

};