
package telas;

/**
 *
 * @author mcdebug
 */

import util.ConexaoMySQL;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class TelaLogin extends javax.swing.JFrame {
    private static final Logger logger = Logger.getLogger(TelaLogin.class.getName());

    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private boolean validateUsername(String username) {
        Pattern p = Pattern.compile("^[a-zA-Z]+$");
        Matcher m = p.matcher(username);
        if (!m.matches()) {
            showMessage("O usuário deve conter apenas letras.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (username.length() > 16) {
            showMessage("O usuário não pode ter mais de 10 caracteres.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validatePassword(String password) {
        if (password.length() < 8) {
            showMessage("A senha deve ter no mínimo 8 caracteres.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            showMessage("A senha deve conter pelo menos uma letra maiúscula.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!password.matches(".*[a-z].*")) {
            showMessage("A senha deve conter pelo menos uma letra minúscula.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!password.matches(".*\\d.*")) {
            showMessage("A senha deve conter pelo menos um número.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!password.matches(".*[!@#$%^&*()\\-_+=<>,.?/].*")) {
            showMessage("A senha deve conter pelo menos um caractere especial.", "Erro de Validação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void showMessage(String message, String title, int messageType) {
        JOptionPane.showMessageDialog(this, message, title, messageType);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestão Hoteleira");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("C059", 1, 16)); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("C059", 1, 16)); // NOI18N
        jLabel3.setText("Senha ");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButton1.setText("Entrar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        jButton2.setText("Sair");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/logo1-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        jButton1ActionPerformed(evt);
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
    String username = jTextField1.getText().trim();
    String password = new String(jPasswordField1.getPassword());

    if (!validateUsername(username)) {
        return;
    }
    if (!validatePassword(password)) {
        return;
    }

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String nomeCompletoUsuario = null;
    String papelUsuario = null;

    try {
        conn = ConexaoMySQL.getConexao();
        if (conn == null) {
            showMessage("Não foi possível conectar ao banco de dados.", "Erro de Conexão", JOptionPane.ERROR_MESSAGE);
            logger.log(Level.SEVERE, "Conexão com o banco de dados é nula.");
            return;
        }

        String sqlCheckUser = "SELECT u.senha_hash, u.papel, f.nome_completo " +
                             "FROM usuarios u " +
                             "LEFT JOIN funcionarios f ON u.id_funcionario = f.id_funcionario " +
                             "WHERE u.nome_usuario = ?";

        logger.log(Level.INFO, "Executando consulta SQL: {0} com username: {1}", new Object[]{sqlCheckUser, username});

        pstmt = conn.prepareStatement(sqlCheckUser);
        pstmt.setString(1, username);
        rs = pstmt.executeQuery();

        if (!rs.next()) {
            showMessage("Nome de usuário não encontrado.", "Erro de Login", JOptionPane.WARNING_MESSAGE);
            logger.log(Level.WARNING, "Nome de usuário não encontrado no banco de dados: {0}", username);
            return;
        }

        String storedHash = rs.getString("senha_hash");
        papelUsuario = rs.getString("papel");
        nomeCompletoUsuario = rs.getString("nome_completo");

        logger.log(Level.INFO, "Dados obtidos do BD: senha_hash={0}, papel={1}, nome_completo={2}", 
                  new Object[]{storedHash, papelUsuario, nomeCompletoUsuario});

        if (password.equals(storedHash)) {
            JOptionPane.showMessageDialog(this, "Login efetuado com sucesso!");
            
            if (nomeCompletoUsuario == null || nomeCompletoUsuario.isEmpty()) {
                nomeCompletoUsuario = username;
                logger.log(Level.WARNING, "Nome completo do funcionário é nulo/vazio. Usando o username: {0}", username);
            }
            papelUsuario = papelUsuario != null ? papelUsuario : ""; // Ensure non-null

            TelaHome telaHome = new TelaHome(nomeCompletoUsuario, papelUsuario);
            telaHome.setVisible(true);
            this.dispose();
        } else {
            showMessage("Senha incorreta para o usuário " + username + ".", "Erro de Login", JOptionPane.WARNING_MESSAGE);
            logger.log(Level.WARNING, "Tentativa de login falhou para o usuário {0} (senha incorreta).", username);
        }

    } catch (SQLException e) {
        logger.log(Level.SEVERE, "Erro durante a autenticação: " + e.getMessage(), e);
        showMessage("Erro de banco de dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao fechar recursos do BD: " + e.getMessage(), e);
        }
    }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        jPasswordField1.requestFocusInWindow();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int confirm = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja sair?", "Confirmar Saída", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
       public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new TelaLogin().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
