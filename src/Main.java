import nonogram.GridGetter;
public class Main {
   public static void main(String[] args) {
    UiBlackNonogram ui = new UiBlackNonogram();

    GridGetter gg = new GridGetter("src/images/sun.png", 15, 15);
    ui.getNonogram(gg.getBlackAndWhiteGrid());
    ui.getNonogram(gg.getRedBlueGreenWhiteGrid());
  }
}
