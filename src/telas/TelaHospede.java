
package telas;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger; // Importar Logger
import model.Hospede;
import dao.HospedeDAO;
import java.util.List;

/**
 *
 * @author mcdebug
 */
public class TelaHospede extends javax.swing.JFrame 
{
    private static final Logger logger = Logger.getLogger(TelaHospede.class.getName());

    private javax.swing.ButtonGroup buttonGroup1;
    private DefaultTableModel tableModelHospedes;

    private HospedeDAO hospedeDAO;
    
    private javax.swing.JTextField jTextFieldUltimoNome; // Se você adicionar um campo para sobrenome
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNacionalidade;
    private javax.swing.JTextArea jTextAreaObservacoes; // Geralmente um JTextArea para observações

    public TelaHospede() {
    initComponents();
    setLocationRelativeTo(null);
    setCurrentDateTimeModern();

    // Remova ou comente estas linhas, pois não haverá JTable
    // if (buttonGroup1 == null) {
    //     buttonGroup1 = new ButtonGroup();
    //     buttonGroup1.add(jRadioButtonFeminino);
    //     buttonGroup1.add(jRadioButton2);
    //     buttonGroup1.add(jRadioButton3);
    // }

    IDFilde.setEditable(false);

    // Remova ou comente todas estas linhas:
    // tableModelHospedes = (DefaultTableModel) jTableHospedes.getModel();
    // if (tableModelHospedes.getColumnCount() == 0) {
    //     tableModelHospedes.setColumnIdentifiers(new Object[]{
    //         "ID", "Primeiro Nome", "Último Nome", "Nº Bilhete", "Telefone",
    //         "Email", "Endereço", "Data Nasc.", "Gênero", "Nacionalidade", "Obs."
    //     });
    // }

    hospedeDAO = new HospedeDAO();

    // Remova ou comente esta linha:
    // carregarHospedesNaTabela();
    gerarProximoIDDoBanco();
    }
    private void setCurrentDateTimeModern() {
        ZoneId luandaZone = ZoneId.of("Africa/Luanda");
        ZonedDateTime nowInLuanda = ZonedDateTime.now(luandaZone);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        if (jFormattedTextField1 != null) {
            jFormattedTextField1.setText(nowInLuanda.format(dateFormat));
            jFormattedTextField1.setEditable(false);
        }
        if (jFormattedTextField2 != null) {
            jFormattedTextField2.setText(nowInLuanda.format(timeFormat));
            jFormattedTextField2.setEditable(false);
        }
    }

    private void clearFields() {
        jTextFieldNome.setText("");
        // Se você adicionar jTextFieldUltimoNome, limpe-o também
        if (jTextFieldUltimoNome != null) jTextFieldUltimoNome.setText("");
        jTextFieldBilhere.setText("");
        jFormattedFieldDataNasc.setText("");
        jFormattedTextFieldTelefone.setText("");
        // Se você adicionar jTextFieldEmail, limpe-o também
        if (jTextFieldEmail != null) jTextFieldEmail.setText("");
        jTextField5.setText(""); // Endereço
        // Se você adicionar jTextFieldNacionalidade, limpe-o também
        if (jTextFieldNacionalidade != null) jTextFieldNacionalidade.setText("");
        // Se você adicionar jTextAreaObservacoes, limpe-o também
        if (jTextAreaObservacoes != null) jTextAreaObservacoes.setText("");

        jComboBox1NumeroHospedes.setSelectedIndex(0); // Estes são para a reserva, não para o Hóspede diretamente
        jComboBox2NumeroCrianca.setSelectedIndex(0); // Estes são para a reserva, não para o Hóspede diretamente

        if (buttonGroup1 != null) {
            buttonGroup1.clearSelection();
        }

        gerarProximoIDDoBanco(); // Gera o próximo ID do banco
    }

    private void gerarProximoIDDoBanco() {
        int maxId = hospedeDAO.buscarMaiorID();
        int proximoID = maxId + 1;
        IDFilde.setText(String.format("%02d", proximoID));
    }

    private void carregarHospedesNaTabela() {
        tableModelHospedes.setRowCount(0); // Limpa as linhas existentes

        List<Hospede> hospedes = hospedeDAO.listarTodosHospedes();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (Hospede hospede : hospedes) {
            tableModelHospedes.addRow(new Object[]{
                hospede.getId(),
                hospede.getPrimeiroNome(),
                hospede.getUltimoNome(),
                hospede.getNumeroBilheteIdentidade(),
                hospede.getTelefone(),
                hospede.getEmail(),
                hospede.getEndereco(),
                hospede.getDataNascimento() != null ? hospede.getDataNascimento().format(formatter) : "",
                hospede.getGenero(),
                hospede.getNacionalidade(),
                hospede.getObservacoes()
            });
        }
    }

