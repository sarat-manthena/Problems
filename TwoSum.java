package com.learning.problems;

class ListNode{
	int val;
	ListNode next;
	
	ListNode(int x){
		this.val = x;
		this.next = null;
	}
	
	void printList(ListNode root) {
		while(root.next!=null) {
			System.out.print(root.val+"->");
			root = root.next;
		}
		System.out.print(root.val);
		System.out.println();
	}
	
	
}

class MyList{
	ListNode root;
	
	void addNode(int data) {
		if(root == null) {
			root = new ListNode(data);
		}else {
			addNodeRecursive(root,data);
		}
	}
	void addNodeRecursive(ListNode current,int data) {
		if(current.next !=null)
			addNodeRecursive(current.next,data);
		else {
			ListNode tmp = new ListNode(data);
			current.next = tmp;
		}
			
		
	}
	void printList() {
		while(root.next!=null) {
			System.out.print(root.val+"->");
			root = root.next;
		}
		System.out.print(root.val);
		System.out.println();
	}
	ListNode getRoot() {
		return root;
	}
}

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList list1 = new MyList();
		list1.addNode(9);
		
		list1.printList();
		MyList list2 = new MyList();
		list2.addNode(1);
		list2.addNode(9);
		list2.addNode(9);
		list2.addNode(9);
		list2.addNode(9);
		list2.addNode(9);
		list2.addNode(9);
		list2.addNode(9);
		list2.addNode(9);
		list2.addNode(9);
		
		list2.printList();
		
		ListNode result = addTwoNumbers(list1.getRoot(),list2.getRoot());
		System.out.println("Final sum");
		result.printList(result);

	}
	
	static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int index=1;
        int l1Number =0;
        while(l1.next !=null) {
        	int tmp = l1.val * index;
            l1Number = l1Number+tmp;
            index = index*10;
            l1 = l1.next;
        }
        int tmp1 = l1.val * index;
        l1Number = l1Number+tmp1;
        index = index*10;
        index =1;
        int l2Number =0;
        while(l2.next !=null){
            int tmp = l2.val * index;
            l2Number = l2Number+tmp;
            index = index*10;
            l2 = l2.next;
        }
        tmp1 = l2.val * index;
        l2Number = l2Number+tmp1;
        index = index*10;
        int returnNumber = l1Number+l2Number;
        
        int rem = returnNumber%10;
        ListNode root = new ListNode(rem);
        ListNode tmproot = root;
        returnNumber = returnNumber/10;
        while(returnNumber >0){
            rem=returnNumber%10;
            ListNode tmp = new ListNode(rem);
            tmproot.next = tmp;
            tmproot = tmproot.next;
            returnNumber = returnNumber/10;
             
        }
        
        return root;
        
    }

}
