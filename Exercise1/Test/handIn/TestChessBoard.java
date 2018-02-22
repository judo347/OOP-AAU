package handIn;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.testng.Assert;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestChessBoard {

    ChessBoard board = null;

    @BeforeEach
    public void beforeEach(){
        board = new ChessBoard();
    }

    @Test
    public void getChessPiece01(){
        ChessPiece piece = board.getChessPiece(0,0);
        Assert.assertEquals("BLACK", piece.getPlayerColor());
        Assert.assertEquals("ROOK", piece.getPiece());
    }

    @Test
    public void getColor01(){
        Assert.assertEquals("BLACK", board.getColor(0,0));
        Assert.assertEquals("WHITE", board.getColor(7,7));
    }

    @Test
    public void getPiece01(){
        Assert.assertEquals("ROOK", board.getPiece(0,7));
        Assert.assertEquals("", board.getPiece(5,5));
    }

    @Test
    public void movePawn01(){ //BLACK 2 move VALID MOVE
        Assert.assertTrue(board.movePawn(1, 2, 3,2));
    }

    @Test
    public void movePawn02(){ //BLACK 1 move VALID MOVE
        Assert.assertTrue(board.movePawn(1, 2, 2,2));
    }

    @Test
    public void movePawn03(){ //BLACK 3 move NOT VALID MOVE
        Assert.assertFalse(board.movePawn(1, 2, 4,2));
    }

    @Test
    public void movePawn04(){ //BLACK y-axis chance move NOT VALID MOVE
        Assert.assertFalse(board.movePawn(1, 2, 2,3));
    }

    @Test
    public void movePawn05(){ //BLACK valid move but not a pawn
        Assert.assertFalse(board.movePawn(0, 2, 1,2));
    }

    @Test
    public void movePawn06(){ //BLACK valid move 1 not in start pos
        this.board.movePiece(1,3,2,3);

        Assert.assertTrue(this.board.movePawn(2,3, 3,3));
    }

    @Test
    public void movePawn07(){ //BLACK not VALID move not in start pos
        this.board.movePiece(1,3,2,3);

        Assert.assertFalse(this.board.movePawn(2,3, 4,3));
    }

    @Test
    public void movePawn08(){ //WHITE 2 move VALID MOVE
        Assert.assertTrue(board.movePawn(6, 2, 4,2));
    }

    @Test
    public void movePawn09(){ //WHITE 1 move VALID MOVE
        Assert.assertTrue(board.movePawn(6, 2, 5,2));
    }

    @Test
    public void movePawn10(){ //WHITE 3 move NOT VALID MOVE
        Assert.assertFalse(board.movePawn(6, 2, 3,2));
    }

    @Test
    public void movePawn11(){ //WHITE y-axis chance move NOT VALID MOVE
        Assert.assertFalse(board.movePawn(6, 2, 5,3));
    }

    @Test
    public void movePawn12(){ //WHITE valid move but not a pawn
        Assert.assertFalse(board.movePawn(7, 2, 6,2));
    }

    @Test
    public void movePawn13(){ //WHITE valid move 1 not in start pos
        this.board.movePiece(6,3,5,3);

        Assert.assertTrue(this.board.movePawn(5,3, 4,3));
    }

    @Test
    public void movePawn14(){ //WHITE not VALID move not in start pos
        this.board.movePiece(6,3,5,3);

        Assert.assertFalse(this.board.movePawn(5,3, 3,3));
    }

    @Test
    public void movePawn15(){ //WHITE not VALID move not in start pos (y-axis conflict)
        this.board.movePiece(6,3,5,3);

        Assert.assertFalse(this.board.movePawn(5,3, 4,4));
    }

    @Test
    public void movePawn16(){ //BLACK not VALID move not in start pos (y-axis conflict)
        this.board.movePiece(1,3,2,3);

        Assert.assertFalse(this.board.movePawn(2,3, 3,4));
    }
}