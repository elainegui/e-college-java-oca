package eCollegeJavaOCA;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Assignment5_1 extends JFrame implements ActionListener {

	// Instance variables
	private JLabel jlblMiles = new JLabel("Miles");
	private JTextField jtfMiles = new JTextField(10);
	private JLabel jlblKMs = new JLabel("Kilometres");
	private JTextField jtfKMs = new JTextField(10);
	private JButton jtbSubmit = new JButton("Submit");
	private JButton jtbClear = new JButton("Clear");
	private JButton jtbExit = new JButton("Exit");

	// Main method
	public static void main(String[] args) {
		Assignment5_1 obj = new Assignment5_1();
	}

	// Constructor
	public Assignment5_1() {
		// Set GridBagLayout in the container.
		setLayout(new GridBagLayout());
		constructGUI();
	}// constructor

	public void constructGUI() {

		// Get a reference to the container
		Container container = getContentPane();

		// Set the background colour of the container to yellow.
		container.setBackground(Color.yellow);

		// Create a GridBagConstraints object.
		GridBagConstraints gbConstraints = new GridBagConstraints();

		gbConstraints.fill = GridBagConstraints.BOTH;
		gbConstraints.anchor = GridBagConstraints.CENTER;

		// **************************************************************************

		// Row 0 of the container
		// Set parameters
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 0;
		gbConstraints.gridwidth = 1;
		gbConstraints.gridheight = 1;
		gbConstraints.weightx = 1;
		gbConstraints.weighty = 1;

		gbConstraints.insets = new Insets(5, 5, 0, 0);

		// Add component to the container subject to the specified GridBagConstraints.
		container.add(jlblMiles, gbConstraints);

		// **************************************************************************

		// **************************************************************************

		// Row 0 of the container
		// Set parameters
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 0;
		gbConstraints.gridwidth = 1;
		gbConstraints.gridheight = 1;
		gbConstraints.weightx = 1;
		gbConstraints.weighty = 1;

		// Add component to the container subject to the specified GridBagConstraints.
		container.add(jtfMiles, gbConstraints);

		// **************************************************************************

		// **************************************************************************

		// Row 1 of the container
		// Set parameters
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 1;
		gbConstraints.gridwidth = 1;
		gbConstraints.gridheight = 1;
		gbConstraints.weightx = 1;
		gbConstraints.weighty = 1;

		// **
		gbConstraints.insets = new Insets(5, 5, 0, 0);

		// Add component to the container subject to the specified GridBagConstraints.
		container.add(jlblKMs, gbConstraints);

		// **************************************************************************

		// **************************************************************************

		// Row 1 of the container
		// Set parameters
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 1;
		gbConstraints.gridwidth = 1;
		gbConstraints.gridheight = 1;
		gbConstraints.weightx = 1;
		gbConstraints.weighty = 1;

		jtfKMs.setEditable(false);

		// Add component to the container subject to the specified GridBagConstraints.
		container.add(jtfKMs, gbConstraints);

		// **************************************************************************

		// **************************************************************************

		// Row 2 of the container
		// Set parameters
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 2;
		gbConstraints.gridwidth = 1;
		gbConstraints.gridheight = 1;
		gbConstraints.weightx = 1;
		gbConstraints.weighty = 1;

		// **
		gbConstraints.insets = new Insets(5, 5, 5, 5);

		// Set a tool tip message for the button
		jtbSubmit.setToolTipText("Press to submit entry");

		// Set a mnemonic for the button
		jtbSubmit.setMnemonic(KeyEvent.VK_S);

		// Set an actionlistener for the button
		jtbSubmit.addActionListener(this);

		// Add component to the container subject to the specified GridBagConstraints.
		container.add(jtbSubmit, gbConstraints);

		// **************************************************************************

		// **************************************************************************

		// Row 2 of the container
		// Set parameters
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 2;
		gbConstraints.gridwidth = 1;
		gbConstraints.gridheight = 1;
		gbConstraints.weightx = 1;
		gbConstraints.weighty = 1;

		// Set a tool tip message for the button
		jtbClear.setToolTipText("Press to clear the fields");

		// Set a mnemonic for the button
		jtbClear.setMnemonic(KeyEvent.VK_C);

		// Set an actionlistener for the button
		jtbClear.addActionListener(this);

		// Add component to the container subject to the specified GridBagConstraints.
		container.add(jtbClear, gbConstraints);

		// **************************************************************************

		// **************************************************************************

		// Row 2 of the container
		// Set parameters
		gbConstraints.gridx = 2;
		gbConstraints.gridy = 2;
		gbConstraints.gridwidth = 1;
		gbConstraints.gridheight = 1;
		gbConstraints.weightx = 1;
		gbConstraints.weighty = 1;

		// Set a tool tip message for the button
		jtbExit.setToolTipText("Press to exit application");

		// Set a mnemonic for the button
		jtbExit.setMnemonic(KeyEvent.VK_E);

		// Set an actionlistener for the button
		jtbExit.addActionListener(this);

		// Add component to the container subject to the specified GridBagConstraints.
		container.add(jtbExit, gbConstraints);

		// **************************************************************************

		// Frame attributes
		this.setTitle("Miles to KM's Conversion App");
		this.setSize(370, 160);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}// method

	@Override
	public void actionPerformed(ActionEvent e) {
		float noOfMilesEntered;
		float milesToKMsConverted;
		final float milesToKM = 1.60934f;

		if (e.getSource() == jtbSubmit) {
			try {
				noOfMilesEntered = Float.parseFloat(jtfMiles.getText());
				milesToKMsConverted = noOfMilesEntered * milesToKM;
				jtfKMs.setText(String.valueOf(milesToKMsConverted));
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Numeric entries only!", "Distance Conversion App",
						JOptionPane.ERROR_MESSAGE);
			}
		} else if ((e.getSource() == jtbClear)) {
			jtfMiles.setText("");
			jtfKMs.setText("");
		} else if ((e.getSource() == jtbExit)) {
			System.exit(0);
		}
	}// method

}// class

