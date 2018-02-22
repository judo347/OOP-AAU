package handIn;

public class ChessPiece {

    private String playerColor;
    private String piece;

    public ChessPiece(String playerColor, String piece) {
        this.playerColor = playerColor;
        this.piece = piece;
    }

    public String getPlayerColor() {
        return playerColor;
    }

    public String getPiece() {
        return piece;
    }

    public void setPlayerColor(String string){
        this.playerColor = string;
    }

    public void setPiece(String string){
        this.piece = string;
    }
}
