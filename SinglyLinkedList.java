public class SinglyLinkedList {
  private ListNode head;

  private static class ListNode {
    private int data;
    private ListNode next;

    private ListNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public int length() {
    if (head == null) {
      return 0;
    }
    ListNode current = head;
    int count = 0;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  public String display() {
    ListNode current = head;
    String returnLinkList = "";
    while (current != null) {
      returnLinkList = returnLinkList + current.data + " --> ";
      current = current.next;
    }
    returnLinkList = returnLinkList + "null";
    return returnLinkList;
  }

  public String display(ListNode head) {
    ListNode current = head;
    String returnLinkList = "";
    while (current != null) {
      returnLinkList = returnLinkList + current.data + " --> ";
      current = current.next;
    }
    returnLinkList = returnLinkList + "null";
    return returnLinkList;
  }

  public void insertFirst(int value) {
    ListNode newNode = new ListNode(value);
    newNode.next = head;
    head = newNode;
  }

  public void insertLast(int value) {
    ListNode newNode = new ListNode(value);
    if (head == null) {
      head = newNode;
      return;
    }
    ListNode current = head;
    while (null != current.next) {
      current = current.next;
    }
    current.next = newNode;
  }

  public void insert(int value, int position, int length) {
    ListNode newNode = new ListNode(value);
    if (length < position) {
      System.out.println("Invalid position, Please enter position according to list length!");
      return;
    }
    if (position == 1) {
      newNode.next = head;
      head = newNode;
    } else {
      ListNode previous = head;
      int count = 1;
      while (count < position - 1) {
        previous = previous.next;
        count++;
      }
      ListNode current = previous.next;
      previous.next = newNode;
      newNode.next = current;
    }
  }

  public ListNode deleteFirst() {
    if (head == null) {
      return null;
    }
    ListNode temp = head;
    head = head.next;
    temp.next = null;
    return temp;
  }

  public ListNode deleteLast() {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode current = head;
    ListNode previous = null;
    while (current.next != null) {
      previous = current;
      current = current.next;
    }
    previous.next = null;
    return current;
  }

  public ListNode delete(int position) {
    if (position == 1) {
      ListNode temp = head;
      head = head.next;
      return temp;
    } else {
      ListNode previous = head;
      int count = 1;
      while (count < position - 1) {
        previous = previous.next;
        count++;
      }
      ListNode current = previous.next;
      previous.next = current.next;
      return current;
    }
  }

  public boolean find(ListNode head, int searchKey) {
    if (head == null) {
      return false;
    }
    ListNode current = head;
    while (current != null) {
      if (current.data == searchKey) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public ListNode reverse() {
    ListNode current = head;
    ListNode previous = null;
    ListNode next = null;
    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    return previous;
  }

  public static void main(String[] args) {
    SinglyLinkedList sl = new SinglyLinkedList();
    sl.insertFirst(10);
    sl.insert(100, 1, sl.length());
    sl.insert(501, 1, sl.length());
    sl.insert(50, 2, sl.length());
    // System.out.println(sl.display());
    // sl.deleteFirst();
    // System.out.println(sl.display());
    // sl.deleteLast();
    // System.out.println(sl.display());
    // sl.delete(2);
    if (sl.find(sl.head, 10)) {
      System.out.println("element found in linked list");
    } else {
      System.out.println("element not found in linked list");
    }
    System.out.println(sl.display());
    System.out.println(sl.display(sl.reverse()));
    System.out.println("Length is - " + sl.length());
  }
}