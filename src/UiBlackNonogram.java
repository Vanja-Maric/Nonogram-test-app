import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.Dimension;
import java.util.ArrayList;
import java.awt.Color;
import nonogram.BWCellCounts;

public class UiBlackNonogram {

  public JFrame getNonogram(String[][] nonogramGrid) {
    JFrame appFrame = createNonogramFrame();
    Box nonogramCellsGrid = createNonogramCellsGrid(nonogramGrid);
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

  private Box createNonogramCellsGrid(String[][] nonogramGrid) {
    Box verticalBoxforButtonRows = Box.createVerticalBox();
    BWCellCounts cellCounts = new BWCellCounts(nonogramGrid);
    ArrayList<ArrayList<Integer>> columnCellCounts = cellCounts.getColumnBlackCellCount();
    ArrayList<ArrayList<Integer>> rowCellCounts = cellCounts.getRowBlackCellCounts();

    Box nonogramHorisontalCounts = addNonogramHorrisontalCountsToBox(columnCellCounts);

    verticalBoxforButtonRows.add(nonogramHorisontalCounts);

    for (int row = 0; row < nonogramGrid.length; row++) {
      Box buttonRowBox = getOneNonogramRow(nonogramGrid[row]);
      addNonogramVerticalCountsToBox(rowCellCounts.get(row), buttonRowBox);
      verticalBoxforButtonRows.add(buttonRowBox);
    }
    System.out.println(verticalBoxforButtonRows);
    return verticalBoxforButtonRows;
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

  private Box addNonogramHorrisontalCountsToBox(ArrayList<ArrayList<Integer>> counts) {
    Box horisontalBox = Box.createHorizontalBox();
    for (ArrayList<Integer> count : counts) {
      JButton buttonForCounts = createNonogramCell("white");
      buttonForCounts.setBackground(Color.WHITE);

      for (int i = 0; i < count.size(); i++) {
        buttonForCounts.setText(convertCountsToString(count));
        horisontalBox.add(buttonForCounts);
      }
    }
    JButton buttonOwerVerticalCounts = new JButton();
    buttonOwerVerticalCounts.setPreferredSize(new Dimension(100, 50));
    buttonOwerVerticalCounts.setMaximumSize(new Dimension(100, 50));
    horisontalBox.add(buttonOwerVerticalCounts);
    return horisontalBox;
  }

  private void addNonogramVerticalCountsToBox(ArrayList<Integer> countsInOneCell, Box nonogramBox) {
    JButton buttonForCounts = createNonogramCell("white");
    buttonForCounts.setBackground(Color.WHITE);
    buttonForCounts.setText(convertCountsToString(countsInOneCell));
    buttonForCounts.setPreferredSize(new Dimension(100, 50));
    buttonForCounts.setMaximumSize(new Dimension(100, 50));
    nonogramBox.add(buttonForCounts);
  }

  private String convertCountsToString(ArrayList<Integer> oneCellCount) {
    StringBuilder countsToString = new StringBuilder();
    for (int separateNumberIndex = 0; separateNumberIndex < oneCellCount.size(); separateNumberIndex++) {
      countsToString.append(oneCellCount.get(separateNumberIndex));
      if (separateNumberIndex < oneCellCount.size() - 1) {
        countsToString.append(", ");
      }
    }
    return countsToString.toString();
  }
}
