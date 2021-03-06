/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.tracking;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import org.opensim.modeling.OrientationWeight;
import org.opensim.modeling.OrientationWeightSet;
import org.opensim.utils.ErrorDialog;

/**
 *
 * @author Ayman-NMBL
 */
public class OrientationWeightsJPanel extends javax.swing.JPanel {

    class WeightsTableModel extends AbstractTableModel {
        OrientationWeightSet owSet= null;
        WeightsTableModel(OrientationWeightSet owSet){
            this.owSet = owSet;
        }
        @Override
        public Class getColumnClass(int column){
            if (column==0)
                return String.class;
            else
                return Double.class;
        }
        @Override
        public String getColumnName(int column) {
            return (column==0)?"Sensor Name":"Weight";
        }

        @Override
        public int getColumnCount() {
            return 2; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public int getRowCount() {
            return owSet.getSize(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public Object getValueAt(int i, int i1) {
            OrientationWeight ow = owSet.get(i);
            return (i1==0)?ow.getName():ow.getWeight();
        }

        @Override
        public boolean isCellEditable(int i, int i1) {
            return i1==1; //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fireTableRowsUpdated(int i, int i1) {
            super.fireTableRowsUpdated(i, i1); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void fireTableDataChanged() {
            super.fireTableDataChanged(); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void setValueAt(Object o, int i, int i1) {
            if (i1==1){
                OrientationWeight ow = owSet.get(i);
                double wgt = (Double)o;
                if (wgt >=0. && wgt <= 1.0)
                    ow.setWeight(wgt);
                else
                    ErrorDialog.showMessageDialog("Weights need to be between 0 and 1");
            }
        }
        
    }
    /**
     * Creates new form WeightsJPanel
     */
    public OrientationWeightsJPanel(OrientationWeightSet owSet) {
        WeightsTableModel tableModel = new WeightsTableModel(owSet);
        initComponents();
        jWeightsTable.setModel(tableModel);
        jWeightsTable.putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jWeightsTable = new javax.swing.JTable();

        jWeightsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null,  new Double(1.0)},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Weight"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jWeightsTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jWeightsTable;
    // End of variables declaration//GEN-END:variables
}
