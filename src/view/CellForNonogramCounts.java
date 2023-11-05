package view;

import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;

/**
 * This class represents a cell used for displaying counts in the Nonogram game.
 */
public class CellForNonogramCounts extends JButton {
  private final int CELL_WIDTH = 20;
  private final int CELL_HEIGHT = 20;
  private final Color CELL_BACKGROUND_COLOR = Color.YELLOW;
  private final Color CELL_BORDER_COLOR = Color.GRAY;
  private final int CELL_BORDER_WIDTH = 1;

  /**
   * Constructor for CellForNonogramCounts class.
   * Sets the button color, size, border.
   */
  public CellForNonogramCounts() {
    setButtonColor();
    setButtonSize();
    setButtonBorder();
  }

  private void setButtonColor() {
    setOpaque(true);
    setFocusPainted(false);
    setBackground(CELL_BACKGROUND_COLOR);
  }

  private void setButtonSize() {
    Dimension size = new Dimension(CELL_WIDTH, CELL_HEIGHT);
    setMaximumSize(size);
    setMinimumSize(size);
    setPreferredSize(size);
  }

  private void setButtonBorder() {
    setBorder(new LineBorder(CELL_BORDER_COLOR, CELL_BORDER_WIDTH));
  }

}
