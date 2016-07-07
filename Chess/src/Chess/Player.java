/****************************************************************************

* Copyright (c) 2016 by Accolite.com. All rights reserved

*

* Created date :: Jul 7, 2016

*

*  @author :: Udit Mehata

* ***************************************************************************

*/
package Chess;

// TODO: Auto-generated Javadoc
/**
 * The Class Player.
 */
public class Player extends chessBoard implements PlayerActions {

	/** The Captured pieces array. */
	private char[] CapturedPiecesArray = new char[16];
	
	/** The color. */
	char color;
	
	Player( char c )
	{
		this.color = c;
	}
	
	/* (non-Javadoc)
	 * @see Chess.PlayerActions#printCapturedPieces()
	 */
	@Override
	public void printCapturedPieces() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see Chess.PlayerActions#getColorOfPlayerChessman()
	 */
	@Override
	public char getColorOfPlayerChessman() {
		// TODO Auto-generated method stub
		return color;
	}

	/* (non-Javadoc)
	 * @see Chess.PlayerActions#forfeit()
	 */
	@Override
	public void forfeit() {
		// TODO Auto-generated method stub

	}

}

