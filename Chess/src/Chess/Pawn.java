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
 * The Class Pawn.
 */
public class Pawn extends ChessMan {

	/**
	 * Instantiates a new pawn.
	 *
	 * @param color the color
	 */
	public Pawn( char color )
	{
		this.setType( 'P' );
		this.setColor( color );
	}
	
	/* (non-Javadoc)
	 * @see Chess.ChessMan#move(short, short, short, short)
	 */
	public void move(short currX, short currY, short tarX, short tarY) {
		// TODO Auto-generated method stub

	}

}
