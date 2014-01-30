package org.pvg.plasmagraph.models;

//Class Import Block
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.pvg.plasmagraph.utils.ExceptionHandler;
import org.pvg.plasmagraph.utils.FileUtilities;
import org.pvg.plasmagraph.utils.data.DataFilter;
import org.pvg.plasmagraph.utils.data.DataFilterWindow;
import org.pvg.plasmagraph.utils.data.DataSet;
import org.pvg.plasmagraph.utils.template.Template;

/**
 * Primary Model for the PlasmaGraph product. 
 * Controls the primary JFrame's (MainView) view.
 * Manages MainView's menu option selections, and
 * deals with the modification of the Template, the DataSet, and DataFilter objects.
 * 
 * @author Gerardo A. Navas Morales
 */
public class MainModel {
	// Externally-controlled variables
	/** Reference to MainModel's Template, passed via constructor reference. */
	Template t;
	/** Reference to MainModel's DataSet, passed via constructor reference. */
	DataSet ds;
	/** Reference to MainModel's Template, passed via constructor reference. */
	DataFilter df;
	
	// Internally-controlled variables
	///** Open File selection dialog. Disabled in favor of on-demand JFileChooser creation. */
	//JFileChooser open_file_dialog;
	///** Save File selection dialog. Disabled in favor of on-demand JFileChooser creation. */
	//JFileChooser save_file_dialog;
	
	/**
	 * Creates a new MainModel with references to the data, settings and filter,
	 * as well as creates and updates its respective view.
	 * 
	 * @param t_reference Settings - Template reference provided by PlasmaGraph.
	 * @param ds_reference Data - DataSet reference provided by PlasmaGraph.
	 * @param df_reference Filter - DataFilter reference provided by PlasmaGraph.
	 */
	public MainModel (Template t_reference, DataSet ds_reference, DataFilter df_reference) {
		// Update currently-used Template, Data, and Data Filter Sources.
		t = t_reference;
		ds = ds_reference;
		df = df_reference;
		
		// Prepare FileChooser.
		
	}

	/**
	 * Imports a new Data file to the reference variable this Model contains.
	 * Allows the user to specify the location wherein it will be loaded from.
	 */
	public void importData () {
		// TODO: Set the correct Initial Directory for the JFileChooser!
		// Prepare the JFileChooser for use.
		JFileChooser open_file = new JFileChooser ("./Data/");
		createOpenFileChooser (open_file);
		
		// Prepare the FileFilter
		FileNameExtensionFilter mat_filter = new FileNameExtensionFilter ("Matlab Files", "mat");
		// TODO: Decide if you want to keep "supporting" CSV files.
		FileNameExtensionFilter csv_filter = new FileNameExtensionFilter ("Comma-Separated Value Files", "csv");
		
		// Insert the FileFilter into the JFileChooser
		open_file.addChoosableFileFilter(mat_filter);
		// TODO: Decide if you want to keep "supporting" CSV files.
		open_file.addChoosableFileFilter(csv_filter);
		
		// Open the Dialog!
		int return_value = open_file.showOpenDialog(null);
		
		// Check to see what the user selected, and act on it!
		if (return_value == JFileChooser.APPROVE_OPTION) {
			File f = open_file.getSelectedFile();
			
			if (FileUtilities.getExtension(f).equals (mat_filter.getExtensions()[0])) {
				
				// TODO: Implement Data Reading for MATLAB Files.
				ExceptionHandler.createFunctionNotImplementedException ("MATLAB File Reader");
			
			} else if (FileUtilities.getExtension(f).equals (csv_filter.getExtensions()[0])) {
				
				// TODO: Decide if you want to keep "supporting" CSV files.
				// TODO: Implement Data Reading for CSV Files.
				ExceptionHandler.createFunctionNotImplementedException ("CSV File Reader");
			
			} else {
				ExceptionHandler.createFunctionNotImplementedException ("Other File Readers");
			}
		} else if (return_value == JFileChooser.ERROR_OPTION) {
			ExceptionHandler.createFileSelectionException ("Import Data");
			
		} 
		// "return_value == JFileChooser.CANCEL_OPTION" has no response.
	}

