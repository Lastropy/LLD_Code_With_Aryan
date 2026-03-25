package LLD_CWA.Questions.Tic_Tac_Toe;

public class Board {
    Symbol[][] grid;
    int size;

    Board(int sz) {
        size = sz;
        grid = new Symbol[sz][sz];
        for (int i = 0; i < sz; i++) {
            for (int j = 0; j < sz; j++) {
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }
}