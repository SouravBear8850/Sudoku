package sudoku3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;

public class Sudoku1 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private final JTextField textField_7 = new JTextField();
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sudoku1 dialog = new Sudoku1();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sudoku1() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			textField_4 = new JTextField();
			contentPanel.add(textField_4);
			textField_4.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_1 = new JTextField();
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		contentPanel.add(textField_7);
		textField_7.setColumns(10);
		{
			textField_8 = new JTextField();
			textField_8.setColumns(10);
			contentPanel.add(textField_8);
		}
		{
			textField_6 = new JTextField();
			contentPanel.add(textField_6);
			textField_6.setColumns(10);
		}
		{
			textField_5 = new JTextField();
			contentPanel.add(textField_5);
			textField_5.setColumns(10);
		}
		{
			textField_11 = new JTextField();
			textField_11.setColumns(10);
			contentPanel.add(textField_11);
		}
		{
			textField_12 = new JTextField();
			textField_12.setColumns(10);
			contentPanel.add(textField_12);
		}
		{
			textField_10 = new JTextField();
			textField_10.setColumns(10);
			contentPanel.add(textField_10);
		}
		{
			textField_9 = new JTextField();
			textField_9.setColumns(10);
			contentPanel.add(textField_9);
		}
		{
			textField_15 = new JTextField();
			textField_15.setColumns(10);
			contentPanel.add(textField_15);
		}
		{
			textField_14 = new JTextField();
			textField_14.setColumns(10);
			contentPanel.add(textField_14);
		}
		{
			textField_16 = new JTextField();
			contentPanel.add(textField_16);
			textField_16.setColumns(10);
		}
		{
			textField_13 = new JTextField();
			textField_13.setColumns(10);
			contentPanel.add(textField_13);
		}
		{
			textField = new JTextField();
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			textField_19 = new JTextField();
			textField_19.setColumns(10);
			contentPanel.add(textField_19);
		}
		{
			textField_20 = new JTextField();
			textField_20.setColumns(10);
			contentPanel.add(textField_20);
		}
		{
			textField_18 = new JTextField();
			textField_18.setColumns(10);
			contentPanel.add(textField_18);
		}
		{
			textField_17 = new JTextField();
			contentPanel.add(textField_17);
			textField_17.setColumns(10);
		}
		{
			textField_22 = new JTextField();
			textField_22.setColumns(10);
			contentPanel.add(textField_22);
		}
		{
			textField_24 = new JTextField();
			textField_24.setColumns(10);
			contentPanel.add(textField_24);
		}
		{
			textField_23 = new JTextField();
			textField_23.setColumns(10);
			contentPanel.add(textField_23);
		}
		{
			textField_21 = new JTextField();
			textField_21.setColumns(10);
			contentPanel.add(textField_21);
		}
		{
			textField_25 = new JTextField();
			textField_25.setColumns(10);
			contentPanel.add(textField_25);
		}
		{
			textField_29 = new JTextField();
			textField_29.setColumns(10);
			contentPanel.add(textField_29);
		}
		{
			textField_27 = new JTextField();
			textField_27.setColumns(10);
			contentPanel.add(textField_27);
		}
		{
			textField_26 = new JTextField();
			contentPanel.add(textField_26);
			textField_26.setColumns(10);
		}
		{
			textField_33 = new JTextField();
			textField_33.setColumns(10);
			contentPanel.add(textField_33);
		}
		{
			textField_30 = new JTextField();
			textField_30.setColumns(10);
			contentPanel.add(textField_30);
		}
		{
			textField_31 = new JTextField();
			textField_31.setColumns(10);
			contentPanel.add(textField_31);
		}
		{
			textField_36 = new JTextField();
			textField_36.setColumns(10);
			contentPanel.add(textField_36);
		}
		{
			textField_32 = new JTextField();
			textField_32.setColumns(10);
			contentPanel.add(textField_32);
		}
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		contentPanel.add(textField_37);
		{
			textField_34 = new JTextField();
			textField_34.setColumns(10);
			contentPanel.add(textField_34);
		}
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		contentPanel.add(textField_40);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		contentPanel.add(textField_39);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		contentPanel.add(textField_38);
		{
			textField_35 = new JTextField();
			textField_35.setColumns(10);
			contentPanel.add(textField_35);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(null);
			{
				textField_28 = new JTextField();
				textField_28.setBounds(211, 6, 86, 20);
				textField_28.setColumns(10);
				buttonPane.add(textField_28);
			}
			{
				JButton okButton = new JButton("table");
				okButton.setBounds(302, 5, 57, 23);
				buttonPane.add(okButton);
				okButton.setActionCommand("OK");
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setBounds(364, 5, 65, 23);
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
