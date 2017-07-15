package com.chess.peice;

import com.chess.exception.NoPieceFoundException;

/**
 * Created by Manish on 7/15/17.
 *
 */
public class PieceFactory {


    public static Piece getPiece(Piece.Type type, Piece.PieceColor color) throws NoPieceFoundException {
        Piece piece;
        switch (type){
            case BISHOP:
                piece = new Bishop(color);
                break;
            case ELEPHANT:
                piece = new Elephant(color);
                break;
            case HORSE:
                piece = new Horse(color);
                break;
            case KING:
                piece = new King(color);
                break;
            case PAWN:
                piece = new Pawn(color);
                break;
            case QUEEN:
                piece = new Queen(color);
                break;

            default:
                throw new NoPieceFoundException("No such piece found with type: " + type.toString());

        }

        return piece;
    }

}
