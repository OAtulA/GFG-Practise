
class node:
    def __init__(self):
        self.data = None
        self.next = None

class Solution:
    def display(self,node):
        
        while node != None :
            print(node.data, end=" ")
            node = node.next
    

