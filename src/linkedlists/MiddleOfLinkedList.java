package linkedlists;

public class MiddleOfLinkedList {
	public ListNode middleNode(ListNode head) {
        int numNodes = 1;
        ListNode middleNode = head; 
        ListNode currNode = head;
        while (currNode.next != null){
            numNodes++;
            currNode = currNode.next;
        }
        int middleNodePosition = (numNodes / 2) + 1;
        // reset current node to head 
        currNode = head;
        for(int i =1; i <= middleNodePosition; i++){
            if(i != middleNodePosition){
                 currNode = currNode.next; 
            } else{
                middleNode = currNode; 
            }
        }
        return middleNode;
    }
}
