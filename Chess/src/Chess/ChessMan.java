/****************************************************************************

* Copyright (c) 2016 by Accolite.com. All rights reserved

*

* Created date :: Jul 7, 2016

*

*  @author :: Udit Mehata

* ***************************************************************************

*/
package Chess;

public class ChessMan implements ChessPiece {

	private char color;
	private boolean dead;
	private char type;
	
	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return dead;
	}

	/* (non-Javadoc)
	 * @see Chess.ChessPiece#move(short, short, short, short)
	 */
	@Override
	public void move(short currX, short currY, short tarX, short tarY) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see Chess.ChessPiece#getColor()
	 */
	@Override
	public char getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	public void setColor( char c )
	{
		
	}
	
	@Override
	public char getType() {
		// TODO Auto-generated method stub
		return type;
	}
	
	@Override
	public void setType( char c ) {
		// TODO Auto-generated method stub
		type = c;
	}

}
