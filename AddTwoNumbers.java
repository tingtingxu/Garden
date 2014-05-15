import datastructure.ListNode;
public class AddTwoNumbers{
	/* parameter: two linked list, the digits are in reversed order here
	 * See another version of this question in AddTwoNumber.java
	 * in which the two parameters are NOT in reversed order.
	 */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ArrayList<Integer> sum = new ArrayList<Integer>();
		int carry = 0;
		while(l1!=null || l2!=null){
			if(l1!=null&&l2!=null){
				int digitSum = l1.val + l2.val + carry;
				if(digitSum>9){
					carry = 1;
					sum.add(new Integer(String.valueOf(new StringBuilder(digitSum+"").charAt(1))));
				}else{
					carry = 0;
					sum.add(digitSum);
				}
				l1 = l1.next;
				l2 = l2.next;
			}else if(l1!=null){
				int digitSum = l1.val + carry;
				if(digitSum>9){
					carry = 1;
					sum.add(new Integer(String.valueOf(new StringBuilder(digitSum+"").charAt(1))));
				}else{
					carry = 0;
					sum.add(digitSum);
				}
				l1 = l1.next;
			}else if(l2!=null){
				int digitSum = l2.val + carry;
				if(digitSum>9){
					carry = 1;
					sum.add(new Integer(String.valueOf(new StringBuilder(digitSum+"").charAt(1))));
				}else{
					carry = 0;
					sum.add(digitSum);
				}
				l2 = l2.next;
			}
		}
		//code handling carry for last node here
		if(carry==1){
			sum.add(1);
		}
		if(sum.size()>0){
			ListNode result = new ListNode(sum.get(sum.size()-1));
			for(int index=sum.size()-2;index>=0;index--){
				result = new ListNode(sum.get(index), result);
			}
			return result;
		}else{
			return null;
		}
	}
}
