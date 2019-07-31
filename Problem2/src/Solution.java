/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null, temp = null;
        int n = 0;
        boolean f = true;
        int carry = 0;
        while (l1 != null && l2 != null){
            n = l1.val + l2.val;
            if (carry == 1) {
                n++;
                carry = 0;
            }
            if (n >= 10){
                carry = 1;
                n = n % 10;
            }
            if(f){
                res = new ListNode(n);
                temp = res;
                f = false;
            }
            else {
                res.next = new ListNode(n);
                res = res.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            n = l1.val;
            if (carry == 1) {
                n++;
                carry = 0;
            }
            if (n >= 10){
                carry = 1;
                n = n % 10;
            }
            if(f){
                res = new ListNode(n);
                temp = res;
                f = false;
            }
            else {
                res.next = new ListNode(n);
                res = res.next;
            }
            l1 = l1.next;
        }
        while (l2 != null){
            n = l2.val;
            if (carry == 1) {
                n++;
                carry = 0;
            }
            if (n >= 10){
                carry = 1;
                n = n % 10;
            }
            if(f){
                res = new ListNode(n);
                temp = res;
                f = false;
            }
            else {
                res.next = new ListNode(n);
                res = res.next;
            }
            l2 = l2.next;
        }
        if (carry == 1) {
            res.next = new ListNode(1);
            res = res.next;
        }
        return temp;
    }
}

