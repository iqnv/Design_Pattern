package SnakeAndLadder;

import TicToe.Players;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Board {

    private Cell [][]arr;

    private Jump jump;

    private int jumpNo;

    private int playerCount;

    private PLayer winner;

    private Deque<PLayer> pLayerDeque;

    private int diceCount;
    public Board(int dimension, int dice , int jumpNo, int Player) {
        this.arr = new Cell[dimension][dimension];
        this.jumpNo = jumpNo;
        this.playerCount = Player;
        this.diceCount = dice;
        initializeCell();
        intializePlayer();

    }

    private void initializeCell() {

        while (jumpNo > 0) {
            int start = ThreadLocalRandom.current().nextInt(1, 99);
            int end = ThreadLocalRandom.current().nextInt(1, 99);
            if (start == end) {
                continue;
            }
            jump = new Jump();
            Cell cell = new Cell();
            jump.setStart(start);
            jump.setEnd(end);
            if (arr[start / 10][start % 10] != null && arr[start / 10][start % 10].getJump() != null) {
                continue;
            }
            if (start > end) {
                cell.setJump(jump);
                arr[start / 10][start % 10] = cell;
            }
            else {
                cell.setJump(jump);
                arr[start / 10][start % 10] = cell;
            }
            jumpNo--;
        }
    }

    private void intializePlayer() {
        pLayerDeque = new LinkedList<>();
        int count = 1;
        while (playerCount > 0) {
            PLayer pLayer = new PLayer();
            pLayer.setPlayerID(count);
            pLayer.setCurrenPostion(0);
            pLayerDeque.add(pLayer);
            count++;
            playerCount--;
        }
    }

    public PLayer startGame() {

        while (winner == null) {

            PLayer pLayer = pLayerDeque.removeFirst();
            int diceCount1 = diceCount;
            while (diceCount1 > 0) {

                int num = rollDice();
                int curentPostion = pLayer.getCurrenPostion() + num;
                if (curentPostion >= 99) {
                    winner = pLayer;
                    return pLayer;
                }
                if (arr[curentPostion / 10][curentPostion % 10] != null && arr[curentPostion / 10][curentPostion % 10].getJump() != null) {

                    if (arr[curentPostion / 10][curentPostion % 10].getJump().getStart() > arr[curentPostion / 10][curentPostion % 10].getJump().getEnd()) {
                        System.out.println("Snake " + curentPostion);
                        pLayer.setCurrenPostion(arr[curentPostion / 10][curentPostion % 10].getJump().getEnd());
                        System.out.println("Snake " + pLayer.getCurrenPostion()) ;

                    }
                    else {
                        System.out.println("Ladder " + curentPostion) ;
                        pLayer.setCurrenPostion(arr[curentPostion / 10][curentPostion % 10].getJump().getEnd());
                        System.out.println("Ladder " + pLayer.getCurrenPostion()) ;
                    }
                }
                else {
                    pLayer.setCurrenPostion(curentPostion);
                }
                diceCount1--;
            }
            pLayerDeque.addLast(pLayer);
        }
        return winner;
    }

    private int rollDice() {

        return ((int)Math.random() + 1) % 6;
    }
}
