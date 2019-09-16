# SUDOKU GAME:+1: :rocket: :sparkles:

*The word Sudoku is Japanese and is composed of two parts: Su- meaning ‘number’, and Doku- meaning ‘single’. Rightfully so, as Sudoku is a puzzle where the objective is to fill a 9×9 square grid with digits numbered 1 to 9, so that each column, each row, and each of the nine 3×3 sub-grids contains all of the digits, but absolutely NO duplicates. The puzzle starts out partially filled in i.e some of the numbers are given to you as a starting point as shown for example above. It’s quite the mentally stimulating game and is often featured in newspapers, right beside the crossword.*


*we can get to the meat of the code. The function below is the BFS algorithm with backtracking and is responsible for solving the Sudoku puzzle perfectly. As can be seen below, the function is recursive; each time it is called, it is handling a single cell at a time; whichever one has not been assigned yet. For that particular cell, we loop through all possible digits from 1 to 9 and try them out. If a digit is valid for that cell, we move on to the next unassigned cell. If we find that for a particular cell that there are no valid digits, then we return false, then backtrack, incriminating the digit in the previous cell and trying again. If we are able to assign a valid number to every cell in the grid i.e the array is totally full, then the recursive algorithm will return true, jumping out of all the recursive loops having filled in the whole grid with valid numbers.*

https://medium.com/@george.seif94/solving-sudoku-using-a-simple-search-algorithm-3ac44857fee8 -lnk Algo [algo for sudoku solver](https://medium.com/@george.seif94/solving-sudoku-using-a-simple-search-algorithm-3ac44857fee8)

![200x160](https://miro.medium.com/max/260/1*j4YPhOorjY2_bzcmEZWl3A.gif)
 

# rules
 - [x] in the 9x9 grid enter vales between 1 to 9 only
 -  [x] make sure no 3x3 subgrid have anuy numbert repeated between 1to 9
  -  [x] make sure no element in the row has any number repeated between 1to 9
   - [x]  make sure no element in the column has any number repeated between 1to 9
 

# controls
  -  [x] **Enter number from 1-9 only** *1 and 9 inclusive*
  - [x]  **click on the number to be inputed **
  - [x]  **enter the digits in order of their blank spaces **
  - [x]  **press enter to proceed and check**
  
  
# Screensorts
  -![](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgaba5d97JAAFR49X6a2tHOZ5MiqvJc7onDdnBWgFNUc7ER0K7vN47yKS7)
  -![](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRxUSfLBU4tgQ0XV4nI9EPuvQSGjYKUpxmk9lHXybKcpGWCvYYK)
# Dopwnload link(for 32Bit or 64Bit)
  - [x]  choose the medium of download(user recommended download.zip)
  
