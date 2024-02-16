package SnakeAndLadder;

public class Main {

    public static void main(String[] args) {
//        Game game = new Game(10, 6, 1, 2);
//
//        System.out.println(game.startGame().getPlayerID());

        String str = "shivam";
        System.out.println(str);
        checkingString(str);
        System.out.println(str);

    }

    private static void checkingString(String str) {
        str = str + str;
        System.out.println(str);
    }
}
