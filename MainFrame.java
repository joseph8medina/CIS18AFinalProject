MainFrame.Java

package project;
//File I/O
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Date to String Conversion
import java.text.SimpleDateFormat;
import java.util.Date;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Frame
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.toedter.calendar.JCalendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class MainFrame extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtAddress;

	//Creating MainFrame
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Joseph's Mobile Detailing Serivce");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 1, 3, 3));
		
		JCalendar calendar = new JCalendar();
		panel_1.add(calendar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 3, 3, 3));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(4, 3, 2, 2));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(192, 192, 192));
		panel_7.setBorder(null);
		panel_4.add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblDetailPackage = new JLabel("*Detail Package:");
		panel_7.add(lblDetailPackage);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(192, 192, 192));
		panel_8.setBorder(null);
		panel_4.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblCarType = new JLabel("*Car Type:");
		panel_8.add(lblCarType);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(192, 192, 192));
		panel_9.setBorder(null);
		panel_4.add(panel_9);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblHouseCall = new JLabel("*House Call?");
		panel_9.add(lblHouseCall);
		
		JPanel panel_10 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_10.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panel_10.setBorder(null);
		panel_4.add(panel_10);
		
		JRadioButton rdbtnDeluxe = new JRadioButton("Deluxe");
		panel_10.add(rdbtnDeluxe);
		
		JPanel panel_11 = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panel_11.getLayout();
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		panel_11.setBorder(null);
		panel_4.add(panel_11);
		
		JRadioButton rdbtnSedan = new JRadioButton("Sedan");
		panel_11.add(rdbtnSedan);
		
		JPanel panel_12 = new JPanel();
		FlowLayout flowLayout_6 = (FlowLayout) panel_12.getLayout();
		flowLayout_6.setAlignment(FlowLayout.LEFT);
		panel_12.setBorder(null);
		panel_4.add(panel_12);
		
		JCheckBox chckbxHCYes = new JCheckBox("Yes");
		panel_12.add(chckbxHCYes);
		
		JPanel panel_13 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_13.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panel_13.setBorder(null);
		panel_4.add(panel_13);
		
		JRadioButton rdbtnDeluxePlus = new JRadioButton("Deluxe Plus");
		panel_13.add(rdbtnDeluxePlus);
		
		JPanel panel_3 = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) panel_3.getLayout();
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		panel_3.setBorder(null);
		panel_4.add(panel_3);
		
		JRadioButton rdbtnTruck = new JRadioButton("Truck");
		panel_3.add(rdbtnTruck);
		
		JPanel panel_14 = new JPanel();
		FlowLayout flowLayout_7 = (FlowLayout) panel_14.getLayout();
		flowLayout_7.setAlignment(FlowLayout.LEFT);
		panel_14.setBorder(null);
		panel_4.add(panel_14);
		
		JCheckBox chckbxHCNo = new JCheckBox("No");
		panel_14.add(chckbxHCNo);
		
		JPanel panel_15 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_15.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panel_15.setBorder(null);
		panel_4.add(panel_15);
		
		JRadioButton rdbtnDeluxeUltra = new JRadioButton("Deluxe Ultra");
		panel_15.add(rdbtnDeluxeUltra);
		
		JPanel panel_29 = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panel_29.getLayout();
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		panel_29.setBorder(null);
		panel_4.add(panel_29);
		
		JRadioButton rdbtnSUV = new JRadioButton("SUV");
		panel_29.add(rdbtnSUV);
		
		JPanel panel_30 = new JPanel();
		panel_30.setBorder(null);
		panel_4.add(panel_30);
		panel_30.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 2, 1, 1));
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(new Color(192, 192, 192));
		panel_5.add(panel_16);
		
		JLabel lblFirstName = new JLabel("*First Name:");
		panel_16.add(lblFirstName);
		
		JPanel panel_17 = new JPanel();
		panel_5.add(panel_17);
		
		txtFirstName = new JTextField();
		panel_17.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(192, 192, 192));
		panel_5.add(panel_18);
		
		JLabel lblLastName = new JLabel("*Last Name:");
		panel_18.add(lblLastName);
		
		JPanel panel_19 = new JPanel();
		panel_5.add(panel_19);
		
		txtLastName = new JTextField();
		panel_19.add(txtLastName);
		txtLastName.setColumns(10);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(192, 192, 192));
		panel_5.add(panel_20);
		
		JLabel lblAddress = new JLabel("Address (If selected Yes for House Call):");
		panel_20.add(lblAddress);
		
		JPanel panel_21 = new JPanel();
		panel_5.add(panel_21);
		
		txtAddress = new JTextField();
		panel_21.add(txtAddress);
		txtAddress.setColumns(10);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(192, 192, 192));
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.add(panel_6);
		panel_6.setLayout(new GridLayout(4, 1, 0, 1));
		
		JPanel panel_25 = new JPanel();
		panel_25.setBackground(new Color(192, 192, 192));
		panel_6.add(panel_25);
		
		
		//Clear Button Functionality
		JButton btnClear = new JButton("Clear");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Clears Package Type
				rdbtnDeluxe.setSelected(false);
				rdbtnDeluxePlus.setSelected(false);
				rdbtnDeluxeUltra.setSelected(false);
				
				//Clears Car Type
				rdbtnSedan.setSelected(false);
				rdbtnTruck.setSelected(false);
				rdbtnSUV.setSelected(false);
				
				//Clears House Call (Yes or No)
				chckbxHCYes.setSelected(false);
				chckbxHCNo.setSelected(false);
				
				//Clears Text Boxes
				txtFirstName.setText("");
				txtLastName.setText("");
				txtAddress.setText("");
				
			}
		});
		panel_25.add(btnClear);
		
		JPanel panel_26 = new JPanel();
		panel_26.setBackground(new Color(192, 192, 192));
		panel_6.add(panel_26);
		
		//Book Appointment Button Functionality
		JButton btnBookAppt = new JButton("Book Appointment");
		btnBookAppt.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBookAppt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//House Call Yes - Address Needed
				//Deluxe Sedan
				if (rdbtnDeluxe.isSelected() && rdbtnSedan.isSelected() && chckbxHCYes.isSelected()) {

					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe - Sedan - House Call -\nDetails: \n" 
							+ txtAddress.getText() + "\n" + calendar.getDate(), "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				
				//Summary to Text File
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: Yes\n");
					writer.write("Address: " + txtAddress.getText() + "\n");
					writer.write("Package: Deluxe\n");
					writer.write("Car Type: Sedan\n");
					writer.close();
				} 
				catch (IOException a1) {
					a1.printStackTrace();
				}
				}
				
				//Deluxe Truck
				if (rdbtnDeluxe.isSelected() && rdbtnTruck.isSelected() && chckbxHCYes.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe - Truck - House Call -\nDetails: \n" 
							+ txtAddress.getText() + "\n" + calendar.getDate(), "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				//Summary to Text File
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: Yes\n");
					writer.write("Address: " + txtAddress.getText() + "\n");
					writer.write("Package: Deluxe\n");
					writer.write("Car Type: Truck\n");
					writer.close();
				} 
				catch (IOException a2) {
					a2.printStackTrace();
				}
				}
				
				//Deluxe SUV
				if (rdbtnDeluxe.isSelected() && rdbtnSUV.isSelected() && chckbxHCYes.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe - SUV - House Call -\nDetails: \n" 
							+ txtAddress.getText() + "\n" + calendar.getDate(), "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				//Summary to Text File
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: Yes\n");
					writer.write("Address: " + txtAddress.getText() + "\n");
					writer.write("Package: Deluxe\n");
					writer.write("Car Type: SUV\n");
					writer.close();
				} 
				catch (IOException a3) {
					a3.printStackTrace();
				}
				}
				
				//Deluxe-Plus Sedan
				if (rdbtnDeluxePlus.isSelected() && rdbtnSedan.isSelected() && chckbxHCYes.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe Plus - Sedan - House Call -\nDetails: \n" 
							+ txtAddress.getText() + "\n" + calendar.getDate(), "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				//Summary to Text File
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: Yes\n");
					writer.write("Address: " + txtAddress.getText() + "\n");
					writer.write("Package: Deluxe Plus\n");
					writer.write("Car Type: Sedan\n");
					writer.close();
				} 
				catch (IOException b1) {
					b1.printStackTrace();
				}
				}
				
				//Deluxe-Plus Truck
				if (rdbtnDeluxePlus.isSelected() && rdbtnTruck.isSelected() && chckbxHCYes.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe Plus - Truck - House Call -\nDetails: \n" 
							+ txtAddress.getText() + "\n" + calendar.getDate(), "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				//Summary to Text File
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: Yes\n");
					writer.write("Address: " + txtAddress.getText() + "\n");
					writer.write("Package: Deluxe Plus\n");
					writer.write("Car Type: Truck\n");
					writer.close();
				} 
				catch (IOException b2) {
					b2.printStackTrace();
				}
				}
				
				//Deluxe-Plus SUV
				if (rdbtnDeluxePlus.isSelected() && rdbtnSUV.isSelected() && chckbxHCYes.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe Plus - SUV - House Call -\nDetails: \n" 
							+ txtAddress.getText() + "\n" + calendar.getDate(), "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				//Summary to Text File
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: Yes\n");
					writer.write("Address: " + txtAddress.getText() + "\n");
					writer.write("Package: Deluxe Plus\n");
					writer.write("Car Type: SUV\n");
					writer.close();
				} 
				catch (IOException b3) {
					b3.printStackTrace();
				}
				}
				
				//Deluxe-ultra Sedan
				if (rdbtnDeluxeUltra.isSelected() && rdbtnSedan.isSelected() && chckbxHCYes.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe Ultra - Sedan - House Call -\nDetails: \n" 
							+ txtAddress.getText() + "\n" + calendar.getDate(), "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				//Summary to Text File
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: Yes\n");
					writer.write("Address: " + txtAddress.getText() + "\n");
					writer.write("Package: Deluxe Ultra\n");
					writer.write("Car Type: Sedan\n");
					writer.close();
				} 
				catch (IOException c1) {
					c1.printStackTrace();
				}
				}
				
				//Deluxe-Ultra Truck
				if (rdbtnDeluxeUltra.isSelected() && rdbtnTruck.isSelected() && chckbxHCYes.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe Ultra - Truck - House Call -\nDetails: \n" 
							+ txtAddress.getText() + "\n" + calendar.getDate(), "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: Yes\n");
					writer.write("Address: " + txtAddress.getText() + "\n");
					writer.write("Package: Deluxe Ultra\n");
					writer.write("Car Type: Truck\n");
					writer.close();
				} 
				catch (IOException c2) {
					c2.printStackTrace();
				}
				}
				
				//Deluxe-Ultra SUV
				if (rdbtnDeluxeUltra.isSelected() && rdbtnSUV.isSelected() && chckbxHCYes.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe Ultra - SUV - House Call -\nDetails: \n" 
							+ txtAddress.getText() + "\n" + calendar.getDate(), "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: Yes\n");
					writer.write("Address: " + txtAddress.getText() + "\n");
					writer.write("Package: Deluxe Ultra\n");
					writer.write("Car Type: SUV\n");
					writer.close();
				} 
				catch (IOException c3) {
					c3.printStackTrace();
				}
				}
				
				//House Call No - No Address Needed -----------------------------------------------------------------------------
				
				//Deluxe Sedan
				if (rdbtnDeluxe.isSelected() && rdbtnSedan.isSelected() && chckbxHCNo.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe - Sedan - No House Call -\nDetails: \n"
							+ "123 Detail Way, 92555, Moreno Valley CA" + "\n" + calendar.getDate() , "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
					try {
						BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
						//Convert Calendar into String and Write to File
							Date date = calendar.getDate();
							SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
							String strDate = dateFormat.format(date);
						
						writer.write("Appointment Date: " + strDate + "\n");
						writer.write("First Name: " + txtFirstName.getText() + "\n");
						writer.write("Last Name: " + txtLastName.getText() + "\n");
						writer.write("House Call: No\n");
						writer.write("Address: 123 Detail Way, 92555, Moreno Valley CA\n");
						writer.write("Package: Deluxe\n");
						writer.write("Car Type: Sedan\n");
						writer.close();
					} 
					catch (IOException d1) {
						d1.printStackTrace();
					}
				}
				
				//Deluxe Truck	
				if (rdbtnDeluxe.isSelected() && rdbtnTruck.isSelected() && chckbxHCNo.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe - Truck - No House Call -\nDetails: \n"
							+ "123 Detail Way, 92555, Moreno Valley CA" + "\n" + calendar.getDate() , "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: No\n");
					writer.write("Address: 123 Detail Way, 92555, Moreno Valley CA\n");
					writer.write("Package: Deluxe\n");
					writer.write("Car Type: Sedan\n");
					writer.close();
				} 
				catch (IOException d2) {
					d2.printStackTrace();
				}
				}
				
				//Deluxe SUV
				if (rdbtnDeluxe.isSelected() && rdbtnSUV.isSelected() && chckbxHCNo.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe - SUV - No House Call -\nDetails: \n"
							+ "123 Detail Way, 92555, Moreno Valley CA" + "\n" + calendar.getDate() , "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: No\n");
					writer.write("Address: 123 Detail Way, 92555, Moreno Valley CA\n");
					writer.write("Package: Deluxe\n");
					writer.write("Car Type: SUV\n");
					writer.close();
				} 
				catch (IOException d3) {
					d3.printStackTrace();
				}
				}
				
				//Deluxe-Plus Sedan
				if (rdbtnDeluxePlus.isSelected() && rdbtnSedan.isSelected() && chckbxHCNo.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe Plus - Sedan - No House Call -\nDetails: \n"
							+ "123 Detail Way, 92555, Moreno Valley CA" + "\n" + calendar.getDate() , "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: No\n");
					writer.write("Address: 123 Detail Way, 92555, Moreno Valley CA\n");
					writer.write("Package: Deluxe Plus\n");
					writer.write("Car Type: Sedan\n");
					writer.close();
				} 
				catch (IOException e1) {
					e1.printStackTrace();
				}
				}
				
				//Deluxe-Plus Truck
				if (rdbtnDeluxePlus.isSelected() && rdbtnTruck.isSelected() && chckbxHCNo.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe Plus - Truck - No House Call -\nDetails: \n"
							+ "123 Detail Way, 92555, Moreno Valley CA" + "\n" + calendar.getDate() , "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: No\n");
					writer.write("Address: 123 Detail Way, 92555, Moreno Valley CA\n");
					writer.write("Package: Deluxe Plus\n");
					writer.write("Car Type: Truck\n");
					writer.close();
				} 
				catch (IOException e2) {
					e2.printStackTrace();
				}
				}
				
				//Deluxe-Plus SUV
				if (rdbtnDeluxePlus.isSelected() && rdbtnSUV.isSelected() && chckbxHCNo.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe Plus - SUV - No House Call -\nDetails: \n"
							+ "123 Detail Way, 92555, Moreno Valley CA" + "\n" + calendar.getDate() , "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: No\n");
					writer.write("Address: 123 Detail Way, 92555, Moreno Valley CA\n");
					writer.write("Package: Deluxe Plus\n");
					writer.write("Car Type: SUV\n");
					writer.close();
				} 
				catch (IOException e3) {
					e3.printStackTrace();
				}
				}
				
				//Deluxe-Ultra Sedan
				if (rdbtnDeluxeUltra.isSelected() && rdbtnSedan.isSelected() && chckbxHCNo.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe Ultra - Sedan - No House Call -\nDetails: \n"
							+ "123 Detail Way, 92555, Moreno Valley CA" + "\n" + calendar.getDate() , "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: No\n");
					writer.write("Address: 123 Detail Way, 92555, Moreno Valley CA\n");
					writer.write("Package: Deluxe Ultra\n");
					writer.write("Car Type: Sedan\n");
					writer.close();
				} 
				catch (IOException f1) {
					f1.printStackTrace();
				}
				}
				
				//Deluxe-Ultra Truck
				if (rdbtnDeluxeUltra.isSelected() && rdbtnTruck.isSelected() && chckbxHCNo.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe Ultra - Truck - No House Call -\nDetails: \n"
							+ "123 Detail Way, 92555, Moreno Valley CA" + "\n" + calendar.getDate() , "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
					//Convert Calendar into String and Write to File
						Date date = calendar.getDate();
						SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
						String strDate = dateFormat.format(date);
					
					writer.write("Appointment Date: " + strDate + "\n");
					writer.write("First Name: " + txtFirstName.getText() + "\n");
					writer.write("Last Name: " + txtLastName.getText() + "\n");
					writer.write("House Call: No\n");
					writer.write("Address: 123 Detail Way, 92555, Moreno Valley CA\n");
					writer.write("Package: Deluxe Ultra\n");
					writer.write("Car Type: Truck\n");
					writer.close();
				} 
				catch (IOException f2) {
					f2.printStackTrace();
				}				
				}
				
				//Deluxe-Ultra SUV
				if (rdbtnDeluxeUltra.isSelected() && rdbtnSUV.isSelected() && chckbxHCNo.isSelected()) {
					JOptionPane.showMessageDialog(null, txtFirstName.getText() + " " + txtLastName.getText() + " - Deluxe Ultra- SUV - No House Call -\nDetails: \n"
							+ "123 Detail Way, 92555, Moreno Valley CA" + "\n" + calendar.getDate() , "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION);
					try {
						BufferedWriter writer = new BufferedWriter(new FileWriter("Summary"));
						//Convert Calendar into String and Write to File
							Date date = calendar.getDate();
							SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
							String strDate = dateFormat.format(date);
						
						writer.write("Appointment Date: " + strDate + "\n");
						writer.write("First Name: " + txtFirstName.getText() + "\n");
						writer.write("Last Name: " + txtLastName.getText() + "\n");
						writer.write("House Call: No!!\n");
						writer.write("Address: 123 Detail Way, 92555, Moreno Valley CA\n");
						writer.write("Package: Deluxe Ultra\n");
						writer.write("Car Type: SUV\n");
						writer.close();
					} 
					catch (IOException f3) {
						f3.printStackTrace();
					}
				
				//else
					//JOptionPane.showMessageDialog(null, "Empty or Invalid Format! Clear and try again.", "Joseph's Mobile Detailing Service", JOptionPane.OK_CANCEL_OPTION)
			}
			}
		});
		
		panel_26.add(btnBookAppt);
		
		JPanel panel_28 = new JPanel();
		panel_28.setBackground(new Color(192, 192, 192));
		panel_6.add(panel_28);
		
		//Exit Button Functionality
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (JOptionPane.showConfirmDialog(btnExit, "Are you sure you want to exit?", "Joseph's Mobile Detailing Service", JOptionPane.YES_NO_OPTION) == (JOptionPane.YES_NO_OPTION)){
					System.exit(0);
				}
			}
		});
		panel_28.add(btnExit);
	}
}

