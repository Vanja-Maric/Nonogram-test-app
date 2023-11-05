package view;

import javax.swing.Box;
import javax.swing.JButton;

import java.util.ArrayList;

/**
 * The GameBoardView class represents the view of the nonogram game board.
 */
public class GameBoardView {
  private ArrayList<ArrayList<JButton>> gameCells = new ArrayList<ArrayList<JButton>>();

  /**
   * Returns a Box object representing the game board for the nonogram game.
   * 
   * @param nonogramGrid a 2D array of Strings representing the nonogram grid
   * @return a Box object representing the game board
   */
  public Box getGameBoard(String[][] nonogramGrid) {
    return createGameBoard(nonogramGrid);
  }

  /**
   * Creates a game board with nonogram grid, row and column counts.
   * The game board is represented by a Box object.
   * Row counts are displayed on the left side of the game board.
   * Column counts are displayed on the top of the game board.
   * 
   * @param nonogramGrid the nonogram grid to be displayed on the game board
   * @return the game board as a Box object
   */
  private Box createGameBoard(String[][] nonogramGrid) {
    Box gameBoard = Box.createVerticalBox();
    NonogramCountsView nonogramCountsView = new NonogramCountsView(nonogramGrid);
    Box countsInAllColumns = nonogramCountsView.getColumnsNonogramCounts();

    gameBoard.add(countsInAllColumns);

    for (int row = 0; row < nonogramGrid.length; row++) {
      Box oneRowOfGameBoard = Box.createHorizontalBox();
      ArrayList<JButton> gameCellsInOneRow = createOneRowOfGameCells(nonogramGrid[row]);
      Box countsInOneRow = nonogramCountsView.getNonogramCountsOfOneRow(row);

      oneRowOfGameBoard.add(countsInOneRow);
      for (JButton gameCell : gameCellsInOneRow) {
        oneRowOfGameBoard.add(gameCell);
      }

      gameBoard.add(oneRowOfGameBoard);
    }

    return gameBoard;
  }

  private ArrayList<JButton> createOneRowOfGameCells(String[] oneRowOfNonogramGrid) {
    ArrayList<JButton> gameCellsInOneRow = new ArrayList<>();

    for (int cell = 0; cell < oneRowOfNonogramGrid.length; cell++) {
      JButton gameCell = createGameCell(oneRowOfNonogramGrid[cell]);
      gameCellsInOneRow.add(gameCell);
    }
    addGameCellsToList(gameCellsInOneRow);

    return gameCellsInOneRow;
  }

  private JButton createGameCell(String gridCellColor) {
    JButton gameCell = new GameCell(gridCellColor);
    return gameCell;
  }

  private void addGameCellsToList(ArrayList<JButton> gameCellsInOneRow) {
    gameCells.add(gameCellsInOneRow);
  }

}
