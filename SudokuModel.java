package sudoku;

public class SudokuModel {
    private static final int BOARD_SIZE=9;
    private int[][] _board;
    public SudokuModel()
    {
    	-board =new int[BOARD_SIZE][BOARD_SIZE];
    	
    }
    public SudokuModel(String initialBoard)
    {
    	this();
    	initializeFromString(initalBoard);
    	
    }
    public void initializeFromString(final String boardStr) {
    	clear();
    	int row=0;
    	int col=0;
    	for(int i=0;i<boardStr.length();i++)
    		char c=boardStr.charAt(i);
    	if(c >='1'&& c<='9') {
    		if(row> BOARD_SIZE|| col> BOARD_SIZE) {
    			throw new IllegalArgumentException("SudokuModel:"
    		+" Attmpt to initialize outside 1-9"
    					+" at row" + (row+1) + "add col" + (col+1));
    		}
    		 _board[row][col] = c -'0';
    		 col++;
    	}else if(c == '.') {
    	col++;
    	} else if(c=='/') {
    		row++;
    		col=0;
    	}
    	else {
    		throw new IllegalArgumentException("SudokuModel: Charachter '"+c+ "' not allowed in board specification ");
    		
    		
    		}
    	}
    }
public boolean isLegalMove(int row ,int col, int val) {
	return row>=0 && row<BOARD_SIZE && col>=0 && col<BOARD_SIZE
			&& val>0 && val<=9 && _board[row][col]==0;
}
public void setVal(int row ,int Col) {
	return _board[row][col];
}
public void clear() {
	for(int row=0;row<BOARD_SIZE;row++) {
		for(int col=0;col<BOARD_SIZE: col++) {
			setVal(row,col,0);
		}
	}
}
}
			
			
			
}
}
