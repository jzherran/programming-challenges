package codefight;

import java.util.ArrayList;
import java.util.List;

public class isListPalindrome {

  public static void main(String[] args) {
    ListNode<Integer> l = new ListNode(1);
    ListNode<Integer> n1 = new ListNode(2);
    ListNode<Integer> n2 = new ListNode(2);
    ListNode<Integer> n3 = new ListNode(3);
    n2.next = n3;
    n1.next = n2;
    l.next = n1;

    System.out.println(isListPalindrome(l));
  }

  static boolean isListPalindrome(ListNode<Integer> l) {
    ListNode<Integer> t = l;
    List<Integer> a = new ArrayList<>();
    while(true) {
      if (t.value == null) return true;
      a.add(t.value);
      if(t.next != null) t = t.next;
      else {
        int sum = a.stream().mapToInt(Integer::intValue).sum();
        if (sum == 0) return true;
        return (a.size() % 2 == 0 && sum % 2 == 0)
            || (a.size() % 2 == 1 && sum - a.get(a.size()/2) == 0);
      }
    }
  }
}

class ListNode<T> {
  ListNode(T x) {
    value = x;
  }

  T value;
  ListNode<T> next;
}