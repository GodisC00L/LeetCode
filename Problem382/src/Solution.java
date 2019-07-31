import java.util.Random;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

        private ListNode received = null;
        private int size = 0;
        private Random random = new Random();
        /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
        public Solution(ListNode head) {
            received = head;
            while (head != null) {
                size++;
                head = head.next;
            }
        }

        /** Returns a random node's value. */
        public int getRandom() {
            ListNode temp = received;
            int rand = random.nextInt(size);
            int i = 0;
            while (temp != null) {
                if (i == rand) return temp.val;
                i++;
                temp = temp.next;
            }
            return 0;
        }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        Solution solution = new Solution(head);
        System.out.println(solution.getRandom());
        System.out.println(solution.getRandom());
        System.out.println(solution.getRandom());

    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */

