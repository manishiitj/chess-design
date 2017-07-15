package com.chess.peice;

import com.chess.board.Block;
import com.chess.board.Board;

/**
 * Created by Manish on 7/15/17.
 *
 */
public class Elephant extends Piece {

    Elephant(PieceColor color) {
        this.pieceColor = color;
    }

    Boolean canMove(Board board, Block fromBlock, Block toBlock) {
        if(!super.inValid(board,fromBlock, toBlock))
            return false;

        if(toBlock.getX() == fromBlock.getX())
            return true;
        if(fromBlock.getY() == fromBlock.getY())
            return true;
        return false;
    }
}
