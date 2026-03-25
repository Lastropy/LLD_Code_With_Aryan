package LLD_CWA.Questions.Tic_Tac_Toe.PlayerStrategy;

import java.util.Scanner;

import LLD_CWA.Questions.Tic_Tac_Toe.Board;
import LLD_CWA.Questions.Tic_Tac_Toe.Position;

public class HumanPlayerStrategy implements IPlayerStrategy {

    @Override
    public Position getNextMove(Board b) {
        System.out.println("Enter Next Move: ");
        System.out.println("Row (0-based index): ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Column (0-based index): ");
        int c = sc.nextInt();
        // Do not close — closing Scanner(System.in) closes stdin for the process.
        return new Position(r, c);
    }
}
