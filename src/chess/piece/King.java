package chess.piece;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}

	//Imprimindo o Rei
	@Override
	public String toString() {
		return "K";
	}
}
