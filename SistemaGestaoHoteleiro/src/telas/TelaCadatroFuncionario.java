/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        rbFeminino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
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
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
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
        jButton1 = new javax.swing.JButton();

        rbFeminino.setText("Feminino");
        rbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemininoActionPerformed(evt);
            }
        });

        rbMasculino.setText("Masculino");

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

        jRadioButton1.setText("Masculino");

        jRadioButton2.setText("Feminino");

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

        txtNomeCompletoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCompletoFuncActionPerformed(evt);
            }
        });

        txtDataContratacaoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataContratacaoFuncActionPerformed(evt);
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

        btnLimparNascimento.setText("Limpar");

        btnLimparTelefone.setText("Limpar");

        btnLimparEmail.setText("Limpar");

        btnLimparCargoFuncao.setText("Limpar");

        btnLimparDataContracao.setText("Limpar");

        btnLimparSalario.setText("Limpar");

        btnLimparEndereco.setText("Limpar");
        btnLimparEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparEnderecoActionPerformed(evt);
            }
        });

        bnVoltar.setText("Voltar");

        lblObservacoes.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lblObservacoes.setText("Observações");

        jButton1.setText("Limpar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                                    .addComponent(txtEnderecoFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(txtSalarioFunc)
                                    .addComponent(txtDataContratacaoFunc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimparDataContracao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimparSalario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLimparEndereco, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jRadioButton1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(lblObservacoes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPaneObservacoesFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(9, 9, 9)))
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
                .addContainerGap(227, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalFuncionariosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
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
                .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPaneObservacoesFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(painelPrincipalFuncionariosLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(painelPrincipalFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSexo)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(lblObservacoes)
                        .addGap(69, 69, 69)))
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
        String idFunc = txtIDFunc.getText(); 
        String nomeCompleto = txtNomeCompletoFunc.getText();
        String numeroBilhete = txtNumeroBilheteFunc.getText();
        String dataNascimento = txtDataNascimentoFunc.getText();
        String telefone = txtTelefoneFunc.getText();
        String email = txtEmailFunc.getText();
        String cargoFuncao = txtCargoFuncaoFunc.getText();
        String dataContratacao = txtDataContratacaoFunc.getText();
        String salario = txtSalarioFunc.getText();
        String endereco = txtEnderecoFunc.getText();
    
        String sexo = "";
        if (rbFeminino.isSelected())
        { 
            sexo = "Feminino";
        } 
        else if (rbMasculino.isSelected()) 
        {
            sexo = "Masculino";
        }
        String observacoes = txtObservacoes.getText();

  
        if (idFunc.isEmpty() || nomeCompleto.isEmpty() || numeroBilhete.isEmpty() || 
        telefone.isEmpty() || cargoFuncao.isEmpty() || sexo.isEmpty()) 
        {
        JOptionPane.showMessageDialog(this, "Por favor, preencha os campos obrigatórios: ID, Nome, Bilhete, Telefone, Cargo e Sexo.", "Campos Obrigatórios", JOptionPane.WARNING_MESSAGE);
        return;
        }


        JOptionPane.showMessageDialog(this, "Funcionário '" + nomeCompleto + "' adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        DefaultTableModel model = (DefaultTableModel) jTableFuncionarios.getModel();
        model.addRow(new Object[]{
            idFunc, nomeCompleto, numeroBilhete, cargoFuncao, telefone, email, salario, dataContratacao
        });
    
        limparTodosOsCamposFunc();
    }   
    private void rbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemininoActionPerformed

    private void btnLimparEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparEnderecoActionPerformed

    private void btnLimparNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparNomeActionPerformed

    private void txtDataContratacaoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataContratacaoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataContratacaoFuncActionPerformed

    private void txtNomeCompletoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCompletoFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCompletoFuncActionPerformed

    private void bnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnExcluirActionPerformed
        int selectedRow = jTableFuncionarios.getSelectedRow();

        if (selectedRow == -1)
        {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um funcionário na tabela para excluir.", "Nenhuma Seleção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir o funcionário selecionado?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION)
        {

            DefaultTableModel model = (DefaultTableModel) jTableFuncionarios.getModel();
            model.removeRow(selectedRow);
            JOptionPane.showMessageDialog(this, "Funcionário excluído (simulado)!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limparTodosOsCamposFunc();
        }
    }//GEN-LAST:event_bnExcluirActionPerformed

    private void bnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAtualizarActionPerformed

        JOptionPane.showMessageDialog(this, "Dados do Funcionário atualizados (simulado)!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bnAtualizarActionPerformed

    private void btnLimparIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bnVoltarActionPerformed(java.awt.event.ActionEvent evt) 
    {
        TelaHome telaHome = new TelaHome();
        telaHome.setVisible(true);
        this.dispose();
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
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
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

    private void limparTodosOsCamposFunc()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
