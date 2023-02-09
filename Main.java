import java.util.Scanner;

public class Main {

  private static final int GRID_SIZE = 4;
  private static int[][] grid = new int[GRID_SIZE][GRID_SIZE];

  public static void main(String[] args) {
    initGrid();
    printGrid();

    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.print("Move (w/a/s/d): ");
      String move = sc.nextLine();
      switch (move) {
        case "w":
          moveUp();
          break;
        case "a":
          moveLeft();
          break;
        case "s":
          moveDown();
          break;
        case "d":
          moveRight();
          break;
        default:
          System.out.println("Invalid move");
          continue;
      }
      addRandomTile();
      printGrid();
    }
  }

  private static void initGrid() {
    // Initialize grid with two random tiles
    addRandomTile();
    addRandomTile();
  }

  private static void addRandomTile() {
    int x = (int) (Math.random() * GRID_SIZE);
    int y = (int) (Math.random() * GRID_SIZE);
    while (grid[x][y] != 0) {
      x = (int) (Math.random() * GRID_SIZE);
      y = (int) (Math.random() * GRID_SIZE);
    }
    int value = Math.random() < 0.9 ? 2 : 4;
    grid[x][y] = value;
  }

  private static void printGrid() {
    for (int i = 0; i < GRID_SIZE; i++) {
      for (int j = 0; j < GRID_SIZE; j++) {
        System.out.print(grid[i][j] + "\t");
      }
      System.out.println();
    }
  }

  private static void moveUp() {
    // TODO: Implement move up logic
  }

  private static void moveLeft() {
    // TODO: Implement move left logic
  }

  private static void moveDown() {
    // TODO: Implement move down logic
  }

  private static void moveRight() {
    // TODO: Implement move right logic
  }
}
