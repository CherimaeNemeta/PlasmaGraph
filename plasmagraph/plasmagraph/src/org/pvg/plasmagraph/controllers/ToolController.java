package org.pvg.plasmagraph.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import org.pvg.plasmagraph.controllers.AestheticController.ChartNameListener;
import org.pvg.plasmagraph.controllers.AestheticController.XAxisLabelListener;
import org.pvg.plasmagraph.models.AestheticModel;
import org.pvg.plasmagraph.models.ToolModel;
import org.pvg.plasmagraph.views.AestheticView;
import org.pvg.plasmagraph.views.ToolView;

public class ToolController {
    /** Reference to model related to this controller. */
    private ToolModel tool_model;
    /** Reference to view related to this controller. */
    private ToolView tool_view;
    
    /**
     * 
     * @param tool_model
     * @param tool_view
     */
    public ToolController (ToolModel tool_model, ToolView tool_view) {
        // Set related objects into proper positions in object.
        this.tool_model = tool_model;
        this.tool_view = tool_view;
        
        // Automatically add listeners to Tools Tab via view.
        tool_view.addInterpolationListener (new InterpolationListener ());
        tool_view.addOutlierListener (new OutlierListener ());
        
        tool_view
                .addInterpolationTypeListener (new InterpolationTypeListener ());
        tool_view.addOutlierResponseListener (new OutlierResponseListener ());
    }
    
    /**
     * Listener for the Interpolation optional tool that is a part of the
     * ToolView pane.
     * Relies on ActionListener in order to manage messages.
     * 
     * @author Gerardo A. Navas Morales
     */
    class InterpolationListener implements ActionListener {
        
        /**
         * Calls a ToolModel method to begin the interpolation process.
         */
        @SuppressWarnings ("unchecked")
        @Override
        public void actionPerformed (ActionEvent arg0) {
            tool_model.interpolate (tool_view.getSelectedDataPairIndex ());
        }
        
    }
    
    /**
     * Listener for the Outlier Search optional tool that is a part of the
     * ToolView pane.
     * Relies on FocusListener in order to manage messages.
     * 
     * @author Gerardo A. Navas Morales
     */
    class OutlierListener implements ActionListener {
        
        /**
         * Calls a ToolModel method to being the Outlier Search process.
         */
        @SuppressWarnings ("unchecked")
        @Override
        public void actionPerformed (ActionEvent arg0) {
            tool_model.outlier_search (tool_view.getSelectedDataPairIndex ());
        }
        
    }
    
    /**
     * Listener for the Interpolation optional tool that is a part of the
     * ToolView pane.
     * Relies on ItemListener in order to know that a change in selected item
     * occured.
     * 
     * @author Gerardo A. Navas Morales
     */
    class InterpolationTypeListener implements ItemListener {
        
        /**
         * Bridge between ToolView and ToolModel; changes Template's
         * Interpolation Type value.
         */
        @Override
        public void itemStateChanged (ItemEvent arg0) {
            tool_model.getTemplate ().setInterpolationType (
                    tool_view.getInterpolationTypeStatus ());
        }
        
    }
    
    /**
     * Listener for the Outlier Search optional tool that is a part of the
     * ToolView pane.
     * Relies on ItemListener in order to know that a change in selected item
     * occured.
     * 
     * @author Gerardo A. Navas Morales
     */
    class OutlierResponseListener implements ItemListener {
        
        /**
         * Response Type value.
         */
        @Override
        public void itemStateChanged (ItemEvent arg0) {
            tool_model.getTemplate ().setOutlierResponse (
                    tool_view.getOutlierResponseTypeStatus ());
        }
        
    }
}
