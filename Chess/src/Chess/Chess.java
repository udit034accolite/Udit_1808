/****************************************************************************

* Copyright (c) 2016 by Accolite.com. All rights reserved

*

* Created date :: Jul 7, 2016

*

*  @author :: Udit Mehata

* ***************************************************************************

*/
package Chess;

public class Chess {
	chessBoard cboard = new chessBoard();
	Player player1 = new Player('w');
	
	/** The player 2. */
	Player player2 = new Player('b');
	
	public void chessInit()
	{
		/* 
		 * cboard.board[1][0].setChessMan( new Pawn('w'));
		 * cboard.board[1][1].setChessMan( new Pawn('w'));
		 * cboard.board[1][2].setChessMan( new Pawn('w'));
		 * cboard.board[1][3].setChessMan( new Pawn('w'));
		 * cboard.board[1][4].setChessMan( new Pawn('w'));
		 * cboard.board[1][5].setChessMan( new Pawn('w'));
		 * cboard.board[1][6].setChessMan( new Pawn('w'));
		 * cboard.board[1][7].setChessMan( new Pawn('w'));
		 * cboard.board[6][0].setChessMan( new Pawn('b'));
		 * cboard.board[6][1].setChessMan( new Pawn('b'));
		 * cboard.board[6][2].setChessMan( new Pawn('b'));
		 * cboard.board[6][3].setChessMan( new Pawn('b'));
		 * cboard.board[6][4].setChessMan( new Pawn('b'));
		 * cboard.board[6][5].setChessMan( new Pawn('b'));
		 * cboard.board[6][6].setChessMan( new Pawn('b'));
		 * cboard.board[6][7].setChessMan( new Pawn('b'));
		 * cboard.board[0][0].setChessMan( new Rook('w'));
		 * cboard.board[0][1].setChessMan( new knight('w'));
		 * cboard.board[0][2].setChessMan( new Bishop('w'));
		 * cboard.board[0][3].setChessMan( new King('w'));
		 * cboard.board[0][4].setChessMan( new Queen('w'));
		 * cboard.board[0][5].setChessMan( new Bishop('w'));
		 * cboard.board[0][6].setChessMan( new knight('w'));
		 * cboard.board[0][7].setChessMan( new Rook('w'));
		 * cboard.board[7][0].setChessMan( new Rook('b'));
		 * cboard.board[7][1].setChessMan( new knight('b'));
		 * cboard.board[7][2].setChessMan( new Bishop('b'));
		 * cboard.board[7][3].setChessMan( new King('b'));
		 * cboard.board[7][4].setChessMan( new Queen('b'));
		 * cboard.board[7][5].setChessMan( new Bishop('b'));
		 * cboard.board[7][6].setChessMan( new knight('b'));
		 * cboard.board[7][7].setChessMan( new Rook('b'));
		 */
	}
	
	public void getStatus()
	{
		/*
		player1.printCapturedPieces();
		player2.printCapturedPieces();
		// print( cboard.board ) in readable format
		*/
	}
	
}
