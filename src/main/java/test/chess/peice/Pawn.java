package test.chess.peice;

import test.chess.board.Block;
import test.chess.board.Board;

/**
 * Created by Manish on 7/15/17.
 *
 */
public class Pawn extends Piece {

    public Pawn(PieceColor color) {
        this.pieceColor = color;
    }

    Boolean canMove(Board board, Block fromBlock, Block toBlock) {
        if(!super.inValid(board,fromBlock, toBlock))
            return false;

        int xDist = Math.abs(toBlock.getX() - fromBlock.getX());
        int yDist = Math.abs(toBlock.getY() - fromBlock.getY());

        if( xDist == 0 && (yDist == 1 || yDist == 2)){
            return true;
        }

        return false;
    }
}
