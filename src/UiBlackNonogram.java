import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.Dimension;
import java.awt.Color;

public class UiBlackNonogram {

  public JFrame getNonogram(String[][] nonogramGrid ) {
    JFrame appFrame = createNonogramFrame();
    Box nonogramCellsGrid = createNonogramCellsGrid(nonogramGrid);
    appFrame.add(nonogramCellsGrid);
    appFrame.setVisible(true);
    return appFrame;
  }

  private JFrame createNonogramFrame() {
    JFrame appFrame = new JFrame();
    appFrame.setTitle("Nonogram");
    appFrame.setSize(400, 400);
    return appFrame;
  }

  private Box createNonogramCellsGrid(String[][] nonogramGrid) {
    Box verticalBoxforButtonRows = Box.createVerticalBox();
    for (int row = 0; row < nonogramGrid.length; row++) {
      Box buttonRowBox = createNonogramRow(nonogramGrid[row]);
      verticalBoxforButtonRows.add(buttonRowBox);
    }
    return verticalBoxforButtonRows;
  }

  private Box createNonogramRow(String[] oneRowOfNonogramGrid) {
    Box buttonRowBox = Box.createHorizontalBox();
    for (int cell = 0; cell < oneRowOfNonogramGrid.length; cell++) {
     JButton nonogramCell = createNonogramCell(oneRowOfNonogramGrid[cell]);
     buttonRowBox.add(nonogramCell);
    }
    return buttonRowBox;
  }

  private JButton createNonogramCell(String cell) {
    JButton button = new JButton(cell);
    // color = oneRowOfNonogramGrid[cell]
    button.setBackground(Color.RED);
    Dimension buttonSize = new Dimension(50, 50);
    button.setMaximumSize(buttonSize);
    button.setPreferredSize(buttonSize);
    button.setOpaque(true);
    button.setFocusPainted(false);
    int borderWidth = 1;
    Color borderColor = Color.BLACK;
    button.setBorder(new LineBorder(borderColor, borderWidth));
    return button;
  }
}
