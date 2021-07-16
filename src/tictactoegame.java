

public class tictactoegame {
	
	// Creating Board Method

	public static char[] createBoard()
	{	
		//Creating Board with size 10
		char[] board = new char[10];
		
		//Assigning empty space for each value
		for(int i = 1;i < board.length; i++) {
			board[i]= ' ';
		}
			return board;
	}
//Calling Board function  
 public static void main(String[]args) {
	char[] board=createBoard();
  }
}