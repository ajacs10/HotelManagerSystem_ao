/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author mcdebug
 */
package telas;

public class TelaCadastro extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCadastro.class.getName());

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        painelPrincipalCadastro = new javax.swing.JPanel();
        txCadastroHóspedes = new javax.swing.JLabel();
        txNomeCompleto = new javax.swing.JLabel();
        txNºBilhete = new javax.swing.JLabel();
        txDataNasc = new javax.swing.JLabel();
        txTelefone = new javax.swing.JLabel();
        txEmail = new javax.swing.JLabel();
        txNacionalidade = new javax.swing.JLabel();
        txEndereco = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPaneObservacoes = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        btnAdicionar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        bnLimparNome = new javax.swing.JButton();
        bnLimparBilhete = new javax.swing.JButton();
        bnLimparDataNAsc = new javax.swing.JButton();
        bnEmailLimpar = new javax.swing.JButton();
        bnLimparEndereco = new javax.swing.JButton();
        bnsexoLimpar = new javax.swing.JButton();
        bnLimparTelefone = new javax.swing.JButton();
        bnLimparNacional = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        txObservações = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        txID = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes/Hóspedes");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(990, 1000));
        setResizable(false);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(42767, 42767));

        painelPrincipalCadastro.setBackground(new java.awt.Color(255, 255, 255));

        txCadastroHóspedes.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        txCadastroHóspedes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txCadastroHóspedes.setText("Cadastro de Hóspedes");
        txCadastroHóspedes.setAlignmentX(0.5F);

        txNomeCompleto.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        txNomeCompleto.setText("Nome Completo:");

        txNºBilhete.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        txNºBilhete.setText("Nº de Bilhete");

        txDataNasc.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        txDataNasc.setText("Data Nasc.");

        txTelefone.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txTelefone.setText("Telefone");

        txEmail.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txEmail.setText("Email");

        txNacionalidade.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txNacionalidade.setText("Nacionalidade");

        txEndereco.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        txEndereco.setText("Endereço");

        lbSexo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lbSexo.setText("Sexo");

        jRadioButton1.setText("Feminino");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Masculino");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        txtObservacoes.setColumns(20);
        txtObservacoes.setLineWrap(true);
        txtObservacoes.setRows(5);
        txtObservacoes.setWrapStyleWord(true);
        jScrollPaneObservacoes.setViewportView(txtObservacoes);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        bnLimparNome.setText("Limpar");

        bnLimparBilhete.setText("Limpar");

        bnLimparDataNAsc.setText("Limpar");

        bnEmailLimpar.setText("Limpar");

        bnLimparEndereco.setText("Limpar");

        bnsexoLimpar.setText("Limpar");

        bnLimparTelefone.setText("Limpar");

        bnLimparNacional.setText("Limpar");

        txObservações.setText("Observações");

        jButton9.setText("Voltar");

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logo1-removebg-preview.png"))); // NOI18N

        txID.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        txID.setText("Id");

        jButton1.setText("Limpar");

        javax.swing.GroupLayout painelPrincipalCadastroLayout = new javax.swing.GroupLayout(painelPrincipalCadastro);
        painelPrincipalCadastro.setLayout(painelPrincipalCadastroLayout);
        painelPrincipalCadastroLayout.setHorizontalGroup(
            painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalCadastroLayout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalCadastroLayout.createSequentialGroup()
                        .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txNºBilhete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txDataNasc)
                            .addComponent(txEmail)
                            .addComponent(txEndereco)
                            .addComponent(txTelefone)
                            .addComponent(txNacionalidade)
                            .addComponent(lbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txNomeCompleto, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                                    .addComponent(btnAdicionar)
                                    .addGap(25, 25, 25))))
                        .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                                        .addComponent(jRadioButton2)
                                        .addGap(86, 86, 86)
                                        .addComponent(jRadioButton1)
                                        .addGap(128, 128, 128))
                                    .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                                            .addComponent(txObservações)
                                            .addGap(27, 27, 27)
                                            .addComponent(jScrollPaneObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalCadastroLayout.createSequentialGroup()
                                            .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(27, 27, 27)
                                            .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bnLimparNome)
                                                .addComponent(jButton1)
                                                .addComponent(bnLimparBilhete)
                                                .addComponent(bnLimparDataNAsc)
                                                .addComponent(bnEmailLimpar)
                                                .addComponent(bnLimparEndereco)
                                                .addComponent(bnsexoLimpar)
                                                .addComponent(bnLimparTelefone)
                                                .addComponent(bnLimparNacional))))))
                            .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(409, 409, 409))
                    .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                        .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))))
            .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(txCadastroHóspedes, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
        );
        painelPrincipalCadastroLayout.setVerticalGroup(
            painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txCadastroHóspedes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bnLimparNome))
                    .addComponent(txNomeCompleto))
                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(bnLimparBilhete))
                    .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNºBilhete))))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bnLimparDataNAsc))
                    .addComponent(txDataNasc))
                .addGap(28, 28, 28)
                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txEmail)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnEmailLimpar))
                .addGap(30, 30, 30)
                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txEndereco)
                    .addComponent(bnLimparEndereco))
                .addGap(24, 24, 24)
                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnsexoLimpar)
                    .addComponent(txTelefone))
                .addGap(33, 33, 33)
                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnLimparTelefone)
                    .addComponent(txNacionalidade))
                .addGap(21, 21, 21)
                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnLimparNacional)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(lbSexo))
                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(txObservações))
                    .addGroup(painelPrincipalCadastroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPaneObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(painelPrincipalCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnExcluir)
                    .addComponent(btnAdicionar))
                .addContainerGap(654, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(painelPrincipalCadastro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1085, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new TelaCadastro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton bnEmailLimpar;
    private javax.swing.JButton bnLimparBilhete;
    private javax.swing.JButton bnLimparDataNAsc;
    private javax.swing.JButton bnLimparEndereco;
    private javax.swing.JButton bnLimparNacional;
    private javax.swing.JButton bnLimparNome;
    private javax.swing.JButton bnLimparTelefone;
    private javax.swing.JButton bnsexoLimpar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneObservacoes;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JPanel painelPrincipalCadastro;
    private javax.swing.JLabel txCadastroHóspedes;
    private javax.swing.JLabel txDataNasc;
    private javax.swing.JLabel txEmail;
    private javax.swing.JLabel txEndereco;
    private javax.swing.JLabel txID;
    private javax.swing.JLabel txNacionalidade;
    private javax.swing.JLabel txNomeCompleto;
    private javax.swing.JLabel txNºBilhete;
    private javax.swing.JLabel txObservações;
    private javax.swing.JLabel txTelefone;
    private javax.swing.JTextArea txtObservacoes;
    // End of variables declaration//GEN-END:variables
}
