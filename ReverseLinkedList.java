import datastructure.ListNode;//Singly Linked List

public class ReverseLinkedList{
  	//recursively solution
  	public ListNode reverseLinkedList(ListNode l1, ListNode preListNode) {
		if(l1==null&&preListNode==null) return l1;
		if(l1.next==null){
			l1.next = preListNode;
			return l1;
		}
		ListNode nextNode = l1.next;
		l1.next = preListNode;
		return reverseLinkedList(nextNode, l1);
	}
	
	//Non-recursivly solution.
	public ListNode reverse(ListNode l1){
		if(l1==null||l1.next==null) return l1;
		ListNode preNode = l1.next;
		l1.next = null;
		while(preNode!=null){
			ListNode tempNode = preNode.next;
			preNode.next = l1;
			l1 = preNode;
			preNode = tempNode;
		}
		return l1;
	}
}
