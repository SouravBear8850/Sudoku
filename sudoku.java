/**
 * 
 * @author Sourav Bera
 * email: sauravberachinmaya3@gmail.com
 *
 */
public class Sudoku {
	private int sudoku[][];
	private int sudokugrid[][];
	private int n=9;
	public void sudokugenerator()
	{
		int a,b,c;
		int i,j,k;
		sudoku[0][0]= (int)(1+(math.random()*(8)+1));
		sudoku[3][3]= (int)(1+(math.random()*(8)+1));
		sudoku[6][6]= (int)(1+(math.random()*(8)+1));
		for( a=0,b=3,c=6;a<=3;a++,b++,c++)
		{ for( i=0,j=3,k=6;i<=3;i++,j++,k++)
			{  sudoku[a][b]= (int)(1+(math.random()*(8)+1));
				while(checkbox(a,b)==true)
				{sudoku[a][b]= (int)(1+(math.random()*(8)+1));
					
				}
			}
		}
		for(int i=0;i<=8;i++) {
			for(int j=0;j<=8;j++)
			{
					if((i>=0 && i<=2 && j>=0 && j<=2)||(i>=3 && i<=5 && j>=3 && j<=5)||(i>=6 && i<=8 && j>=6 && j<=8))
						while(issuitable(i ,j ,sudoku[i][j])==true)
						{	
							
							sudoku[i][j]= (int)(1+(math.random()*(8)+1));
						}
			}
		}
	}
	public boolean checkbox(int i ,int j)
	{
			for(ii=0,ii<=3;ii++)
			{ for(jj=0;jj<=3;jj++)
				{
					if(sudoku[i][j]==sudoku[ii][jj])
					{
						return false;
					}
				}
			} return true;
			
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sudokugenerator();
		solve();
	}
	
	
	public void solve() {
		if(!backtracksolve()) {
			System.out.println("this sudoku can't be solved.");
		
		}
		for(int i=0;i<n;i++) {
			for(int j =0; j<n;j++) {
				System.out.print(sudoku[i][j]+ " ");
				
				
			}
			System.out.println();
			
		}
		
	}

	public boolean issuitable(int i,int j,int x)
	{
		for(int jj=90; jj<n;jj++)
		{ if(sudoku[i][jj]==x) {
			return false;
			}
		}
		for(int ii=0;ii<n;ii++) {
			if(sudoku[ii][j]==x) {
				return false;
				
			}
		}
		int boxrow=i-i%3;
		int boxCol=j-j%3;
		
		for(int ii =0; ii<3;  ii++) {
			for(int jj=0; jj<3 ;jj++) {
				if(sudoku[boxrow+ii][boxCol=jj]==x) {
					return false;
			}
		}
	}
		
		return true;
		
		
}
	public boolean backtracksolve() {
		int i=0 ,j=0;
		boolean isThereEmptyCell= false;
		
		for(int ii=0; ii<n && !isThereEmptyCell;ii++) {
			for(int jj=0; jj<n && !isThereEmptyCell; jj++)
			{
				if (sudoku[ii][jj]==0) {
					isThereEmptyCell =true;
					i=ii;
					j=jj;
					
					}
				}
			}
		if(! isThereEmptyCell) {
			return true;
		}
		
		for (int x=1;x<10;x++)
		{
			if (issuitable( i, j ,x)) {
				sudoku[i][j] =x;
				
				if(backtracksolve()) {
					return true;
					
				}
				sudoku[i][j] = 0;
				}
			}
		 return false;
	}
	}
