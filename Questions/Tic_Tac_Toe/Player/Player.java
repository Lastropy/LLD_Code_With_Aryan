package LLD_CWA.Questions.Tic_Tac_Toe.Player;

import LLD_CWA.Questions.Tic_Tac_Toe.Symbol;
import LLD_CWA.Questions.Tic_Tac_Toe.Board;
import LLD_CWA.Questions.Tic_Tac_Toe.Position;
import LLD_CWA.Questions.Tic_Tac_Toe.PlayerStrategy.IPlayerStrategy;

public class Player {
    public int id;
    public Symbol mark;
    IPlayerStrategy moveStrategy;

    public Player(int _id, Symbol m, IPlayerStrategy ps) {
        id = _id;
        mark = m;
        moveStrategy = ps;
    }

    public Position makeMove(Board b) {
        return moveStrategy.getNextMove(b);
    }
}
