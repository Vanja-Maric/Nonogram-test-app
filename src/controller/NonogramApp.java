package controller;
import javax.swing.*;

import view.AppFrame;
import view.GameBoardView;

public class NonogramApp {
  String[][] nonogramGrid;

  public NonogramApp(String[][] nonogramGrid) {
    this.nonogramGrid = nonogramGrid;
  }

  public AppFrame getNonogramApp(String title) {
    AppFrame appFrame = new AppFrame(title);
    appFrame.addContentToAppFrame(nonogramBoard());
    appFrame.showAppFrame();
    return appFrame;
  }

  private JPanel nonogramBoard() {
    GameBoardView gameBoardView = new GameBoardView();
    JPanel gameBoardContainer = new JPanel();
    gameBoardContainer.add(gameBoardView.getGameBoard(nonogramGrid));
    return gameBoardContainer;
  }

}
