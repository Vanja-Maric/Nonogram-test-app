package controller;

import nonogram.HintGetter;

import nonogram.NonogramGridCreator;

public class Main {
  public static void main(String[] args) {
    try {
      NonogramGridCreator nonogramGridCreator = new NonogramGridCreator("src/images/sun.png", 15, 15);
      String[][] blackAndWhiteGrid = nonogramGridCreator.getBlackAndWhiteGrid();

      
      NonogramApp nonogramApp = new NonogramApp(nonogramGridCreator.getBlackAndWhiteGrid());
      nonogramApp.getNonogramApp();

      HintGetter hintGetter = new HintGetter(blackAndWhiteGrid);

      System.out.println(hintGetter.getHint(13, 5));
    } catch (Exception e) {
      System.err.println("An error has occurred:" + e.getMessage());
    }
  }
}
