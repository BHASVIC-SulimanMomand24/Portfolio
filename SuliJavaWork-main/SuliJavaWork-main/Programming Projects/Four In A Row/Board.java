public class Board {
    private final int rows = 0;
    private final int columns = 0;
    private char[][] board = new char[rows][columns];


	public void display() {
        for (int i = 0; i < this.rows; i++) {
            for (int x = 0; x < this.columns; x++)
                System.out.print("|" + this.board[i][x]);
            System.out.println("|");
        }
        System.out.println();
	}

    private int checkVertical() {
        for (int c = 0; c < this.columns; c++)
            for (int r = 0; r < this.rows - 3; r++)
                if (this.board[r][c] != 0 && this.board[r][c] == this.board[r+1][c] && this.board[r+1][c] ==
				this.board[r+2][c] && this.board[r+2][c] == this.board[r+3][c])
                    return this.board[r][c];
        return 0;
    }

    private int checkHorizontal() {
    	for (int r = 0; r < this.rows; r++)
            for (int c = 0; c < this.columns - 3; c++)
                if (this.board[r][c] != 0 && this.board[r][c] == this.board[r][c+1] && this.board[r][c+1] == 
				this.board[r][c+2] && this.board[r][c+2] == this.board[r][c+3])
                    return this.board[r][c];
        return 0;
    }
    
    private int checkRightDiagonal() {
        for (int r = 0; r < this.rows - 3; r++) 
        	for (int c = 0; c < this.columns - 3; c++)
                if (this.board[r][c] != 0 && this.board[r][c] == this.board[r+1][c+1] && this.board[r+1][c+1] == 
				this.board[r+2][c+2] && this.board[r+2][c+2] == this.board[r+3][c+3])
                    return this.board[r][c];
        return 0;
    }
    
    private int checkLeftDiagonal() {
        for (int r = 0; r < this.rows - 3; r++) 
        	for (int c = 0; c < this.columns - 3; c++)
                if (this.board[r][(this.columns - 1) - c] != 0 && this.board[r][(this.columns - 1) - c] == 
				this.board[r+1][(this.columns - 2) - c] && this.board[r+1][(this.columns - 2) - c] == 
				this.board[r+2][(this.columns - 3) - c] && this.board[r+2][(this.columns - 3) - c] == 
				this.board[r+3][(this.columns - 4) - c])
                    return this.board[r][(this.columns - 1) - c];
        return 0;
    }
}