package snakenladder;

public class SnakeNladder {
    private static SnakeNladder game;
    private static input Input;
    private void start(SnakeNladder game){
        Input = new input(game);
        Input.main(Input);
    }
    public static void main(String[] args) {
        game = new SnakeNladder();
        game.start(game);
    }
}
