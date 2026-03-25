package LLD_CWA.Questions.Tic_Tac_Toe;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting Tic Tac Toe Game - ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of board: ");
        int sz = sc.nextInt();
        System.out.println("Enter numberOfPlayers: ");
        int np = sc.nextInt();
        // Do not close Scanner on System.in — it closes stdin for the whole JVM.
        Game g = new Game(sz, np);
        g.start();
    }
}
