public class Main {
   public static void main(String[] args) {
    UiBlackNonogram ui = new UiBlackNonogram();

    String[][] nonogramGrid = {
        { "bl", "wh" },
        { "wh", "wh" }
    };

    ui.getNonogram(nonogramGrid);
  }
}
