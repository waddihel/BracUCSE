// Assignment Task 04: Rotate Secret
class AssgnTask4 {
  public static void rotateSecret(Character[][] board) {
    int S = board.length;
    int I = (S / 2) - 1;
    int J = S / 2;
    int rCount = 1;
    while (I >= 0) {
      int i = I;
      int j = I;
      for (int r = 0; r < rCount; r++) {
        Character t1 = board[I][I];
        Character t2;
        do {
          if (i == I && j != J)
            t2 = board[i][++j];
          else if (i != J && j == J)
            t2 = board[++i][j];
          else if (i == J && j != I)
            t2 = board[i][--j];
          else
            t2 = board[--i][j];
          board[i][j] = t1;
          t1 = t2;
        } while (i != I || j != I);
      }
      I--;
      J++;
      rCount++;
    }
    for (int i = 0; i < S; i++) {
      for (int j = 0; j < S; j++) {
        System.out.print(board[i][j]);
      }
    }
    System.out.println();
  }

  // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
  public static void main(String[] args) {
    System.out.print("===========Test#1===========\n");
    Character[][] board = {{'T', 'A', 'U', 'S'},
                           {'A', 'R', 'I', '.'},
                           {'D', 'T', 'T', 'N'},
                           {'S', 'C', 'F', 'U'}};
    System.out.println("Given Board: ");
    Arr.print2D(board);

    System.out.println("\nExpected Output:");
    Character[][] outputBoard = {{'D', 'A', 'T', 'A'},
                                 {'S', 'T', 'R', 'U'},
                                 {'C', 'T', 'I', 'S'},
                                 {'F', 'U', 'N', '.'}};
    System.out.print("DATASTRUCTISFUN.\n");
    Arr.print2D(outputBoard);

    System.out.print("\nYour Output:\n");
    rotateSecret(board);
    Arr.print2D(board);

    if (Arr.compare2D(outputBoard, board))
      System.out.print("Test 1 Success");
    else
      System.out.println("Test 1 FAILED");

    System.out.print("\n===========Test#2===========\n");

    board = new Character[][] {
        {'O', 'R', 'I', 'R', 'N', 'P'}, {'G', 'S', 'A', 'A', 'L', 'R'},
        {'L', 'M', 'N', 'O', 'N', 'Y'}, {'A', 'H', 'U', 'O', 'O', 'P'},
        {'T', 'F', 'C', 'T', 'H', 'S'}, {'E', 'D', 'Y', 'O', 'C', 'K'}};
    System.out.println("Given Board: ");
    Arr.print2D(board);

    System.out.println("\nExpected Output:");
    outputBoard = new Character[][] {
        {'A', 'L', 'G', 'O', 'R', 'I'}, {'T', 'H', 'M', 'S', 'A', 'R'},
        {'E', 'F', 'U', 'N', 'A', 'N'}, {'D', 'C', 'O', 'O', 'L', 'P'},
        {'Y', 'T', 'H', 'O', 'N', 'R'}, {'O', 'C', 'K', 'S', 'P', 'Y'}};
    System.out.print("ALGORITHMSAREFUNANDCOOLPYTHONROCKSPY\n");
    Arr.print2D(outputBoard);

    System.out.print("\nYour Output:\n");
    rotateSecret(board);
    Arr.print2D(board);

    if (Arr.compare2D(outputBoard, board))
      System.out.print("Test 2 Success");
    else
      System.out.println("Test 2 FAILED");
  }
}
