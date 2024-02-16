package SnakeAndLadder;

public class Game {

    int dimension;
    int jumNo;
    int diceCount;
    int noOPlayer;

    private Board board;


    public Game(int dimension, int jumpNo, int diceCount, int noOfPlayer) {
        this.dimension = dimension;
        this.jumNo = jumpNo;
        this.diceCount = diceCount;
        this.noOPlayer = noOfPlayer;
        intializeBoard();
    }

    private void intializeBoard() {
         board = new Board(10, 1, 1, 2);
    }

    public PLayer startGame() {
       return  board.startGame();
    }


}
