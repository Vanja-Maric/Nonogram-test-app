import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.Dimension;
import java.awt.Color;

import nonogram.BWCellCounts;
import nonogram.RGBCellCounts;

public class NonogramTableInJFrame {

  public JFrame getNonogram(String[][] nonogramGrid, boolean isBlackAndWhite) {
    JFrame appFrame = createNonogramFrame();
    Box nonogramCellsGrid = createNonogramCellsGrid(nonogramGrid, isBlackAndWhite);
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

  private Box createNonogramCellsGrid(String[][] nonogramGrid, boolean isBlackAndWhite) {
    Box verticalBoxforButtonRows = Box.createVerticalBox();
    NonogramCountsKeysUI nonogramCounsKeys = new NonogramCountsKeysUI();
    if (isBlackAndWhite) {
      verticalBoxforButtonRows.add(
          nonogramCounsKeys.addNonogramAllColumnsCounts(new BWCellCounts(nonogramGrid).getAllColumnsBlackCellCount()));
    } else {
      RGBCellCounts rgbCellCounts = new RGBCellCounts(nonogramGrid);

      Box horisontalColorsOfColumnCounts = nonogramCounsKeys
          .addNonogramAllColumnsColorsOfCounts(rgbCellCounts.getColorsOfCellCountsColumns());
      horisontalColorsOfColumnCounts.add(createButtonOverVerticalCounts());
      verticalBoxforButtonRows.add(horisontalColorsOfColumnCounts);

      Box horisontalColumCounts = nonogramCounsKeys
          .addNonogramAllColumnsCounts(rgbCellCounts.getColorCellCountsColumns());
      horisontalColumCounts.add(createButtonOverVerticalCounts());
      verticalBoxforButtonRows.add(horisontalColumCounts);
    }

    for (int row = 0; row < nonogramGrid.length; row++) {
      Box buttonRowBox = getOneNonogramRow(nonogramGrid[row]);
      if (isBlackAndWhite) {
        nonogramCounsKeys.addNonogramOneRowCounts(new BWCellCounts(nonogramGrid).getAllRowsBlackCellCounts().get(row),
            buttonRowBox);
      } else {
        RGBCellCounts rgbCellCounts = new RGBCellCounts(nonogramGrid);
        nonogramCounsKeys.addNonogramOneRowCounts(rgbCellCounts.getColorCellCountsRows().get(row), buttonRowBox);
        nonogramCounsKeys.addNonogramOneRowColoursOfCounts(rgbCellCounts.getColorsOfCellCountsRows().get(row),
            buttonRowBox);
      }
      verticalBoxforButtonRows.add(buttonRowBox);
    }
    return verticalBoxforButtonRows;
  }

  private JButton createButtonOverVerticalCounts() {
    JButton buttonOverVerticalCounts = new JButton();
    buttonOverVerticalCounts.setPreferredSize(new Dimension(100, 50));
    buttonOverVerticalCounts.setMaximumSize(new Dimension(100, 50));
    return buttonOverVerticalCounts;
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
    } else if (gridCellColor.equalsIgnoreCase("red")) {
      cellColor = Color.RED;
    } else if (gridCellColor.equalsIgnoreCase("green")) {
      cellColor = Color.GREEN;
    } else if (gridCellColor.equalsIgnoreCase("blue")) {
      cellColor = Color.BLUE;
    }
    return cellColor;
  }
}