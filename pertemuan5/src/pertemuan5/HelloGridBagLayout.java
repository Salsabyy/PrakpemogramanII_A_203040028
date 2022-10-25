package pertemuan5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloGridBagLayout extends JFrame{
	
	public HelloGridBagLayout() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel headerLabel = new JLabel("Layout in action: GridBagLayout",JLabel.CENTER);
		
		JPanel controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		panel.setSize(300,300);
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridx = 0;
		panel.add (new JButton("button 1"),gbc);
		
		gbc.gridx = 1;
		gbc.gridx = 0;
		panel.add (new JButton("button 2"),gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 20;
		gbc.gridx = 0;
		gbc.gridx = 1;
		panel.add (new JButton("button 3"),gbc);
		
		gbc.gridx = 1;
		gbc.gridx = 1;
		panel.add (new JButton("button 4"),gbc);
		
		gbc.gridx = 0;
		gbc.gridx = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 2;
		panel.add (new JButton("button 5"),gbc);
		
		controlPanel.add(panel);
		
		this.setLayout(new GridLayout(2,1));
		this.add(headerLabel);
		this.add(controlPanel);
		this.setSize(400,400);
	}
	
	public static void main (String[]args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				HelloGridBagLayout h = new HelloGridBagLayout();
				h.setVisible(true);
			}
		});
	}
}
