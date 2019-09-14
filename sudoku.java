/**
 * 
 * @author Sourav Bera
 * @email: sauravberachinmaya3@gmail.com
 *
 */
import java.util.Scanner;
 public class Sudoku {
	private static int sudoku[][];
	private static int sudokugrid[][];
	private static int n=9;
    private static int loc[][];
	public static void sudokugenerator()
	{
		int a,b,c;
		int l,j,k;
		sudoku[0][0]= (int)(1+(Math.random()*(8)+1));
		sudoku[3][3]= (int)(1+(Math.random()*(8)+1));
		sudoku[6][6]= (int)(1+(Math.random()*(8)+1));
		for( a=0,b=3,c=6;a<=3;a++,b++,c++)
		{ for( l=0,j=3,k=6;l<=3;l++,j++,k++)
			{  sudoku[a][l]= (int)(1+(Math.random()*(8)+1));
				while(checkbox(a,l)==true)
				{sudoku[a][l]= (int)(1+(Math.random()*(8)+1));
					
				}
                while(checkbox(b,j)==true)
				{sudoku[b][j]= (int)(1+(Math.random()*(8)+1));
					
				}
                while(checkbox(c,k)==true)
				{sudoku[c][k]= (int)(1+(Math.random()*(8)+1));
					
				}
			}
		}
		for(int i=0;i<=8;i++) {
			for(int n=0;n<=8;n++)
			{
					if((i>=0 && i<=2 && n>=0 && n<=2)||(i>=3 && i<=5 && n>=3 && n<=5)||(i>=6 && i<=8 && n>=6 && n<=8))
						while(issuitable(i ,j ,sudoku[i][j])==true)
						{	
							
							sudoku[i][j]= (int)(1+(Math.random()*(8)+1));
						}
			}
		}
        for(int i=0;i<=8;i++) {
			for(int j=0;j<=8;j++)
			{

                 sudokugrid[i][j]=sudoku[i][j];
            }
        }
        int count=0,m=0;
        while(count<=37)
        {
          int i = (int)(Math.random ()*(8)+1);
          int j = (int)(Math.random ()*(8)+1);
            sudokugrid[i][j]=0;
            loc[m][0]=i;
            loc[m++][1]=j;
            count++;
        }
	}
	public static boolean checkbox(int i ,int j)
	{
			for(int ii=0;ii<=3;ii++)
			{ for(int jj=0;jj<=3;jj++)
				{
					if(sudoku[i][j]==sudoku[ii][jj])
					{
						return false;
					}
				}
			} return true;
			
	}
	public static boolean game()
    {
        for(int i=0;i<=37;i++)
        {
            Scanner Sc=new Scanner(System.in);
            sudokugrid[loc[i][0]][loc[i][1]]=Sc.nextInt();

        }
         for(int i=0;i<=8;i++) {
			for(int j=0;j<=8;j++)
			{
                if(sudokugrid[i][j]==sudoku[i][j])
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
        
        if(game())
        {
            System.out.println("***************Congratulations you won***************");

        }
        else
        {
            System.out.println("------------------Sorry you Lost-----------------------");
        }
	}
	
	
	public static void solve() {
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

	public static boolean issuitable(int i,int j,int x)
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
	public static boolean backtracksolve() {
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
		if(!isThereEmptyCell) {
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
