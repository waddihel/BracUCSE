// Assignment Task 01: Row Rotation Policy
class AssgnTask1 {
  public static Integer rowRotation(Integer examWeek, String[][] matrix) {
    int R = matrix.length;
    int C = matrix[0].length;
    while (--examWeek > 0) {
      for (int j = 0; j < C; j++) {
        String t1 = matrix[0][j];
        String t2 = matrix[1][j];
        for (int i = 0; i < R; i++) {
          matrix[(i + 1) % R][j] = t1;
          t1 = t2;
          t2 = matrix[(i + 2) % R][j];
        }
      }
    }
    Arr.print2D(matrix);
    for (int i = 0; i < R; i++) {
      if (matrix[i][0].equals("Z"))
        return i + 1;
    }
    return -1;
  }

  // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
  public static void main(String[] args) {
    String[][] seatStatus = {
        {"A", "B", "C", "D", "E"}, {"F", "G", "H", "I", "J"},
        {"K", "L", "M", "N", "O"}, {"P", "Q", "R", "S", "T"},
        {"U", "V", "W", "X", "Y"}, {"Z", "AA", "BB", "CC", "DD"}};
    System.out.println("Given Seat Status: ");
    Arr.print2D(seatStatus);

    System.out.println("\nExpected Output:");
    System.out.println("| U  | V  | W  | X  | Y  | ");
    System.out.println("| Z  | AA | BB | CC | DD | ");
    System.out.println("| A  | B  | C  | D  | E  | ");
    System.out.println("| F  | G  | H  | I  | J  | ");
    System.out.println("| K  | L  | M  | N  | O  | ");
    System.out.println("| P  | Q  | R  | S  | T  | ");
    System.out.println("Your friend AA will be on row 2");

    System.out.print("\nYour Output:\n");
    Integer examWeek = 3;
    // This following should print modified seat status after rotation and
    // return the current exam week
    Integer rowNumber = rowRotation(examWeek, seatStatus);
    // The following should print Your friend AA will be on row 2
    System.out.println("Your friend AA will be on row " + rowNumber);
  }
}
