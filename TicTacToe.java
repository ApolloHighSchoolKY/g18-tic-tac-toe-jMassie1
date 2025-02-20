//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		 mat = new char[3][3];

		mat[0][0] = 'x';
		mat[0][1] = 'x';
		mat[0][2] = 'x';

		mat[1][0] = 'x';
		mat[1][1] = 'x';
		mat[1][2] = 'x';

		mat[2][0] = 'x';
		mat[2][1] = 'x';
		mat[2][2] = 'x';

	}

	public TicTacToe(String game)
	{
		// to avoid null pointer exception
		mat = new char[3][3];

		//create a variable to track our position
		int pos = 0;

		//row major order will happen here
		for(int row = 0; row<mat.length; row++){
			for(int col = 0; col<mat[row].length; col++){
				mat[row][col] = game.charAt(pos);
				pos++;
			}
		}



	}

	public String getWinner()
	{
		// if a=c and b=c then a=b
		// else is the tie
		//9 ways

		if(mat[0][0] == mat[0][1] && mat[0][1] == mat[0][2])
			return "" + mat[0][0] + " wins horizontally";
		else if(mat[1][0] == mat[1][1] && mat[1][1] == mat[1][2])
			return "" + mat[1][0] + " wins horizontally";
		else if(mat[2][0] == mat[2][1] && mat[2][1] == mat[2][2])
			return "" + mat[2][0] + " wins horizontally";

		else if(mat[0][0] == mat[1][0] && mat[1][0] == mat[2][0])
			return "" + mat[0][0] + " wins vertically";
		else if(mat[0][1] == mat[1][1] && mat[1][1] == mat[2][1])
			return "" + mat[0][1] + " wins vertically";
		else if(mat[0][2] == mat[1][2] && mat[1][2] == mat[2][2])
			return "" + mat[0][2] + " wins vertically";

		else if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])
			return "" + mat[0][0] + " wins diagonally";
		else if(mat[2][0] == mat[1][1] && mat[1][1] == mat[0][2])
			return "" + mat[2][0] + " wins diagonally";

		else
			return "" + "The game is a tie.";







		return "";
	}

	public String toString()
	{
		String output="";

		for(int row = 0; row<mat.length; row++){
			for(int col = 0; col<mat[row].length; col++){
				output += "" + mat[row][col] + " ";
			}
		}



		return output+"\n\n";
	}
}