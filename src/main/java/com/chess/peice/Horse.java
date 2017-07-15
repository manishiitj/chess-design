package com.chess.peice;

import com.chess.board.Block;
import com.chess.board.Board;

/**
 * Created by Manish on 7/15/17.
 *
 */
public class Horse extends Piece {

    public Horse(PieceColor color) {
        this.pieceColor = color;
    }


    Boolean canMove(Board board, Block fromBlock, Block toBlock) {
        if(!super.inValid(board,fromBlock, toBlock))
            return false;

        int toX = toBlock.getX(), fromX = fromBlock.getX(), toY = toBlock.getY(), fromY = fromBlock.getY();

        if(toX != fromX - 1 && toX != fromX + 1 && toX != fromX + 2 && toX != fromX - 2)
            return false;
        if(toY != fromY - 2 && toY != fromY + 2 && toY != fromY - 1 && toY != fromY + 1)
            return false;

        return true;

    }
}
