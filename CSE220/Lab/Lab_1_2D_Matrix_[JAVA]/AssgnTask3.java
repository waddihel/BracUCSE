// Assignment Task 03: Game Arena
class AssgnTask3 {
  public static void playGame(Integer[][] arena) {
    int points = 0;
    int R = arena.length;
    int C = arena[0].length;
    for (int i = 0; i < R; i++) {
      for (int j = 0; j < C; j++) {
        if (arena[i][j] % 50 == 0 && arena[i][j] != 0) {
          if (i != 0)
            points += (arena[i - 1][j] == 2) ? 2 : 0;
          if (j != 0)
            points += (arena[i][j - 1] == 2) ? 2 : 0;
          if (i != R - 1)
            points += (arena[i + 1][j] == 2) ? 2 : 0;
          if (j != C - 1)
            points += (arena[i][j + 1] == 2) ? 2 : 0;
        }
      }
    }
    System.out.println("Points Gained: " + points + ". " +
                       ((points >= 10) ? "Your team has survived the game."
                                       : "Your team is out."));
  }

  // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
  public static void main(String[] args) {
    Integer[][] arena = {
        {0, 2, 2, 0}, {50, 1, 2, 0}, {2, 2, 2, 0}, {1, 100, 2, 0}};
    System.out.println("Given Arena: ");
    Arr.print2D(arena);

    System.out.println("\nExpected Output:");
    System.out.print("Points Gained: 6. Your team is out.\n");

    System.out.print("\nYour Output:\n");
    playGame(arena);

    System.out.print("\n======================\n");

    Integer[][] arena1 = {{0, 2, 2, 0, 2},
                          {1, 50, 2, 1, 100},
                          {2, 2, 2, 0, 2},
                          {0, 200, 2, 0, 0}};
    System.out.println("\nGiven Arena: ");
    Arr.print2D(arena1);

    System.out.println("\nExpected Output:");
    System.out.print("Points Gained: 14. Your team has survived the game.\n");

    System.out.print("\nYour Output:\n");
    playGame(arena1);
  }
}
