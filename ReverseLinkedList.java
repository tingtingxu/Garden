import datastructure.ListNode;

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
}
