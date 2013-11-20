/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PrototypeTemplateFrame.java
 *
 * Created on Nov 12, 2013, 11:31:50 AM
 */
package org.plasmagraph.prototype;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.plasmagraph.graphs.*;
import org.plasmagraph.template.Template;

/**
 *
 * @author tako
 */
public class PrototypeTemplateFrame extends javax.swing.JFrame {

    public Template current_template;
    public CategoryDataset current_data;
    
    /** Creates new form PrototypeTemplateFrame */
    public PrototypeTemplateFrame() {
        initComponents();
        current_template = new Template ();
    }
    
    public PrototypeTemplateFrame(String chart_type) {
        initComponents();
        current_template = new Template ();
        current_template.chart_type = chart_type;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PrototypeFileChooser = new javax.swing.JFileChooser();
        PrototypeOptionsPanel = new javax.swing.JPanel();
        PrototypeOptionsLabel = new javax.swing.JLabel();
        PrototypeGenerateChartButton = new javax.swing.JButton();
        PrototypeChartNameTextField = new javax.swing.JTextField();
        PrototypeChartNameLabel = new javax.swing.JLabel();
        PrototypeChartTypeLabel = new javax.swing.JLabel();
        PrototypeXAxisLabel = new javax.swing.JLabel();
        PrototypeYAxisLabel = new javax.swing.JLabel();
        PrototypeXAxisLabelTextField = new javax.swing.JTextField();
        PrototypeYAxisLabelTextField = new javax.swing.JTextField();
        PrototypeLegendCheckBox = new javax.swing.JCheckBox();
        PrototypeLegendLabel = new javax.swing.JLabel();
        PrototypeTooltipLabel = new javax.swing.JLabel();
        PrototypeTooltipCheckBox = new javax.swing.JCheckBox();
        PrototypeURLLabel = new javax.swing.JLabel();
        PrototypeURLCheckBox = new javax.swing.JCheckBox();
        PrototypePlotOrientationLabel = new javax.swing.JLabel();
        PrototypeHorizontalPlotOrientationSelection = new javax.swing.JRadioButton();
        PrototypeVerticalPlotOrientationSelection = new javax.swing.JRadioButton();
        PrototypeXMinimumLabel = new javax.swing.JLabel();
        PrototypeXMaximumLabel = new javax.swing.JLabel();
        PrototypeYMinimumLabel = new javax.swing.JLabel();
        PrototypeYMaximumLabel = new javax.swing.JLabel();
        PrototypeXMinimumTextField = new javax.swing.JTextField();
        PrototypeXMaximumTextField = new javax.swing.JTextField();
        PrototypeYMinimumTextField = new javax.swing.JTextField();
        PrototypeYMaximumTextField = new javax.swing.JTextField();
        PrototypeChartTypeComboBox = new javax.swing.JComboBox();
        PrototypeMenuBar = new javax.swing.JMenuBar();
        PrototypeFileMenu = new javax.swing.JMenu();
        PrototypeDataMenu = new javax.swing.JMenu();
        PrototypeLoadDataMenuOption = new javax.swing.JMenuItem();
        PrototypeTemplatesMenu = new javax.swing.JMenu();
        PrototypeLoadTemplateMenuOption = new javax.swing.JMenuItem();
        PrototypeSaveTemplateMenuOption = new javax.swing.JMenuItem();
        PrototypeExitMenuOption = new javax.swing.JMenuItem();
        PrototypeEditMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PlasmaGraph Prototype");

        PrototypeOptionsLabel.setFont(new java.awt.Font("Dialog", 0, 36));
        PrototypeOptionsLabel.setText("Options");

        PrototypeGenerateChartButton.setText("Generate Chart");
        PrototypeGenerateChartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrototypeGenerateChartButtonActionPerformed(evt);
            }
        });

        PrototypeChartNameTextField.setText("Default Chart");

        PrototypeChartNameLabel.setText("Chart Name");

        PrototypeChartTypeLabel.setText("Chart Type");

        PrototypeXAxisLabel.setText("X Axis Label");

        PrototypeYAxisLabel.setText("Y Axis Label");

        PrototypeXAxisLabelTextField.setText("X Axis");

        PrototypeYAxisLabelTextField.setText("Y Axis");

        PrototypeLegendLabel.setText("Legend?");

        PrototypeTooltipLabel.setText("Tooltips?");

        PrototypeURLLabel.setText("URLs?");

        PrototypePlotOrientationLabel.setText("Plot Orientation");

        PrototypeHorizontalPlotOrientationSelection.setSelected(true);
        PrototypeHorizontalPlotOrientationSelection.setText("Horizontal");

        PrototypeVerticalPlotOrientationSelection.setText("Vertical");

        PrototypeXMinimumLabel.setText("X Minimum");

        PrototypeXMaximumLabel.setText("X Maximum");

        PrototypeYMinimumLabel.setText("Y Minimum");

        PrototypeYMaximumLabel.setText("Y Maximum");

        PrototypeXMinimumTextField.setText("640");

        PrototypeXMaximumTextField.setText("640");

        PrototypeYMinimumTextField.setText("480");

        PrototypeYMaximumTextField.setText("480");

        PrototypeChartTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pie Chart", "Bar Chart", "Line Graph", "XY Plot" }));

        javax.swing.GroupLayout PrototypeOptionsPanelLayout = new javax.swing.GroupLayout(PrototypeOptionsPanel);
        PrototypeOptionsPanel.setLayout(PrototypeOptionsPanelLayout);
        PrototypeOptionsPanelLayout.setHorizontalGroup(
            PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrototypeOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrototypeChartNameLabel)
                    .addComponent(PrototypeXAxisLabel)
                    .addComponent(PrototypeYAxisLabel)
                    .addComponent(PrototypeChartTypeLabel))
                .addGap(18, 18, 18)
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrototypeYAxisLabelTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(PrototypeChartNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(PrototypeXAxisLabelTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(PrototypeChartTypeComboBox, 0, 149, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrototypeTooltipLabel)
                    .addComponent(PrototypeURLLabel)
                    .addComponent(PrototypeLegendLabel))
                .addGap(43, 43, 43)
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrototypeURLCheckBox)
                    .addComponent(PrototypeTooltipCheckBox)
                    .addComponent(PrototypeLegendCheckBox))
                .addContainerGap())
            .addGroup(PrototypeOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PrototypePlotOrientationLabel)
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(PrototypeOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PrototypeHorizontalPlotOrientationSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrototypeVerticalPlotOrientationSelection)
                .addContainerGap(224, Short.MAX_VALUE))
            .addGroup(PrototypeOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PrototypeXMinimumTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(PrototypeXMinimumLabel, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrototypeXMaximumTextField, 0, 0, Short.MAX_VALUE)
                    .addComponent(PrototypeXMaximumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrototypeYMinimumTextField, 0, 0, Short.MAX_VALUE)
                    .addComponent(PrototypeYMinimumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrototypeYMaximumTextField, 0, 0, Short.MAX_VALUE)
                    .addComponent(PrototypeYMaximumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
            .addGroup(PrototypeOptionsPanelLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(PrototypeGenerateChartButton)
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(PrototypeOptionsPanelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(PrototypeOptionsLabel)
                .addContainerGap(136, Short.MAX_VALUE))
        );
        PrototypeOptionsPanelLayout.setVerticalGroup(
            PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrototypeOptionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PrototypeOptionsLabel)
                .addGap(26, 26, 26)
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PrototypeChartNameLabel)
                        .addComponent(PrototypeChartNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PrototypeLegendLabel))
                    .addComponent(PrototypeLegendCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrototypeTooltipLabel)
                    .addComponent(PrototypeTooltipCheckBox)
                    .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PrototypeChartTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PrototypeChartTypeLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrototypeURLCheckBox)
                    .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PrototypeXAxisLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PrototypeXAxisLabel)
                        .addComponent(PrototypeURLLabel))
                    .addGroup(PrototypeOptionsPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PrototypeYAxisLabelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrototypeYAxisLabel))))
                .addGap(183, 183, 183)
                .addComponent(PrototypePlotOrientationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrototypeHorizontalPlotOrientationSelection)
                    .addComponent(PrototypeVerticalPlotOrientationSelection))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrototypeXMinimumLabel)
                    .addComponent(PrototypeXMaximumLabel)
                    .addComponent(PrototypeYMinimumLabel)
                    .addComponent(PrototypeYMaximumLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrototypeOptionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrototypeXMinimumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrototypeXMaximumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrototypeYMinimumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrototypeYMaximumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrototypeGenerateChartButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PrototypeFileMenu.setText("File");

        PrototypeDataMenu.setText("Data");

        PrototypeLoadDataMenuOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        PrototypeLoadDataMenuOption.setText("Load Data");
        PrototypeLoadDataMenuOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrototypeLoadDataMenuOptionActionPerformed(evt);
            }
        });
        PrototypeDataMenu.add(PrototypeLoadDataMenuOption);

        PrototypeFileMenu.add(PrototypeDataMenu);

        PrototypeTemplatesMenu.setText("Templates");

        PrototypeLoadTemplateMenuOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        PrototypeLoadTemplateMenuOption.setText("Load Template");
        PrototypeLoadTemplateMenuOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrototypeLoadTemplateMenuOptionActionPerformed(evt);
            }
        });
        PrototypeTemplatesMenu.add(PrototypeLoadTemplateMenuOption);

        PrototypeSaveTemplateMenuOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        PrototypeSaveTemplateMenuOption.setText("Save Template");
        PrototypeSaveTemplateMenuOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrototypeSaveTemplateMenuOptionActionPerformed(evt);
            }
        });
        PrototypeTemplatesMenu.add(PrototypeSaveTemplateMenuOption);

        PrototypeFileMenu.add(PrototypeTemplatesMenu);

        PrototypeExitMenuOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        PrototypeExitMenuOption.setText("Exit");
        PrototypeExitMenuOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrototypeExitMenuOptionActionPerformed(evt);
            }
        });
        PrototypeFileMenu.add(PrototypeExitMenuOption);

        PrototypeMenuBar.add(PrototypeFileMenu);
        PrototypeFileMenu.getAccessibleContext().setAccessibleDescription("");

        PrototypeEditMenu.setText("Edit");
        PrototypeMenuBar.add(PrototypeEditMenu);

        setJMenuBar(PrototypeMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrototypeOptionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrototypeOptionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void PrototypeGenerateChartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrototypeGenerateChartButtonActionPerformed
    // Update the Model with the View's Data.
    updateTemplateModel ();
    
    // Generate Chart based on Model's Data.
    if (current_template.chart_type.compareTo("Pie Chart") == 0) {
        PieChart chart = new PieChart (this.current_template, this.current_data);
        chart.pack ();
        chart.setVisible (true);
        
    } else if (current_template.chart_type.compareTo("Bar Chart") == 0) {
        BarChart chart = new BarChart (this.current_template, this.current_data);
        chart.pack ();
        chart.setVisible (true);
        
    } else if (current_template.chart_type.compareTo("Line Chart") == 0) {
        LineChart chart = new LineChart (this.current_template, this.current_data);
        chart.pack ();
        chart.setVisible (true);
        
    } else { // XY Plot
        XYPlot chart = new XYPlot (this.current_template, this.current_data);
        chart.pack ();
        chart.setVisible (true);
        
    }
}//GEN-LAST:event_PrototypeGenerateChartButtonActionPerformed

private void PrototypeSaveTemplateMenuOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrototypeSaveTemplateMenuOptionActionPerformed
// @TODO: Create try / catch block around this.
    int response_value = this.PrototypeFileChooser.showSaveDialog (this);
    
    if (response_value == JFileChooser.APPROVE_OPTION) {
        File f = this.PrototypeFileChooser.getSelectedFile ();
        
        // Save the file.
        this.current_template.saveTemplate (f);
        
        // Inform the user that the process was completed successfully
        JOptionPane.showMessageDialog 
                (this, "Template was saved successfully", "Template Saved.", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // @TODO: Create a Dialog stating the problem.
    }
}//GEN-LAST:event_PrototypeSaveTemplateMenuOptionActionPerformed

private void PrototypeLoadTemplateMenuOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrototypeLoadTemplateMenuOptionActionPerformed
// @TODO: Create try / catch block around this.
    int response_value = this.PrototypeFileChooser.showOpenDialog (this);

    if (response_value == JFileChooser.APPROVE_OPTION) {
        File f = this.PrototypeFileChooser.getSelectedFile ();

        // Open the file.
        this.current_template = new Template (f);
        
        // Update the Settings View on the JPanel of the Template!
        updateTemplateView ();
        
        // Inform the user that the process was completed successfully.
        JOptionPane.showMessageDialog 
                (this, "Template was loaded successfully.", "Template Loaded.", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // @TODO: Create a Dialog stating the problem.
    }
}//GEN-LAST:event_PrototypeLoadTemplateMenuOptionActionPerformed

