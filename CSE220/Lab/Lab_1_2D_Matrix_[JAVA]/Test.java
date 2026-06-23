public class Test {
  public static void main(String[] args) {
    Character[][] board = {{'T', 'A', 'U', 'S'},
                           {'A', 'R', 'I', '.'},
                           {'D', 'T', 'T', 'N'},
                           {'S', 'C', 'F', 'U'}};
    int S = board.length;
    int I = (S / 2) - 1;
    int J = S / 2;
    int rCount = 1;

    while (I >= 0 && J < S) {
      int i = I;
      int j = I;

      for (int r = 0; r < rCount; r++) {
        Character t1 = board[I][I];
        Character t2 = board[I][I + 1];
        while (true) {
          if (i == I && j != J) {
            j++;
            t2 = board[i][j];
          } else if (i != J && j == J) {
            i++;
            t2 = board[i][j];
          } else if (i == J && j != I) {
            j--;
            t2 = board[i][j];
          } else if (i != I && j == I) {
            i--;
            t2 = board[i][j];
          }

          board[i][j] = t1;
          t1 = t2;

          if (i == I && j == I)
            break;
        }
      }
      I--;
      J++;
      rCount++;
    }
    Arr.print2D(board);
  }
}