    private boolean validateFields() {
        // Seu código de validação existente (ajustado para nome e bilhete)
        if (jTextFieldNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo 'Primeiro Nome' é obrigatório.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            jTextFieldNome.requestFocus();
            return false;
        }
        // Se você tiver um campo jTextFieldUltimoNome:
        if (jTextFieldUltimoNome != null && jTextFieldUltimoNome.getText().trim().isEmpty()) {
             JOptionPane.showMessageDialog(this, "O campo 'Último Nome' é obrigatório.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
             jTextFieldUltimoNome.requestFocus();
             return false;
        }

        // Renomeado para bilheteIdentidade
        if (jTextFieldBilhere.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo 'Nº Bilhete/Identidade' é obrigatório.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            jTextFieldBilhere.requestFocus();
            return false;
        }
        // Validação para email, se o campo existir
        if (jTextFieldEmail != null && jTextFieldEmail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo 'Email' é obrigatório.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            jTextFieldEmail.requestFocus();
            return false;
        }
        // Validação para endereço
        if (jTextField5.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo 'Endereço' é obrigatório.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            jTextField5.requestFocus();
            return false;
        }

        String dataNascText = jFormattedFieldDataNasc.getText().trim();
        if (dataNascText.replace("/", "").trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo 'Data de Nascimento' é obrigatório.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            jFormattedFieldDataNasc.requestFocus();
            return false;
        }
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataNascimento = LocalDate.parse(dataNascText, formatter);
            if (dataNascimento.isAfter(LocalDate.now())) {
                JOptionPane.showMessageDialog(this, "A 'Data de Nascimento' não pode ser uma data futura.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
                jFormattedFieldDataNasc.requestFocus();
                return false;
            }
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "Formato inválido para 'Data de Nascimento'. Use DD/MM/AAAA.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            jFormattedFieldDataNasc.requestFocus();
            return false;
        }

        String telefoneText = jFormattedTextFieldTelefone.getText().trim();
        if (telefoneText.replace(" ", "").isEmpty() || telefoneText.replace(" ", "").length() < 9) {
            JOptionPane.showMessageDialog(this, "O campo 'Telefone' é obrigatório e deve ter 9 dígitos.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            jFormattedTextFieldTelefone.requestFocus();
            return false;
        }

        if (buttonGroup1.getSelection() == null) {
            JOptionPane.showMessageDialog(this, "Selecione o 'Gênero' do hóspede.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            jRadioButtonFeminino.requestFocus();
            return false;
        }
        // Validação para Nacionalidade, se o campo existir
        if (jTextFieldNacionalidade != null && jTextFieldNacionalidade.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O campo 'Nacionalidade' é obrigatório.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            jTextFieldNacionalidade.requestFocus();
            return false;
        }

        return true;
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
        jTextField5 = new javax.swing.JTextField();
        LimparBilhete = new javax.swing.JButton();
        LimparDataNasci = new javax.swing.JButton();
        LimparTelefone = new javax.swing.JButton();
        LimparEndereco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAdicionarActionPerformed = new javax.swing.JButton();
        btnAtualizarActionPerformed = new javax.swing.JButton();
        btnExcluirActionPerformed = new javax.swing.JButton();
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
        jFormattedFieldDataNasc = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jComboBox1NumeroHospedes = new javax.swing.JComboBox<>();
        jLabelCrianca = new javax.swing.JLabel();
        jComboBox2NumeroCrianca = new javax.swing.JComboBox<>();

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

        IDFilde.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

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

        try {
            jFormattedFieldDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedFieldDataNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jComboBox1NumeroHospedes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabelCrianca.setText("Crianca");

        jComboBox2NumeroCrianca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                                            .addComponent(jTextField5)
                                            .addComponent(jTextFieldBilhere, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFormattedFieldDataNasc, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(FormularioGeralLayout.createSequentialGroup()
                                                .addComponent(jComboBox1NumeroHospedes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabelCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jComboBox2NumeroCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jRadioButton2))))
                                        .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(FormularioGeralLayout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(IDLimparBN))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FormularioGeralLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(FormularioGeralLayout.createSequentialGroup()
                                                    .addGap(48, 48, 48)
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
                    .addComponent(LimparDataNasci)
                    .addComponent(jFormattedFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LimparTelefone)
                        .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimparEndereco))
                .addGap(18, 18, 18)
                .addGroup(FormularioGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton10)
                    .addComponent(jComboBox1NumeroHospedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCrianca)
                    .addComponent(jComboBox2NumeroCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(103, Short.MAX_VALUE))
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
      jTextFieldNome.setText("");
        if (jTextFieldUltimoNome != null) jTextFieldUltimoNome.setText("");
    }//GEN-LAST:event_LimparNomeActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnAtualizarActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformedActionPerformed
       JOptionPane.showMessageDialog(this, "Funcionalidade de Atualização ainda não implementada.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAtualizarActionPerformedActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     TelaHome TelaHomes = new TelaHome();
        TelaHomes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        clearFields();
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void btnExcluirActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformedActionPerformed
   String idInput = JOptionPane.showInputDialog(this, "Digite o ID do hóspede que deseja excluir:", "Excluir Hóspede", JOptionPane.QUESTION_MESSAGE);

    // 2. Verificar se o utilizador inseriu algo e validá-lo
    if (idInput == null || idInput.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nenhum ID inserido. Operação cancelada.", "Cancelado", JOptionPane.INFORMATION_MESSAGE);
        return; // Sai do método se o utilizador cancelar ou não digitar nada
    }

    int idParaExcluir;
    try {
        idParaExcluir = Integer.parseInt(idInput.trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "ID inválido. Por favor, digite um número.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        return; // Sai do método se o ID não for um número válido
    }

    // 3. Confirmar a exclusão
    int confirm = JOptionPane.showConfirmDialog(this,
            "Tem certeza que deseja excluir o hóspede com ID: " + idParaExcluir + "?",
            "Confirmar Exclusão",
            JOptionPane.YES_NO_OPTION);

    // 4. Se o utilizador confirmar, tentar excluir
    if (confirm == JOptionPane.YES_OPTION) 
    {
        // Descomente e use o seu método real de exclusão no DAO
        boolean excluidoComSucesso = hospedeDAO.excluirHospede(idParaExcluir);

        if (excluidoComSucesso) {
            JOptionPane.showMessageDialog(this, "Hóspede excluído com sucesso! ID: " + idParaExcluir, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            clearFields(); // Limpa os campos da interface
            // Se você não tem tabela, não precisa chamar carregarHospedesNaTabela();
            // Se você tiver uma forma de mostrar os hóspedes (ex: JTextArea), atualize-a aqui.
            gerarProximoIDDoBanco(); // Gera o próximo ID disponível
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir hóspede do banco de dados. Verifique os logs.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
      }
    }//GEN-LAST:event_btnExcluirActionPerformedActionPerformed

    private void btnAdicionarActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformedActionPerformed
     
        if (validateFields()) 
        {
            Hospede novoHospede = new Hospede();
            // ID é gerado pelo banco, não o definimos aqui.
            // Para nome completo, você pode dividir ou usar como primeiro nome por enquanto.
            novoHospede.setPrimeiroNome(jTextFieldNome.getText().trim());
            // Se você tiver um campo separado para o sobrenome:
            novoHospede.setUltimoNome(jTextFieldUltimoNome != null ? jTextFieldUltimoNome.getText().trim() : "");

            novoHospede.setNumeroBilheteIdentidade(jTextFieldBilhere.getText().trim());
            novoHospede.setTelefone(jFormattedTextFieldTelefone.getText().trim());
            // Novos campos:
            novoHospede.setEmail(jTextFieldEmail != null ? jTextFieldEmail.getText().trim() : "");
            novoHospede.setEndereco(jTextField5.getText().trim());

            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                novoHospede.setDataNascimento(LocalDate.parse(jFormattedFieldDataNasc.getText().trim(), formatter));
            } catch (DateTimeParseException e) {
                logger.log(Level.SEVERE, "Erro ao converter data de nascimento: " + e.getMessage(), e);
                JOptionPane.showMessageDialog(this, "Erro interno ao processar data de nascimento.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String genero = "";
            if (jRadioButtonFeminino.isSelected()) {
                genero = "Feminino";
            } else if (jRadioButton2.isSelected()) {
                genero = "Masculino";
            } else if (jRadioButton3.isSelected()) {
                genero = "Outros";
            }
            novoHospede.setGenero(genero); // Campo renomeado

            // Novos campos:
            novoHospede.setNacionalidade(jTextFieldNacionalidade != null ? jTextFieldNacionalidade.getText().trim() : "");
            novoHospede.setObservacoes(jTextAreaObservacoes != null ? jTextAreaObservacoes.getText().trim() : "");

            // ATENÇÃO: númeroHospedes e numeroCriancas não fazem parte da tabela 'hospedes' diretamente.
            // Eles pertencem à tabela 'reservas' ou 'reserva_hospedes'.
            // Por isso, removi a atribuição direta a Hospede. Se precisar desses valores na reserva,
            // você os coletará na TelaQuartos ou passará para lá.
            // novoHospede.setNumeroHospedes(Integer.parseInt(jComboBox1NumeroHospedes.getSelectedItem().toString()));
            // novoHospede.setNumeroCriancas(Integer.parseInt(jComboBox2NumeroCrianca.getSelectedItem().toString()));

            int idGerado = hospedeDAO.adicionarHospede(novoHospede);

            if (idGerado != -1) {
                JOptionPane.showMessageDialog(this, "Hóspede adicionado com sucesso! ID: " + idGerado, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                clearFields(); // Limpa campos e gera o próximo ID
                carregarHospedesNaTabela(); // Atualiza a tabela com o novo hóspede

                // Redireciona para a TelaQuartos
                TelaQuartos telaQuartos = new TelaQuartos();
                telaQuartos.setVisible(true);
                this.dispose(); // Fecha a TelaHospede
            } else {
                // Mensagem de erro já tratada dentro do HospedeDAO
                JOptionPane.showMessageDialog(this, "Falha ao adicionar hóspede. Verifique os logs para detalhes.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAdicionarActionPerformedActionPerformed

    private void IDLimparBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDLimparBNActionPerformed
       clearFields();
    }//GEN-LAST:event_IDLimparBNActionPerformed

    private void LimparBilheteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparBilheteActionPerformed
       jTextFieldBilhere.setText("");
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

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed


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
            java.util.logging.Logger.getLogger(TelaHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TelaHospede().setVisible(true);
            }
        });
    }
    
   private void updateData() {
    String id = IDFilde.getText();
    String nome = jTextFieldNome.getText();
    String bilhete = jTextFieldBilhere.getText();
    // CORREÇÃO: Usar jFormattedFieldDataNasc
    String dataNascimento = jFormattedFieldDataNasc.getText();
    // CORREÇÃO: Usar jFormattedTextFieldTelefone
    String telefone = jFormattedTextFieldTelefone.getText();
    String endereco = jTextField5.getText();
    // CORREÇÃO: Para jComboBox1NumeroHospedes
    String numeroHospedes = (String) jComboBox1NumeroHospedes.getSelectedItem();
    String data = jFormattedTextField1.getText();
    String outroCampo = jFormattedTextField2.getText(); // Assumindo que este é o jFormattedTextField2 para hora
    String sexo = "";
    if (jRadioButtonFeminino.isSelected()) {
        sexo = "Feminino";
    } else if (jRadioButton2.isSelected()) {
        sexo = "Masculino";
    } else if (jRadioButton3.isSelected()) {
        sexo = "Outros";
    }
    
    // As validações aqui devem ser as mesmas do btnAdicionarActionPerformedActionPerformed
    // Recomendo criar um método separado para validação e chamá-lo de ambos os lugares.
    // Por exemplo: boolean isValid = validateFields(); if (!isValid) return;

    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'ID' é obrigatório!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (nome.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Nome' é obrigatório!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (bilhete.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Bilhete' é obrigatório!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Validação aprimorada para campos formatados
    if (dataNascimento.isEmpty() || dataNascimento.replace("/", "").trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Data de Nascimento' é obrigatório!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Validação aprimorada para campos formatados
    if (telefone.isEmpty() || telefone.replace(" ", "").trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Telefone' é obrigatório!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }
    
    if (sexo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Selecione o sexo (Feminino, Masculino ou Outros)!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Adicione validação para endereco, numeroHospedes, data e hora também
    if (endereco.isEmpty()) {
        JOptionPane.showMessageDialog(this, "O campo 'Endereço' é obrigatório!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }
    if (numeroHospedes == null || numeroHospedes.isEmpty() || numeroHospedes.equals("Item 1")) {
        JOptionPane.showMessageDialog(this, "Selecione o Número de Hóspedes.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }
    if (data.isEmpty() || data.equals("//")) {
        JOptionPane.showMessageDialog(this, "O campo 'Data' é obrigatório!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        return;
    }
    if (outroCampo.isEmpty() || outroCampo.equals(":")) {
        JOptionPane.showMessageDialog(this, "O campo 'Hora' é obrigatório!", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
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

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Erro de formato numérico: " + e.getMessage() + "\nVerifique campos como ID, Número de Hóspedes.", "Erro de Conversão", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao atualizar dados: " + e.getMessage() + "\nVerifique sua lógica de banco de dados.", "Erro de Atualização", JOptionPane.WARNING_MESSAGE);
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
    private javax.swing.JComboBox<String> jComboBox1NumeroHospedes;
    private javax.swing.JComboBox<String> jComboBox2NumeroCrianca;
    private javax.swing.JFormattedTextField jFormattedFieldDataNasc;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCrianca;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButtonFeminino;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextFieldBilhere;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel txDataNasc;
    private javax.swing.JLabel txNomeCompleto;
    private javax.swing.JLabel txNºBilhetePassaport;
    // End of variables declaration//GEN-END:variables
}
