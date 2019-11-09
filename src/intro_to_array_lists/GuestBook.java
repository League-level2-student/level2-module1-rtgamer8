package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	ArrayList<String> names = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
		// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
		// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
		// all the names added to the list. Format the list as follows:
		
		GuestBook book = new GuestBook();
		book.run();
	}

	
	public void run() {

		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		
		
		button1.setText("add name");
		button2.setText("view names");
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
		
		
		//frame.pack();
		
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == button1) {
			String name =JOptionPane.showInputDialog("Please enter a name to add");
			names.add(name);
		}
		String output = "";
		if (buttonClicked == button2) {
			for(int i = 0; i < names.size(); i++){
				String s = names.get(i);
				output +=  "" + "guest #" +(i+1) +": " + s + "\n";
				
				
			}
			
			JOptionPane.showMessageDialog(null, output  );
		}
		
	}
	}
