

public class Ques2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // Holds the start of the result
        ListNode curr = dummy;
        int carry = 0;

        // Traverse both lists at the same time
        while (l1 != null || l2 != null || carry != 0) {
            // Get values (use 0 if a list has ended)
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10; // New carry (1 or 0)
            
            // Create the new node for this digit
            curr.next = new ListNode(sum % 10);
            
            // Move all pointers forward
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next; // Skip the dummy 0 we started with
}
public static void main(String[] args) {
    Ques2 solution = new Ques2();
    // Creating first number: 342 (represented as 2 -> 4 -> 3)
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    // Creating second number: 465 (represented as 5 -> 6 -> 4)
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    
    ListNode result = solution.addTwoNumbers(l1, l2);
    
    // Print the result: should represent 807 (7 -> 0 -> 8)
    while (result != null) {
        System.out.print(result.val + " ");
        result = result.next;
    }
}
}
//Definition for singly-linked list.
 class ListNode {
      int val;
     ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 