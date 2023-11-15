package controller;

import nonogram.HintGetter;

import nonogram.NonogramGridCreator;

public class Main {
  public static void main(String[] args) {
    try {
      String[][] blackAndWhiteGrid1 = createNonogram("src/images/sun.png", 15, 15);
      displayNonogram(blackAndWhiteGrid1, "Nonogram app 1 - 15x15");

      HintGetter hintGetter = new HintGetter(blackAndWhiteGrid1);
      System.out.println("The color of the cell located in the fourth row and the sixth column in Nonogram app 1 - 15x15 is "
          + hintGetter.getHint(4, 6));
      System.out
          .println("The color of the cell located in the nineteenth row and the sixth column in Nonogram app 1 - 15x15 is "
              + hintGetter.getHint(19, 6));
    } catch (Exception e) {
      System.err.println("An error has occurred:" + e.getMessage());
    }

    try {
      String[][] blackAndWhiteGrid2 = createNonogram("src/images/sun.png", 55, 55);
      displayNonogram(blackAndWhiteGrid2, "Nonogram app 2 - 55x55");

      HintGetter hintGetter = new HintGetter(blackAndWhiteGrid2);
      System.out.println(
          "The color of the cell located in the minus nineteenth column and the sixth row in Nonogram app 2 - 55x55 is "
              + hintGetter.getHint(6, -19));
    } catch (Exception e) {
      System.err.println("An error has occurred:" + e.getMessage());
    }

    try {
      String[][] blackAndWhiteGrid3 = createNonogram("src/images/sun.png", 19, 15);
      displayNonogram(blackAndWhiteGrid3, "Nonogram app 3 - 19x15");

      HintGetter hintGetter = new HintGetter(null);
      System.out.println(
          "The color of the cell located in the minus sixth column and the sixth row in Nonogram app 3 - 19x15 is "
              + hintGetter.getHint(6, 6));
    } catch (Exception e) {
      System.err.println("An error has occurred:" + e.getMessage());
    }

    try {
      String[][] blackAndWhiteGrid4 = createNonogram("src/images/sun.png", 5, 5);
      displayNonogram(blackAndWhiteGrid4, "Nonogram app 4 5x5");

      String[][] blackAndWhiteGrid6 = createNonogram("src/images/sun.png", 0, 5);
      displayNonogram(blackAndWhiteGrid6, "Nonogram app 6 - 0x5");
    } catch (Exception e) {
      System.err.println("An error has occurred:" + e.getMessage());
    }

    try {
      String[][] blackAndWhiteGrid5 = createNonogram("src/imags/sn.png", 5, 5);
      displayNonogram(blackAndWhiteGrid5, "Nonogram app 5 - 5x5");
    } catch (Exception e) {
      System.err.println("An error has occurred:" + e.getMessage());
    }
  }

  private static String[][] createNonogram(String imagePath, int rows, int cols) {
    NonogramGridCreator gridCreator = new NonogramGridCreator(imagePath, rows, cols);
    return gridCreator.getBlackAndWhiteGrid();
  }

  private static void displayNonogram(String[][] grid, String title) {
    NonogramApp nonogramApp2 = new NonogramApp(grid);
    nonogramApp2.getNonogramApp(title);
  }

}
