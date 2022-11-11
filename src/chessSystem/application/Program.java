package chessSystem.application;

import chessSystem.boardgame.Board;
import chessSystem.boardgame.Position;
import chessSystem.chess.ChessMatch;

public class Program {
    public static void main(String[] args){

        //instantiate chess match
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
