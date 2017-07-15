package test.chess.exception;

/**
 * Created by Manish on 7/15/17.
 *
 */
public class NoPieceFoundException extends Exception{
    public NoPieceFoundException() {
    }

    public NoPieceFoundException(String message) {
        super(message);
    }
}
