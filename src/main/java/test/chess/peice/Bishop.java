package test.chess.peice;

import test.chess.board.Block;
import test.chess.board.Board;

/**
 * Created by Manish on 7/15/17.
 *
 */
public class Bishop extends Piece {

    public Bishop(PieceColor color) {
        this.pieceColor = color;
    }

    public Boolean canMove(Board board, Block fromBlock, Block toBlock) {
        return super.inValid(board, fromBlock, toBlock) && (toBlock.getX() - fromBlock.getX() == toBlock.getY() - fromBlock.getY());
    }
}
