package inter6;

import java.util.Random;
import java.util.Scanner;

public class TICTAC {
	public static void main(String[] args) {
		char[][]board = {{' ',' ',' '},
						 {' ' ,' ',' '},
						 {' ' ,' ',' '}};
		
		printBoard(board);
		Scanner sc=  new Scanner(System.in) ;
//		PlayerTurn(board, 'x');
		Random rand = new Random();
		while (true) {
			int computer = rand.nextInt(9)+1;

			if (isvaible(board, computer)) {
				break;
				
			}
		
		}
	printBoard(board);
	}
	private static boolean isvaible(char[][] board, int position) { 
		switch (position) {
		case 1:
		return board[0][0] == ' ' ;
	
			
		case 2:
return			board[0][1] ==' ';
		
		case 3:
			return board[0][2] == ' ';
		case 4:
return			board[1][0] == ' ';

		case 5:
			return board[1][1] == ' ';
		
		case 6:
			return board[1][2] == ' ';
			
		case 7:
	return		board[2][0] == ' ';
	
		case 8:
		return	board[2][1] == ' ';
			
		case 9:
			return board[2][2] == ' ';
			
			
			

		default:
			System.out.println("Plese a numbum 1-9");
			break;
		}
		return false;
		
		
		
	}

	private static void PlayerTurn(char[][] board, Scanner sc) {
		System.out.println("where would you like to play?1-9");
		String Inputuser = sc.nextLine();
		System.out.println(Inputuser);
	//moveon(board, Inputuser);
	}
	
	
	private static void moveon(char[][] board, String position, char symbol) {
		switch (position) {
		case "1":
			board[0][0] = symbol;
			break;
		case "2":
			board[0][1] = symbol;
			break;
		
		case "3":
			board[0][2] = symbol;
			break;
		case "4":
			board[1][0] = symbol;
			break;
		case "5":
			board[1][1] = symbol;
			break;
		case "6":
			board[1][2] = symbol;
			break;
		case "7":
			board[2][0] = symbol;
			break;
		case "8":
			board[2][1] = symbol;
			break;
		case "9":
			board[2][2] = symbol;
			break;
			
			

		default:
			System.out.println("Plese a numbum 1-9");
		
		}
	}

	private static void printBoard(char[][] board) {
		System.out.println(board[0][0] + "|"+ board[0][1]+ "|"+ board[0][2] );
		System.out.println("-+-+-");
		System.out.println(board[1][0] + "|"+ board[1][1]+ "|"+ board[1][2] );
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|"+ board[2][1]+ "|"+ board[2][2] );
	}


}
