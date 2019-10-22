package sudoku;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Sudoku extends JFrame {
    public static void final String INITIAL_BOARD=
    		"8156....4/"+
    	    "6...75.8./"+
    				"....9..../"+
    	    ".4.....2./"+
    				"..623...8/"+
    	    "....5..../"+
    				".5.91...6/"+
    	    "1....7895";
    private SudokuModel _sudokulogic= new SudokuModel(INITIAL_BOARD);
    private SudokuBoardDisplay _sudokuBoard= new SudokuboardDislay(_sudokuLogic);
    
    private JtextFeild _rowTF=new JTextFeild(2);
    private JTextFeild _colTf=new JTextFeild(2);

private jTextfeild _valTF=new JTextFeild(2);
 public Sudoku() {
	 JButton moveBtn=new JButton("Move");
	 controlPanel.setLayout(new FlowLayout());
	 controlPanel.add(new JLabel("Row (1-9):"));
	 controlPanel.add(_rowTF);
	 contrlpanel.add(new JLabel("Col (1-9):"));
	 controlPanel.add(_colTF);
	 controlPanel.add("Val:" );
	 contolPanel.add(_valTF);
	 controlPanel.add(moveBtn);
	 moveBtn.addActionListener(new MoveListener());
	 JPanel content=new JPanel();
	 content.setLayout(new BorderLayout());
	 content.add(contrlPanel, BorderLayout.NORTH);
	 content.add(_sudokuBoard, BorderLayout.CENTER);
	 setContentPane(content);
	 setTitle("Sudoku 3");
	 SetDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setResizable(false);
	 pack();
	 setLocationRelativeTo(null);
 }
 class MoveListener implements ActionListener {
	 public void actionPerformed(ActionEvent ae) {
		 try { 
			 int row=Integer.parseInt(_rowTF.getText().trim())-1 ;
			 int col =Integer.parseInt(_colTF.getText().trim())-1;
			 int val =Integer.parseInt(_valTf.getText().trim());
			 if(_sudokuLogic.isLegalMove(row, col , val)) {
				 _sudokuLogic.setVal(row, col, val);
				 -sudokuBoard.repaint();
				 { 
				 else {
					 JOptionPane.showMesssageDialog(null, "Please enter numeric values.");
					 
				 }
				 }
				 catch(NumberFormatException nfe) {
					 JOptionpane.showMesssageDialog(null,"Please enter numeric values");
					 
				 }
			 }
	 }
    public static void main(String[] args) {
    	new Sudoku().setVisible(true);
    }
	 
	 
 }
}
