package project;
import java.awt.*;

//The purpose of this program is to demonstrate how to use JFrame and JCalendar to create
//a Booking System for a hypotherical Mobile Detailing Service. This program implements 
//Window Builder to build our Graphical User Interface, different buttons, and checkboxes.
//The user is able to choose from 3 different package types, 3 different car types, and whether
//the user wants a house call or not. There are also 3 buttons where the user can clear the form,
//book the appointment which also writes to a txt file summarizing the appointment, and an exit button
//that exits the program.

//Launching MainFrame and Writing to File
public class MFDemo {
	public static void main(String[] args) {
	
		//Launches MainFrame
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
