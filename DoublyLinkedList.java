public class DoublyLinkedList {

  private ListNode head;
  private ListNode tail;
  private int length;

  private class ListNode {
    private int data;
    private ListNode previous;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
    }
  }

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public int length() {
    return length;
  }

  public void insertLast(int value) {
    ListNode newNode = new ListNode(value);
    if (isEmpty()) {
      head = newNode;
    } else {
      tail.next = newNode;
    }
    newNode.previous = tail;
    tail = newNode;
    length++;
  }

  public void displayForward() {
    if (head == null) {
      return;
    }
    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.data + " --> ");
      temp = temp.next;
    }
    System.out.print("null");
  }

  public void displayBackward() {
    if (tail == null) {
      return;
    }
    ListNode temp = tail;
    while (temp != null) {
      System.out.print(temp.data + " --> ");
      temp = temp.previous;
    }
    System.out.print("null");
  }

  public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    dll.insertLast(1);
    dll.insertLast(10);
    dll.insertLast(15);
    dll.displayForward();
    System.out.println("");
    dll.displayBackward();
  }

}
