//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));
		String x = file.nextLine();

		TicTacToe toe = new TicTacToe(file.nextLine());

		//TicTacToe game = new TicTacToe(x);
		//read how many time you should read

		//TicTacToe only wants this file.nextLine();

		//Make a tictactoe object for each game in the file

		//Print the game (TicTacToe)
		//traditional for lop






	}
}



