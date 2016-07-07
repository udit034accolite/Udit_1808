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
 * The Interface PlayerActions.
 */
public interface PlayerActions 
{
	
	/**
	 * Prints the captured pieces.
	 */
	public void printCapturedPieces();
	
	/**
	 * Gets the color of player chessman.
	 *
	 * @return the color of player chessman
	 */
	public char getColorOfPlayerChessman();
	
	/**
	 * Forfeit.
	 */
	public void forfeit();
}
