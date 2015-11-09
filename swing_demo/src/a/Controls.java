package a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;        

public class Controls extends JPanel
implements ActionListener {
	    protected JButton b1, b2, b3;
	 
	    public Controls() {

	    	//Create and set up the controls
	 
	        b1 = new JButton("Disable middle button");
	        b1.setVerticalTextPosition(AbstractButton.CENTER);
	        b1.setHorizontalTextPosition(AbstractButton.LEADING); //aka LEFT, for left-to-right locales
	        b1.setMnemonic(KeyEvent.VK_D);
	        b1.setActionCommand("disable");
	 
	        b2 = new JButton("Middle button");
	        b2.setVerticalTextPosition(AbstractButton.BOTTOM);
	        b2.setHorizontalTextPosition(AbstractButton.CENTER);
	        b2.setMnemonic(KeyEvent.VK_M);
	 
	        b3 = new JButton("Enable middle button");
	        //Use the default text position of CENTER, TRAILING (RIGHT).
	        b3.setMnemonic(KeyEvent.VK_E);
	        b3.setActionCommand("enable");
	        b3.setEnabled(false);
	 
	        //Listen for actions on buttons 1 and 3.
	        b1.addActionListener(this);
	        b3.addActionListener(this);
	 
	        b1.setToolTipText("Click this button to disable the middle button.");
	        b2.setToolTipText("This middle button does nothing when you click it.");
	        b3.setToolTipText("Click this button to enable the middle button.");
	 
	        //Add Components to this container, using the default FlowLayout.
	        add(b1);
	        add(b2);
	        add(b3);

	        JFrame frame = new JFrame("Controls");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        //Create and set up the content pane.
	        setOpaque(true); //content panes must be opaque
	        frame.setContentPane(this);
	 
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);	        
	    }
	 
	    public void actionPerformed(ActionEvent e) {
	        if ("disable".equals(e.getActionCommand())) {
	            b2.setEnabled(false);
	            b1.setEnabled(false);
	            b3.setEnabled(true);
	        } else {
	            b2.setEnabled(true);
	            b1.setEnabled(true);
	            b3.setEnabled(false);
	        }
	    }
	 
}
