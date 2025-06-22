/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;


import util.ConexaoMySQL; // Importe a sua classe de conexão
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel; // Para manipular a JTable
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; // Importar para usar JOptionPane

/**
 *
 * @author mcdebug
 */
public class TelaHome extends javax.swing.JFrame {
    
   private static final Logger logger = Logger.getLogger(TelaHome.class.getName());
    private String usuarioLogadoNome; // Store logged-in user's name
    private String usuarioLogadoPapel; // Store logged-in user's role

    /**
     * Default constructor for preview or fallback.
     */
    public TelaHome() {
        initComponents();
        setLocationRelativeTo(null);
        carregarReservasRecentes();
        jLabeUserName.setText("Usuário: Não Logado");
        carregarContagemHospedes();
        carregarContagemQuartos();
        carregarContagemReservas();
        carregarContagemFuncionarios();
    }

    /**
     * Constructor with username.
     * @param username The logged-in user's name.
     */
    public TelaHome(String username) {
        this.usuarioLogadoNome = username;
        this.usuarioLogadoPapel = ""; // Default empty role
        initComponents();
        setLocationRelativeTo(null);
        jLabeUserName.setText(this.usuarioLogadoNome);
        carregarReservasRecentes();
        carregarContagemHospedes();
        carregarContagemQuartos();
        carregarContagemReservas();
        carregarContagemFuncionarios();
    }

    /**
     * Constructor with username and role.
     * @param username The logged-in user's name.
     * @param papel The logged-in user's role.
     */
    public TelaHome(String username, String papel) {
        this.usuarioLogadoNome = username;
        this.usuarioLogadoPapel = papel;
        initComponents();
        setLocationRelativeTo(null);
        jLabeUserName.setText("Usuário: " + this.usuarioLogadoNome + (papel.isEmpty() ? "" : " (" + papel + ")"));
        carregarReservasRecentes();
        carregarContagemHospedes();
        carregarContagemQuartos();
        carregarContagemReservas();
        carregarContagemFuncionarios();
    }

