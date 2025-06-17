/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author mcdebug
 */
package telas;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

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
        String idText = jTextField8.getText().trim();
        String nomeCompleto = jTextField2.getText().trim();
        String bilhete = jTextField3.getText().trim();
        String dataNascimentoStr = jTextField1.getText().trim();
        String email = jTextField4.getText().trim();
        String endereco = jTextField5.getText().trim();
        String telefone = jTextField6.getText().trim();
        String nacionalidade = jTextField11.getText().trim();
        String observacoes = txtObservacoes.getText().trim();

        // **Validações Campo a Campo:**

        // 1. Validação do ID (jTextField8)
        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo ID não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return; // Impede que o código continue
        }
        try {
            int id = Integer.parseInt(idText);
            if (id <= 0) {
                JOptionPane.showMessageDialog(this, "O ID deve ser um número positivo.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "O ID deve ser um número válido.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 2. Validação do Nome Completo (jTextField2)
        if (nomeCompleto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Nome Completo não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (nomeCompleto.length() < 3) {
            JOptionPane.showMessageDialog(this, "O Nome Completo deve ter pelo menos 3 caracteres.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!nomeCompleto.matches("^[a-zA-ZáéíóúÁÉÍÓÚãõÃÕçÇ\\s]+$")) { // Permite letras, acentos e espaços
            JOptionPane.showMessageDialog(this, "O Nome Completo deve conter apenas letras e espaços.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 3. Validação do Nº de Bilhete (jTextField3)
        if (bilhete.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Nº de Bilhete não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Exemplo: Validação para bilhete com 12 caracteres alfanuméricos
        if (!bilhete.matches("^[a-zA-Z0-9]{12}$")) {
            JOptionPane.showMessageDialog(this, "O Nº de Bilhete deve ter 12 caracteres alfanuméricos (letras e números).", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 4. Validação da Data de Nascimento (jTextField1)
        if (dataNascimentoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Data de Nascimento não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            // Assume o formato "DD/MM/AAAA"
            String[] partesData = dataNascimentoStr.split("/");
            if (partesData.length != 3) {
                JOptionPane.showMessageDialog(this, "Formato de Data de Nascimento inválido. Use DD/MM/AAAA.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
                return;
            }
            int dia = Integer.parseInt(partesData[0]);
            int mes = Integer.parseInt(partesData[1]);
            int ano = Integer.parseInt(partesData[2]);

            // Cria uma data e verifica se é válida
            LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

            // Verifica se a data não é futura
            if (dataNascimento.isAfter(LocalDate.now())) {
                JOptionPane.showMessageDialog(this, "A Data de Nascimento não pode ser no futuro.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
                return;
            }
            // Pode adicionar uma validação para idade mínima, por exemplo, maior de 18 anos
            if (dataNascimento.plusYears(18).isAfter(LocalDate.now())) {
                 JOptionPane.showMessageDialog(this, "O hóspede deve ter pelo menos 18 anos.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
                 return;
            }

        } catch (NumberFormatException | DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Formato de Data de Nascimento inválido. Use DD/MM/AAAA e verifique os valores de dia, mês e ano.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 5. Validação do Email (jTextField4)
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Email não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Regex para validação de email simples
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Matcher emailMatcher = emailPattern.matcher(email);
        if (!emailMatcher.matches()) {
            JOptionPane.showMessageDialog(this, "Formato de Email inválido. Ex: exemplo@dominio.com", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 6. Validação do Endereço (jTextField5)
        if (endereco.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Endereço não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (endereco.length() < 10) {
            JOptionPane.showMessageDialog(this, "O Endereço deve ter pelo menos 10 caracteres.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 7. Validação do Telefone (jTextField6)
        if (telefone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Telefone não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Exemplo: Validação para telefone com apenas dígitos e um número específico de dígitos (ex: 9 dígitos)
        if (!telefone.matches("^[0-9]{9}$")) { // Adapte para o formato de telefone angolano (ex: 9 dígitos)
            JOptionPane.showMessageDialog(this, "O Telefone deve conter apenas 9 dígitos numéricos.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 8. Validação da Nacionalidade (jTextField11)
        if (nacionalidade.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Nacionalidade não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (nacionalidade.length() < 3) {
            JOptionPane.showMessageDialog(this, "A Nacionalidade deve ter pelo menos 3 caracteres.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!nacionalidade.matches("^[a-zA-ZáéíóúÁÉÍÓÚãõÃÕçÇ\\s]+$")) {
            JOptionPane.showMessageDialog(this, "A Nacionalidade deve conter apenas letras e espaços.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 9. Validação do Sexo (jRadioButton1 e jRadioButton2)
        if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Selecione o Sexo (Feminino ou Masculino).", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 10. Validação das Observações (txtObservacoes)
        // Você pode ter validações opcionais aqui, como limite de caracteres
        if (observacoes.length() > 500) {
            JOptionPane.showMessageDialog(this, "As Observações não podem exceder 500 caracteres.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }


        // Se todas as validações passarem, você pode prosseguir com a lógica de adicionar/salvar os dados
        JOptionPane.showMessageDialog(this, "Dados válidos! Pronto para adicionar.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        // Coloque aqui o código para salvar os dados no banco de dados ou outra lógica
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
          String idToUpdateText = jTextField8.getText().trim();
        if (idToUpdateText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Para atualizar, insira o ID do hóspede.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int idToUpdate = Integer.parseInt(idToUpdateText);
            if (idToUpdate <= 0) {
                JOptionPane.showMessageDialog(this, "O ID para atualização deve ser um número positivo.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(this, "O ID para atualização deve ser um número válido.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String nomeCompleto = jTextField2.getText().trim();
        if (nomeCompleto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo Nome Completo não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // ... (continue com as validações para todos os campos relevantes)

        JOptionPane.showMessageDialog(this, "Dados válidos para atualização! Hóspede com ID " + idToUpdateText + " pronto para atualizar.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        // Aqui você chamaria sua lógica para atualizar o hóspede com base no ID
        // TODO add your handling code here:
        }
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
            logger.log(java.util.logging.Level.SEVERE, null, (UnsupportedLookAndFeelException) ex);
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
