/*You will have to complete the FruitNode Contrustor first
then within this class you only have to complete two methods
hashFunction() and insert()
the rest of the metods are already written
DO NOT TOUCH any other methods or codes*/
public class HashTable {

  // ht[] :: is the HashTable array that stores the FruitNode objects
  private FruitNode[] ht;

  // Constructor that initializes the HashTable array
  // DO NOT change this Constructor
  public HashTable(int size) { this.ht = new FruitNode[size]; }

  // This method basically prints the HashTable
  // DO NOT change this method
  public void show() {
    for (int i = 0; i < ht.length; i++) {
      System.out.print(i + " ");
      FruitNode n = ht[i];
      while (n != null) {
        System.out.print("('" + n.fruit[0] + "', " + n.fruit[1] + ") --> ");
        n = n.next;
      }
      System.out.println();
    }
  }

  // you need to COMPLETE this method
  private int hashFunction(String key) {
    int sum = 0;
    for (int i = (key.length() % 2 == 0) ? 0 : 1; i < key.length(); i += 2) {
      sum += key.charAt(i);
    }
    return sum % ht.length;
  }

  // you need to COMPLETE this method
  // The insert() method will create a FruitNode using name(Key) & price(value)
  // then inserts it in the proper hashed index
  // If collision occurs resolve using the steps explained in the question
  public void insert(String key, Integer value) {
    int idx = hashFunction(key);

    FruitNode prev = null;
    FruitNode it = ht[idx];
    while (it != null) {
      if (it.fruit[0].equals(key)) {
        if (prev == null) {
          ht[idx] = it.next;
        } else {
          prev.next = it.next;
        }
        break;
      }
      prev = it;
      it = it.next;
    }
    FruitNode ins = new FruitNode(key, value);
    if (ht[idx] == null || (int)ht[idx].fruit[1] < value) {
      ins.next = ht[idx];
      ht[idx] = ins;
      return;
    }
    prev = ht[idx];
    it = prev.next;
    while (true) {
      if (it == null) {
        prev.next = ins;
        return;
      }
      if ((int)prev.fruit[1] > value && value > (int)it.fruit[1]) {
        prev.next = ins;
        ins.next = it;
        return;
      }
    }
  }
}
