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
import javax.swing.JTextField;

/**
 *
 * @author mcdebug
 */
public class TelaCadatroFuncionario extends javax.swing.JFrame 
{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCadatroFuncionario.class.getName());
    private int proximoID = 1; 
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
    txtIDFunc.setEditable(false); // ID não deve ser editável
    gerarProximoID();
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
        txtNomeCompletoFunc = new javax.swing.JTextField();
        txtNumeroBilheteFunc = new javax.swing.JTextField();
        txtEmailFunc = new javax.swing.JTextField();
        txtCargoFuncaoFunc = new javax.swing.JTextField();
        txtSalarioFunc = new javax.swing.JTextField();
        txtEnderecoFunc = new javax.swing.JTextField();
        jScrollPaneObservacoesFunc = new javax.swing.JPanel();
        painelObservacoesFunc = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
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
        txtDataNascimentoFunc = new javax.swing.JFormattedTextField();
        txtTelefoneFunc = new javax.swing.JFormattedTextField();
        txtDataContratacaoFunc = new javax.swing.JFormattedTextField();
        txtIDFunc = new javax.swing.JFormattedTextField();

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
        lblNomeCompleto.setText("Nome Completo *");

        lblID.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblID.setText("Id");

        lblNumeroBilhete.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblNumeroBilhete.setText("Nº de Bilhete *");

        lblDataNascimento.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblDataNascimento.setText("Data Nascimento *");

        lblTelefone.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblTelefone.setText("Telefone *");

        lblEmail.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblEmail.setText("Email *");

        lblCargoFuncao.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblCargoFuncao.setText("Cargo/Função *");

        lblDataContratacao.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblDataContratacao.setText("Data Contratação *");

        lblSalario.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblSalario.setText("Salário *");

        lblEndereco.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblEndereco.setText("Endereço *");

        lblSexo.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblSexo.setText("Sexo *");

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
        bnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAdicionarActionPerformed(evt);
            }
        });

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

        try {
            txtDataNascimentoFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataNascimentoFunc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataNascimentoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoFuncActionPerformed(evt);
            }
        });

        try {
            txtTelefoneFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneFunc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefoneFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneFuncActionPerformed(evt);
            }
        });

        try {
            txtDataContratacaoFunc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## /##/ #####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataContratacaoFunc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDataContratacaoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataContratacaoFuncActionPerformed(evt);
            }
        });

        txtIDFunc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPrincipalFuncionariosLayout = new javax.swing.GroupLayout(painelPrincipalFuncionarios);
        painelPrincipalFuncionarios.setLayout(painelPrincipalFuncionariosLayout);
        painelPrincipalFuncionariosLayout.setHorizontalGroup(
            painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                .addGap(263, 263, 263)
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
                    .addComponent(bnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPrincipalFuncionariosLayout.createSequentialGroup()
                                            .addComponent(rbFeminino)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rbMasculino))
                                        .addComponent(txtEnderecoFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                        .addComponent(txtSalarioFunc))
                                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                                        .addComponent(txtDataContratacaoFunc)
                                        .addGap(29, 29, 29)))
                                .addGap(18, 18, 18)
                                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimparDataContracao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimparSalario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimparEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton3)))
                            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtDataNascimentoFunc)
                                    .addComponent(txtNumeroBilheteFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(txtTelefoneFunc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimparBilhete, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimparNascimento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimparTelefone, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtIDFunc)
                                    .addComponent(txtNomeCompletoFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimparNome)))
                        .addGap(0, 438, Short.MAX_VALUE))
                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblObservacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPaneObservacoesFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tITULO, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addGap(876, 876, 876)
                        .addComponent(bnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalFuncionariosLayout.createSequentialGroup()
                .addGap(0, 92, Short.MAX_VALUE)
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
                        .addContainerGap()
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
                            .addComponent(lblID)
                            .addComponent(txtIDFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btnLimparNascimento)
                    .addComponent(txtDataNascimentoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(btnLimparTelefone)
                    .addComponent(txtTelefoneFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(btnLimparDataContracao)
                    .addComponent(lblDataContratacao)
                    .addComponent(txtDataContratacaoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(40, 40, 40)
                        .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(rbFeminino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(lblObservacoes)
                        .addGap(69, 69, 69))
                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(rbMasculino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPaneObservacoesFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnAtualizar)
                    .addComponent(bnExcluir)
                    .addComponent(bnAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneTabelaFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(painelPrincipalFuncionarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void rbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemininoActionPerformed

    private void btnLimparEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparEnderecoActionPerformed
       txtEnderecoFunc.setText("");
    }//GEN-LAST:event_btnLimparEnderecoActionPerformed

    private void btnLimparNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparNomeActionPerformed
      txtNomeCompletoFunc.setText("");
    }//GEN-LAST:event_btnLimparNomeActionPerformed

    private void txtNomeCompletoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCompletoFuncActionPerformed
       txtNomeCompletoFunc.setText("");
    }//GEN-LAST:event_txtNomeCompletoFuncActionPerformed

    private void bnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnExcluirActionPerformed
  
    }//GEN-LAST:event_bnExcluirActionPerformed

    private void bnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAtualizarActionPerformed

        JOptionPane.showMessageDialog(this, "Dados do Funcionário atualizados (simulado)!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bnAtualizarActionPerformed

    private void bnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnVoltarActionPerformed
        TelaHome telaHome = new TelaHome();
        telaHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bnVoltarActionPerformed

    private void btnLimparBilheteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBilheteActionPerformed
       txtNumeroBilheteFunc.setText("");
    }//GEN-LAST:event_btnLimparBilheteActionPerformed

    private void btnLimparNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparNascimentoActionPerformed
       txtDataNascimentoFunc.setText(null); 
    }//GEN-LAST:event_btnLimparNascimentoActionPerformed

    private void btnLimparTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTelefoneActionPerformed
        txtTelefoneFunc.setText(null); 
    }//GEN-LAST:event_btnLimparTelefoneActionPerformed

    private void btnLimparEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparEmailActionPerformed
       txtEmailFunc.setText("");
    }//GEN-LAST:event_btnLimparEmailActionPerformed

    private void btnLimparCargoFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCargoFuncaoActionPerformed
       txtCargoFuncaoFunc.setText("");
    }//GEN-LAST:event_btnLimparCargoFuncaoActionPerformed

    private void btnLimparDataContracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDataContracaoActionPerformed
         txtDataContratacaoFunc.setText(null);
    }//GEN-LAST:event_btnLimparDataContracaoActionPerformed

    private void btnLimparSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparSalarioActionPerformed
         txtSalarioFunc.setText("");
    }//GEN-LAST:event_btnLimparSalarioActionPerformed

    private void txtNumeroBilheteFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroBilheteFuncActionPerformed
        
    }//GEN-LAST:event_txtNumeroBilheteFuncActionPerformed

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

    private void txtIDFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDFuncActionPerformed

    private void txtDataNascimentoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoFuncActionPerformed

    private void txtTelefoneFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneFuncActionPerformed

    private void txtDataContratacaoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataContratacaoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataContratacaoFuncActionPerformed

    private void bnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAdicionarActionPerformed

    String nomeCompleto = txtNomeCompletoFunc.getText();
    if (!validarNome(nomeCompleto)) {
        // Se a validação falhar, o método validarNome já exibe a mensagem de erro.
        // Apenas retornamos para não continuar com a adição do funcionário.
        return;
    }
    // ---------------------------------

    // Agora, continue com suas validações existentes e a lógica de adição.
    String id = txtIDFunc.getText();
    String numeroBilhete = txtNumeroBilheteFunc.getText();
    String cargo = txtCargoFuncaoFunc.getText();
    String telefone = txtTelefoneFunc.getText().replaceAll("[^0-9]", ""); // Remover máscara do telefone para validação numérica
    String email = txtEmailFunc.getText();
    String salarioStr = txtSalarioFunc.getText();
    String dataContratacaoStr = txtDataContratacaoFunc.getText();
    String dataNascimentoStr = txtDataNascimentoFunc.getText();
    String endereco = txtEnderecoFunc.getText();

    String sexo = "";
    if (rbMasculino.isSelected()) {
        sexo = "Masculino";
    } else if (rbFeminino.isSelected()) {
        sexo = "Feminino";
    } else if (jRadioButton3.isSelected()) { // Considerando que jRadioButton3 é "outros"
        sexo = "Outros";
    }

    // Validações restantes (já existentes ou a serem adicionadas)
    if (numeroBilhete.isEmpty() || cargo.isEmpty() || telefone.isEmpty() || email.isEmpty() ||
        salarioStr.isEmpty() || dataContratacaoStr.isEmpty() || dataNascimentoStr.isEmpty() ||
        endereco.isEmpty() || sexo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios.", "Campos Vazios", JOptionPane.WARNING_MESSAGE);
        return; // Sai do método se houver campos vazios
    }

    // Validação de email (exemplo básico)
    if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$")) {
        JOptionPane.showMessageDialog(this, "Por favor, insira um endereço de e-mail válido.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Validação de telefone (deve ser apenas números após a máscara)
    if (telefone.length() != 9) { // Assumindo 9 dígitos para o telefone em Angola
        JOptionPane.showMessageDialog(this, "Por favor, insira um número de telefone válido (9 dígitos).", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }
    try {
        Long.parseLong(telefone); // Tenta converter para número para garantir que são apenas dígitos
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "O campo 'Telefone' deve conter apenas números.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Validação de salário (deve ser um número)
    double salario;
    try {
        salario = Double.parseDouble(salarioStr);
        if (salario < 0) {
             JOptionPane.showMessageDialog(this, "O salário não pode ser negativo.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
             return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "O campo 'Salário' deve conter um valor numérico válido.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Validação de datas
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    dateFormat.setLenient(false); // Importante para não aceitar datas inválidas como 32/01/2023

    Date dataNascimento = null;
    try {
        dataNascimento = dateFormat.parse(dataNascimentoStr);
        // Opcional: Validar se a data de nascimento não é futura
        if (dataNascimento.after(new Date())) {
            JOptionPane.showMessageDialog(this, "A Data de Nascimento não pode ser futura.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Formato de Data de Nascimento inválido. Use DD/MM/AAAA.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Date dataContratacao = null;
    try {
        dataContratacao = dateFormat.parse(dataContratacaoStr);
        // Opcional: Validar se a data de contratação não é futura
        if (dataContratacao.after(new Date())) {
            JOptionPane.showMessageDialog(this, "A Data de Contratação não pode ser futura.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
    } catch (ParseException e) {
        JOptionPane.showMessageDialog(this, "Formato de Data de Contratação inválido. Use DD/MM/AAAA.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Se todas as validações passarem, adicione o funcionário à tabela
    DefaultTableModel model = (DefaultTableModel) jTableFuncionarios.getModel();
    model.addRow(new Object[]{
        proximoID,
        nomeCompleto,
        numeroBilhete,
        cargo,
        telefone, // Telefone já é string filtrada
        email,
        salario,
        dateFormat.format(dataContratacao) // Formatar a data de volta para string para exibição na tabela
    });

    // Limpar campos e gerar novo ID
    clearAllFields();
    gerarProximoID();
    JOptionPane.showMessageDialog(this, "Funcionário adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bnAdicionarActionPerformed

    private void clearAllFields() 
    {
        txtNomeCompletoFunc.setText("");
        txtNumeroBilheteFunc.setText("");
        
        // Para JFormattedTextFields, defina o texto como null para limpar a máscara
        txtDataNascimentoFunc.setText(null); 
        txtTelefoneFunc.setText(null);
        
        txtEmailFunc.setText("");
        txtCargoFuncaoFunc.setText("");
        
        txtSalarioFunc.setText(""); // Para campos de texto normal que podem conter números
        
        // Para JFormattedTextFields, defina o texto como null para limpar a máscara
        txtDataContratacaoFunc.setText(null);
        
        txtEnderecoFunc.setText("");
        txtObservacoes.setText("");
        buttonGroupSexo.clearSelection(); // Limpa a seleção dos radio buttons
        
        txtNomeCompletoFunc.requestFocusInWindow();
    }
private void gerarProximoID() {
        DefaultTableModel model = (DefaultTableModel) jTableFuncionarios.getModel();
        
        // Se a tabela não tiver colunas definidas (apenas linhas nulas),
        // ou se não tiver nenhuma linha de dados adicionada, comece com 1.
        if (model.getRowCount() == 0 || model.getValueAt(0, 0) == null) { 
            proximoID = 1;
        } else {
            // Encontra o maior ID existente e incrementa
            int maxId = 0;
            for (int i = 0; i < model.getRowCount(); i++) {
                Object cellValue = model.getValueAt(i, 0); // Obtenha o valor da célula como Object

                // VERIFICAÇÃO CRÍTICA: Certifica-se de que o valor não é nulo antes de tentar toString()
                if (cellValue != null) {
                    try {
                        String idStr = cellValue.toString();
                        // Remover quaisquer espaços ou formatação que possam vir do JFormattedTextField
                        idStr = idStr.trim(); 
                        if (!idStr.isEmpty()) { // Garante que a string não está vazia após trim
                            int currentId = Integer.parseInt(idStr);
                            if (currentId > maxId) {
                                maxId = currentId;
                            }
                        }
                    } catch (NumberFormatException e) {
                        // Lidar com IDs não numéricos, se houver
                        logger.log(Level.WARNING, "ID não numérico encontrado na tabela: {0}", cellValue);
                    }
                }
            }
            proximoID = maxId + 1;
        }
        txtIDFunc.setText(String.format("%02d", proximoID)); // Formata para ter sempre 2 dígitos (ex: 01, 02)
    }

    // -------------------------------------------------------------------------
    // MÉTODOS DE VALIDAÇÃO AUXILIARES
    // -------------------------------------------------------------------------

    // Validação de campo vazio
    private boolean validarCampoVazio(JTextField campo, String nomeCampo) {
        if (campo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                                          "O campo '" + nomeCampo + "' não pode estar vazio.",
                                          "Campo Requerido",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }
        return true;
    }

    // Validação de telefone angolano (9 dígitos, começa com 9, apenas números)
    private boolean validarTelefone(JTextField campo) {
        String telefone = campo.getText().trim();
        // Remove quaisquer caracteres não numéricos que o JFormattedTextField possa ter deixado
        telefone = telefone.replaceAll("[^0-9]", "");

        if (telefone.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                                          "O campo 'Telefone' não pode estar vazio.",
                                          "Campo Requerido: Telefone",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }

        // Verifica se tem 9 dígitos
        if (telefone.length() != 9) {
            JOptionPane.showMessageDialog(this,
                                          "O 'Telefone' deve conter exatamente 9 dígitos.",
                                          "Erro de Formato: Telefone",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }

        // Verifica se começa com '9'
        if (!telefone.startsWith("9")) {
            JOptionPane.showMessageDialog(this,
                                          "O 'Telefone' angolano deve começar com '9'.",
                                          "Erro de Formato: Telefone",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }

        // Verifica se contém apenas números (já feito pelo replaceAll, mas bom ter um fallback)
        if (!telefone.matches("\\d+")) {
             JOptionPane.showMessageDialog(this,
                                          "O campo 'Telefone' deve conter apenas números.",
                                          "Erro de Formato: Telefone",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }

        return true;
    }

    // Validação de email (@gmail.com e formato básico)
    private boolean validarEmail(JTextField campo) {
        String email = campo.getText().trim();

        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                                          "O campo 'Email' não pode estar vazio.",
                                          "Campo Requerido: Email",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }

        // Padrão regex para um email básico (contém @ e .)
        // E deve terminar com @gmail.com
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"; // Regex genérico
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(this,
                                          "O formato do 'Email' é inválido.",
                                          "Erro de Formato: Email",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }

        // Validação específica para terminar com @gmail.com
        if (!email.toLowerCase().endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(this,
                                          "O 'Email' deve ser um endereço @gmail.com.",
                                          "Erro de Domínio: Email",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }

        return true;
    }

    // Validação de salário (apenas números, positivo, pode ser decimal)
    private boolean validarSalario(JTextField campo) {
        String salarioStr = campo.getText().trim();

        if (salarioStr.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                                          "O campo 'Salário' não pode estar vazio.",
                                          "Campo Requerido: Salário",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }

        try {
            double salario = Double.parseDouble(salarioStr.replace(",", ".")); // Aceita vírgula como separador decimal
            if (salario < 0) {
                JOptionPane.showMessageDialog(this,
                                              "O 'Salário' não pode ser um valor negativo.",
                                              "Erro de Validação: Salário",
                                              JOptionPane.WARNING_MESSAGE);
                campo.requestFocus();
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                                          "O campo 'Salário' deve conter apenas números (ex: 1500.00 ou 1500,00).",
                                          "Erro de Formato: Salário",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }
        return true;
    }

    // Validação de Data de Contratação (formato DD/MM/AAAA, não futura, data real)
    private boolean validarDataContratacao(JTextField campo) {
        String dataStr = campo.getText().trim();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // Não permite datas inválidas como 30/02/2023

        if (dataStr.isEmpty() || dataStr.equals("  /  /    ")) { // Verificar também a máscara vazia
            JOptionPane.showMessageDialog(this,
                                          "O campo 'Data de Contratação' não pode estar vazio.",
                                          "Campo Requerido: Data",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }

        try {
            Date dataContratacao = sdf.parse(dataStr);
            Date hoje = new Date();
            // Comparar apenas as datas (ignorar horas)
            SimpleDateFormat sdfOnlyDate = new SimpleDateFormat("dd/MM/yyyy");
            String hojeStr = sdfOnlyDate.format(hoje);
            String dataContratacaoStr = sdfOnlyDate.format(dataContratacao);

            if (sdfOnlyDate.parse(dataContratacaoStr).after(sdfOnlyDate.parse(hojeStr))) {
                JOptionPane.showMessageDialog(this,
                                              "A 'Data de Contratação' não pode ser uma data futura.",
                                              "Erro de Validação: Data",
                                              JOptionPane.WARNING_MESSAGE);
                campo.requestFocus();
                return false;
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this,
                                          "O formato da 'Data de Contratação' é inválido (use DD/MM/AAAA) ou a data não existe.",
                                          "Erro de Formato: Data",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }
        return true;
    }

    // Validação do Número de Bilhete (aceita letras e números, formato flexível por enquanto)
    // Se tiver um formato exato como "AABB1234567BB123", me diga para criar uma regex mais específica.
    // Por enquanto, valida apenas que não está vazio e contém apenas letras e números.
    private boolean validarNumeroBilhete(JTextField campo) {
        String bilhete = campo.getText().trim();

        if (bilhete.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                                          "O campo 'Nº de Bilhete' não pode estar vazio.",
                                          "Campo Requerido: Nº de Bilhete",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }

        // Regex para aceitar apenas letras e números (sem espaços ou caracteres especiais)
        // Se o documento angolano tem um formato fixo (ex: 2 letras, 9 números, 2 letras),
        // precisaríamos de uma regex mais específica. Para isso, preciso do formato exato.
        // Exemplo de regex para 2 letras, 9 números, 2 letras, 3 números: "[A-Z]{2}\\d{9}[A-Z]{2}\\d{3}"
        // Por ora, uma mais genérica:
        if (!bilhete.matches("^[a-zA-Z0-9]+$")) {
            JOptionPane.showMessageDialog(this,
                                          "O 'Nº de Bilhete' deve conter apenas letras e números, sem espaços ou caracteres especiais.",
                                          "Erro de Formato: Nº de Bilhete",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }

        // TODO: Adicionar validação de tamanho mínimo/máximo se houver um padrão
        // Ex: if (bilhete.length() != 16) { ... }

        return true;
    }

    // Validação da Data de Nascimento
    private boolean validarDataNascimento(JTextField campo) {
        String dataStr = campo.getText().trim();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false); // Não permite datas inválidas como 30/02/2023

        if (dataStr.isEmpty() || dataStr.equals("  /  /    ")) {
            JOptionPane.showMessageDialog(this,
                                          "O campo 'Data de Nascimento' não pode estar vazio.",
                                          "Campo Requerido: Data de Nascimento",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }

        try {
            Date dataNascimento = sdf.parse(dataStr);
            Date hoje = new Date();

            // Comparar apenas as datas (ignorar horas)
            SimpleDateFormat sdfOnlyDate = new SimpleDateFormat("dd/MM/yyyy");
            String hojeStr = sdfOnlyDate.format(hoje);
            String dataNascimentoStr = sdfOnlyDate.format(dataNascimento);

            if (sdfOnlyDate.parse(dataNascimentoStr).after(sdfOnlyDate.parse(hojeStr))) {
                JOptionPane.showMessageDialog(this,
                                              "A 'Data de Nascimento' não pode ser uma data futura.",
                                              "Erro de Validação: Data de Nascimento",
                                              JOptionPane.WARNING_MESSAGE);
                campo.requestFocus();
                return false;
            }

            // Opcional: Validar idade mínima (ex: funcionário deve ter pelo menos 18 anos)
            // Calendar calNasc = Calendar.getInstance();
            // calNasc.setTime(dataNascimento);
            // Calendar calHoje = Calendar.getInstance();
            // calHoje.setTime(hoje);
            //
            // int idade = calHoje.get(Calendar.YEAR) - calNasc.get(Calendar.YEAR);
            // if (calHoje.get(Calendar.DAY_OF_YEAR) < calNasc.get(Calendar.DAY_OF_YEAR)) {
            //     idade--;
            // }
            //
            // if (idade < 18) {
            //     JOptionPane.showMessageDialog(this, "O funcionário deve ter pelo menos 18 anos.", "Idade Mínima", JOptionPane.WARNING_MESSAGE);
            //     campo.requestFocus();
            //     return false;
            // }

        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this,
                                          "O formato da 'Data de Nascimento' é inválido (use DD/MM/AAAA) ou a data não existe.",
                                          "Erro de Formato: Data de Nascimento",
                                          JOptionPane.WARNING_MESSAGE);
            campo.requestFocus();
            return false;
        }
        return true;
    }
    private boolean validarNome(String nome) {
    // Expressão regular para permitir apenas letras (maiúsculas e minúsculas),
    // espaços, e caracteres acentuados comuns em nomes (ex: ç, ã, é, ó).
    // Adicione outros caracteres se necessário, dependendo da sua necessidade.
    String regex = "^[a-zA-Z\\u00C0-\\u017F\\s]+$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(nome);

    if (nome.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Nome Completo' não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return false;
    }

    if (!matcher.matches()) {
        JOptionPane.showMessageDialog(this, "O campo 'Nome Completo' deve conter apenas letras e espaços.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return false;
    }
    return true;
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
    private javax.swing.JFormattedTextField txtDataContratacaoFunc;
    private javax.swing.JFormattedTextField txtDataNascimentoFunc;
    private javax.swing.JTextField txtEmailFunc;
    private javax.swing.JTextField txtEnderecoFunc;
    private javax.swing.JFormattedTextField txtIDFunc;
    private javax.swing.JTextField txtNomeCompletoFunc;
    private javax.swing.JTextField txtNumeroBilheteFunc;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JTextField txtSalarioFunc;
    private javax.swing.JFormattedTextField txtTelefoneFunc;
    // End of variables declaration//GEN-END:variables

}
