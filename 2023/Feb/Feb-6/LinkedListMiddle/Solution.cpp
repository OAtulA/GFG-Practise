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
        int count = 0, ans = -1;
        Node *itr = head;

        while (itr->next != NULL)
        {
            count++;
        }
        itr = head;
        for (int i = 0; i <= count/2; i++)
        {
            itr = itr->next;
        }
        ans = itr->data;

        return ans;
        
    }
};