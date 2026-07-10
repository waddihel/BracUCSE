public class AssignmentTask5 {

  // SUBMIT ONLY THIS METHOD
  public static void sumOddAppend(Node dh) {
    Node oddSum = new Node((int)0);
    oddSum.next = dh;
    while (dh.next != oddSum.next) {
      if ((int)dh.next.elem % 2 != 0) {
        oddSum.elem = (int)oddSum.elem + (int)dh.next.elem;
        dh.next = dh.next.next;
      } else
        dh = dh.next;
    }
    dh.next = oddSum;
  }

  // DO NOT SUBMIT THE DRIVER CODE BELOW
  // SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
  public static void main(String[] args) {
    Object[] values = {11, 22, 33, 44, 55, 66};
    Node head =
        LinkedListHelpers.createDummyHeadedSinglyCircularLL(values, true);

    System.out.println("Given Linked List:");
    LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
    System.out.println("\nExpected Output:");
    Object[] expected = {22, 44, 66, 99};
    Node expectedHead =
        LinkedListHelpers.createDummyHeadedSinglyCircularLL(expected, true);
    LinkedListHelpers.printDummyHeadedSinglyCircularLL(expectedHead);

    // Running the Sum Odd Append
    sumOddAppend(head);
    // Printing after Sum Odd Append
    System.out.println("\nYour Output:");
    LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
  }
}
