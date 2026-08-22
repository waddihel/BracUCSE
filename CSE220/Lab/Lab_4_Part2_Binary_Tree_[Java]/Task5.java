// Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

  // ===================================TASK#5======================
  // This method takes only one parameter
  // it is root of the given tree
  // You can use extra helper private static methods as per need
  public static Integer mirrorSum(BSTNode root) {
    return mSumHelp(root.left, root.right);
  }

  private static Integer mSumHelp(BSTNode left, BSTNode right) {
    return (left != null && right != null)
        ? ((int) left.elem
            + right.elem
            + mSumHelp(left.left, right.right)
            + mSumHelp(left.right, right.left))
        : 0;
  }
  // ===============================================================

}
