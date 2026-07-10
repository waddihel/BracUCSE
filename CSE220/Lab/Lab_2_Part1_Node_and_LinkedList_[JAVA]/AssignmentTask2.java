// AssignmentTask2: Organize Books
import java.util.Arrays;
public class AssignmentTask2 {

  // MUST SUBMIT this method
  public static Node organizeBooks(Node head, Integer[] popularity) {

    while (true) {
      Node temp = head;
      int swap = 0;
      for (int i = 0; i < popularity.length - 1; i++) {
        if (popularity[i] < popularity[i + 1]) {
          popularity[i] = popularity[i] ^ popularity[i + 1];
          popularity[i + 1] = popularity[i] ^ popularity[i + 1];
          popularity[i] = popularity[i] ^ popularity[i + 1];

          String t = (String)temp.elem;
          temp.elem = temp.next.elem;
          temp.next.elem = t;

          swap++;
        }
        temp = temp.next;
      }
      if (swap == 0)
        break;
    }
    return head;
  }

  // NOTE: if you find any issue with the driver code please inform AIB
  // DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
  // DO NOT SUBMIT THE DRIVER CODE BELOW
  public static void main(String[] args) {
    System.out.println("=================Test Case 1=================");
    Node books = LinkedList.createList(
        new String[] {"Dune", "IT", "Coraline", "Inferno", "Twilight"});
    Integer[] arr = {8, 10, 5, 10, 6};

    System.out.println("Sample Given LinkedList and Popularity array:  ");
    LinkedList.printLL(books);
    System.out.println(Arrays.toString(arr));

    System.out.println("\nExpected Output");
    System.out.println("IT -> Inferno -> Dune -> Twilight -> Coraline");

    System.out.println("Your Output");
    books = organizeBooks(books, arr);
    LinkedList.printLL(books);

    System.out.println("=================Test Case 2=================");
    Node books2 = LinkedList.createList(
        new String[] {"Hamlet", "Persuasion", "It", "Dracula", "Beloved"});
    Integer[] arr2 = {7, 9, 9, 6, 7};

    System.out.println("Sample Given LinkedList and Popularity array:  ");
    LinkedList.printLL(books2);
    System.out.println(Arrays.toString(arr2));

    System.out.println("\nExpected Output");
    System.out.println("Persuasion -> It -> Hamlet -> Beloved -> Dracula");

    System.out.println("Your Output");
    books2 = organizeBooks(books2, arr2);
    LinkedList.printLL(books2);

    System.out.println("=================Test Case 3=================");
    Node books3 = LinkedList.createList(
        new String[] {"Matilda", "Franny", "Foundation", "Carrie", "Misery"});
    Integer[] arr3 = {5, 8, 8, 10, 6};

    System.out.println("Sample Given LinkedList and Popularity array:  ");
    LinkedList.printLL(books3);
    System.out.println(Arrays.toString(arr3));

    System.out.println("\nExpected Output");
    System.out.println("Carrie -> Franny -> Foundation -> Misery -> Matilda");

    System.out.println("Your Output");
    books3 = organizeBooks(books3, arr3);
    LinkedList.printLL(books3);
  }
}
