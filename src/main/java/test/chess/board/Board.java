package test.chess.board;

import test.chess.constant.Constant;
import test.chess.peice.Piece;
import test.chess.peice.PieceFactory;

/**
 * Created by Manish on 7/15/17.
 *
 */
public class Board {
    private static Board board;
    private int rowSize;
    private int colSize;
    private Block[][] grid;


    private Board(int rowSize, int colSize){
        assert rowSize >=0 && rowSize < Constant.MAX_ROW_SIZE;
        assert colSize >=0 && colSize < Constant.MAX_COL_SIZE;

        this.rowSize = rowSize;
        this.colSize = colSize;
    }

    public static Board getInstance(){
        if(board == null){
            synchronized (Board.class){
                if(board == null){
                    board = new Board(8,8);
                    board.initialize();
                }
            }
        }
        return board;
    }

    public int getRowSize() {
        return rowSize;
    }

    public void setRowSize(int rowSize) {
        this.rowSize = rowSize;
    }

    public int getColSize() {
        return colSize;
    }

    public void setColSize(int colSize) {
        this.colSize = colSize;
    }

    private void initialize(){
        grid = new Block[rowSize][colSize];
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                grid[i][j] = new Block(i,j);
                init();
            }
        }

    }

    private void init(){
        try {
            initKing();
            initPawn();
            initQueen();
            initHorse();
            initBishop();
            initElephant();
        }catch (Exception e){

        }
    }
    private void initElephant(){

    }
    private void initBishop() {
    }

    private void initHorse() {
    }

    private void initQueen() {
    }

    private void initPawn() {
    }


    private void initKing() throws Exception{
        grid[0][3].setPiece(PieceFactory.getPiece(Piece.Type.KING, Piece.PieceColor.BLACK));
        grid[7][3].setPiece(PieceFactory.getPiece(Piece.Type.KING, Piece.PieceColor.WHITE));
    }

    public void movePiece(Piece piece, Block toBlock, Block fromBlock){
        if(piece.getPieceColor() == Piece.PieceColor.BLACK){
            // player 1 history
        }else{
            // player 2 history
        }
    }

    public Piece removePiece(Piece piece, Block fromBlock){
        return piece;
    }

    public Boolean isCheckMate(){
        return false;
    }

    public Block[][] getGrid() {
        return grid;
    }

    public void setGrid(Block[][] grid) {
        this.grid = grid;
    }
}

