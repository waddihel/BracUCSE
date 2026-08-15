// Complete the levelSum method
// ASSIGNMENT TASK MUST SUBMIT
public class Task7 {

  // ===================================TASK#6===================================
  // This method takes only 1 parameter which is root of the given tree
  // This method returns an Integer
  // At times you may need to typeCast root.elem to Integer
  // You can use extra helper private static methods with extra extra params as per need
  static int CURRENT_LEVEL = -1;

  public static Integer levelSum(BTNode root) {
    CURRENT_LEVEL++;
    if (root == null) {
      CURRENT_LEVEL--;
      return 0;
    }
    if (CURRENT_LEVEL % 2 == 0) {
      int s = levelSum(root.left) + levelSum(root.right) - (int) root.elem;
      CURRENT_LEVEL--;
      return s;
    }
    int s = levelSum(root.left) + levelSum(root.right) + (int) root.elem;
    CURRENT_LEVEL--;
    return s;
  }
  // ============================================================================

}
