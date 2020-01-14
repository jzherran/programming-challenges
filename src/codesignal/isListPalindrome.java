package codesignal;

public class isListPalindrome {

  public static void main(final String[] args) {

    // 1, 2, 2, 3
    final ListNode<Integer> l1 = new ListNode<Integer>(1);
    final ListNode<Integer> l11 = new ListNode<Integer>(2);
    final ListNode<Integer> l12 = new ListNode<Integer>(2);
    final ListNode<Integer> l13 = new ListNode<Integer>(3);
    l12.next = l13;
    l11.next = l12;
    l1.next = l11;

    // 1, 1000000000, -1000000000, -1000000000, 1000000000, 1
    final ListNode<Integer> l2 = new ListNode<Integer>(1);
    final ListNode<Integer> l21 = new ListNode<Integer>(1000000000);
    final ListNode<Integer> l22 = new ListNode<Integer>(-1000000000);
    final ListNode<Integer> l23 = new ListNode<Integer>(-1000000000);
    final ListNode<Integer> l24 = new ListNode<Integer>(1000000000);
    final ListNode<Integer> l25 = new ListNode<Integer>(1);
    l24.next = l25;
    l23.next = l24;
    l22.next = l23;
    l21.next = l22;
    l2.next = l21;

    // System.out.println(isListPalindrome(l1));
    System.out.println(isListPalindromeCalc(l2));
  }

  static boolean isListPalindromeCalc(final ListNode<Integer> head) {

    ListNode<Integer> slow_ptr, fast_ptr, second_half;
    ListNode<Integer> prev_of_slow_ptr = head;
    ListNode<Integer> mid_node = null;
    boolean ans = true;

    slow_ptr = head;
    fast_ptr = head;

    if (head != null && head.next != null) {
      while (fast_ptr != null && fast_ptr.next != null) {
        fast_ptr = fast_ptr.next.next;
        prev_of_slow_ptr = slow_ptr;
        slow_ptr = slow_ptr.next;
      }

      if (fast_ptr != null) {
        mid_node = slow_ptr;
        slow_ptr = slow_ptr.next;
      }

      second_half = slow_ptr;
      prev_of_slow_ptr.next = null;
      second_half = reverse(second_half);
      ans = compareLists(head, second_half);

      if (mid_node != null) {
        prev_of_slow_ptr.next = mid_node;
        mid_node.next = second_half;
      } else
        prev_of_slow_ptr.next = second_half;
    }

    return ans;
  }

  static ListNode<Integer> reverse(final ListNode<Integer> second_half) {
    ListNode<Integer> prev = null;
    ListNode<Integer> current = second_half;
    ListNode<Integer> next;

    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }

    return prev;
  }

  static boolean compareLists(final ListNode<Integer> head1, final ListNode<Integer> head2) {
    ListNode<Integer> temp1 = head1;
    ListNode<Integer> temp2 = head2;

    while (temp1 != null && temp2 != null) {
      if (temp1.value.equals(temp2.value)) {
        temp1 = temp1.next;
        temp2 = temp2.next;
      } else
        return false;
    }

    if (temp1 == null && temp2 == null)
      return true;

    return false;
  }
}

class ListNode<T> {
  ListNode(final T x) {
    value = x;
  }

  T value;
  ListNode<T> next;
}