    private void carregarContagemHospedes() {
        try (Connection conn = ConexaoMySQL.getConexao();
             PreparedStatement pstmt = conn.prepareStatement("SELECT COUNT(*) AS total FROM hospedes");
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                jLabel17.setText(String.valueOf(rs.getInt("total")));
            } else {
                jLabel17.setText("0");
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao carregar contagem de hóspedes!", e);
            JOptionPane.showMessageDialog(this, "Erro ao carregar contagem de hóspedes: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            jLabel17.setText("Erro");
        }
    }

    private void carregarContagemQuartos() {
        try (Connection conn = ConexaoMySQL.getConexao();
             PreparedStatement pstmt = conn.prepareStatement("SELECT COUNT(*) AS total FROM quartos");
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                jLabel5.setText(String.valueOf(rs.getInt("total")));
            } else {
                jLabel5.setText("0");
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao carregar contagem de quartos!", e);
            JOptionPane.showMessageDialog(this, "Erro ao carregar contagem de quartos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            jLabel5.setText("Erro");
        }
    }

    private void carregarContagemReservas() {
        try (Connection conn = ConexaoMySQL.getConexao();
             PreparedStatement pstmt = conn.prepareStatement("SELECT COUNT(*) AS total FROM reservas");
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                jLabel10.setText(String.valueOf(rs.getInt("total")));
            } else {
                jLabel10.setText("0");
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao carregar contagem de reservas!", e);
            JOptionPane.showMessageDialog(this, "Erro ao carregar contagem de reservas: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            jLabel10.setText("Erro");
        }
    }

    private void carregarContagemFuncionarios() {
        try (Connection conn = ConexaoMySQL.getConexao();
             PreparedStatement pstmt = conn.prepareStatement("SELECT COUNT(*) AS total FROM funcionarios");
             ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                jLabel13.setText(String.valueOf(rs.getInt("total")));
            } else {
                jLabel13.setText("0");
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao carregar contagem de funcionários!", e);
            JOptionPane.showMessageDialog(this, "Erro ao carregar contagem de funcionários: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            jLabel13.setText("Erro");
        }
    }

    private void carregarReservasRecentes() {
        try (Connection conn = ConexaoMySQL.getConexao();
             PreparedStatement pstmt = conn.prepareStatement(
                 "SELECT CONCAT(H.primeiro_nome, ' ', H.ultimo_nome) AS nome_hospede_completo, " +
                 "Q.numero_quarto, R.data_check_in, R.data_check_out " +
                 "FROM reservas AS R " +
                 "JOIN hospedes AS H ON R.id_hospede_principal = H.id_hospede " +
                 "JOIN quartos AS Q ON R.id_quarto = Q.id_quarto " +
                 "ORDER BY R.data_check_in DESC LIMIT 10");
             ResultSet rs = pstmt.executeQuery()) {

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("nome_hospede_completo"),
                    rs.getString("numero_quarto"),
                    rs.getString("data_check_in"),
                    rs.getString("data_check_out")
                });
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao carregar reservas recentes!", e);
            JOptionPane.showMessageDialog(this, "Erro ao carregar reservas: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    // ... outros métodos ...

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {
            // Agora, o botão "Cadastro" da TelaHome abrirá a sua TelaGeralCadatro
            TelaGeralCadatro telaGeralCadastro = new TelaGeralCadatro();
            telaGeralCadastro.setVisible(true);
            this.dispose(); // Fecha a TelaHome (opcional, dependendo do seu fluxo de navegação)
        } catch (Exception ex) {
            logger.log(Level.SEVERE, "Erro ao abrir a Tela Geral de Cadastro.", ex);
            JOptionPane.showMessageDialog(this, "Erro ao abrir a tela de opções de cadastro: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } 

// ... main method ou final da classe

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ConteinerPart1 = new javax.swing.JPanel();
        ConteinerTitulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabeUserName = new javax.swing.JLabel();
        ConteinerBaixo = new javax.swing.JPanel();
        Caixinha1Hosped = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Caixinha4Quarto = new javax.swing.JPanel();
        painelConteudoQuartos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Caixinha2Reserva = new javax.swing.JPanel();
        painelConteudoReservas = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Caixinha3Funcionario = new javax.swing.JPanel();
        painelConteudoFuncionarios = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        painelReservasRecentes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        painelMenuLateralPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnCadastroActionPerformed = new javax.swing.JPanel();
        btnCadastro = new javax.swing.JButton();
        painelMenuItemHospedes = new javax.swing.JPanel();
        bnHospedagem = new javax.swing.JButton();
        painelMenuItemQuartos = new javax.swing.JPanel();
        bnQuartos = new javax.swing.JButton();
        painelMenuItemReservas = new javax.swing.JPanel();
        bnReservas = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Funcionario = new javax.swing.JPanel();
        bnFuncionarios = new javax.swing.JButton();
        painelMenuItemDashboard = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(200, 21474));
        setPreferredSize(new java.awt.Dimension(1854, 1024));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 1280));

        jSplitPane1.setDividerLocation(200);

        ConteinerPart1.setBackground(new java.awt.Color(255, 255, 255));
        ConteinerPart1.setForeground(new java.awt.Color(255, 255, 255));
        ConteinerPart1.setLayout(new javax.swing.BoxLayout(ConteinerPart1, javax.swing.BoxLayout.Y_AXIS));

        ConteinerTitulo.setBackground(new java.awt.Color(255, 255, 255));
        ConteinerTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ConteinerTitulo.setMaximumSize(new java.awt.Dimension(32767, 10067));
        ConteinerTitulo.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 0));

        Titulo.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Sistema de Gestão Hoteleira");
        Titulo.setAlignmentX(0.5F);
        ConteinerTitulo.add(Titulo);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Adobe_Express_-_file-removebg-preview(1).png"))); // NOI18N
        jLabel2.setAlignmentX(0.5F);
        ConteinerTitulo.add(jLabel2);

        jLabeUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeUserName.setText("..............");
        jLabeUserName.setAlignmentX(0.5F);
        ConteinerTitulo.add(jLabeUserName);

        ConteinerPart1.add(ConteinerTitulo);

        ConteinerBaixo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ConteinerBaixo.setMaximumSize(new java.awt.Dimension(32767, 10767));
        ConteinerBaixo.setPreferredSize(new java.awt.Dimension(500, 166));
        ConteinerBaixo.setLayout(new java.awt.GridLayout(1, 0));

        Caixinha1Hosped.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Caixinha1Hosped.setForeground(new java.awt.Color(255, 255, 255));
        Caixinha1Hosped.setToolTipText("");
        Caixinha1Hosped.setAlignmentX(19.0F);
        Caixinha1Hosped.setAlignmentY(10.0F);
        Caixinha1Hosped.setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Hóspedes");
        jLabel15.setAlignmentX(0.5F);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Hospedagem.png"))); // NOI18N
        jLabel16.setAlignmentX(0.5F);

        jLabel17.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("----");
        jLabel17.setAlignmentX(0.5F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(32, 32, 32)
                .addComponent(jLabel17))
        );

        Caixinha1Hosped.add(jPanel1, java.awt.BorderLayout.LINE_END);

        ConteinerBaixo.add(Caixinha1Hosped);

        Caixinha4Quarto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Caixinha4Quarto.setForeground(new java.awt.Color(242, 242, 242));
        Caixinha4Quarto.setAlignmentX(19.5F);
        Caixinha4Quarto.setAlignmentY(10.5F);
        Caixinha4Quarto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Caixinha4Quarto.setLayout(new java.awt.BorderLayout());

        painelConteudoQuartos.setForeground(new java.awt.Color(50, 50, 50));
        painelConteudoQuartos.setOpaque(false);
        painelConteudoQuartos.setLayout(new java.awt.BorderLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/quarto.png"))); // NOI18N
        jLabel4.setAlignmentX(0.5F);
        painelConteudoQuartos.add(jLabel4, java.awt.BorderLayout.CENTER);

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(50, 50, 50));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Quartos");
        jLabel7.setAlignmentX(0.5F);
        painelConteudoQuartos.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(50, 50, 50));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("----");
        jLabel5.setAlignmentX(0.5F);
        painelConteudoQuartos.add(jLabel5, java.awt.BorderLayout.PAGE_END);

