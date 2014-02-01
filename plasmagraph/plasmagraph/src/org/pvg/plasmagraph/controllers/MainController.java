package org.pvg.plasmagraph.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.pvg.plasmagraph.models.MainModel;
import org.pvg.plasmagraph.views.MainView;

// TODO: Add more JavaDoc comments!
public class MainController {
    /** Reference to model related to this controller. */
    private MainModel main_model;
    /** Reference to view related to this controller. */
    private MainView main_view;
    
    public MainController (MainModel main_model, MainView main_view) {
        // Set related objects into proper positions in object.
        this.main_model = main_model;
        this.main_view = main_view;
        
        // Automatically add listeners to Main Panel via view.
        // Data
        main_view.addDataImportMenuListener (new DataImportMenuListener ());
        // Template
        main_view
                .addTemplateImportMenuListener (new TemplateImportMenuListener ());
        main_view.addTemplateSaveMenuListener (new TemplateSaveMenuListener ());
        // Data Filter
        main_view
                .addDataFilterImportMenuListener (new DataFilterImportMenuListener ());
        main_view
                .addDataFilterEditMenuListener (new DataFilterEditMenuListener ());
        main_view
                .addDataFilterSaveMenuListener (new DataFilterSaveMenuListener ());
        // Graph
        main_view.addGraphMenuListener (new GraphMenuListener ());
        // Exit
        main_view.addExitMenuListener (new ExitMenuListener ());
    }
    
    // Data Action Listener Inner Classes
    class DataImportMenuListener implements ActionListener {
        
        @Override
        public void actionPerformed (ActionEvent arg0) {
            main_model.importData ();
            main_view.updateViews ();
        }
        
    }
    
    // Template Action Listener Inner Classes
    class TemplateImportMenuListener implements ActionListener {
        
        @Override
        public void actionPerformed (ActionEvent arg0) {
            main_model.importTemplate ();
            main_view.updateViews ();
        }
        
    }
    
    class TemplateSaveMenuListener implements ActionListener {
        
        @Override
        public void actionPerformed (ActionEvent arg0) {
            main_model.saveTemplate ();
        }
        
    }
    
    // Data Filter Action Listener Inner Classes
    class DataFilterImportMenuListener implements ActionListener {
        
        @Override
        public void actionPerformed (ActionEvent arg0) {
            main_model.importDataFilter ();
        }
        
    }
    
    class DataFilterEditMenuListener implements ActionListener {
        
        @Override
        public void actionPerformed (ActionEvent arg0) {
            main_model.editDataFilter ();
        }
        
    }
    
    class DataFilterSaveMenuListener implements ActionListener {
        
        @Override
        public void actionPerformed (ActionEvent arg0) {
            main_model.saveDataFilter ();
        }
        
    }
    
    // Graph Action Listener Inner Class
    class GraphMenuListener implements ActionListener {
        
        @Override
        public void actionPerformed (ActionEvent arg0) {
            main_model.graph ();
        }
        
    }
    
    // Exit Action Listener Inner Class
    class ExitMenuListener implements ActionListener {
        
        @Override
        public void actionPerformed (ActionEvent arg0) {
            main_model.exit ();
        }
        
    }
    
}