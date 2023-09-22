import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class NonogramCountsKeysUI {

  public Box addNonogramAllColumnsCounts(ArrayList<ArrayList<Integer>> counts) {
    return addNonogramColumnsCountsToBoxNumbers(counts);
}

public Box addNonogramAllColumnsColorsOfCounts(ArrayList<ArrayList<String>> colors) {
    return addNonogramColumnsColorsOfCountsToBoxColors(colors);
}

public void addNonogramOneRowCounts(ArrayList<Integer> countsInOneLine, Box nonogramBox) {
    addNonogramRowCountsToBoxNumbers(countsInOneLine, nonogramBox);
}

public void addNonogramOneRowColoursOfCounts(ArrayList<String> countsInOneCell, Box nonogramBox) {
    addNonogramRowColorsOfCountsToBoxColors(countsInOneCell, nonogramBox);
}

private Box addNonogramColumnsCountsToBoxNumbers(ArrayList<ArrayList<Integer>> counts) {
    Box horizontalBox = Box.createHorizontalBox();
    
    for (ArrayList<Integer> count : counts) {
        JButton buttonForCounts = createCountsCells(convertCountsToString(count), 50, 50);
        horizontalBox.add(buttonForCounts);
    }
    
    JButton buttonOverVerticalCounts = createButtonOverVerticalCounts();
    horizontalBox.add(buttonOverVerticalCounts);
    
    return horizontalBox;
}

private Box addNonogramColumnsColorsOfCountsToBoxColors(ArrayList<ArrayList<String>> colors) {
    Box horizontalBox = Box.createHorizontalBox();
    
    for (ArrayList<String> colorsArray : colors) {
        JButton buttonForCounts = createCountsCells(convertColorsofCountsInOneCellToString(colorsArray), 50, 50);
        horizontalBox.add(buttonForCounts);
    }
    JButton buttonOverVerticalCounts = createButtonOverVerticalCounts();
    horizontalBox.add(buttonOverVerticalCounts);
    
    return horizontalBox;
}

private JButton createButtonOverVerticalCounts() {
    JButton buttonOverVerticalCounts = new JButton();
    buttonOverVerticalCounts.setPreferredSize(new Dimension(100, 50));
    buttonOverVerticalCounts.setMaximumSize(new Dimension(100, 50));
    return buttonOverVerticalCounts;
}

private void addNonogramRowCountsToBoxNumbers(ArrayList<Integer> countsInOneLine, Box nonogramBox) {
    JButton buttonForCounts = createCountsCells(convertCountsToString(countsInOneLine), 100, 50);
    nonogramBox.add(buttonForCounts);
}

private void addNonogramRowColorsOfCountsToBoxColors(ArrayList<String> countsInOneCell, Box nonogramBox) {
    JButton buttonForCounts = createCountsCells(convertColorsofCountsInOneCellToString(countsInOneCell), 100, 50);
    nonogramBox.add(buttonForCounts);
}


  private JButton createCountsCells(String ButtonText, int cellWidth, int cellHeight) {
    JButton button = new JButton();
    button.setText(ButtonText);
    Dimension buttonSize = new Dimension(cellWidth, cellHeight);
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

  private String convertCountsToString(ArrayList<Integer> oneLineCounts) {
    StringBuilder oneLineCountsString = new StringBuilder();
    for (int oneNumberIndex = 0; oneNumberIndex < oneLineCounts.size(); oneNumberIndex++) {
      oneLineCountsString.append(oneLineCounts.get(oneNumberIndex));
      if (oneNumberIndex < oneLineCounts.size() - 1) {
        oneLineCountsString.append(", ");
      }
    }
    return oneLineCountsString.toString();
  }

  private String convertColorsOfCountsToOneLetter(String color) {
    String countColorOneLetter = "w";
    if (color.equalsIgnoreCase("red")) {
      countColorOneLetter = "r";
    } else if (color.equalsIgnoreCase("green")) {
      countColorOneLetter = "g";
    } else if (color.equalsIgnoreCase("blue")) {
      countColorOneLetter = "b";
    }
    return countColorOneLetter;
  }

  private String convertColorsofCountsInOneCellToString(ArrayList<String> oneLineCountColors) {
    StringBuilder oneLineColorsToString = new StringBuilder();

    for (int oneColorIndex = 0; oneColorIndex < oneLineCountColors.size(); oneColorIndex++) {
      String oneLetterColor = convertColorsOfCountsToOneLetter(oneLineCountColors.get(oneColorIndex));
      oneLineColorsToString.append(oneLetterColor);
      if (oneColorIndex < oneLineCountColors.size() - 1) {
        oneLineColorsToString.append(", ");
      }
    }

    return oneLineColorsToString.toString();
  }
}
