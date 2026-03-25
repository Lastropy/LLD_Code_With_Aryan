package LLD_CWA.Questions.Tic_Tac_Toe.PlayerStrategy;

import LLD_CWA.Questions.Tic_Tac_Toe.Board;
import LLD_CWA.Questions.Tic_Tac_Toe.Position;

public interface IPlayerStrategy {
    Position getNextMove(Board b);
}
