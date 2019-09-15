#Sudoku solver function
def print_sudoku():
    for i in sudoku:
        print(i)


 def number_unassigned(row , col):
     num-unassign = 0
     for i in range(0.SIZE):  
         if sudoku[r][i]==n :
             return False
      for i in range(0,SIZE):
             if sudoku[i][j]==n:    
                 return False
    for i in range(0,SIZE):
        if sudoku[i][c] ==n:
            return False
            row_start =(r//3)*3
            col_start =(r//3)*3
            #checking 3x3 grid
            for i in range(row_start,row_start+3):
                for j in range(col_start,col_start+3):
                    if matrix[i][j]==n:
                        return False
             return True

#function to check if we can put a
#value in a paticular cell or not
  def solve_sudoku():
        row=0
        col=0
       a = number_unassigned(row,col)
       if a[2] == 0:
           return True
        row=a[0]
        col=a[1]
        for i in range(1,10):
         #if we can assign i to the cell or not
        #the cell is matrix[row][col]
         if is_safe(i ,row ,col):
               sudoku[row][col]=i
                        #backtracking
            if solve_sudoku():
                return True
     #f we can't proceed with this solution
     #reassign the cell
     sudoku[row][col]=0
return False

if solve_sudoku():
     print_sudoku()
else:
    print("No Solution")

