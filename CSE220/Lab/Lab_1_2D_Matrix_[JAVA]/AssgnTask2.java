// Assignment Task 02: Matrix Compression
class AssgnTask2 {

  // Complete this method so that it gives the Expected Output
  // YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
  public static Integer[][] compressMatrix(Integer[][] matrix) {
    Integer[][] ret = new Integer[matrix.length / 2][matrix[0].length / 2];

    for (int i = 0; i < matrix.length; i += 2) {
      for (int j = 0; j < matrix[0].length; j += 2) {
        ret[i / 2][j / 2] = matrix[i][j] + matrix[i + 1][j] + matrix[i][j + 1] +
                            matrix[i + 1][j + 1];
      }
    }
    return ret;
  }

  // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
  public static void main(String[] args) {
    Integer[][] matrix = {
        {1, 2, 3, 4}, {5, 6, 7, 8}, {1, 3, 5, 2}, {-2, 0, 6, -3}};
    System.out.println("Given Matrix: ");
    Arr.print2D(matrix);

    System.out.println("\nExpected Output:");
    System.out.print("| 14 | 22 |\n| 2  | 10 |\n");

    System.out.print("\nYour Output:\n");
    Integer[][] returnedArray = compressMatrix(matrix);
    Arr.print2D(returnedArray);
  }
}
