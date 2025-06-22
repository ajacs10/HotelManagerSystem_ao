package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexaoMySQL {

    // ESTAS SÃO AS CREDENCIAIS PARA CONECTAR AO SERVIDOR MYSQL DO XAMPP
    // O USUÁRIO 'root' SEM SENHA É O PADRÃO PARA CONEXÃO LOCAL
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_gestao_hoteleira?useTimezone=true&serverTimezone=UTC";
    private static final String USUARIO = "root";   // <<--- TEM QUE SER "root"
    private static final String SENHA = "";         // <<--- TEM QUE SER "" (STRING VAZIA)

    private static Connection conexao = null;
    private static final Logger logger = Logger.getLogger(ConexaoMySQL.class.getName());

    public static Connection getConexao() {
        try {
            if (conexao == null || conexao.isClosed()) {
                logger.info("Tentando estabelecer conexão com o banco de dados...");
                conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
                logger.info("Conexão com o banco de dados estabelecida com sucesso!");
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao conectar ao banco de dados MySQL!", e);
            logger.log(Level.SEVERE, "Código de Erro SQL: " + e.getErrorCode());
            logger.log(Level.SEVERE, "Estado SQL: " + e.getSQLState());
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados. Verifique o servidor e as credenciais.\nDetalhes: " + e.getMessage(), "Erro de Conexão", JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException("Falha na conexão com o banco de dados.", e);
        }
        return conexao;
    }

    public static void fecharConexao(Connection conn) {
        if (conn != null) {
            try {
                if (!conn.isClosed()) {
                    conn.close();
                    logger.info("Conexão com o banco de dados fechada.");
                }
            } catch (SQLException e) {
                logger.log(Level.SEVERE, "Erro ao fechar a conexão com o banco de dados.", e);
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco de dados:\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}