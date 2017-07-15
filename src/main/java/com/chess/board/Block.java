package com.chess.board;

import com.chess.peice.Piece;

/**
 * Created by Manish on 7/15/17.
 *
 */
public class Block {
    private int X;
    private int Y;
    private BlockType type;
    private Piece piece;

    public Block(int x, int y) {
        X = x;
        Y = y;
        type = (x+y)%2 == 0? BlockType.BLACK: BlockType.WHITE;
    }

    public enum BlockType{
        WHITE,
        BLACK;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