        Caixinha4Quarto.add(painelConteudoQuartos, java.awt.BorderLayout.CENTER);

        ConteinerBaixo.add(Caixinha4Quarto);

        Caixinha2Reserva.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Caixinha2Reserva.setLayout(new java.awt.BorderLayout());

        painelConteudoReservas.setBackground(new java.awt.Color(255, 51, 255));
        painelConteudoReservas.setOpaque(false);
        painelConteudoReservas.setLayout(new java.awt.BorderLayout());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/reserva.png"))); // NOI18N
        jLabel8.setAlignmentX(0.5F);
        painelConteudoReservas.add(jLabel8, java.awt.BorderLayout.CENTER);

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Reservas");
        jLabel9.setAlignmentX(0.5F);
        painelConteudoReservas.add(jLabel9, java.awt.BorderLayout.PAGE_START);

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("-----------");
        jLabel10.setAlignmentX(0.5F);
        painelConteudoReservas.add(jLabel10, java.awt.BorderLayout.PAGE_END);

        Caixinha2Reserva.add(painelConteudoReservas, java.awt.BorderLayout.CENTER);

        ConteinerBaixo.add(Caixinha2Reserva);

        Caixinha3Funcionario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Caixinha3Funcionario.setLayout(new java.awt.BorderLayout());

        painelConteudoFuncionarios.setOpaque(false);
        painelConteudoFuncionarios.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/pessoas.png"))); // NOI18N
        jLabel11.setAlignmentX(0.5F);
        painelConteudoFuncionarios.add(jLabel11, java.awt.BorderLayout.CENTER);

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Funcionarios");
        jLabel12.setAlignmentX(0.5F);
        painelConteudoFuncionarios.add(jLabel12, java.awt.BorderLayout.PAGE_START);

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("-----------");
        jLabel13.setAlignmentX(0.5F);
        painelConteudoFuncionarios.add(jLabel13, java.awt.BorderLayout.PAGE_END);

