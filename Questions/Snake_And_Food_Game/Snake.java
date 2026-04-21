package LLD_CWA.Questions.Snake_And_Food_Game;

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

public class Snake {
    int length;
    Direction dir;

    public Snake(int l, Direction d) {
        length = l;
        dir = d;
    }
}
