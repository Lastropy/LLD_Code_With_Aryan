package LLD_CWA.Questions.Snake_And_Food_Game;

public class Food {
    Position pos;
    int points;
    boolean consumed = false;

    public Food(int p, Position ps) {
        points = p;
        pos = ps;
    }

    boolean isEaten() {
        return consumed;
    }

    int getEaten() {
        consumed = true;
        return points;
    }
}