private void updateTemplateView () {
    // Chart Name and Type
    PrototypeChartNameTextField.setText 
            (this.current_template.chart_name);
    PrototypeChartTypeComboBox.setSelectedItem 
            (this.current_template.chart_type);
    //PrototypeChartSubTypeTextField.setText (this.current_template.chart_sub_type);
    
    // Axis Labels
    PrototypeXAxisLabelTextField.setText 
            (this.current_template.x_axis_name);
    PrototypeYAxisLabelTextField.setText 
            (this.current_template.y_axis_name);
    
    // Options
    PrototypeLegendCheckBox.setSelected 
            (this.current_template.using_legend);
    PrototypeTooltipCheckBox.setSelected 
            (this.current_template.using_tooltips);
    PrototypeURLCheckBox.setSelected 
            (this.current_template.generate_urls);
    
    // PlotOrientation
    PrototypeHorizontalPlotOrientationSelection.setSelected 
            (this.current_template.orientation == PlotOrientation.HORIZONTAL);
    PrototypeVerticalPlotOrientationSelection.setSelected 
            (this.current_template.orientation == PlotOrientation.VERTICAL);
    
    // X/Y Min/Max
    PrototypeXMinimumTextField.setText 
            ("" + this.current_template.x_minimum);
    PrototypeXMaximumTextField.setText 
            ("" + this.current_template.x_maximum);
    PrototypeYMinimumTextField.setText 
            ("" + this.current_template.y_minimum);
    PrototypeYMaximumTextField.setText 
            ("" + this.current_template.y_maximum);
}

