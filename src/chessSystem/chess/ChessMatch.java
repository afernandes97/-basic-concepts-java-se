package chessSystem.chess;

import chessSystem.boardgame.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        //define rows and columns for Board
        board = new Board(8,8);
    }

    //return pieces for chess match
    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i = 0; i < board.getRows(); i ++){
            for(int j = 0; j < board.getColumns(); j ++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }

        return mat;
    }
}
