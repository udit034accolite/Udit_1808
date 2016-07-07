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
 * The Class ChessBoardSquare.
 */
public class ChessBoardSquare 
{
	
	/** The color. */
	private char color;
	
	/** The Chess man. */
	private ChessMan ChessMan;
	
	/** The row. */
	private int row;
	
	/** The col. */
	private int col;
	
	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public char getColor() {
		return color;
	}
	
	/**
	 * Sets the color.
	 *
	 * @param color the new color
	 */
	public void setColor(char color) {
		this.color = color;
	}
	
	/**
	 * Gets the chess man.
	 *
	 * @return the chess man
	 */
	public ChessMan getChessMan() {
		return ChessMan;
	}
	
	/**
	 * Sets the chess man.
	 *
	 * @param chessMan the new chess man
	 */
	public void setChessMan(ChessMan chessMan) {
		ChessMan = chessMan;
	}
	
	/**
	 * Gets the row.
	 *
	 * @return the row
	 */
	public int getRow() {
		return row;
	}
	
	/**
	 * Sets the row.
	 *
	 * @param row the new row
	 */
	public void setRow(int row) {
		this.row = row;
	}
	
	/**
	 * Gets the col.
	 *
	 * @return the col
	 */
	public int getCol() {
		return col;
	}
	
	/**
	 * Sets the col.
	 *
	 * @param col the new col
	 */
	public void setCol(int col) {
		this.col = col;
	}
}
