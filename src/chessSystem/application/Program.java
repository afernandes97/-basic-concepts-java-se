package chessSystem.application;

import chessSystem.boardgame.Board;
import chessSystem.boardgame.Position;

public class Program {
    public static void main(String[] args){
        //test: instantiate position
        Position pos = new Position(3,5);
        System.out.println(pos);

        //test: instantiate chess board
        Board board = new Board(8,8);
    }
}
