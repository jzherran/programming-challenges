package codefight;

import java.math.BigInteger;
import java.util.Scanner;

public class MthToLast {

  public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named hackerrank.MthToLast. */

    Scanner sc = new Scanner(System.in);

    BigInteger n = BigInteger.valueOf(Long.parseLong(sc.nextLine()));
    String[] l = sc.nextLine().split(" ");

    DoublyLinkedList list = new DoublyLinkedList();

    for (String li : l) {
      DoublyLinkedNode node =
          new DoublyLinkedNode(null, null, BigInteger.valueOf(Long.parseLong(li)));
      DoublyLinkedList.insertEnd(list, node);
    }

    String r = "";
    DoublyLinkedNode node = list.lastNode;

    while (n.compareTo(BigInteger.ZERO) == 1) {
      if (node.prev != null) {
        r = node.n.toString();
        node = node.prev;
        n = n.subtract(BigInteger.ONE);
      } else {
        r = "NIL";
        break;
      }
    }
    System.out.println(r);
  }

  static class DoublyLinkedList {

    DoublyLinkedNode firstNode;
    DoublyLinkedNode lastNode;

    DoublyLinkedList() {
    }

    static void insertBefore(DoublyLinkedList list, DoublyLinkedNode node,
        DoublyLinkedNode newNode) {
      newNode.next = node;
        if (node.prev == null) {
            list.firstNode = newNode;
        } else {
            node.prev.next = newNode;
            newNode.prev = node.prev;
        }
      node.prev = newNode;
    }

    static void insertAfter(DoublyLinkedList list, DoublyLinkedNode node,
        DoublyLinkedNode newNode) {

      newNode.prev = node;
        if (node.next == null) {
            list.lastNode = newNode;
        } else {
            newNode.next = node.next;
            node.next.prev = newNode;
        }
      node.next = newNode;
    }

    static void insertBeginning(DoublyLinkedList list, DoublyLinkedNode newNode) {

        if (list.firstNode == null) {
            list.firstNode = newNode;
            list.lastNode = newNode;
            newNode.prev = null;
            newNode.next = null;
        } else {
            insertBefore(list, list.firstNode, newNode);
        }
    }

    static void insertEnd(DoublyLinkedList list, DoublyLinkedNode newNode) {

        if (list.lastNode == null) {
            insertBeginning(list, newNode);
        } else {
            insertAfter(list, list.lastNode, newNode);
        }
    }

    @Override
    public String toString() {
      return super.toString();
    }
  }

  static class DoublyLinkedNode {

    protected DoublyLinkedNode prev;
    protected DoublyLinkedNode next;
    protected BigInteger n;

    DoublyLinkedNode(DoublyLinkedNode prev, DoublyLinkedNode next, BigInteger n) {
      this.prev = prev;
      this.next = next;
      this.n = n;
    }
  }
}
