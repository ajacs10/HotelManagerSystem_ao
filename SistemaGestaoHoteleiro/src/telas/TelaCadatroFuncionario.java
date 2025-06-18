/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mcdebug
 */
public class TelaCadatroFuncionario extends javax.swing.JFrame 
{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCadatroFuncionario.class.getName());

    public TelaCadatroFuncionario() 
    {
        initComponents();
         setLocationRelativeTo(null); 
    bnVoltar.addActionListener(this::bnVoltarActionPerformed);  
    DefaultTableModel model = (DefaultTableModel) jTableFuncionarios.getModel();
    model.setColumnIdentifiers(new Object[]
    {
       "ID", "Nome Completo", "Nº de Bilhete", "Cargo", "Telefone", "Email", "Salário", "Data Contrat"
    });
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSexo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelPrincipalFuncionarios = new javax.swing.JPanel();
        jScrollPaneTabelaFuncionarios = new javax.swing.JScrollPane();
        jTableFuncionarios = new javax.swing.JTable();
        LOGO = new javax.swing.JLabel();
        tITULO = new javax.swing.JLabel();
        lblNomeCompleto = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblNumeroBilhete = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCargoFuncao = new javax.swing.JLabel();
        lblDataContratacao = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        bnAdicionar = new javax.swing.JButton();
        bnAtualizar = new javax.swing.JButton();
        bnExcluir = new javax.swing.JButton();
        txtIDFunc = new javax.swing.JTextField();
        txtNomeCompletoFunc = new javax.swing.JTextField();
        txtNumeroBilheteFunc = new javax.swing.JTextField();
        txtDataNascimentoFunc = new javax.swing.JTextField();
        txtTelefoneFunc = new javax.swing.JTextField();
        txtEmailFunc = new javax.swing.JTextField();
        txtCargoFuncaoFunc = new javax.swing.JTextField();
        txtDataContratacaoFunc = new javax.swing.JTextField();
        txtSalarioFunc = new javax.swing.JTextField();
        txtEnderecoFunc = new javax.swing.JTextField();
        jScrollPaneObservacoesFunc = new javax.swing.JPanel();
        painelObservacoesFunc = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        btnLimparID = new javax.swing.JButton();
        btnLimparNome = new javax.swing.JButton();
        btnLimparBilhete = new javax.swing.JButton();
        btnLimparNascimento = new javax.swing.JButton();
        btnLimparTelefone = new javax.swing.JButton();
        btnLimparEmail = new javax.swing.JButton();
        btnLimparCargoFuncao = new javax.swing.JButton();
        btnLimparDataContracao = new javax.swing.JButton();
        btnLimparSalario = new javax.swing.JButton();
        btnLimparEndereco = new javax.swing.JButton();
        bnVoltar = new javax.swing.JButton();
        lblObservacoes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPaneTabelaFuncionarios.setPreferredSize(new java.awt.Dimension(850, 250));

        jTableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome Completo", "Nº de Bilhete", "Cargo", "Telefone", "Email", "Salário", "Data Contrat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPaneTabelaFuncionarios.setViewportView(jTableFuncionarios);

        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logo1-removebg-preview.png"))); // NOI18N

        tITULO.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        tITULO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tITULO.setText("Gestão de Funcionários");

        lblNomeCompleto.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblNomeCompleto.setText("Nome Completo");

        lblID.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblID.setText("Id");

        lblNumeroBilhete.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblNumeroBilhete.setText("Nº de Bilhete");

        lblDataNascimento.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblDataNascimento.setText("Data Nasc.:");

        lblTelefone.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblTelefone.setText("Telefone");

        lblEmail.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblEmail.setText("Email");

        lblCargoFuncao.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblCargoFuncao.setText("Cargo/Função");

        lblDataContratacao.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblDataContratacao.setText("Data Contratação");

        lblSalario.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblSalario.setText("Salário");

        lblEndereco.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblEndereco.setText("Endereço");

        lblSexo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblSexo.setText("Sexo");

        rbMasculino.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroupSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        rbFeminino.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroupSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");
        rbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemininoActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroupSexo.add(jRadioButton3);
        jRadioButton3.setText("outros");

        bnAdicionar.setText("Adicionar");

        bnAtualizar.setText("Atualizar");
        bnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAtualizarActionPerformed(evt);
            }
        });

        bnExcluir.setText("Excluir");
        bnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnExcluirActionPerformed(evt);
            }
        });

        txtIDFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDFuncActionPerformed(evt);
            }
        });

        txtNomeCompletoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCompletoFuncActionPerformed(evt);
            }
        });

        txtNumeroBilheteFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroBilheteFuncActionPerformed(evt);
            }
        });

        txtDataNascimentoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoFuncActionPerformed(evt);
            }
        });

        txtTelefoneFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneFuncActionPerformed(evt);
            }
        });

        txtEmailFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailFuncActionPerformed(evt);
            }
        });

        txtCargoFuncaoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoFuncaoFuncActionPerformed(evt);
            }
        });

        txtDataContratacaoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataContratacaoFuncActionPerformed(evt);
            }
        });

        txtSalarioFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioFuncActionPerformed(evt);
            }
        });

        txtEnderecoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoFuncActionPerformed(evt);
            }
        });

        txtObservacoes.setColumns(20);
        txtObservacoes.setRows(5);
        painelObservacoesFunc.setViewportView(txtObservacoes);

        javax.swing.GroupLayout jScrollPaneObservacoesFuncLayout = new javax.swing.GroupLayout(jScrollPaneObservacoesFunc);
        jScrollPaneObservacoesFunc.setLayout(jScrollPaneObservacoesFuncLayout);
        jScrollPaneObservacoesFuncLayout.setHorizontalGroup(
            jScrollPaneObservacoesFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jScrollPaneObservacoesFuncLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelObservacoesFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jScrollPaneObservacoesFuncLayout.setVerticalGroup(
            jScrollPaneObservacoesFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelObservacoesFunc, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        btnLimparID.setText("Limpar");
        btnLimparID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparIDActionPerformed(evt);
            }
        });

        btnLimparNome.setText("Limpar");
        btnLimparNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparNomeActionPerformed(evt);
            }
        });

        btnLimparBilhete.setText("Limpar");
        btnLimparBilhete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparBilheteActionPerformed(evt);
            }
        });

        btnLimparNascimento.setText("Limpar");
        btnLimparNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparNascimentoActionPerformed(evt);
            }
        });

        btnLimparTelefone.setText("Limpar");
        btnLimparTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTelefoneActionPerformed(evt);
            }
        });

        btnLimparEmail.setText("Limpar");
        btnLimparEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparEmailActionPerformed(evt);
            }
        });

        btnLimparCargoFuncao.setText("Limpar");
        btnLimparCargoFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCargoFuncaoActionPerformed(evt);
            }
        });

        btnLimparDataContracao.setText("Limpar");
        btnLimparDataContracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDataContracaoActionPerformed(evt);
            }
        });

        btnLimparSalario.setText("Limpar");
        btnLimparSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparSalarioActionPerformed(evt);
            }
        });

        btnLimparEndereco.setText("Limpar");
        btnLimparEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparEnderecoActionPerformed(evt);
            }
        });

        bnVoltar.setText("Voltar");
        bnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnVoltarActionPerformed(evt);
            }
        });

        lblObservacoes.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblObservacoes.setText("Observações");

        javax.swing.GroupLayout painelPrincipalFuncionariosLayout = new javax.swing.GroupLayout(painelPrincipalFuncionarios);
        painelPrincipalFuncionarios.setLayout(painelPrincipalFuncionariosLayout);
        painelPrincipalFuncionariosLayout.setHorizontalGroup(
            painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                .addGap(356, 356, 356)
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataContratacao)
                    .addComponent(lblSalario)
                    .addComponent(lblCargoFuncao)
                    .addComponent(lblEmail)
                    .addComponent(lblTelefone)
                    .addComponent(lblDataNascimento)
                    .addComponent(lblNumeroBilhete)
                    .addComponent(lblNomeCompleto)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndereco)
                    .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                                .addComponent(txtCargoFuncaoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(btnLimparCargoFuncao))
                            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                                .addComponent(txtEmailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimparEmail))
                            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                                .addComponent(txtTelefoneFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimparTelefone))
                            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                                .addComponent(txtDataNascimentoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimparNascimento))
                            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                                .addComponent(txtNumeroBilheteFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimparBilhete))
                            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                                .addComponent(txtNomeCompletoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimparNome))
                            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                                .addComponent(txtIDFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimparID))
                            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalFuncionariosLayout.createSequentialGroup()
                                        .addComponent(rbFeminino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbMasculino)
                                        .addGap(36, 36, 36))
                                    .addComponent(txtEnderecoFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                    .addComponent(txtSalarioFunc)
                                    .addComponent(txtDataContratacaoFunc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimparDataContracao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimparSalario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimparEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalFuncionariosLayout.createSequentialGroup()
                                        .addComponent(jRadioButton3)
                                        .addGap(29, 29, 29)))))
                        .addGap(0, 315, Short.MAX_VALUE))
                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblObservacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPaneObservacoesFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addGap(373, 373, 373)
                        .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addGap(876, 876, 876)
                        .addComponent(bnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalFuncionariosLayout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addComponent(bnAtualizar)
                        .addGap(137, 137, 137)
                        .addComponent(bnAdicionar)
                        .addGap(323, 323, 323))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addComponent(jScrollPaneTabelaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 1123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        painelPrincipalFuncionariosLayout.setVerticalGroup(
            painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(bnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tITULO)
                .addGap(32, 32, 32)
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimparID)
                            .addComponent(txtIDFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblID))
                        .addGap(37, 37, 37)
                        .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomeCompletoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeCompleto)))
                    .addComponent(btnLimparNome, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroBilhete)
                    .addComponent(txtNumeroBilheteFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparBilhete))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNascimento)
                    .addComponent(txtDataNascimentoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparNascimento))
                .addGap(28, 28, 28)
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefoneFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparTelefone))
                .addGap(26, 26, 26)
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparEmail))
                .addGap(28, 28, 28)
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargoFuncao)
                    .addComponent(txtCargoFuncaoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparCargoFuncao))
                .addGap(30, 30, 30)
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataContratacaoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparDataContracao)
                    .addComponent(lblDataContratacao))
                .addGap(18, 18, 18)
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimparSalario)
                    .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSalarioFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblSalario)))
                .addGap(25, 25, 25)
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparEndereco)
                    .addComponent(lblEndereco))
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lblSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(lblObservacoes)
                        .addGap(69, 69, 69))
                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(rbFeminino)
                            .addComponent(rbMasculino))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPaneObservacoesFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnAtualizar)
                    .addComponent(bnExcluir)
                    .addComponent(bnAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneTabelaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(painelPrincipalFuncionarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void bnAdicionarActionPerformed(java.awt.event.ActionEvent evt) 
    {                                             
        String idStr = txtIDFunc.getText().trim();
    String nomeCompleto = txtNomeCompletoFunc.getText().trim();
    String numeroBilhete = txtNumeroBilheteFunc.getText().trim();
    String dataNascimentoStr = txtDataNascimentoFunc.getText().trim();
    String telefone = txtTelefoneFunc.getText().trim();
    String email = txtEmailFunc.getText().trim();
    String cargoFuncao = txtCargoFuncaoFunc.getText().trim();
    String dataContratacaoStr = txtDataContratacaoFunc.getText().trim();
    String salarioStr = txtSalarioFunc.getText().trim();
    String endereco = txtEnderecoFunc.getText().trim();
    String observacoes = txtObservacoes.getText().trim();

    // Variável para armazenar o sexo selecionado
    String sexo = "";
    if (rbMasculino.isSelected()) {
        sexo = "Masculino";
    } else if (rbFeminino.isSelected())
    {
        sexo = "Feminino";
    } else if (jRadioButton3.isSelected()) 
    { // Se "outros" for uma opção válida
        sexo = "Outros";
    }

    // --- 2. Validação de Campos Obrigatórios (todos os que não podem ser vazios) ---
    // Comece pelas validações mais básicas: campos vazios.
    if (idStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'ID' é obrigatório.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        txtIDFunc.requestFocus();
        return;
    }
    if (nomeCompleto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Nome Completo' é obrigatório.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        txtNomeCompletoFunc.requestFocus();
        return;
    }
    if (numeroBilhete.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Nº de Bilhete' é obrigatório.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        txtNumeroBilheteFunc.requestFocus();
        return;
    }
    if (dataNascimentoStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Data Nasc.' é obrigatório.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        txtDataNascimentoFunc.requestFocus();
        return;
    }
    if (telefone.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Telefone' é obrigatório.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        txtTelefoneFunc.requestFocus();
        return;
    }
    if (email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Email' é obrigatório.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        txtEmailFunc.requestFocus();
        return;
    }
    if (cargoFuncao.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Cargo/Função' é obrigatório.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        txtCargoFuncaoFunc.requestFocus();
        return;
    }
    if (dataContratacaoStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Data Contratação' é obrigatório.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        txtDataContratacaoFunc.requestFocus();
        return;
    }
    if (salarioStr.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Salário' é obrigatório.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        txtSalarioFunc.requestFocus();
        return;
    }
    if (endereco.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Endereço' é obrigatório.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        txtEnderecoFunc.requestFocus();
        return;
    }
    if (sexo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Selecione o 'Sexo' do funcionário.", "Campo Vazio", JOptionPane.WARNING_MESSAGE);
        rbMasculino.requestFocusInWindow();
        return;
    }

    int idFunc;
    try {
        idFunc = Integer.parseInt(idStr);
        if (idFunc <= 0) {
            JOptionPane.showMessageDialog(this, "ID deve ser um número inteiro positivo.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            txtIDFunc.requestFocus();
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID deve conter apenas números inteiros válidos.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        txtIDFunc.requestFocus();
        return;
    }

    // --- 4. Validação de Email (formato básico) ---
    // Você pode refinar esta regex para ser mais rigorosa se necessário.
    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    Pattern pattern = Pattern.compile(emailRegex);
    Matcher matcher = pattern.matcher(email);
    if (!matcher.matches()) {
        JOptionPane.showMessageDialog(this, "Formato de Email inválido.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        txtEmailFunc.requestFocus();
        return;
    }

    // --- 5. Validação de Data de Nascimento (formato dd/MM/yyyy e idade mínima) ---
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    dateFormat.setLenient(false); // CRUCIAL: Impede datas inválidas como 31/02 ou 30/02/2023.
    Date dataNasc = null; // Inicialize fora do try para que possa ser usada depois
    try {
        dataNasc = dateFormat.parse(dataNascimentoStr);

        // Validação 5.1: Data não pode ser no futuro
        Date hoje = new Date(); // Data atual
        if (dataNasc.after(hoje)) {
            JOptionPane.showMessageDialog(this, "Data de Nascimento não pode ser uma data futura.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            txtDataNascimentoFunc.requestFocus();
            return;
        }

        // Validação 5.2: Idade Mínima (ex: 18 anos)
        java.util.Calendar calNasc = java.util.Calendar.getInstance();
        calNasc.setTime(dataNasc);

        java.util.Calendar calHoje = java.util.Calendar.getInstance();
        calHoje.setTime(hoje);

        int idade = calHoje.get(java.util.Calendar.YEAR) - calNasc.get(java.util.Calendar.YEAR);

        if (calNasc.get(java.util.Calendar.MONTH) > calHoje.get(java.util.Calendar.MONTH) ||
            (calNasc.get(java.util.Calendar.MONTH) == calHoje.get(java.util.Calendar.MONTH) &&
             calNasc.get(java.util.Calendar.DAY_OF_MONTH) > calHoje.get(java.util.Calendar.DAY_OF_MONTH))) {
            idade--;
        }

        int idadeMinima = 18; // Idade mínima para funcionário
        if (idade < idadeMinima) {
            JOptionPane.showMessageDialog(this, "O funcionário deve ter no mínimo " + idadeMinima + " anos de idade.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            txtDataNascimentoFunc.requestFocus();
            return;
        }

    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Formato de Data de Nascimento inválido. Use dd/MM/yyyy (ex: 12/07/2002).", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        txtDataNascimentoFunc.requestFocus();
        return;
    }

    // --- 6. Validação de Data de Contratação (formato dd/MM/yyyy e não pode ser futura) ---
    Date dataContratacao = null; // Inicialize fora do try
    try {
        dataContratacao = dateFormat.parse(dataContratacaoStr); // Usar o mesmo dateFormat, se o formato for igual

        // Validação 6.1: Data não pode ser no futuro
        Date hoje = new Date();
        if (dataContratacao.after(hoje)) {
            JOptionPane.showMessageDialog(this, "Data de Contratação não pode ser uma data futura.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            txtDataContratacaoFunc.requestFocus();
            return;
        }

        // Validação 6.2: Data de contratação não pode ser anterior à data de nascimento
        if (dataContratacao.before(dataNasc)) {
            JOptionPane.showMessageDialog(this, "Data de Contratação não pode ser anterior à Data de Nascimento.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            txtDataContratacaoFunc.requestFocus();
            return;
        }

    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Formato de Data de Contratação inválido. Use dd/MM/yyyy (ex: 18/06/2025).", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        txtDataContratacaoFunc.requestFocus();
        return;
    }

    // --- 7. Validação e Conversão do Salário (double) ---
    double salario;
    try {
        // Permite vírgula como separador decimal para o usuário, mas converte para ponto para Double.parseDouble
        salario = Double.parseDouble(salarioStr.replace(',', '.'));
        if (salario < 0) {
            JOptionPane.showMessageDialog(this, "Salário não pode ser um valor negativo.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            txtSalarioFunc.requestFocus();
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Salário deve ser um número válido (ex: 150000.00 ou 150000,00).", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        txtSalarioFunc.requestFocus();
        return;
    }

    // --- 8. Validação de Nº de Bilhete (exemplo de formato angolano) ---
    // Exemplo: 9 dígitos, 2 letras, 3 dígitos (000000000AA000)
    // Ajuste esta regex se o formato for diferente
    String bilheteRegex = "^\\d{9}[A-Z]{2}\\d{3}$";
    Pattern bilhetePattern = Pattern.compile(bilheteRegex);
    Matcher bilheteMatcher = bilhetePattern.matcher(numeroBilhete);
    if (!bilheteMatcher.matches()) {
        JOptionPane.showMessageDialog(this, "Formato de Nº de Bilhete inválido. Use 9 dígitos, 2 letras, 3 dígitos (Ex: 000000000AB000).", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        txtNumeroBilheteFunc.requestFocus();
        return;
    }


    // --- SE TODAS AS VALIDAÇÕES PASSARAM, PROSSIGA PARA ADICIONAR À TABELA ---
    DefaultTableModel model = (DefaultTableModel) jTableFuncionarios.getModel();
    Object[] row = new Object[8]; // Oito colunas como definido no setColumnIdentifiers
    row[0] = idFunc; // ID (int)
    row[1] = nomeCompleto; // Nome Completo (String)
    row[2] = numeroBilhete; // Nº de Bilhete (String)
    row[3] = cargoFuncao; // Cargo (String)
    row[4] = telefone; // Telefone (String)
    row[5] = email; // Email (String)
    row[6] = salario; // Salário (double)
    row[7] = dateFormat.format(dataContratacao); // Data Contratação (String formatada para exibição)

    model.addRow(row);
    JOptionPane.showMessageDialog(this, "Funcionário adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    // Limpar todos os campos após o cadastro bem-sucedido (você pode criar um método auxiliar para isso)
    clearAllFields();
    }   
    private void rbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemininoActionPerformed

    private void btnLimparEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparEnderecoActionPerformed

    private void btnLimparNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparNomeActionPerformed
      txtNomeCompletoFunc.setText("");
    }//GEN-LAST:event_btnLimparNomeActionPerformed

    private void txtDataContratacaoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataContratacaoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataContratacaoFuncActionPerformed

    private void txtNomeCompletoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCompletoFuncActionPerformed
       txtNomeCompletoFunc.setText("");
    }//GEN-LAST:event_txtNomeCompletoFuncActionPerformed

    private void bnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnExcluirActionPerformed
  
    }//GEN-LAST:event_bnExcluirActionPerformed

    private void bnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAtualizarActionPerformed

        JOptionPane.showMessageDialog(this, "Dados do Funcionário atualizados (simulado)!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bnAtualizarActionPerformed

    private void btnLimparIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparIDActionPerformed

    private void bnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnVoltarActionPerformed
        TelaHome telaHome = new TelaHome();
        telaHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bnVoltarActionPerformed

    private void btnLimparBilheteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBilheteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparBilheteActionPerformed

    private void btnLimparNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparNascimentoActionPerformed

    private void btnLimparTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparTelefoneActionPerformed

    private void btnLimparEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparEmailActionPerformed

    private void btnLimparCargoFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCargoFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparCargoFuncaoActionPerformed

    private void btnLimparDataContracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDataContracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparDataContracaoActionPerformed

    private void btnLimparSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparSalarioActionPerformed

    private void txtIDFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDFuncActionPerformed

    private void txtNumeroBilheteFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroBilheteFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroBilheteFuncActionPerformed

    private void txtDataNascimentoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoFuncActionPerformed

    private void txtTelefoneFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneFuncActionPerformed

    private void txtEmailFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailFuncActionPerformed

    private void txtCargoFuncaoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoFuncaoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoFuncaoFuncActionPerformed

    private void txtSalarioFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioFuncActionPerformed

    private void txtEnderecoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoFuncActionPerformed
    private boolean isValidAngolanPhoneNumber(String phoneNumber) {
        // Remove espaços e hífens para validação
        String cleanedNumber = phoneNumber.replaceAll("[\\s-]", "");
        // Regex: ^9\\d{8}$
        // ^   - Início da string
        // 9   - Deve começar com o dígito '9'
        // \\d - Qualquer dígito (0-9)
        // {8} - Exatamente 8 dígitos após o '9' (total de 9 dígitos)
        // $   - Fim da string
        Pattern pattern = Pattern.compile("^9\\d{8}$");
        Matcher matcher = pattern.matcher(cleanedNumber);
        return matcher.matches();
    }
    private void clearAllFields() 
    {
        txtIDFunc.setText("");
        txtNomeCompletoFunc.setText("");
        txtNumeroBilheteFunc.setText("");
        txtDataNascimentoFunc.setText("");
        txtTelefoneFunc.setText("");
        txtEmailFunc.setText("");
        txtCargoFuncaoFunc.setText("");
        txtDataContratacaoFunc.setText("");
        txtSalarioFunc.setText("");
        txtEnderecoFunc.setText("");
        txtObservacoes.setText("");
        buttonGroupSexo.clearSelection(); // Limpa a seleção dos radio buttons de sexo
    }
    private boolean isValidDate(String dateStr, String format) 
     {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
     private boolean isValidEmail(String email) 
     {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String args[]) 
    {
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
        java.awt.EventQueue.invokeLater(() -> new TelaCadatroFuncionario().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGO;
    private javax.swing.JButton bnAdicionar;
    private javax.swing.JButton bnAtualizar;
    private javax.swing.JButton bnExcluir;
    private javax.swing.JButton bnVoltar;
    private javax.swing.JButton btnLimparBilhete;
    private javax.swing.JButton btnLimparCargoFuncao;
    private javax.swing.JButton btnLimparDataContracao;
    private javax.swing.JButton btnLimparEmail;
    private javax.swing.JButton btnLimparEndereco;
    private javax.swing.JButton btnLimparID;
    private javax.swing.JButton btnLimparNascimento;
    private javax.swing.JButton btnLimparNome;
    private javax.swing.JButton btnLimparSalario;
    private javax.swing.JButton btnLimparTelefone;
    private javax.swing.ButtonGroup buttonGroupSexo;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jScrollPaneObservacoesFunc;
    private javax.swing.JScrollPane jScrollPaneTabelaFuncionarios;
    private javax.swing.JTable jTableFuncionarios;
    private javax.swing.JLabel lblCargoFuncao;
    private javax.swing.JLabel lblDataContratacao;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblNumeroBilhete;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JScrollPane painelObservacoesFunc;
    private javax.swing.JPanel painelPrincipalFuncionarios;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JLabel tITULO;
    private javax.swing.JTextField txtCargoFuncaoFunc;
    private javax.swing.JTextField txtDataContratacaoFunc;
    private javax.swing.JTextField txtDataNascimentoFunc;
    private javax.swing.JTextField txtEmailFunc;
    private javax.swing.JTextField txtEnderecoFunc;
    private javax.swing.JTextField txtIDFunc;
    private javax.swing.JTextField txtNomeCompletoFunc;
    private javax.swing.JTextField txtNumeroBilheteFunc;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JTextField txtSalarioFunc;
    private javax.swing.JTextField txtTelefoneFunc;
    // End of variables declaration//GEN-END:variables

}