private void updateTemplateModel () {
    this.current_template.chart_name = PrototypeChartNameTextField.getText ();
    this.current_template.chart_sub_type = ""; //PrototypeChartSubTypeTextField.getText ();
    this.current_template.chart_type = (String) PrototypeChartTypeComboBox.getSelectedItem();
    
    this.current_template.x_axis_name = PrototypeXAxisLabelTextField.getText ();
    this.current_template.y_axis_name = PrototypeYAxisLabelTextField.getText ();
    
    this.current_template.using_legend = PrototypeLegendCheckBox.isSelected ();
    this.current_template.using_tooltips = PrototypeTooltipCheckBox.isSelected ();
    this.current_template.generate_urls = PrototypeURLCheckBox.isSelected ();
    
    if (PrototypeHorizontalPlotOrientationSelection.isSelected()) {this.current_template.orientation = PlotOrientation.HORIZONTAL; }
    else {this.current_template.orientation = PlotOrientation.VERTICAL;}
    
    this.current_template.x_minimum = new Integer (PrototypeXMinimumTextField.getText ());
    this.current_template.x_maximum = new Integer (PrototypeXMaximumTextField.getText ());
    this.current_template.y_minimum = new Integer (PrototypeYMinimumTextField.getText ());
    this.current_template.y_maximum = new Integer (PrototypeYMaximumTextField.getText ());
}

