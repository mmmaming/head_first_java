import jdk.internal.util.SystemProps;

public class SimpleDotComGame {
  public static void main(String[] args) {
    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();

    SimpleDotCom theDotCom = new SimpleDotCom();
    //               类型转换，强制编译器以所设定的类型来处理
    int randomNum = (int)(Math.random() * 5);

    int[] locationCells = {randomNum, randomNum+1, randomNum+2};
    theDotCom.setLocationCells(locationCells);
    boolean isAlive = true;

    while (isAlive == true) {
      String guess = helper.getUserInput("enter a number");
      String result = theDotCom.checkYourSelf(guess);
      numOfGuesses++;
      if (result.equals("kill")) {
        isAlive = false;
        System.out.println("you took" + numOfGuesses + "guesses");
      }
    }
  }
}
