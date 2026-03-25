package LLD_CWA.Questions.Tic_Tac_Toe;

import LLD_CWA.Questions.Tic_Tac_Toe.Player.Player;
import LLD_CWA.Questions.Tic_Tac_Toe.Player.PlayerFactory;
import LLD_CWA.Questions.Tic_Tac_Toe.Player.PlayerType;

class Game {
    Board b;
    int sizeOfBoard;
    int numberOfPlayers;
    Player[] players;
    int numberOfFreeCells;

    public Game(int sz, int np) throws Exception {
        b = new Board(sz);
        sizeOfBoard = sz;
        numberOfPlayers = np;
        numberOfFreeCells = sz * sz;
        players = new Player[numberOfPlayers];
        PlayerFactory pf = new PlayerFactory();
        for (int i = 0; i < numberOfPlayers; i++) {
            players[i] = pf.getPlayer(PlayerType.HUMAN);
        }
    }

    void start() throws Exception {
        int currPlayerId = 0;
        while (true) {
            System.out.println("\nChance for Player " + players[currPlayerId].id + " move");
            Position nextMove = players[currPlayerId].makeMove(b);
            if (!isValidMove(nextMove, b)) {
                System.out.println("Invalid move by Player " + players[currPlayerId].id);
                System.out.println("Enter again");
                continue;
            }
            b.grid[nextMove.row][nextMove.col] = players[currPlayerId].mark;
            numberOfFreeCells--;
            displayCurrentBoardStatus();
            if (checkIfCurrentPlayerWins(players[currPlayerId].mark, nextMove)) {
                System.out.println("Player " + players[currPlayerId].id + " wins!!");
                break;
            } else if (checkIfDraw()) {
                System.out.println("Game is a draw!");
                break;
            }
            currPlayerId++;
            currPlayerId %= numberOfPlayers;
        }
    }

    boolean isValidMove(Position move, Board b) {
        int r = move.row, c = move.col;
        if (r < 0 || c < 0)
            return false;
        if (r >= sizeOfBoard || c >= sizeOfBoard)
            return false;
        if (b.grid[r][c] != Symbol.EMPTY)
            return false;
        return true;
    }

    boolean checkIfCurrentPlayerWins(Symbol mark, Position move) {
        int r = move.row, c = move.col;
        boolean allSame = true;
        for (int i = 0; i < sizeOfBoard; i++) {
            if (b.grid[i][c] != mark) {
                allSame = false;
                break;
            }
        }
        if (allSame)
            return true;
        allSame = true;
        for (int i = 0; i < sizeOfBoard; i++) {
            if (b.grid[r][i] != mark) {
                allSame = false;
                break;
            }
        }
        if (allSame)
            return true;

        allSame = true;
        for (int i = 0; i < sizeOfBoard; i++) {
            if (b.grid[i][i] != mark) {
                allSame = false;
                break;
            }
        }
        if (allSame)
            return true;

        allSame = true;
        for (int i = 0; i < sizeOfBoard; i++) {
            if (b.grid[i][sizeOfBoard - i - 1] != mark) {
                allSame = false;
                break;
            }
        }
        if (allSame)
            return true;
        return false;
    }

    boolean checkIfDraw() {
        return numberOfFreeCells == 0;
    }

    void displayCurrentBoardStatus() {
        System.out.println("Current Board Status: ");
        for (int i = 0; i < sizeOfBoard; i++) {
            for (int j = 0; j < sizeOfBoard; j++) {
                char eq = b.grid[i][j] == Symbol.EMPTY ? '-' : b.grid[i][j] == Symbol.X ? 'X' : 'O';
                System.out.print(eq + " | ");
            }
            System.out.println("");
        }
    }
}