private void PrototypeExitMenuOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrototypeExitMenuOptionActionPerformed
    // Ask the user to confirm their decision. We want to protect data from mistakes like accidentally closing.
    int response = JOptionPane.showConfirmDialog
            (this, "Do you wish to close PlasmaGraph?", "Exiting PlasmaGraph.", JOptionPane.YES_NO_OPTION);
    
    if (response == 1) { System.exit(0); }
}//GEN-LAST:event_PrototypeExitMenuOptionActionPerformed

private void PrototypeLoadDataMenuOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrototypeLoadDataMenuOptionActionPerformed
// @TODO: Create try / catch block around this.
    int response_value = this.PrototypeFileChooser.showOpenDialog (this);

    if (response_value == JFileChooser.APPROVE_OPTION) {
        File f = this.PrototypeFileChooser.getSelectedFile ();

        // Open the file.
        this.current_data = this.toDataset (new File(f.toURI()));
        
        // Inform the user that the process was completed successfully.
        JOptionPane.showMessageDialog
                (this, "Data was loaded successfully.", "Data Loaded.", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // @TODO: Create a Dialog stating the problem.
    }
}//GEN-LAST:event_PrototypeLoadDataMenuOptionActionPerformed

    private CategoryDataset toDataset(File file) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrototypeTemplateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrototypeTemplateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrototypeTemplateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrototypeTemplateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PrototypeTemplateFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PrototypeChartNameLabel;
    private javax.swing.JTextField PrototypeChartNameTextField;
    private javax.swing.JComboBox PrototypeChartTypeComboBox;
    private javax.swing.JLabel PrototypeChartTypeLabel;
    private javax.swing.JMenu PrototypeDataMenu;
    private javax.swing.JMenu PrototypeEditMenu;
    private javax.swing.JMenuItem PrototypeExitMenuOption;
    private javax.swing.JFileChooser PrototypeFileChooser;
    private javax.swing.JMenu PrototypeFileMenu;
    private javax.swing.JButton PrototypeGenerateChartButton;
    private javax.swing.JRadioButton PrototypeHorizontalPlotOrientationSelection;
    private javax.swing.JCheckBox PrototypeLegendCheckBox;
    private javax.swing.JLabel PrototypeLegendLabel;
    private javax.swing.JMenuItem PrototypeLoadDataMenuOption;
    private javax.swing.JMenuItem PrototypeLoadTemplateMenuOption;
    private javax.swing.JMenuBar PrototypeMenuBar;
    private javax.swing.JLabel PrototypeOptionsLabel;
    private javax.swing.JPanel PrototypeOptionsPanel;
    private javax.swing.JLabel PrototypePlotOrientationLabel;
    private javax.swing.JMenuItem PrototypeSaveTemplateMenuOption;
    private javax.swing.JMenu PrototypeTemplatesMenu;
    private javax.swing.JCheckBox PrototypeTooltipCheckBox;
    private javax.swing.JLabel PrototypeTooltipLabel;
    private javax.swing.JCheckBox PrototypeURLCheckBox;
    private javax.swing.JLabel PrototypeURLLabel;
    private javax.swing.JRadioButton PrototypeVerticalPlotOrientationSelection;
    private javax.swing.JLabel PrototypeXAxisLabel;
    private javax.swing.JTextField PrototypeXAxisLabelTextField;
    private javax.swing.JLabel PrototypeXMaximumLabel;
    private javax.swing.JTextField PrototypeXMaximumTextField;
    private javax.swing.JLabel PrototypeXMinimumLabel;
    private javax.swing.JTextField PrototypeXMinimumTextField;
    private javax.swing.JLabel PrototypeYAxisLabel;
    private javax.swing.JTextField PrototypeYAxisLabelTextField;
    private javax.swing.JLabel PrototypeYMaximumLabel;
    private javax.swing.JTextField PrototypeYMaximumTextField;
    private javax.swing.JLabel PrototypeYMinimumLabel;
    private javax.swing.JTextField PrototypeYMinimumTextField;
    // End of variables declaration//GEN-END:variables
}
