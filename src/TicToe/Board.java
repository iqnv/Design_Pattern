package TicToe;

import java.util.ArrayList;
import java.util.List;

class Pair {
    int row;
    int col;
    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
public class Board {
    int n;
    Pieace [][]arr;
    Board(int n) {
        this.n = n;
        this.arr = new Pieace[n][n];
    }

    public List<Pair> isEmptyCells() {
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if (arr[i][j] == null) {
                   list.add(new Pair(i, j));
               }
            }
        }
        return list;
    }
    public boolean addToBoard(int row, int col, Pieace type) {
        if (arr[row][col] == null) {
            arr[row][col] = type;
            return true;
        }
        return false;
    }

}
