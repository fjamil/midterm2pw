package midterm2;
	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.util.Arrays;
	
	public class passwords extends JPanel
	                         

	 implements ActionListener {
	    private static String OK = "ok";
	    private static String HELP = "help";

	    private JFrame controllingFrame; 
	    private JPasswordField passwordField;

	    public passwords(JFrame f) {
	      
	        controllingFrame = f;

	        
	        passwordField = new JPasswordField(10);
	        passwordField.setActionCommand(OK);
	        passwordField.addActionListener(this);

	        JLabel label = new JLabel("Enter the password: ");
	        label.setLabelFor(passwordField);
	        JComponent buttonPane = createButtonPanel()
	        JPanel textPane = new JPanel(new FlowLayout(FlowLayout.TRAILING));
	        textPane.add(label);
	        textPane.add(passwordField);

	        add(textPane);
	        add(buttonPane);
	    }
}