	/**
	 * Imports a new Template file to the reference variable this Model contains.
	 * Allows the user to specify the location wherein it will be loaded from.
	 */
	public void importTemplate () {
		// TODO: Set the correct Initial Directory for the JFileChooser!
		// Prepare the JFileChooser for use.
		JFileChooser open_file = new JFileChooser ("./Templates/");
		createOpenFileChooser (open_file);
		
		// Prepare the FileFilter
		FileNameExtensionFilter template_filter = new FileNameExtensionFilter ("Template Files", "template");
		
		// Insert the FileFilter into the JFileChooser
		open_file.addChoosableFileFilter(template_filter);
		
		// Open the dialog!
		int return_value = open_file.showOpenDialog(null);
		
		// Check to see what the user selected, and act on it!
		if (return_value == JFileChooser.APPROVE_OPTION) {
			File f = open_file.getSelectedFile();
			
			if (FileUtilities.getExtension(f).equals(template_filter.getExtensions()[0])) {
				// Dialog: Ask if overwrite data?
				if (JOptionPane.showConfirmDialog(null, "Do you wish to overwrite the current settings?",
						"Overwrite Template", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					
					// Read the data.
					t = new Template (f);
					
				} else {
					JOptionPane.showMessageDialog(null, "The current settings will not be overwritten.",
							"Overwrite Template - Stopped", JOptionPane.PLAIN_MESSAGE);
				}
				
			} else {
				ExceptionHandler.createFileSelectionException("Template");
			
			}
		} else if (return_value == JFileChooser.ERROR_OPTION) {
			ExceptionHandler.createFileSelectionException ("Template");
		} 
		// "return_value == JFileChooser.CANCEL_OPTION" has no response.
	}
	
	/**
	 * Saves the current status of the Template.
	 * Allows the user to specify the location wherein it will be saved.
	 */
	public void saveTemplate () {
		// TODO: Set the correct Initial Directory for the JFileChooser!
		// Prepare the JFileChooser for use.
		JFileChooser save_file = new JFileChooser ("./Templates/");
		createSaveFileChooser (save_file);
		
		// Prepare the FileFilter
		FileNameExtensionFilter template_filter = new FileNameExtensionFilter ("Template Files", "template");
		
		// Insert the FileFilter into the JFileChooser
		save_file.addChoosableFileFilter(template_filter);
		
		// Open the dialog!
		int return_value = save_file.showSaveDialog(null);
		
		// Check to see what the user selected, and act on it!
		if (return_value == JFileChooser.APPROVE_OPTION) {
			File f = save_file.getSelectedFile();
			
			if (FileUtilities.getExtension(f).equals(template_filter.getExtensions()[0])) {
				// Save the data.
				t.saveTemplate(f);
				
			} else {
				ExceptionHandler.createFileSelectionException("Template");
			
			}
		} else if (return_value == JFileChooser.ERROR_OPTION) {
			ExceptionHandler.createFileSelectionException ("Template");
		} 
		// "return_value == JFileChooser.CANCEL_OPTION" has no response.
	}

	/**
	 * Imports a new DataFilter file to the reference variable this Model contains.
	 * Allows the user to specify the location wherein it will be loaded from.
	 */
	public void importDataFilter () {
		// Prepare the JFileChooser for use.
		JFileChooser open_file = new JFileChooser ("./Filters/");
		createOpenFileChooser (open_file);
		
		// Prepare the FileFilter
		FileNameExtensionFilter data_filter = new FileNameExtensionFilter ("Data Filter Files", "df");
		
		// Insert the FileFilter into the JFileChooser
		open_file.addChoosableFileFilter(data_filter);
		
		// Open the dialog!
		int return_value = open_file.showOpenDialog(null);
		
		// Check to see what the user selected, and act on it!
		if (return_value == JFileChooser.APPROVE_OPTION) {
			File f = open_file.getSelectedFile();
			
			if (FileUtilities.getExtension(f).equals(data_filter.getExtensions()[0])) {
			
				// Dialog: Ask if overwrite data?
				if (JOptionPane.showConfirmDialog(null, "Do you wish to overwrite the current data filter?",
						"Overwrite Data Filter", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					
					// Read the data.
					df = new DataFilter (f);
					
				} else {
					JOptionPane.showMessageDialog(null, "The current data filter will not be overwritten.",
							"Overwrite Data Filter - Stopped", JOptionPane.PLAIN_MESSAGE);
				}
			} else {
				ExceptionHandler.createFileSelectionException ("Data Filter");
			
			}
		} else if (return_value == JFileChooser.ERROR_OPTION) {
			ExceptionHandler.createFileSelectionException ("Import Data Filter");
		} 
		// "return_value == JFileChooser.CANCEL_OPTION" has no response.
	}
	
	/**
	 * Initializes the DataFilterWindow JFrame, and sets it visibility to true.
	 * WARNING: This is not a modal window, which means that there can be issues with
	 * how data is processed. There is NO EXPECTATION OF RETROACTIVE CHANGES; THE USER
	 * MUST REQUEST FOR A NEW IMPORT BEFORE BEING ABLE TO USE THE NEW FILTERS.
	 */
	public void editDataFilter () {
		// Initialize the DataFilterWindow, and get it running!
		DataFilterWindow dfw = new DataFilterWindow (df);
		dfw.setVisible(true);
		//dfw.setAlwaysOnTop(true);
	}

	/**
	 * Saves the current status of the DataFilter.
	 * Allows the user to specify the location wherein it will be saved.
	 */
	public void saveDataFilter () {
		// Prepare the JFileChooser for use.
		JFileChooser save_file = new JFileChooser ("./Filters/");
		createOpenFileChooser (save_file);
		
		// Prepare the FileFilter
		FileNameExtensionFilter data_filter = new FileNameExtensionFilter ("Data Filter Files", "df");
		
		// Insert the FileFilter into the JFileChooser
		save_file.addChoosableFileFilter(data_filter);
		
		int return_value = save_file.showSaveDialog(null);
		
		// Check to see what the user selected, and act on it!
		if (return_value == JFileChooser.APPROVE_OPTION) {
			File f = save_file.getSelectedFile();
			
			if (FileUtilities.getExtension(f).equals(data_filter.getExtensions()[0])) {
				
				// Save the data.
				df.save (f);
			
			} else {
				ExceptionHandler.createFileSelectionException ("Data Filter");
			}
		} else if (return_value == JFileChooser.ERROR_OPTION) {
			ExceptionHandler.createFileSelectionException ("Save Data Filter");
		}
		// "return_value == JFileChooser.CANCEL_OPTION" has no response.
	}
	
	/**
	 * Helper method that automatically performs some edits to an Open-centric
	 * JFileChooser.
	 * TODO: Remove this method and incorporate its process to the initialization, or
	 * do something else with it!
	 * @param open_file JFileChooser object to edit.
	 * @return An edited JFileChooser object.
	 */
	private JFileChooser createOpenFileChooser (JFileChooser open_file) {
		// File Chooser must select any kind of file or directory.
		open_file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		// It can only select one file.
		open_file.setMultiSelectionEnabled(false);
		
		return (open_file);
	}
	
	/**
	 * Helper method that automatically performs some edits to an Save-centric
	 * JFileChooser.
	 * TODO: Remove this method and incorporate its process to the initialization, or
	 * do something else with it!
	 * @param save_file JFileChooser object to edit.
	 * @return An edited JFileChooser object.
	 */
	private JFileChooser createSaveFileChooser (JFileChooser save_file) {
		// File Chooser must select any kind of file or directory.
		save_file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		// It can only select one file.
		save_file.setMultiSelectionEnabled(false);
				
		return (save_file);
	}
	
}
