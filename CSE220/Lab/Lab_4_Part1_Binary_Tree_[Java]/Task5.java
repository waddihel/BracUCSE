// LAB TASK NO NEED TO SUBMIT
public class Task5 {

  // ===================================TASK#4===================================
  // This method takes 1 parameter, the root
  // This method returns the largest value
  // No Helper Methods are needed for this task
  public static Integer maxTree(BTNode root) {
    if (root == null) return -1;
    int l = maxTree(root.left);
    int r = maxTree(root.right);
    int m = (l > r) ? l : r;
    return ((int) root.elem > m) ? (int) (root.elem) : m;
  }
  // ============================================================================

}
