package view;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import java.awt.Dimension;
import java.awt.Color;

/**
 * Represents a cell in the Nonogram game board.
 */
public class GameCell extends JButton {
  private final int CELL_WIDTH = 20;
  private final int CELL_HEIGHT = 20;
  private final Color CELL_BORDER_COLOR = Color.GRAY;
  private final int CELL_BORDER_WIDTH = 1;

  /**
   * Constructs a GameCell object with the specified grid cell color.
   * 
   * @param gridCellColor the color of the grid cell
   */
  public GameCell(String gridCellColor) {
    setCellColor(gridCellColor);
    configureNonogramCell();
    setCellSize();
    setCellBorder();
  }
  
  private void setCellColor(String gridCellColor) {
    setBackground(getCellColor(gridCellColor));
  }

  private Color getCellColor(String gridCellColor) {
    return "black".equalsIgnoreCase(gridCellColor) ? Color.BLACK : Color.WHITE;
  }

  private void configureNonogramCell() {
    setOpaque(true);
    setFocusPainted(false);
  }

  private void setCellSize() {
    setPreferredSize(new Dimension(CELL_WIDTH, CELL_HEIGHT));
    setMaximumSize(new Dimension(CELL_WIDTH, CELL_HEIGHT));
    setMinimumSize(new Dimension(CELL_WIDTH, CELL_HEIGHT));
  }

  private void setCellBorder() {
    setBorder(new LineBorder(CELL_BORDER_COLOR, CELL_BORDER_WIDTH));
  }
}
