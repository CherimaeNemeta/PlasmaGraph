package org.pvg.plasmagraph.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.SwingWorker;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.pvg.plasmagraph.models.DataSetModel;
import org.pvg.plasmagraph.utils.ExceptionHandler;
import org.pvg.plasmagraph.views.DataSetView;

/**
 * Controller for the data set modification pane, DataSetView.
 * Controls a JPanel embedded into MainView's JTabbedPane, and
 * allows for communication between its View and Model.
 * 
 * @author Gerardo A. Navas Morales
 */
public class DataSetController {
    // Externally-contained variables.
    /** Reference to model related to this controller. */
    DataSetModel data_model;
    /** Reference to view related to this controller. */
    DataSetView data_view;
    
    public DataSetController (DataSetModel data_model, DataSetView data_view) {
        // Set related objects into proper positions in object.
        this.data_model = data_model;
        this.data_view = data_view;
        
        // Automatically add listeners to Data Set Tab via view.
        // Update Template or DataReference Listeners
        data_view.addChartTypeListener (new ChartTypeListener ());
        //data_view.addGroupByListener (new GroupByListener ());
        data_view.addGroupByColumnListener (new GroupByColumnListener ());
        data_view.addAddButtonListener (new AddButtonListener ());
        data_view.addRemoveButtonListener (new RemoveButtonListener ());
        // Update View Listener
        data_model.addTemplateChangeListener (new DataViewTemplateListener ());
        data_model.addHeaderDataChangeListener (new DataViewHeaderDataListener ());
        data_model.addDataReferenceChangeListener (new DataViewReferenceListener ());
    }
    
    /**
     * Listener for the "chart_type" JComboBox part of the DataSetView.
     * Relies on ActionListener to manage messages.
     * 
     * @author Gerardo A. Navas Morales
     */
    class ChartTypeListener implements ActionListener {
        
        /**
         * Calls a DataSetModel method to change the chart type on the Template.
         */
        @Override
        public void actionPerformed (ActionEvent arg0) {
            try {
				data_model.getTemplate ().setChartType 
						(data_view.getSelectedChartType ());
			} catch (Exception e) {
				// TODO Throw a Dialog Exception
			}
        }
        
    }
    
    /**
     * Listener for the "group_by" JComboBox part of the DataSetView.
     * Relies on ActionListener to manage messages.
     * 
     * @author Gerardo A. Navas Morales
     */
    class GroupByColumnListener implements ActionListener {
        
        /**
         * Calls a DataSetModel method to change the chart type on the Template.
         */
        @Override
        public void actionPerformed (ActionEvent arg0) {
            try {
				data_model.getTemplate ().setGroupByColumnn (
						data_view.getGroupingByElement ());
			} catch (Exception e) {
				// TODO Throw a Dialog Exception
			}
        }
        
    }
    
    /**
     * Listener for the "add_button" JButton part of the DataSetView.
     * Relies on ActionListener to manage messages.
     * 
     * @author Gerardo A. Navas Morales
     */
    class AddButtonListener implements ActionListener {
        
        /**
         * Calls a DataSetModel method to add a DataSet to ListModel
         * "list_selected".
         */
        @Override
        public void actionPerformed (ActionEvent arg0) {
			try {
				//System.out.println ("Add button was pressed.");
				ArrayList <String> selected_columns = data_view.getSelectedDatasetsToAdd ();
				    
				if (selected_columns.size () == 2) {
					
					data_model.addToSelectedHeaderData (selected_columns);
				
				} else {
					// TODO: Create an ArrayListSizeException!
					//throw (new ArrayListSizeException ("Only two columns are allowed to be selected."));
				}
			} catch (Exception e) {
				ExceptionHandler.createEmptyArrayException (e.getMessage ());
			}
        }
        
    }
    
    /**
     * Listener for the "remove_button" JButton part of the DataSetView.
     * Relies on ActionListener to manage messages.
     * 
     * @author Gerardo A. Navas Morales
     */
    class RemoveButtonListener implements ActionListener {
        
        /**
         * Calls a DataSetModel method to remove DataSet from ListModel
         * "list_selected".
         */
        @Override
        public void actionPerformed (ActionEvent arg0) {
        	try {
        		
        		//System.out.println ("Remove button was pressed.");
	            data_model.removeFromSelectedHeaderData (data_view
	                    .getSelectedDatasetsToRemove ());
	            
        	} catch (Exception e) {
        		
        		ExceptionHandler.createEmptyArrayException (e.getMessage ());
        		
        	}
        }
        
    }
    
    /**
     * Listener for the Template that contains all settings for the program.
     * Relies on ChangeListener in order to know that a change has occurred
     * in the Template. 
     * 
     * @author Gerardo A. Navas Morales
     */
    class DataViewTemplateListener implements ChangeListener {

        /**
         * Updates the DataSetView's current Template-based state.
         */
        @Override
        public void stateChanged (ChangeEvent e) {
            SwingWorker <Void, Void> template_worker = new SwingWorker <Void, Void> () {

                @Override
                protected Void doInBackground () throws Exception {
                    data_view.updateTemplateView ();
                    data_view.updateGroupByComboBoxSelection ();
                    return null;
                }
                
            };
            
            template_worker.run ();
        }
        
    }
    
    /**
     * Listener for the DataSet that contains all settings for the program.
     * Relies on ChangeListener in order to know that a change has occurred
     * in the DataSet. 
     * 
     * @author Gerardo A. Navas Morales
     */
    class DataViewHeaderDataListener implements ChangeListener {

        /**
         * Updates the AestheticView's current Template-based state.
         */
        @Override
        public void stateChanged (ChangeEvent e) {
            SwingWorker <Void, Void> data_worker = new SwingWorker <Void, Void> () {

                @Override
                protected Void doInBackground () throws Exception {
                    data_view.updateAvailableList ();
                    data_view.updateGroupByComboBox ();
                    return null;
                }
                
            };
            
            data_worker.run ();
        }
        
    }
    
    /**
     * Listener for the DataReference that contains all settings for the program.
     * Relies on ChangeListener in order to know that a change has occurred
     * in the DataReference. 
     * 
     * @author Gerardo A. Navas Morales
     */
    class DataViewReferenceListener implements ChangeListener {

        /**
         * Updates the AestheticView's current Template-based state.
         */
        @Override
        public void stateChanged (ChangeEvent e) {
            SwingWorker <Void, Void> reference_worker = new SwingWorker <Void, Void> () {

                @Override
                protected Void doInBackground () throws Exception {
                    data_view.updateSelectedList ();
                    return null;
                }
                
            };
            
            reference_worker.run ();
        }
        
    }
}