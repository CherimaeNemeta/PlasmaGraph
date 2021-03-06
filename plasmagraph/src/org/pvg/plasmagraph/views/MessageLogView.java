package org.pvg.plasmagraph.views;

/**
 * 
 * @author Plasma Visualization Group
 */
@SuppressWarnings ("serial")
public class MessageLogView extends javax.swing.JFrame {

	/**
	 * Creates new form MessageLogView
	 * @param toString String to put in jTextArea1.
	 */
	public MessageLogView () {
		
		initComponents ();
		
	}
	
	public void appendToTextArea (String text) {
		this.message_log_text_area.append (text + System.lineSeparator ());
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents () {
		this.setTitle ("PlasmaGraph Message Log");

		message_log_scroll_pane = new javax.swing.JScrollPane ();
		message_log_text_area = new javax.swing.JTextArea ();

		setDefaultCloseOperation (javax.swing.WindowConstants.EXIT_ON_CLOSE);

		message_log_text_area.setEditable (false);
		message_log_text_area.setColumns (20);
		message_log_text_area.setRows (5);
		message_log_scroll_pane.setViewportView (message_log_text_area);
		
		message_log_text_area.setLineWrap (true);
		message_log_text_area.setWrapStyleWord (true);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout (
				getContentPane ());
		getContentPane ().setLayout (layout);
		layout.setHorizontalGroup (layout.createParallelGroup (
				javax.swing.GroupLayout.Alignment.LEADING).addComponent (
						message_log_scroll_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 680,
				Short.MAX_VALUE));
		layout.setVerticalGroup (layout.createParallelGroup (
				javax.swing.GroupLayout.Alignment.LEADING).addComponent (
						message_log_scroll_pane, javax.swing.GroupLayout.DEFAULT_SIZE, 228,
				Short.MAX_VALUE));

		this.setLocation (360, 460);
		pack ();
	}

	// Variables declaration - do not modify
	private javax.swing.JScrollPane message_log_scroll_pane;
	private javax.swing.JTextArea message_log_text_area;
	// End of variables declaration
}
