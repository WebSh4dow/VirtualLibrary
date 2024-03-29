/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VEW;

import CONTROLLER.ControllerEditora;
import DAO.DAOEditora;
import MODEL.ModelEditora;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jarmison
 */
public class ViewEditora extends javax.swing.JFrame {
ModelEditora modelEditora = new ModelEditora();
ControllerEditora controllerEditora = new ControllerEditora();
List <ModelEditora> listaEditoras = new ArrayList<>();
 String cadAlt="cad";
    private String pNome_editora;
    
    
    
    
    /**
     * Creates new form ViewEditora
     */
    public ViewEditora() {
        initComponents();
        carregarEditora();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jtfEditora = new javax.swing.JTextField();
        jtfCidade = new javax.swing.JTextField();
        JBcadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jBalterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(89, 89, 89));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 13)); // NOI18N
        jLabel1.setText("CADASTRO DE EDTORAS");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 13)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 13)); // NOI18N
        jLabel3.setText("EDITORA:");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 3, 13)); // NOI18N
        jLabel4.setText("CIDADE:");

        JBcadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTIL/ICONS/adicionar.png"))); // NOI18N
        JBcadastrar.setText("CADASTRAR");
        JBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcadastrarActionPerformed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTIL/ICONS/lixeira.png"))); // NOI18N
        jbExcluir.setText("EXCLUIR");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jBalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UTIL/ICONS/lapis.png"))); // NOI18N
        jBalterar.setText("ALTERAR");
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(3, 190, 181));
        jTable1.setFont(new java.awt.Font("Ubuntu", 3, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "EDITORA", "CIDADE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtfCidade)
                    .addComponent(jtfEditora, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JBcadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBalterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbExcluir)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(16, 16, 16)
                .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jtfEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBcadastrar)
                    .addComponent(jBalterar)
                    .addComponent(jbExcluir))
                .addGap(60, 60, 60))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcadastrarActionPerformed
        modelEditora = new ModelEditora();
        
        modelEditora.setNome_editora(jtfEditora.getText());
        modelEditora.setCidade_editora(jtfCidade.getText());
        
        if (cadAlt.equals("cad")) {
            
            
        if (controllerEditora.SalvarEditoraController(modelEditora)){
            
        JOptionPane.showMessageDialog(this,"EDITORA CADASTRADO COM SUCESSO!","!",JOptionPane.INFORMATION_MESSAGE);
           LimparCampos();
           carregarEditora();
       }
      
       else {
        JOptionPane.showMessageDialog(this, "ERRO AO CADASTRAR A EDITORA","!",JOptionPane.ERROR_MESSAGE);
       }
            
            
            
        } else{
            modelEditora.setId_editora(Integer.parseInt(jtfID.getText()));
             if (controllerEditora.atualizarEditoraController(modelEditora)){
                  
                 
               
                 
        JOptionPane.showMessageDialog(this,"EDITORA ALTERADA COM SUCESSO!","!",JOptionPane.INFORMATION_MESSAGE);
           
           LimparCampos();
           carregarEditora();
       }
      
       else {
        JOptionPane.showMessageDialog(this, "ERRO AO ALTERAR A EDITORA","!",JOptionPane.ERROR_MESSAGE);
       }
        
        }
    }//GEN-LAST:event_JBcadastrarActionPerformed

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarActionPerformed
       // modelEditora  = new ModelEditora();
        cadAlt = "alt";
     
       
      int linha = jTable1.getSelectedRow(); 
      
        
        if (linha < 0){
        JOptionPane.showMessageDialog(this, "USUÁRIO NÃO SELECIONADO!");
        
        }
        
        else {
           
          int codigo = (int) jTable1.getValueAt(linha, 0);
          controllerEditora.getEditoraController(codigo);
          jtfID.setText(String.valueOf(modelEditora.getId_editora()));
          jtfEditora.setText(modelEditora.getNome_editora());
          jtfCidade.setText(modelEditora.getCidade_editora());
          
        }
      
    }//GEN-LAST:event_jBalterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
   int linha = jTable1.getSelectedRow(); 
        
        if (linha < 0){
        JOptionPane.showMessageDialog(this, "USUÁRIO NÃO SELECIONADO!");
        
        }
        
        else {
         int codigo = (int) jTable1.getValueAt(linha, 0);
       
          controllerEditora.excluirEditoraController(codigo);
          carregarEditora();
          LimparCampos();
          JOptionPane.showMessageDialog(this, "EDITORA EXCLUIDA COM EXITO!");
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void LimparCampos (){
        jtfID.setText("");
        jtfCidade.setText("");
        jtfEditora.setText("");
        cadAlt = "cad";
        
        
        } 
    
    
    
    
    
    
    
    
    private void carregarEditora(){
           
     listaEditoras = controllerEditora.getListaEditoraController();
     DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
     modelo.setNumRows(0);
     
     
         for (int i = 0; i < listaEditoras.size(); i++) {
             modelo.addRow(new Object[]{
             listaEditoras.get(i).getId_editora(),
             listaEditoras.get(i).getNome_editora(),
             listaEditoras.get(i).getCidade_editora()//Modificar depois para não listar a senha!
             
             });
         }
     
     
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
            java.util.logging.Logger.getLogger(ViewEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEditora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBcadastrar;
    private javax.swing.JButton jBalterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfEditora;
    private javax.swing.JTextField jtfID;
    // End of variables declaration//GEN-END:variables
}
