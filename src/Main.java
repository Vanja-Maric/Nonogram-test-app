import nonogram.HintGetter;

import nonogram.GridGetter;

public class Main {
  public static void main(String[] args) {
    try {
      NonogramTableInJFrame nonogramTable = new NonogramTableInJFrame();

      GridGetter gridGetter = new GridGetter("src/images/sun.png", 15, 15);
      String[][] blackAndWhiteGrid = gridGetter.getBlackAndWhiteGrid();
      String[][] redGreenBlueWhiteGrid = gridGetter.getRedBlueGreenWhiteGrid();

      nonogramTable.getNonogram(gridGetter.getRedBlueGreenWhiteGrid(), false);
      nonogramTable.getNonogram(gridGetter.getBlackAndWhiteGrid(), true);

      HintGetter hintGetterBW = new HintGetter(blackAndWhiteGrid);
      HintGetter hintGetterRGB = new HintGetter(redGreenBlueWhiteGrid);

      System.out.println(hintGetterBW.getHint(2, 2));
      System.out.println(hintGetterRGB.getHint(6, 6));
    } catch (Exception e) {
      System.err.println("An error has occurred:" + e.getMessage());
    }
  }
}
