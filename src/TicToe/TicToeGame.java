package TicToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicToeGame {
    Deque<Players> players;
    Board board;
    public TicToeGame() {
      intilizeGame();
    }

    public void intilizeGame() {
        players = new LinkedList<>();
        //creating two players
        PieaceX pieaceX = new PieaceX();
        PieaceO pieaceO = new PieaceO();
        Players players1 = new Players("P1",pieaceX);
        Players players2 = new Players("P2", pieaceO);
        players.add(players1);
        players.add(players2);
        board = new Board(3);

    }
    public String startGame() {

        boolean isWinner = true;
        while (isWinner) {
            List<Pair> list = board.isEmptyCells();
            if (list.isEmpty()) {
                isWinner = false;
                continue;
            }
            Players players1 = players.removeFirst();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the position");
           // String str = scanner.nextLine();
           // String []arr = str.split(",");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (board.addToBoard(a, b, players1.pieace)) {
                players.addLast(players1);
            }
            else {
                players.addFirst(players1);
            }
            if (winner(board.arr, players1.pieace.type)) {
                return players1.name + " is " + "winner!";
            }
            else {
                continue;
            }
        }
        return "Tie!";

    }
    public boolean winner(Pieace [][]arr, PieaceType pieaceType) {
         int n = arr.length;
         int count = 0;
       for (int i = 0; i < n; i++) {
           count = 0;
           for (int j = 0; j < n; j++) {
               if (arr[i][j] != null && (arr[i][j].type != pieaceType)) {
                   break;
               }
               else if (arr[i][j] != null && arr[i][j].type == pieaceType)
               count++;
           }
           if (count == n)
                return true;
       }
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] != null && (arr[j][i].type != pieaceType)) {
                    break;
                }
                else if (arr[j][i] != null && arr[j][i].type == pieaceType)
                    count++;
            }
            if (count == n)
                return true;
        }
        int d1 = 0;
        int d2 = 0;
        count = 0;
        while (d1 < n && d2 < n) {
            if (arr[d1][d2] != null && (arr[d1][d2].type != pieaceType)) {
                break;
            }
            else if (arr[d1][d2] != null && arr[d1][d2].type == pieaceType)
                count++;
            d1++;
            d2++;
        }
        if (count == n)
            return true;
        d1 = 0;
        d2 = n - 1;
        count = 0;
        while (d1 < n && d2 >= 0) {
            if (arr[d1][d2] != null && (arr[d1][d2].type != pieaceType)) {
                break;
            }
            else if (arr[d1][d2] != null && arr[d1][d2].type == pieaceType)
                count++;
            d1++;
            d2--;
        }
        if (count == n)
            return true;
        return false;

    }

}
