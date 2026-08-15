// LAB TASK NO NEED TO SUBMIT
public class Task1 {

  // ======================TASK#1_1======================
  // This method takes only 1 parameter which is root
  // You'll traverse the tree pre-order
  public static void preOrder(BTNode root) {
    System.out.print(root.elem + " ");
    if (root.left != null) preOrder(root.left);
    if (root.right != null) preOrder(root.right);
  }

  // ==================================================

  // ======================TASK#1_2======================
  // This method takes only 1 parameter which is root
  // You'll traverse the tree in-order
  static int CURRENT_LEVEL = -1;

  public static void postOrderLvl(BTNode root) {
    CURRENT_LEVEL++;
    if (root.left != null) postOrderLvl(root.left);
    if (root.right != null) postOrderLvl(root.right);
    System.out.println(root.elem + ":" + CURRENT_LEVEL);
    CURRENT_LEVEL--;
  }

  // ==================================================

  // ======================TASK#1_3======================
  // This method takes only 1 parameter which is root
  // You'll traverse the tree in-order
  public static void inOrderEvenLvl(BTNode root) {
    CURRENT_LEVEL++;
    if (root.left != null) inOrderEvenLvl(root.left);
    if (CURRENT_LEVEL % 2 == 0) {
      System.out.println(root.elem + ":" + CURRENT_LEVEL);
    }
    if (root.right != null) inOrderEvenLvl(root.right);
    CURRENT_LEVEL--;
  }
  // ==================================================

}
