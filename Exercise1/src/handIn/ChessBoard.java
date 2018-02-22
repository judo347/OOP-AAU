package handIn;

//8x8
public class ChessBoard {

    private ChessPiece[][] board;
    private int BoardSize;

    public ChessBoard() {
        BoardSize = 8;

        board = new ChessPiece[BoardSize][BoardSize];

        for(int i = 0; i < BoardSize; i++){ //vertical
            for(int k = 0; k < BoardSize; k++){ //horizontal

                if(i == 0 || i == 7){

                    switch (k){
                        case 0 : board[i][k] = new ChessPiece((i == 0) ? "BLACK" : "WHITE" ,"ROOK");
                            break;
                        case 1 : board[i][k] = new ChessPiece((i == 0) ? "BLACK" : "WHITE" ,"KNIGHT");
                            break;
                        case 2 : board[i][k] = new ChessPiece((i == 0) ? "BLACK" : "WHITE" ,"BISHOP");
                            break;
                        case 3 : board[i][k] = new ChessPiece((i == 0) ? "BLACK" : "WHITE" ,"QUEEN");
                            break;
                        case 4 : board[i][k] = new ChessPiece((i == 0) ? "BLACK" : "WHITE" ,"KING");
                            break;
                        case 5 : board[i][k] = new ChessPiece((i == 0) ? "BLACK" : "WHITE" ,"BISHOP");
                            break;
                        case 6 : board[i][k] = new ChessPiece((i == 0) ? "BLACK" : "WHITE" ,"KNIGHT");
                            break;
                        case 7 : board[i][k] = new ChessPiece((i == 0) ? "BLACK" : "WHITE" ,"ROOK");
                    }
                } else if(i == 1 || i == 6){
                    board[i][k] = new ChessPiece((i == 1) ? "BLACK" : "WHITE" ,"PAWN");
                }
                else
                    board[i][k] = new ChessPiece("","");
            }
        }
    }


    //TODO: might delete? so no test yet.
    public void printBoard(){
        for(int i = 0; i < BoardSize; i++){
            for(int k = 0; k < BoardSize; k++){

                System.out.print(board[i][k].getPiece() + board[i][k].getPlayerColor() + " ");
            }
            System.out.println();
        }
    }


    public ChessPiece getChessPiece(int x, int y){
        return this.board[x][y];
    }

    public String getColor(int x, int y){
        return this.board[x][y].getPlayerColor();
    }

    public String getPiece(int x, int y){
        return this.board[x][y].getPiece();
    }


    public boolean movePawn(int x1, int y1, int x2, int y2){
        //check is this a pawn?
        if(!this.board[x1][y1].getPiece().equals("PAWN"))
            return false;

        //TODO: ATTACK MOVE

        //check color for direction
        if(this.board[x1][y1].getPlayerColor().equals("BLACK")){
            if(x1 == 1){ //Start location?
                if(y1 - y2 != 0) //Not allowed
                    return false;
                else{ //no difference in y
                    if(x2 - x1 == 2){ //Move 2
                        movePiece(x1, y1, x2, y2); //Move
                        return true;
                    }
                    if(x2 - x1 == 1){ //Move 1
                        movePiece(x1, y1, x2, y2); //Move
                        return true;
                    }
                }
            }else{
                if(y1 - y2 != 0) //Not allowed
                    return false;
                else{ //no difference in y
                    if(x2 - x1 == 1){ //Move 1
                        movePiece(x1, y1, x2, y2); //Move
                        return true;
                    }
                }
            }
        }else{ //White
            if(x1 == 6){ //Start location?
                if(y1 - y2 != 0) //Not allowed
                    return false;
                else{ //no difference in y
                    if(x1 - x2 == 2){ //Move 2
                        movePiece(x1, y1, x2, y2); //Move
                        return true;
                    }
                    if(x1 - x2 == 1){ //Move 1
                        movePiece(x1, y1, x2, y2); //Move
                        return true;
                    }
                }
            }else{
                if(y1 - y2 != 0) //Not allowed
                    return false;
                else{ //no difference in y
                    if(x1 - x2 == 1){ //Move 1
                        movePiece(x1, y1, x2, y2); //Move
                        return true;
                    }
                }
            }

        }

        return false; //Not  a VALID move
    }

    public void movePiece(int x1, int y1, int x2, int y2){
        ChessPiece tempPiece = new ChessPiece(this.board[x1][y1].getPlayerColor(), this.board[x1][y1].getPiece());

        emptySpace(x1, y1);

        this.board[x2][y2] = tempPiece;
    }

    /** Clears a spot on the board */
    public void emptySpace(int x, int y){
        board[x][y].setPiece("");
        board[x][y].setPlayerColor("");
    }
}
