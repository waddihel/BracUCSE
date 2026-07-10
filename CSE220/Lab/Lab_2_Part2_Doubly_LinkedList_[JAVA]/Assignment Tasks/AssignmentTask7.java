public class AssignmentTask7 {

  // SUBMIT ONLY THIS METHOD
  public static void rangeMove(DNode dh, int start, int end) {
    DNode it = dh.next;
    DNode tail = dh.prev;
    while (it != tail) {
      if ((int)it.elem >= start && (int)it.elem <= end) {
        DNode temp = it.next;
        it.prev.next = it.next;
        it.next.prev = it.prev;
        it.next = dh;
        it.prev = dh.prev;
        dh.prev.next = it;
        dh.prev = it;
        it = temp;
      } else {
        it = it.next;
      }
    }
  }

  // DO NOT SUBMIT THE DRIVER CODE BELOW
  // SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
  public static void main(String[] args) {
    Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
    DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

    System.out.println("Given Linked List:");
    LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

    System.out.println("\nExpected Output:");
    Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
    DNode expectedHead =
        LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
    LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

    // Running the Range Move with [5,7] range
    rangeMove(dh, 5, 7);
    // Printing after Range Move
    System.out.println("\nYour Output:");
    LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
  }
}
