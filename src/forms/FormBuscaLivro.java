/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.util.List;
import javax.swing.JOptionPane;
import model.Livro;

/**
 *
 * @author Daniel
 */
public class FormBuscaLivro extends javax.swing.JFrame {

    /**
     * Creates new form FormBuscaLivro
     */
    public FormBuscaLivro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ftCodigo = new javax.swing.JFormattedTextField();
        btBuscar = new javax.swing.JButton();
        cbBuscaTodos = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDados = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Código");

        try {
            ftCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftCodigo.setName("ftCodigo"); // NOI18N
        ftCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftCodigoActionPerformed(evt);
            }
        });
        ftCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ftCodigoKeyReleased(evt);
            }
        });

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/icBuscar.png"))); // NOI18N
        btBuscar.setText("Buscar Livro");
        btBuscar.setEnabled(false);
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        cbBuscaTodos.setText("Buscar Todos");
        cbBuscaTodos.setName("cbBuscaTodos"); // NOI18N
        cbBuscaTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscaTodosActionPerformed(evt);
            }
        });

        taDados.setColumns(20);
        taDados.setRows(5);
        taDados.setEnabled(false);
        jScrollPane1.setViewportView(taDados);

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/icAtualizar.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btEditar);

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/icExcluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btExcluir);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/icSair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        jPanel1.add(btSair);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ftCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbBuscaTodos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btBuscar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbBuscaTodos)))
                    .addComponent(btBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(385, 360));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        if(cbBuscaTodos.isSelected()){
            taDados.setText("");
            List<Livro> lista = FormPrincipal.dbLivro.todosLivros();
            String aux = "";
            for(Livro l: lista){
                aux = aux + l.toString() + "\n\n";
            }
            taDados.setText(aux);
            btEditar.setEnabled(false);
            btExcluir.setEnabled(false);
        }else{
            Livro l = FormPrincipal.dbLivro.buscarLivro(ftCodigo.getText());
            if(l != null){
                taDados.setText("");
                taDados.setText(l.toString());
                btEditar.setEnabled(true);
                btExcluir.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(null, "Não existe livro cadastrado com esse código!", "Erro pesquisa", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void cbBuscaTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscaTodosActionPerformed
        if(cbBuscaTodos.isSelected()){
            btBuscar.setEnabled(true);
            ftCodigo.setEnabled(false);
        }else{
            ftCodigo.setEnabled(true);
            String aux = ftCodigo.getText();
            aux = aux.replace(" ", "");
            if(aux.length() < 5){
                btBuscar.setEnabled(false);
            }else{
                btBuscar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_cbBuscaTodosActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void ftCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftCodigoKeyReleased
        String aux = ftCodigo.getText();
        aux = aux.replace(" ", "");
        if(aux.length() < 5){
            btBuscar.setEnabled(false);
        }else{
            btBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_ftCodigoKeyReleased

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        Livro l = FormPrincipal.dbLivro.buscarLivro(ftCodigo.getText());
        if(l != null){
            new FormLivro(l).setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Não existe livro cadastrado com esse código!", "Erro pesquisa", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Object[] options = {"Sim", "Não"};
        if(JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]) == JOptionPane.YES_OPTION){
            FormPrincipal.dbLivro.removerLivro(ftCodigo.getText());
            taDados.setText("");
            btEditar.setEnabled(false);
            btExcluir.setEnabled(false);
            ftCodigo.setText("");
            ftCodigo.requestFocus();
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void ftCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(FormBuscaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuscaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuscaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuscaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuscaLivro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSair;
    private javax.swing.JCheckBox cbBuscaTodos;
    private javax.swing.JFormattedTextField ftCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taDados;
    // End of variables declaration//GEN-END:variables
}
