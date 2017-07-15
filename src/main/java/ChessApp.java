import javafx.application.Application;
import javafx.stage.Stage;
import test.chess.board.Block;
import test.chess.board.Board;
import test.chess.peice.Piece;
import test.chess.peice.PieceFactory;
import test.chess.player.Pair;
import test.chess.player.Player;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * Created by Manish on 7/15/17.
 *
 */
public class ChessApp extends Application {
    private Board board;
    private Player player1;
    private Player player2;

    public void start(Stage primaryStage) throws Exception {
        board = Board.getInstance();
        player1 = new Player("Manish", new Stack<Pair>());
        player2 = new Player("Panda", new Stack<Pair>());

        startGame();
        announceWinner();

    }

    private void startGame() throws Exception{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);

        String input = null;
        int turn = 0;
        while((input = br.readLine()) != null){
            String[] s = input.split(",");
            int fromx = Integer.parseInt(s[0]);
            int fromy = Integer.parseInt(s[1]);
            int tox = Integer.parseInt(s[2]);
            int toy = Integer.parseInt(s[3]);

            Piece piece = board.getGrid()[fromx][fromy].getPiece();
            Block fromBlock =  board.getGrid()[fromx][fromy];
            Block toBlock = board.getGrid()[tox][toy];

            if(turn %2 == 0){
                board.movePiece( piece, fromBlock, toBlock);
            }else{
                board.movePiece( piece, fromBlock, toBlock);
            }
        }
    }

    private void announceWinner(){

    }

}
