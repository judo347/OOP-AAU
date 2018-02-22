package handIn;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.testng.Assert;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestChessPiece {

    ChessPiece chessPiece = null;

    @BeforeAll
    public void beforeAll(){
        chessPiece = new ChessPiece("WHITE", "KING");
    }

    @Test
    public void getPlayerColor01(){
        Assert.assertEquals("WHITE", chessPiece.getPlayerColor());
    }

    @Test
    public void getPiece01(){
        Assert.assertEquals("KING", chessPiece.getPiece());
    }
}
