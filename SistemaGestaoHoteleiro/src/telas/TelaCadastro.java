
package telas;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.Date; import java.time.format.DateTimeFormatter; 
import java.time.format.DateTimeParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import javax.swing.ButtonGroup;
import java.time.LocalDateTime; 
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author mcdebug
 */
public class TelaCadastro extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(TelaCadastro.class.getName());
     private javax.swing.ButtonGroup buttonGroup1; 
    public TelaCadastro() {
        initComponents();
        setLocationRelativeTo(null); 
        setCurrentDateTimeModern(); 
    }

    private void setCurrentDateTimeModern() 
    {
        ZoneId luandaZone = ZoneId.of("Africa/Luanda");
        ZonedDateTime nowInLuanda = ZonedDateTime.now(luandaZone);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        if (jFormattedTextField1 != null) 
        {
            jFormattedTextField1.setText(nowInLuanda.format(dateFormat));
            jFormattedTextField1.setEditable(false);
        }
        if (jFormattedTextField2 != null) 
        {
            jFormattedTextField2.setText(nowInLuanda.format(timeFormat));
            jFormattedTextField2.setEditable(false);
        }
    }
    private void clearFields() 
    {
        IDFilde.setText("");
        jTextFieldNome.setText("");
        jTextFieldBilhere.setText("");
        jTextFieldDataNasc.setText("");
        jTextFieldTelefone.setText("");
        jTextField5.setText(""); 
        jTextField6.setText("");
        jFormattedTextField1.setText("");
        jFormattedTextField2.setText("");
        //buttonGroup1.clearSelection();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();
        PainelGeralJPAINEL = new javax.swing.JPanel();
        FormularioGeral = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        txNomeCompleto = new javax.swing.JLabel();
        txNºBilhetePassaport = new javax.swing.JLabel();
        txDataNasc = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IDFilde = new javax.swing.JTextField();
        IDLimparBN = new javax.swing.JButton();
        LimparNome = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldBilhere = new javax.swing.JTextField();
        jTextFieldDataNasc = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        LimparBilhete = new javax.swing.JButton();
        LimparDataNasci = new javax.swing.JButton();
        LimparTelefone = new javax.swing.JButton();
        LimparEndereco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAdicionarActionPerformed = new javax.swing.JButton();
        btnAtualizarActionPerformed = new javax.swing.JButton();
        btnExcluirActionPerformed = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        lbSexo = new javax.swing.JLabel();
        jRadioButtonFeminino = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabelDate = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Logo.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logo1-removebg-preview.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro Hóspedes");
        jLabel2.setAlignmentX(0.5F);

        lbID.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lbID.setText("ID");

        txNomeCompleto.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        txNomeCompleto.setText("Nome Completo");

        txNºBilhetePassaport.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        txNºBilhetePassaport.setText("Nº Bilhete/Passaport");

        txDataNasc.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        txDataNasc.setText("DataNasc");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel6.setText("Telefone");

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel7.setText("Endereco");

        IDLimparBN.setText("Limpar");
        IDLimparBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDLimparBNActionPerformed(evt);
            }
        });

        LimparNome.setText("Limpar");
        LimparNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparNomeActionPerformed(evt);
            }
        });

        LimparBilhete.setText("Limpar");
        LimparBilhete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparBilheteActionPerformed(evt);
            }
        });

        LimparDataNasci.setText("Limpar");
        LimparDataNasci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparDataNasciActionPerformed(evt);
            }
        });

        LimparTelefone.setText("Limpar");
        LimparTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparTelefoneActionPerformed(evt);
            }
        });

        LimparEndereco.setText("Limpar");
        LimparEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparEnderecoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel1.setText("Numero De Hospedes");

        btnAdicionarActionPerformed.setText("Adicionar");
        btnAdicionarActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformedActionPerformed(evt);
            }
        });

        btnAtualizarActionPerformed.setText("Atualizar");
        btnAtualizarActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformedActionPerformed(evt);
            }
        });

        btnExcluirActionPerformed.setText("Excluir");
        btnExcluirActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformedActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jButton9.setText("Voltar");
        jButton9.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Limpar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        lbSexo.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        lbSexo.setText("Sexo");

        jRadioButtonFeminino.setBackground(new java.awt.Color(255, 51, 0));
        buttonGroup1.add(jRadioButtonFeminino);
        jRadioButtonFeminino.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jRadioButtonFeminino.setText("Femenino");

        jRadioButton2.setBackground(new java.awt.Color(255, 51, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jRadioButton2.setText("Masculino");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(255, 51, 51));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jRadioButton3.setText("Outros");

        jLabelDate.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabelDate.setText("Data");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" ##/ ##  /  ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setText("Hora");

        javax.swing.GroupLayout FormularioGeralLayout = new javax.swing.GroupLayout(FormularioGeral);
        FormularioGeral.setLayout(FormularioGeralLayout);
        FormularioGeralLayout.setHorizontalGroup(
            FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioGeralLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioGeralLayout.createSequentialGroup()
                        .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormularioGeralLayout.createSequentialGroup()
                                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(txDataNasc)
                                    .addComponent(jLabel1)
                                    .addComponent(txNºBilhetePassaport)
                                    .addComponent(txNomeCompleto)
                                    .addComponent(lbID)
                                    .addComponent(btnExcluirActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(FormularioGeralLayout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(FormularioGeralLayout.createSequentialGroup()
                                        .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonFeminino)
                                            .addGroup(FormularioGeralLayout.createSequentialGroup()
                                                .addGap(72, 72, 72)
                                                .addComponent(btnAtualizarActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(142, 142, 142)
                                        .addComponent(btnAdicionarActionPerformed))
                                    .addGroup(FormularioGeralLayout.createSequentialGroup()
                                        .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, FormularioGeralLayout.createSequentialGroup()
                                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addGap(24, 24, 24))
                                            .addComponent(IDFilde)
                                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldDataNasc, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField5)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldBilhere, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton2))
                                        .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(FormularioGeralLayout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(IDLimparBN))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioGeralLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(FormularioGeralLayout.createSequentialGroup()
                                                    .addGap(56, 56, 56)
                                                    .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jRadioButton3)
                                                        .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(LimparBilhete, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(LimparDataNasci, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(LimparTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(LimparEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(LimparNome, javax.swing.GroupLayout.Alignment.TRAILING)))))))))
                            .addComponent(lbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioGeralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioGeralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(144, 144, 144))
        );
        FormularioGeralLayout.setVerticalGroup(
            FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioGeralLayout.createSequentialGroup()
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioGeralLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioGeralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioGeralLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDFilde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDLimparBN))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioGeralLayout.createSequentialGroup()
                        .addComponent(lbID)
                        .addGap(18, 18, 18)))
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNomeCompleto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LimparNome)))
                .addGap(18, 18, 18)
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txNºBilhetePassaport)
                    .addComponent(LimparBilhete)
                    .addComponent(jTextFieldBilhere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txDataNasc)
                    .addComponent(jTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimparDataNasci))
                .addGap(26, 26, 26)
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LimparTelefone)))
                .addGap(18, 18, 18)
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimparEndereco))
                .addGap(18, 18, 18)
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10))
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormularioGeralLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSexo)
                            .addComponent(jRadioButtonFeminino)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2)))
                    .addGroup(FormularioGeralLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDate))))
                .addGap(31, 31, 31)
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizarActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PainelGeralJPAINELLayout = new javax.swing.GroupLayout(PainelGeralJPAINEL);
        PainelGeralJPAINEL.setLayout(PainelGeralJPAINELLayout);
        PainelGeralJPAINELLayout.setHorizontalGroup(
            PainelGeralJPAINELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelGeralJPAINELLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(FormularioGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        PainelGeralJPAINELLayout.setVerticalGroup(
            PainelGeralJPAINELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelGeralJPAINELLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FormularioGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelGeralJPAINEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelGeralJPAINEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimparNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparNomeActionPerformed
        clearFields();
    }//GEN-LAST:event_LimparNomeActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnAtualizarActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformedActionPerformed
        updateData();
    }//GEN-LAST:event_btnAtualizarActionPerformedActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    try
    {
            TelaHome telaHome = new  TelaHome(); 
            telaHome.setVisible(true); 
            this.dispose();
            }
            catch (Exception ex)
            {
                logger.log(java.util.logging.Level.SEVERE, "Erro ao abrir a Tela Principal", ex);
                JOptionPane.showMessageDialog(this, "Erro ao carregar a tela principal: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
            clearFields();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        clearFields();
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void btnExcluirActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformedActionPerformed
    String idParaExcluir = IDFilde.getText().trim();

        if (idParaExcluir.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Por favor, digite o ID do hóspede que deseja excluir.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        int confirmacao = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja excluir o hóspede com ID: " + idParaExcluir + "? Esta ação é irreversível.",
                "Confirmar Exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);
        if (confirmacao == JOptionPane.YES_OPTION) 
        {
            try {

                JOptionPane.showMessageDialog(this, "Hóspede com ID " + idParaExcluir + " excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                clearFields();

                } 
                catch (Exception e)
                {
                    logger.log(java.util.logging.Level.SEVERE, "Erro ao excluir hóspede com ID: " + idParaExcluir, e);
                    JOptionPane.showMessageDialog(this, "Erro ao excluir hóspede: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(this, "Exclusão cancelada.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }

    }//GEN-LAST:event_btnExcluirActionPerformedActionPerformed

    private void btnAdicionarActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformedActionPerformed
        String id = IDFilde.getText().trim();
        String nomeCompleto = jTextFieldNome.getText().trim();
        String bilhetePassaporte = jTextFieldBilhere.getText().trim();
        String dataNascimentoStr = jTextFieldDataNasc.getText().trim();
        String telefone = jTextFieldTelefone.getText().trim();
        String endereco = jTextField5.getText().trim(); 
        String numHospedes = jTextField6.getText().trim(); 
        String dataAtualStr = jFormattedTextField1.getText().replace(" ", "").trim();
        String horaAtualStr = jFormattedTextField2.getText().replace(" ", "").trim();

        if (id.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "O campo ID não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (nomeCompleto.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "O campo Nome Completo não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (bilhetePassaporte.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "O campo Nº Bilhete/Passaporte não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (dataNascimentoStr.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "O campo Data de Nascimento não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (telefone.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "O campo Telefone não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (endereco.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "O campo Endereço não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (numHospedes.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "O campo Número de Hóspedes não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (dataAtualStr.isEmpty() || dataAtualStr.equals("//")) { // Verifica se a máscara está vazia
            JOptionPane.showMessageDialog(this, "O campo Data não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (horaAtualStr.isEmpty() || horaAtualStr.equals(":")) { // Verifica se a máscara está vazia
            JOptionPane.showMessageDialog(this, "O campo Hora não pode estar vazio.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try 
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataNasc = LocalDate.parse(dataNascimentoStr, formatter);
            if (dataNasc.isAfter(LocalDate.now())) 
            {
                JOptionPane.showMessageDialog(this, "Data de Nascimento não pode ser no futuro.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } 
        catch (DateTimeParseException e) 
        {
            JOptionPane.showMessageDialog(this, "Formato de Data de Nascimento inválido. Use DD/MM/AAAA.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try 
        {
            int num = Integer.parseInt(numHospedes);
            if (num <= 0) {
                JOptionPane.showMessageDialog(this, "Número de Hóspedes deve ser um valor positivo.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(this, "Número de Hóspedes deve ser um número válido.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try 
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataAtual = LocalDate.parse(dataAtualStr, formatter);
        } 
        catch (DateTimeParseException e) 
        {
            JOptionPane.showMessageDialog(this, "Formato da Data inválido. Use DD/MM/AAAA.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try 
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime horaAtual = LocalTime.parse(horaAtualStr, formatter);
        } 
        catch (DateTimeParseException e)
        {
            JOptionPane.showMessageDialog(this, "Formato da Hora inválido. Use HH:MM.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String sexoSelecionado = "";
        if (jRadioButtonFeminino.isSelected()) 
        {
            sexoSelecionado = "Feminino";
        } else if (jRadioButton2.isSelected()) 
        {
            sexoSelecionado = "Masculino";
        } else if (jRadioButton3.isSelected()) 
        {
            sexoSelecionado = "Outros";
        }
        if (sexoSelecionado.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Selecione o Sexo.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(this, "Dados do hóspede adicionados com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        clearFields();
    }//GEN-LAST:event_btnAdicionarActionPerformedActionPerformed

    private void IDLimparBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDLimparBNActionPerformed
       clearFields();
    }//GEN-LAST:event_IDLimparBNActionPerformed

    private void LimparBilheteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparBilheteActionPerformed
       clearFields();
    }//GEN-LAST:event_LimparBilheteActionPerformed

    private void LimparDataNasciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparDataNasciActionPerformed
        clearFields();
    }//GEN-LAST:event_LimparDataNasciActionPerformed

    private void LimparTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparTelefoneActionPerformed
        clearFields();
    }//GEN-LAST:event_LimparTelefoneActionPerformed

    private void LimparEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparEnderecoActionPerformed
      clearFields();
    }//GEN-LAST:event_LimparEnderecoActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      clearFields();
    }//GEN-LAST:event_jButton10ActionPerformed


    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TelaCadastro().setVisible(true);
            }
        });
    }
    
    private void updateData() 
    {
        String id = IDFilde.getText();
        String nome = jTextFieldNome.getText();
        String bilhete = jTextFieldBilhere.getText();
        String dataNascimento = jTextFieldDataNasc.getText();
        String telefone = jTextFieldTelefone.getText();
        String endereco = jTextField5.getText(); 
        String numeroHospedes = jTextField6.getText(); 
        String data = jFormattedTextField1.getText(); 
        String outroCampo = jFormattedTextField2.getText(); 
        String sexo = "";
        if (jRadioButtonFeminino.isSelected()) 
        {
            sexo = "Feminino";
        } else if (jRadioButton2.isSelected()) 
        {
            sexo = "Masculino";
        } else if (jRadioButton3.isSelected()) 
        {
            sexo = "Outros";
        }
       
        if (id.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "O campo 'ID' é obrigatório!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (nome.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "O campo 'Nome' é obrigatório!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (bilhete.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "O campo 'Bilhete' é obrigatório!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (dataNascimento.isEmpty()) 
        {
             JOptionPane.showMessageDialog(this, "O campo 'Data de Nascimento' é obrigatório!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
             return;
        }

        if (telefone.isEmpty()) 
        {
             JOptionPane.showMessageDialog(this, "O campo 'Telefone' é obrigatório!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
             return;
        }

        if (sexo.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Selecione o sexo (Feminino, Masculino ou Outros)!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return;
        }


        System.out.println("--- Dados Coletados para Atualização ---");
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Bilhete: " + bilhete);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de Hóspedes: " + numeroHospedes);
        System.out.println("Data (jFormattedTextField1): " + data);
        System.out.println("Outro Campo (jFormattedTextField2): " + outroCampo);
        System.out.println("Sexo: " + sexo);
        System.out.println("----------------------------------------");


        // 4. Lógica de atualização real (INTEGRE SEU CÓDIGO DE BACKEND/JPA AQUI)
        try {
            // EX: Chame sua camada de persistência para atualizar os dados
            // Exemplo:
            // Cliente cliente = new Cliente();
            // cliente.setId(Integer.parseInt(id)); // Se o ID for numérico
            // cliente.setNome(nome);
            // cliente.setBilhete(bilhete);
            // cliente.setDataNascimento(dataNascimento); // Pode precisar de conversão de tipo (String para Date)
            // cliente.setTelefone(telefone);
            // cliente.setEndereco(endereco);
            // cliente.setNumeroHospedes(Integer.parseInt(numeroHospedes)); // Se for numérico
            // cliente.setData(data); // Pode precisar de conversão de tipo
            // cliente.setOutroCampo(outroCampo);
            // cliente.setSexo(sexo);

            // MeuDAO.atualizarCliente(cliente); // CHAME SEU MÉTODO DE ATUALIZAÇÃO REAL AQUI

            JOptionPane.showMessageDialog(this, "Dados enviados para atualização (ver console para detalhes)!", "Atualização Sucesso (Simulado)", JOptionPane.INFORMATION_MESSAGE);
            clearFields();

            } 
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(this, "Erro de formato numérico: " + e.getMessage() + "\nVerifique campos como ID, Número de Hóspedes.", "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar dados: " + e.getMessage() + "\nVerifique sua lógica de banco de dados.", "Erro de Atualização", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FormularioGeral;
    private javax.swing.JTextField IDFilde;
    private javax.swing.JButton IDLimparBN;
    private javax.swing.JButton LimparBilhete;
    private javax.swing.JButton LimparDataNasci;
    private javax.swing.JButton LimparEndereco;
    private javax.swing.JButton LimparNome;
    private javax.swing.JButton LimparTelefone;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel PainelGeralJPAINEL;
    private javax.swing.JButton btnAdicionarActionPerformed;
    private javax.swing.JButton btnAtualizarActionPerformed;
    private javax.swing.JButton btnExcluirActionPerformed;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextFieldBilhere;
    private javax.swing.JTextField jTextFieldDataNasc;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelefone;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel txDataNasc;
    private javax.swing.JLabel txNomeCompleto;
    private javax.swing.JLabel txNºBilhetePassaport;
    // End of variables declaration//GEN-END:variables
}
