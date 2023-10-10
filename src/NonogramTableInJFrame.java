import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.Dimension;
import java.awt.Color;

import nonogram.BlackWhiteNonogramCellCounts;

public class NonogramTableInJFrame {

  public JFrame getNonogram(String[][] nonogramGrid) {
    JFrame appFrame = createNonogramFrame();
    Box nonogramCellsGrid = createNonogramCellsGridAndCounts(nonogramGrid);
    appFrame.add(nonogramCellsGrid);
    appFrame.setVisible(true);
    return appFrame;
  }

  private JFrame createNonogramFrame() {
    JFrame appFrame = new JFrame();
    appFrame.setTitle("Nonogram");
    appFrame.setSize(1000, 1000);
    return appFrame;
  }

private Box createNonogramCellsGridAndCounts(String[][] nonogramGrid) {
    Box verticalBoxforButtonRows = Box.createVerticalBox();
    NonogramCountsKeysUI nonogramCounsKeys = new NonogramCountsKeysUI();
    
        verticalBoxforButtonRows.add(createBlackAndWhiteGrid(nonogramGrid, nonogramCounsKeys));
    for (int row = 0; row < nonogramGrid.length; row++) {
        Box buttonRowBox = getOneNonogramRow(nonogramGrid[row]);
            nonogramCounsKeys.addNonogramOneRowCounts(new BlackWhiteNonogramCellCounts(nonogramGrid).getBlackCellCountsInAllRows().get(row),
                buttonRowBox);
        verticalBoxforButtonRows.add(buttonRowBox);
    }
    return verticalBoxforButtonRows;
}

private Box createBlackAndWhiteGrid(String[][] nonogramGrid, NonogramCountsKeysUI nonogramCountsKeysUI) {
    return nonogramCountsKeysUI.addNonogramAllColumnsCounts(new BlackWhiteNonogramCellCounts(nonogramGrid).getBlackCellCountsInAllColumns());
}

  private Box getOneNonogramRow(String[] oneRowOfNonogramGrid) {
    Box buttonRowBox = Box.createHorizontalBox();
    for (int cell = 0; cell < oneRowOfNonogramGrid.length; cell++) {
      JButton nonogramCell = createNonogramCell(oneRowOfNonogramGrid[cell]);
      buttonRowBox.add(nonogramCell);
    }
    return buttonRowBox;
  }

  private JButton createNonogramCell(String gridCellColor) {
    JButton button = new JButton();
    Color cellColor = setCellColor(gridCellColor);
    button.setBackground(cellColor);
    Dimension buttonSize = new Dimension(50, 50);
    button.setMaximumSize(buttonSize);
    button.setMinimumSize(buttonSize);
    button.setPreferredSize(buttonSize);
    button.setOpaque(true);
    button.setFocusPainted(false);
    int borderWidth = 1;
    Color borderColor = Color.GRAY;
    button.setBorder(new LineBorder(borderColor, borderWidth));
    return button;
  }

  private Color setCellColor(String gridCellColor) {
    Color cellColor = Color.WHITE;
    if (gridCellColor.equalsIgnoreCase("black")) {
      cellColor = Color.BLACK;
    } 
    return cellColor;
  }
}
