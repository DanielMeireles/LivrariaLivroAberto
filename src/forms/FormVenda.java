/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Item;
import model.Livro;
import model.Venda;

/**
 *
 * @author Daniel
 */
public class FormVenda extends javax.swing.JFrame {

    private Venda venda = null;
    private Cliente cliente = null;
    private Livro livro = null;
    
    DefaultTableModel modelo = null;
    float soma = 0;
            
    public FormVenda() {
        initComponents();
        venda = new Venda();     
        modelo = (DefaultTableModel)jTable1.getModel();
        limpaTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEstado = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tfCpf = new javax.swing.JFormattedTextField();
        btRemoverItem = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbTelefone = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        btConfirmar = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbNumero = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbEditora = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        btBuscarItem = new javax.swing.JButton();
        tfCodigo = new javax.swing.JTextField();
        tfQuantidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();

        jTable1 = new javax.swing.JTable();
        lbTotal = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btIncluirItem = new javax.swing.JButton();
        javax.swing.JButton btFecharVenda = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Efetuar uma Venda");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("CPF:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 80, 28, 14);

        try {
            tfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(tfCpf);
        tfCpf.setBounds(20, 100, 119, 30);

        btRemoverItem.setBackground(new java.awt.Color(255, 255, 255));
        btRemoverItem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btRemoverItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icRemoverItem.png"))); // NOI18N
        btRemoverItem.setText("Remover Item");
        btRemoverItem.setActionCommand("Incluir");
        btRemoverItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverItemActionPerformed(evt);
            }
        });
        getContentPane().add(btRemoverItem);
        btRemoverItem.setBounds(800, 460, 160, 50);

        btSair.setBackground(new java.awt.Color(255, 255, 255));
        btSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icSair.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });
        getContentPane().add(btSair);
        btSair.setBounds(810, 560, 127, 50);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nome do Cliente: ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));

        jLabel15.setText("Endereço Completo:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        lbEndereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEndereco.setText("Rua Presidente João Goulart, 340");
        jPanel3.add(lbEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 230, 20));

        jLabel3.setText("Telefone:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 110, -1));

        lbTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTelefone.setText("(32) 98810-7889");
        jPanel3.add(lbTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 170, 20));

        jLabel4.setText("Nome do Cliente: ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));

        lbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbNome.setForeground(new java.awt.Color(255, 102, 0));
        lbNome.setText("--");
        jPanel3.add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, 20));

        jLabel5.setText("E-mail de contato:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 110, -1));

        lbEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEmail.setText("joaopereira21@hotmail.com");
        jPanel3.add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 170, 20));

        btConfirmar.setBackground(new java.awt.Color(255, 255, 255));
        btConfirmar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icConfirmarCliente.png"))); // NOI18N
        btConfirmar.setText("Confirmar");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });
        jPanel3.add(btConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 130, 50));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 140, 950, 100);

        btBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icBuscarCliente.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btBuscar);
        btBuscar.setBounds(150, 90, 110, 50);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Venda Nº:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        lbNumero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbNumero.setForeground(new java.awt.Color(0, 102, 0));
        lbNumero.setText("00234");
        jPanel1.add(lbNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Data da Venda:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        lbData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbData.setForeground(new java.awt.Color(0, 0, 153));
        lbData.setText("12/10/2020");
        jPanel1.add(lbData, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 10, 730, 50);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Livros a escolher", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Codigo Livro:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 110, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Título:");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 110, -1));

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTitulo.setText("Desenvolvimento de Aplicações Web com Java");
        jPanel4.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 360, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Editora:");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 110, -1));

        lbEditora.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEditora.setText("Ciência Moderna");
        jPanel4.add(lbEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 150, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Valor unitário:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 80, -1));

        lbValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbValor.setForeground(new java.awt.Color(0, 0, 204));
        lbValor.setText("R$ 78,00");
        jPanel4.add(lbValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 70, 20));

        btBuscarItem.setBackground(new java.awt.Color(255, 255, 255));
        btBuscarItem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btBuscarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icBuscarItem.png"))); // NOI18N
        btBuscarItem.setText("Buscar Item");
        btBuscarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarItemActionPerformed(evt);
            }
        });
        jPanel4.add(btBuscarItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 140, 40));
        jPanel4.add(tfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 110, -1));

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 240, 950, 100);
        getContentPane().add(tfQuantidade);
        tfQuantidade.setBounds(20, 370, 70, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Quantidade:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 350, 70, 14);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Título", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(20);
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(75);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(400);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(90);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 410, 770, 100);

        lbTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(255, 51, 0));
        lbTotal.setText("R$ 00,0");
        getContentPane().add(lbTotal);
        lbTotal.setBounds(130, 510, 100, 30);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Valor Total :");
        getContentPane().add(jLabel24);
        jLabel24.setBounds(30, 510, 100, 30);

        btIncluirItem.setBackground(new java.awt.Color(255, 255, 255));
        btIncluirItem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btIncluirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icIncluirItem.png"))); // NOI18N
        btIncluirItem.setText("Incluir");
        btIncluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirItemActionPerformed(evt);
            }
        });
        getContentPane().add(btIncluirItem);
        btIncluirItem.setBounds(110, 360, 120, 40);

        btFecharVenda.setBackground(new java.awt.Color(255, 255, 255));
        btFecharVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btFecharVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icFecharVenda.png"))); // NOI18N
        btFecharVenda.setText("FECHAR VENDA");
        btFecharVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btFecharVenda);
        btFecharVenda.setBounds(90, 560, 150, 50);

        btCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btCancelar);
        btCancelar.setBounds(430, 560, 140, 50);

        setSize(new java.awt.Dimension(989, 668));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
         venda.setCliente(cliente);
         btConfirmar.setEnabled(false);
    }//GEN-LAST:event_btConfirmarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
           this.dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        cliente = FormPrincipal.dbCliente.buscarCliente(tfCpf.getText());
        if(cliente != null)
        {
            lbNome.setText(cliente.getNome());
            lbEndereco.setText(cliente.getEndereco().getLogradouro() + " " + cliente.getEndereco().getComplemento());
            lbTelefone.setText(cliente.getTelefone());
            lbEmail.setText(cliente.getEmail());
            btConfirmar.setEnabled(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "Atenção!", JOptionPane.ERROR_MESSAGE);
            tfCpf.requestFocus();
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btBuscarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarItemActionPerformed
        livro = FormPrincipal.dbLivro.buscarLivro(tfCodigo.getText());
        if(livro != null)
        {
            lbTitulo.setText(livro.getTitulo());
            lbEditora.setText(livro.getFornecedor());
            lbValor.setText("R$ " + Float.toString(livro.getValorUnitario()));
         }
        else
        {
            JOptionPane.showMessageDialog(null, "Livro não encontrado!", "Atenção!", JOptionPane.ERROR_MESSAGE);
            tfCodigo.requestFocus();
        }
    }//GEN-LAST:event_btBuscarItemActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          lbNumero.setText(Integer.toString(Venda.getNumero()));
          
          SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
          String dt = fm.format(venda.getDataVenda());
          lbData.setText(dt);
    }//GEN-LAST:event_formWindowOpened

    private void btIncluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirItemActionPerformed
        int quantidade = Integer.parseInt(tfQuantidade.getText());
        if(quantidade != 0){
            Item it = new Item(livro);
            it.setQuantidade(quantidade);
            it.calcularValorItem();
            
            modelo.addRow(new Object[]{livro.getCodigo(), livro.getTitulo(), quantidade, livro.getValorUnitario(), it.getValorItem()});
            venda.inserirItem(it);
            soma = soma + it.getValorItem();
            lbTotal.setText(Float.toString(soma));
        }else{
            JOptionPane.showMessageDialog(null, "Favor preencher a quantidade!", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btIncluirItemActionPerformed

    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverItemActionPerformed
        int linha = jTable1.getSelectedRow();        
        String codigo = (String) jTable1.getModel().getValueAt(linha,0);
        soma = soma - (Float)jTable1.getModel().getValueAt(linha,4);
        lbTotal.setText(Float.toString(soma));
        venda.removerItem(codigo);
        modelo.removeRow(linha);
    }//GEN-LAST:event_btRemoverItemActionPerformed

    private void btFecharVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharVendaActionPerformed
        if(!venda.getLista().isEmpty()){
            FormPrincipal.dbVenda.inserirVenda(venda);
            JOptionPane.showMessageDialog(null, "Venda efetuada com sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Não existem itens na venda!", "Atenção!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btFecharVendaActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        Venda.setNumero(Venda.getNumero()-1);
        venda = new Venda();
        limpaTela();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void limpaTela(){
        soma = 0;
        tfCpf.setText("");
        lbNome.setText("");
        lbEndereco.setText("");
        lbTelefone.setText("");
        lbEmail.setText("");
        btConfirmar.setEnabled(true);
        tfCodigo.setText("");
        lbTitulo.setText("");
        lbEditora.setText("");
        lbValor.setText("");
        tfQuantidade.setText("");
        lbTotal.setText("0,00");
        for(int i = jTable1.getRowCount()-1; i>=0; --i)
        {
            modelo.removeRow(i);
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
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEstado;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btBuscarItem;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JButton btIncluirItem;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbEditora;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JFormattedTextField tfCpf;
    private javax.swing.JTextField tfQuantidade;
    // End of variables declaration//GEN-END:variables
}