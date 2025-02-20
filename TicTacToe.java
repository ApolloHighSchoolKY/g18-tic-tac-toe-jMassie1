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
		char[][] mat = new char[3][3];

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
		//row major order will happen here
		for(int row = 0; row<mat.length; row++){
			for(int col = 0; col<mat[0].length; col++){
				mat[row][col] = game.charAt(0);
			}
		}



	}

	public String getWinner()
	{
		// if a=c and b=c then a=b
		// else is the tie
		//9 ways











		return "";
	}

	public String toString()
	{
		String output="";

		for(char[] row: mat){
			for(char col: row){
				output = "" + col;
			}
		}



		return output+"\n\n";
	}
}