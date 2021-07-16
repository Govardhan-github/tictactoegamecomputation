

public class tictactoegame {
	
	// Creating Board Method

	public static char Board()
	{	
		//Creating Board with size 10
		char[] Board = new char[10];
		
		//Assigning empty space for each value
		for(int i = 0;i < Board.length; i++) 
			Board[i]= ' ';
		
			return Board();
	}
//Calling Board function  
 public static void main(String[]args) {
	Board();
 
 }
}