package test.chess.peice;

import test.chess.board.Block;
import test.chess.board.Board;

/**
 * Created by Manish on 7/15/17.
 *
 */
public abstract class Piece {

    PieceColor pieceColor;
    abstract Boolean canMove(Board board, Block fromBlock, Block toBlock);

    public Boolean inValid(Board board, Block fromBlock, Block toBlock){
        int rowSize = board.getRowSize();
        int colSize = board.getColSize();

        int toX = toBlock.getX();
        int toY = toBlock.getY();

        int fromX = fromBlock.getX();
        int fromY = fromBlock.getY();

        if(toX == fromX && toY == fromY)
            return false;
        if(toX < 0 || toX > rowSize || fromX < 0 || fromX > rowSize || toY < 0 || toY > colSize || fromY <0 || fromY > colSize)
            return false;
        return true;
    }

    public enum PieceColor{
        WHITE,
        BLACK
    }

    public enum Type{
        KING,
        QUEEN,
        HORSE,
        ELEPHANT,
        PAWN,
        BISHOP
    }


    public PieceColor getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }
}