        Caixinha3Funcionario.add(painelConteudoFuncionarios, java.awt.BorderLayout.CENTER);

        ConteinerBaixo.add(Caixinha3Funcionario);

        ConteinerPart1.add(ConteinerBaixo);

        painelReservasRecentes.setBackground(new java.awt.Color(255, 255, 255));
        painelReservasRecentes.setMaximumSize(new java.awt.Dimension(100000, 99999));
        painelReservasRecentes.setLayout(new javax.swing.BoxLayout(painelReservasRecentes, javax.swing.BoxLayout.Y_AXIS));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reservas Recentes");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setMaximumSize(new java.awt.Dimension(950, 28));
        painelReservasRecentes.add(jLabel1);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(100000, 99999));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(16, 300));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Hóspedes", "Quartos", "Check-in", "Check-out"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        painelReservasRecentes.add(jScrollPane1);

        ConteinerPart1.add(painelReservasRecentes);

        jSplitPane1.setRightComponent(ConteinerPart1);

        painelMenuLateralPrincipal.setBackground(new java.awt.Color(40, 40, 40));
        painelMenuLateralPrincipal.setForeground(new java.awt.Color(40, 40, 40));
        painelMenuLateralPrincipal.setLayout(new javax.swing.BoxLayout(painelMenuLateralPrincipal, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));
        jPanel2.setForeground(new java.awt.Color(40, 40, 40));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        btnCadastroActionPerformed.setBackground(new java.awt.Color(255, 255, 255));
        btnCadastroActionPerformed.setForeground(new java.awt.Color(70, 70, 70));

        btnCadastro.setBackground(new java.awt.Color(70, 70, 70));
        btnCadastro.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/user.png"))); // NOI18N
        btnCadastro.setText("Cadastro");
        btnCadastro.setBorderPainted(false);
        btnCadastro.setFocusPainted(false);
        btnCadastro.setMargin(new java.awt.Insets(10, 15, 10, 15));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        btnCadastroActionPerformed.add(btnCadastro);

        jPanel2.add(btnCadastroActionPerformed);

        painelMenuItemHospedes.setBackground(new java.awt.Color(255, 255, 255));
        painelMenuItemHospedes.setForeground(new java.awt.Color(70, 70, 70));

        bnHospedagem.setBackground(new java.awt.Color(70, 70, 70));
        bnHospedagem.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        bnHospedagem.setForeground(new java.awt.Color(255, 255, 255));
        bnHospedagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Hospedagem.png"))); // NOI18N
        bnHospedagem.setText("Hospedes");
        bnHospedagem.setBorderPainted(false);
        bnHospedagem.setFocusPainted(false);
        bnHospedagem.setMargin(new java.awt.Insets(10, 15, 10, 15));
        bnHospedagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnHospedagemActionPerformed(evt);
            }
        });
        painelMenuItemHospedes.add(bnHospedagem);

        jPanel2.add(painelMenuItemHospedes);

        painelMenuItemQuartos.setBackground(new java.awt.Color(255, 255, 255));

        bnQuartos.setBackground(new java.awt.Color(70, 70, 70));
        bnQuartos.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        bnQuartos.setForeground(new java.awt.Color(255, 255, 255));
        bnQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/quarto.png"))); // NOI18N
        bnQuartos.setText("Quartos");
        bnQuartos.setBorderPainted(false);
        bnQuartos.setFocusPainted(false);
        bnQuartos.setMargin(new java.awt.Insets(10, 15, 10, 15));
        bnQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnQuartosActionPerformed(evt);
            }
        });
        painelMenuItemQuartos.add(bnQuartos);

        jPanel2.add(painelMenuItemQuartos);

        painelMenuItemReservas.setBackground(new java.awt.Color(255, 255, 255));

        bnReservas.setBackground(new java.awt.Color(70, 70, 70));
        bnReservas.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        bnReservas.setForeground(new java.awt.Color(255, 255, 255));
        bnReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/reserva.png"))); // NOI18N
        bnReservas.setText("Reservas");
        bnReservas.setBorderPainted(false);
        bnReservas.setFocusPainted(false);
        bnReservas.setMargin(new java.awt.Insets(10, 15, 10, 15));
        bnReservas.setMaximumSize(new java.awt.Dimension(160, 54));
        bnReservas.setMinimumSize(new java.awt.Dimension(160, 54));
        bnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnReservasActionPerformed(evt);
            }
        });
        painelMenuItemReservas.add(bnReservas);

        jPanel2.add(painelMenuItemReservas);
        jPanel2.add(jLabel6);

        Funcionario.setBackground(new java.awt.Color(255, 255, 255));

        bnFuncionarios.setBackground(new java.awt.Color(70, 70, 70));
        bnFuncionarios.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        bnFuncionarios.setForeground(new java.awt.Color(255, 255, 255));
        bnFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/pessoas.png"))); // NOI18N
        bnFuncionarios.setText("Funcionarios");
        bnFuncionarios.setBorderPainted(false);
        bnFuncionarios.setFocusPainted(false);
        bnFuncionarios.setMargin(new java.awt.Insets(10, 15, 10, 15));
        bnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnFuncionariosActionPerformed(evt);
            }
        });
        Funcionario.add(bnFuncionarios);

        jPanel2.add(Funcionario);

        painelMenuLateralPrincipal.add(jPanel2);

        jSplitPane1.setLeftComponent(painelMenuLateralPrincipal);

        painelMenuItemDashboard.setBackground(new java.awt.Color(102, 102, 102));
        painelMenuItemDashboard.setForeground(new java.awt.Color(51, 0, 51));
        painelMenuItemDashboard.setLayout(new javax.swing.BoxLayout(painelMenuItemDashboard, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelMenuItemDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 969, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelMenuItemDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnReservasActionPerformed
      TelaReservas telaReservas = new TelaReservas();
        telaReservas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bnReservasActionPerformed

    private void bnQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnQuartosActionPerformed
       TelaQuartos telaQuartos = new TelaQuartos();
        telaQuartos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bnQuartosActionPerformed

    private void bnHospedagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnHospedagemActionPerformed
        TelaHospede telaHospedes = new TelaHospede();
        telaHospedes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bnHospedagemActionPerformed

    private void bnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnFuncionariosActionPerformed
             TelaCadatroFuncionario telaFuncionarios = new TelaCadatroFuncionario(); // Certifique-se de que TelaFuncionarios existe
            telaFuncionarios.setVisible(true);
            this.dispose();    
    }//GEN-LAST:event_bnFuncionariosActionPerformed
                                                                                                                        
    public static void main(String args[]) {
        /* Set the Liberation Sans look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Liberation Sans (Nimbus) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) { // Changed to Nimbus as Liberation Sans might not be a default L&F
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Ao iniciar diretamente por aqui, use o construtor padrão ou um nome fixo para teste
                new TelaHome().setVisible(true); 
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Caixinha1Hosped;
    private javax.swing.JPanel Caixinha2Reserva;
    private javax.swing.JPanel Caixinha3Funcionario;
    private javax.swing.JPanel Caixinha4Quarto;
    private javax.swing.JPanel ConteinerBaixo;
    private javax.swing.JPanel ConteinerPart1;
    private javax.swing.JPanel ConteinerTitulo;
    private javax.swing.JPanel Funcionario;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton bnFuncionarios;
    private javax.swing.JButton bnHospedagem;
    private javax.swing.JButton bnQuartos;
    private javax.swing.JButton bnReservas;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JPanel btnCadastroActionPerformed;
    private javax.swing.JLabel jLabeUserName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel painelConteudoFuncionarios;
    private javax.swing.JPanel painelConteudoQuartos;
    private javax.swing.JPanel painelConteudoReservas;
    private javax.swing.JPanel painelMenuItemDashboard;
    private javax.swing.JPanel painelMenuItemHospedes;
    private javax.swing.JPanel painelMenuItemQuartos;
    private javax.swing.JPanel painelMenuItemReservas;
    private javax.swing.JPanel painelMenuLateralPrincipal;
    private javax.swing.JPanel painelReservasRecentes;
    // End of variables declaration//GEN-END:variables
}

