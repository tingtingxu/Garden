public class AddTwoNumber(){
	/*Two Linked List - NOT IN REVERSE ORDER!!!!!*/
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ArrayList<Integer> n1 = new ArrayList<Integer>();
		ArrayList<Integer> n2 = new ArrayList<Integer>();
		if(l1!=null && l2!=null){
			ListNode temp1 = l1;
			ListNode temp2 = l2;
			while(temp1!=null){
				n1.add(temp1.val);
				temp1 = temp1.next;
			}
			while(temp2!=null){
				n2.add(temp2.val);
				temp2 = temp2.next;
			}
			if(n1.size()>n2.size()) return addTwoNumbers(l2, l1);
			else{
				int diff = n2.size()-n1.size();
				int carry = 0;
				for(int index=n2.size()-1;index>=0;index--){
					if(index-diff>=0){
						int tempSum = n1.get(index-diff)+n2.get(index)+carry;
						if(tempSum>9){
							carry = 1;
							n2.set(index, new Integer(String.valueOf(new StringBuilder(tempSum+"").charAt(1))));
							if(index-1<0){
								n2.add(0, 1);
							}
						}else{
							carry = 0;
							n2.set(index, tempSum);
						}
					}else{
						int tempSum = n2.get(index)+carry;
						if(tempSum>9){
							carry = 1;
							n2.set(index, new Integer(String.valueOf(new StringBuilder(tempSum+"").charAt(1))));
							if(index-1<0){
								n2.add(0, 1);
							}
						}else{
							carry = 0;
							n2.set(index, tempSum);
						}
					}
				}

				ListNode r1 = new ListNode(n2.get(n2.size()-1));
				for(int index=n2.size()-2;index>=0;index--){
					ListNode tempNode = new ListNode(Integer.parseInt(String.valueOf(n2.get(index))));
					tempNode.next = r1;
					r1 = tempNode;
				}
				return r1;
			}
		}else if(l1==null){
			return l2;
		}else if(l2==null){
			return l1;
		}else{
			return null;
		}
	}
}
