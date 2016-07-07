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
 * The Class Rook.
 */
public class Rook extends ChessMan {

	/**
	 * Instantiates a new rook.
	 *
	 * @param color the color
	 */
	public Rook( char color )
	{
		this.setType( 'R' );
		this.setColor( color );
	}
	
	/* (non-Javadoc)
	 * @see Chess.ChessMan#move(short, short, short, short)
	 */
	public void move(short currX, short currY, short tarX, short tarY) {
		// TODO Auto-generated method stub

	}
}
