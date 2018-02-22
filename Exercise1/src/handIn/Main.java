package handIn;

public class Main {

    /**
     *  Did not finish the task but would still like feedback :)
     *  Not done:
     *      Any other movePiece methods than movePawn
     *      All methods to determine the state of the game
     */
    public static void main(String[] args) {

        ChessBoard board = new ChessBoard();

        board.printBoard();

        board.movePawn(1,4,3,4);

        board.printBoard();

    }
}
