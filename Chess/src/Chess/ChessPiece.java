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
 * The Interface ChessPiece.
 */
public interface ChessPiece 
{
	
	/**
	 * Checks if is alive.
	 *
	 * @return true, if is alive
	 */
	public boolean isAlive();
	
	/**
	 * Move.
	 *
	 * @param currX the curr X
	 * @param currY the curr Y
	 * @param tarX the tar X
	 * @param tarY the tar Y
	 */
	public void move( short currX, short currY, short tarX, short tarY );
	
	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public char getColor();
	
	/**
	 * Sets the color.
	 *
	 * @return the color
	 */
	public void setColor( char c );
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public char getType();
	
	/**
	 * Sets the type.
	 *
	 * @return the type
	 */
	public void setType( char c );
}
