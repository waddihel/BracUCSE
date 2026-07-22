import HelperDataStructures.Queue;
import HelperDataStructures.Stack;

public class DancePairs {
  public static void dance_pair(Stack stk) {
    Queue male = new Queue();
    Queue female = new Queue();
    int counter = 0;
    Dancer temp = (Dancer) stk.pop();
    while (!stk.isEmpty()) {
      if (temp.getGender() == ((Dancer) stk.peek()).getGender()) {
        if (!female.isEmpty() && temp.getGender() == 'M') {
          System.out.printf(
              "#%d: %s & %s\n", ++counter, temp.toString(), female.dequeue().toString());
        } else if (temp.getGender() == 'F') female.enqueue(temp);
        else if (temp.getGender() == 'M') male.enqueue(temp);
      } else {
        System.out.printf("#%d: %s & %s\n", ++counter, temp.toString(), stk.pop().toString());
      }
      temp = (Dancer) stk.pop();
    }
    if (temp != null) {
      if (temp.getGender() == 'F') female.enqueue(temp);
      else if (temp.getGender() == 'M') male.enqueue(temp);
    }

    if (!male.isEmpty() && !female.isEmpty()) {
      System.out.println("Extra Pair:");
      while (!male.isEmpty() && !female.isEmpty()) {
        System.out.printf("#%d: %s & %s\n", ++counter, temp.toString(), stk.pop().toString());
      }
    }
    if (!male.isEmpty()) {
      System.out.println("Unpaired Male:");
      System.out.printf("%s", male.dequeue());
      while (!male.isEmpty()) {
        System.out.printf(", %s", male.dequeue());
      }
    }
    if (!female.isEmpty()) {
      System.out.println("Unpaired Female:");
      System.out.printf("%s", female.dequeue());
      while (!female.isEmpty()) {
        System.out.printf(", %s", female.dequeue());
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("===== Test Case 1 =====");
    Stack stack1 = new Stack();
    stack1.push(new Dancer("Arif", 'M', 10));
    stack1.push(new Dancer("Maya", 'F', 54));
    stack1.push(new Dancer("Sara", 'F', 15));
    stack1.push(new Dancer("Liam", 'M', 24));
    stack1.push(new Dancer("Omar", 'M', 44));
    stack1.push(new Dancer("Nina", 'F', 12)); // TOP
    System.out.println("Given Stack of Dancers");
    printStack(stack1);
    System.out.println("\nExpected Output:");
    System.out.println(
        "#1 Nina(F-12) & Omar(M-44)\n#2 Liam(M-24) & " + "Sara(F-15)\n#3 Maya(F-54) & Arif(M-10)");
    System.out.println("\nYour Output:\n");
    dance_pair(stack1);

    System.out.println("\n===== Test Case 2 =====");
    Stack stack2 = new Stack();
    stack2.push(new Dancer("Kazi", 'M', 45));
    stack2.push(new Dancer("Lara", 'F', 43));
    stack2.push(new Dancer("Nina", 'F', 29));
    stack2.push(new Dancer("Sami", 'M', 53));
    stack2.push(new Dancer("Arif", 'M', 51));
    stack2.push(new Dancer("Omar", 'M', 9));
    stack2.push(new Dancer("Lina", 'F', 12));
    stack2.push(new Dancer("Mina", 'F', 54));
    stack2.push(new Dancer("Rita", 'F', 43)); // TOP
    System.out.println("Given Stack of Dancers");
    printStack(stack2);
    System.out.println("\nExpected Output:");
    System.out.println(
        "#1: Lina(F-12) & Omar(M-09)\n#2: Arif(M-51) & "
            + "Rita(F-43)\n#3: Sami(M-53) & Nina(F-29)\n#4: "
            + "Lara(F-43) & Kazi(M-45)\nUnpaired Female:\nMina(F-54)");
    System.out.println("\nYour Output:\n");
    dance_pair(stack2);

    System.out.println("\n===== Test Case 3 =====");
    Stack stack3 = new Stack();
    stack3.push(new Dancer("Wafi", 'M', 13));
    stack3.push(new Dancer("Anan", 'M', 11));
    stack3.push(new Dancer("Nina", 'F', 75));
    stack3.push(new Dancer("Kazi", 'M', 32));
    stack3.push(new Dancer("Ali", 'M', 11));
    stack3.push(new Dancer("Maya", 'F', 65));
    stack3.push(new Dancer("Rafi", 'M', 23));
    stack3.push(new Dancer("Omar", 'M', 16));
    stack3.push(new Dancer("Lina", 'F', 52));
    stack3.push(new Dancer("Sara", 'F', 43)); // TOP
    System.out.println("Given Stack of Dancers");
    printStack(stack3);
    System.out.println("\nExpected Output:");
    System.out.println(
        "#1: Lina(F-52) & Omar(M-16)\n#2: Rafi(M-23) & Maya(F-65)\n#3: "
            + "Alim(M-11) & Sara(F-43)\n#4: Kazi(M-32) & Nina(F-75)\nUnpaired "
            + "Male:\nAnan(M-11), Wafi(M-13)");
    System.out.println("\nYour Output:\n");
    dance_pair(stack3);
  }

  // Actually Stack doesn't really have this type of print method
  // It's only being used to show you the Stack Visually
  public static void printStack(Stack stack) {
    if (stack == null || stack.isEmpty()) {
      return; // remove this line once your're done
    }
    Object elem = stack.pop();
    System.out.printf("| %2s |\n", elem);
    printStack(stack);
    stack.push(elem);
  }
}
