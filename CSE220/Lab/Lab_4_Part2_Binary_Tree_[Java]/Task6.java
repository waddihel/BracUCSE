// Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

  // ===================================TASK#6======================
  // This method takes only one parameter
  // it is root of the given tree
  // You can use extra helper private static methods as per need
  public static Boolean isBST(BSTNode root) {
    if (root.left == null && root.right == null) return true;
    if (root.left == null) {
      if (root.elem < root.right.elem) {
        if (!isBST(root.right)) return false;
        return true;
      }
    }
    if (root.right == null) {
      if (root.elem > root.left.elem) {
        if (!isBST(root.left)) return false;
        return true;
      }
    }
    if (root.left.elem < root.elem && root.elem < root.right.elem) {
      if (!(isBST(root.left) && isBST(root.right))) return false;
      return true;
    }
    return false;
  }
  // ===============================================================

}
