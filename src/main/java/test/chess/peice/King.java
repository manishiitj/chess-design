package test.chess.peice;

import test.chess.board.Block;
import test.chess.board.Board;

/**
 * Created by Manish on 7/15/17.
 *
 */
public class King extends Piece {

    public King(PieceColor color) {
        this.pieceColor = color;
    }

    Boolean canMove(Board board, Block fromBlock, Block toBlock) {
        if(!super.inValid(board,fromBlock, toBlock))
            return false;

        int dist = (int) Math.pow(Math.abs(toBlock.getX() - fromBlock.getX()),2) + (int)Math.pow(Math.abs(toBlock.getY() - fromBlock.getY()),2);
        return (dist == 1 || dist == 2);

    }
}
