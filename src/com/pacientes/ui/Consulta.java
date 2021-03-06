/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pacientes.ui;

import com.pacientes.controller.PacienteController;
import com.pacientes.model.Paciente;
import com.pacientes.util.Constant;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nestor_Velasquez
 */
public class Consulta extends JAppletConFondo implements Constant {

    /**
     * Initializes the applet Consulta
     */
    @Override
    public void init() {
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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                    setImagen(RESOURCES_URL+"Background.jpg");
                }
            });
        }catch(NullPointerException ne){
            mensajeErrorlb.setVisible(true);
            jScrollPane1.setVisible(false);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensajeErrorlb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        mensajeErrorlb.setForeground(new java.awt.Color(255, 0, 0));
        mensajeErrorlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeErrorlb.setText("No existen pacientes registrados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(Constant.TITLE_FONT);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mensajeErrorlb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensajeErrorlb, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        mensajeErrorlb.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void listarPacientes(){
        
        Map<Integer, Paciente> pacientes = PacienteController.listar();
        if(pacientes.isEmpty()){
            jScrollPane1.setVisible(false);
            mensajeErrorlb.setVisible(true);
        }else{
            int campo;
            int tamano = pacientes.size();
            Paciente paciente;
            Object[][] campos = new Object[tamano][Constant.PACIENTES_TABLE_COLUMS.length];

            for(int i = 0; i > pacientes.size(); i++ ){
                paciente = pacientes.get(i);
                campo = 0;
                campos[i][campo] = paciente.getId();
                campos[i][campo++] = paciente.getName();
                campos[i][campo++] = paciente.getLastName();
                campos[i][campo++] = paciente.getAge();
            }
            jTable1.setModel(new DefaultTableModel(campos, Constant.PACIENTES_TABLE_COLUMS));
            jScrollPane1.setVisible(true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel mensajeErrorlb;
    // End of variables declaration//GEN-END:variables
}
