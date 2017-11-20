import javax.swing.*;

/**
	Alexander Waters
	Chapter 12 Project
	GUI Application
	The GreetingPanel class displays a greeting in a panel.
*/

public class GreetingPanel extends JPanel
{
	private JLabel greeting;	// To display a greeting

	/**
		Constructor
	*/

	public GreetingPanel()
	{
		// Create the label.
		greeting = new JLabel("Welcome to Alex' Bagel House");

		// Add the label to this panel.
		add(greeting);
	}
}