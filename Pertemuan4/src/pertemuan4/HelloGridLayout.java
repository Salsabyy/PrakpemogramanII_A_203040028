//package pertemuan4;
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//
//public class HelloGridLayout extends JFrame implements ActionListener {
//	private JButton buttonA;
//	private JButton buttonB;
//	private JButton buttonC;
//	private JButton buttonD;
//	private JButton buttonE;
//	private JButton buttonF;
//	private JButton buttonG;
//	private JButton buttonH;
//	private JButton buttonI;
//	
//	private JButton[] buttons;
//	private boolean gameOver;
//	
//	public HelloGridLayout() {
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		gameOver = false;
//		
//		buttonA = new JButton("");
//		buttonB = new JButton("");
//		buttonC = new JButton("");
//		buttonD = new JButton("");
//		buttonE = new JButton("");
//		buttonF = new JButton("");
//		buttonG = new JButton("");
//		buttonH = new JButton("");
//		buttonI = new JButton("");
//		
//		buttons = new JButton[9];
//		buttons[0] = buttonA;
//		buttons[1] = buttonB;
//		buttons[2] = buttonC;
//		buttons[3] = buttonD;
//		buttons[4] = buttonE;
//		buttons[5] = buttonF;
//		buttons[6] = buttonG;
//		buttons[7] = buttonH;
//		buttons[8] = buttonI;
//		
//		buttonA.addActionListener(this);
//		buttonB.addActionListener(this);
//		buttonC.addActionListener(this);
//		buttonD.addActionListener(this);
//		buttonE.addActionListener(this);
//		buttonF.addActionListener(this);
//		buttonG.addActionListener(this);
//		buttonH.addActionListener(this);
//		buttonI.addActionListener(this);
//		
//		this.setLayout(new GridLayout(3, 3));
//		
//		this.add(buttonA);
//		this.add(buttonB);
//		this.add(buttonC);
//		this.add(buttonD);
//		this.add(buttonE);
//		this.add(buttonF);
//		this.add(buttonG);
//		this.add(buttonH);
//		this.add(buttonI);
//		
//		this.setSize(300, 300);	
//	}
//	public void actionPerformed(ActionEvent e) {
//		if (!gameOver)
//		{
//			JButton button = (JButton) e.getSource();
//			if (button.getText().isEmpty())
//			{
//				button.setText("0");
//				checkWinner();
//				if (!gameOver);
//				{
//					for(int i = 0; i < buttons.length; i++)
//					{
//						if(buttons[i].getText().isEmpty())
//						{
//							buttons[i].setText("x");
//							break;
//						}
//					}
//					checkWinner();
//				}
//			}
//		}
//	}
//	private void checkWinner()
//	{
//		String Winner = "";
//		if (!buttonA.getText().isEmpty()
//				&& buttonA.getText().equals(buttonB.getText())
//				&& buttonA.getText().equals(buttonC.getText()))
//				{
//			Winner = buttonA.getText();
//			buttonA.setForeground(Color.pink);
//			buttonB.setForeground(Color.pink);
//			buttonC.setForeground(Color.pink);
//			
//			}else if (!buttonD.getText().isEmpty())
////				&& buttonD.getText().equals(buttonE.getText())
//				buttonD.getText().equals(buttonE.getText());
//				buttonD.getText().equals(buttonF.getText());
////				&& buttonD.getText().equals(buttonF.getText()))
//			{
//				Winner = buttonD.getText();
//				buttonD.setForeground(Color.pink);
//				buttonE.setForeground(Color.pink);
//				buttonF.setForeground(Color.pink);
//			}if (!buttonG.getText().isEmpty())
//				buttonG.getText().equals(buttonH.getText());
//				buttonG.getText().equals(buttonI.getText());
//			{
//				Winner = buttonG.getText();
//				buttonG.setForeground(Color.pink);
//				buttonH.setForeground(Color.pink);
//				buttonI.setForeground(Color.pink);
//			}else if (!buttonA.getText().isEmpty())
//				buttonA.getText().equals(buttonD.getText());
//				buttonA.getText().equals(buttonG.getText());
//			{
//				Winner = buttonA.getText();
//				buttonA.setForeground(Color.pink);
//				buttonD.setForeground(Color.pink);
//				buttonG.setForeground(Color.pink);
//			}else if (!buttonB.getText().isEmpty()
//				&& buttonB.getText().equals(buttonE.getText())
//				&& buttonB.getText().equals(buttonH.getText()))
//			{
//				Winner = buttonB.getText();
//				buttonB.setForeground(Color.pink);
//				buttonE.setForeground(Color.pink);
//				buttonH.setForeground(Color.pink);
//			}else if (!buttonC.getText().isEmpty()
//				&& buttonC.getText().equals(buttonF.getText())
//				&& buttonC.getText().equals(buttonI.getText()))
//			{
//				Winner = buttonC.getText();
//				buttonC.setForeground(Color.pink);
//				buttonF.setForeground(Color.pink);
//				buttonI.setForeground(Color.pink);
//			}else if (!buttonA.getText().isEmpty()
//				&& buttonA.getText().equals(buttonE.getText())
//				&& buttonA.getText().equals(buttonI.getText()))
//			{
//				Winner = buttonA.getText();
//				buttonA.setForeground(Color.pink);
//				buttonE.setForeground(Color.pink);
//				buttonI.setForeground(Color.pink);
//			}else if(!buttonC.getText().isEmpty()
//				&& buttonA.getText().equals(buttonE.getText())
//				&& buttonA.getText().equals(buttonG.getText()))
//			{
//				Winner = buttonC.getText();
//				buttonC.setForeground(Color.pink);
//				buttonE.setForeground(Color.pink);
//				buttonG.setForeground(Color.pink);
//			}
//			
//			gameOver = !Winner.isEmpty();
//			
//	}
//			public static void main(String[]args) {
//				javax.swing.SwingUtilities.invokeLater(new Runnable() {
//					public void run() {
//						HelloGridLayout h = new HelloGridLayout();
//						h.setVisible(true);
//					}
//				});
//			}
//			
//}