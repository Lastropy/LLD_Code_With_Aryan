package LLD_CWA.Questions.Tic_Tac_Toe.Player;

import LLD_CWA.Questions.Tic_Tac_Toe.Symbol;
import LLD_CWA.Questions.Tic_Tac_Toe.PlayerStrategy.HumanPlayerStrategy;
import LLD_CWA.Questions.Tic_Tac_Toe.PlayerStrategy.AIPlayerStrategy;

public class PlayerFactory {
    static int id = 0;

    static void incrementId() {
        id++;
    }

    public Player getPlayer(PlayerType t) throws Exception {
        Symbol currentSymbol = Symbol.values()[id];
        if (t == PlayerType.HUMAN) {
            HumanPlayerStrategy hps = new HumanPlayerStrategy();
            PlayerFactory.incrementId();
            return new Player(id, currentSymbol, hps);
        } else if (t == PlayerType.AI) {
            AIPlayerStrategy aips = new AIPlayerStrategy();
            PlayerFactory.incrementId();
            return new Player(id++, currentSymbol, aips);
        } else {
            throw new Exception("Invalid Player Type cannot be created");
        }
    }
}
