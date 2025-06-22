package dao;

import model.Hospede;
import util.ConexaoMySQL; // Certifique-se que esta classe e seus detalhes de conexão estão corretos

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date; // Para conversão de java.time.LocalDate para java.sql.Date
import java.time.LocalDate; // Para usar LocalDate
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane; // Para mostrar mensagens de erro no DAO, embora seja melhor tratá-las na UI

public class HospedeDAO {

    private static final Logger logger = Logger.getLogger(HospedeDAO.class.getName());

    /**
     * Adiciona um novo hóspede ao banco de dados.
     * O ID do hóspede é gerado automaticamente pelo banco (AUTO_INCREMENT).
     *
     * @param hospede O objeto Hospede a ser salvo.
     * @return O ID gerado para o hóspede, ou -1 se a operação falhar.
     */
    public int adicionarHospede(Hospede hospede) {
        String sql = "INSERT INTO hospedes (primeiro_nome, ultimo_nome, numero_bilhete_identidade, telefone, email, endereco, data_nascimento, genero, nacionalidade, observacoes) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int idGerado = -1;

        try {
            conexao = ConexaoMySQL.getConexao();
            pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pst.setString(1, hospede.getPrimeiroNome());
            pst.setString(2, hospede.getUltimoNome());
            pst.setString(3, hospede.getNumeroBilheteIdentidade());
            pst.setString(4, hospede.getTelefone());
            pst.setString(5, hospede.getEmail());
            pst.setString(6, hospede.getEndereco());
            // Converte LocalDate para java.sql.Date. Se for nulo, insere NULL.
            pst.setDate(7, hospede.getDataNascimento() != null ? Date.valueOf(hospede.getDataNascimento()) : null);
            pst.setString(8, hospede.getGenero());
            pst.setString(9, hospede.getNacionalidade());
            pst.setString(10, hospede.getObservacoes());

            int linhasAfetadas = pst.executeUpdate();

            if (linhasAfetadas > 0) {
                rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    idGerado = rs.getInt(1);
                    hospede.setId(idGerado); // Atualiza o objeto com o ID gerado pelo DB
                    logger.info("Hóspede adicionado com sucesso! ID: " + idGerado);
                }
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro SQL ao adicionar hóspede: " + e.getMessage(), e);
            JOptionPane.showMessageDialog(null, "Erro ao adicionar hóspede: " + e.getMessage(), "Erro no Banco de Dados", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (conexao != null) conexao.close(); // Fechar a conexão
            } catch (SQLException ex) {
                logger.log(Level.SEVERE, "Erro ao fechar recursos do banco de dados após adicionar hóspede.", ex);
            }
        }
        return idGerado;
    }

    /**
     * Busca o maior ID existente na tabela de hóspedes.
     * Útil para exibir o "próximo ID" na interface antes mesmo do cadastro.
     *
     * @return O maior ID, ou 0 se a tabela estiver vazia ou houver erro.
     */
    public int buscarMaiorID() {
        String sql = "SELECT MAX(id_hospede) FROM hospedes";
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int maxId = 0;

        try {
            conexao = ConexaoMySQL.getConexao();
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                maxId = rs.getInt(1);
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro SQL ao buscar maior ID de hóspede: " + e.getMessage(), e);
            JOptionPane.showMessageDialog(null, "Erro ao buscar maior ID: " + e.getMessage(), "Erro no Banco de Dados", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (conexao != null) conexao.close(); // Fechar a conexão
            } catch (SQLException ex) {
                logger.log(Level.SEVERE, "Erro ao fechar recursos do banco de dados após buscar maior ID.", ex);
            }
        }
        return maxId;
    }

    /**
     * Carrega todos os hóspedes do banco de dados.
     *
     * @return Uma lista de objetos Hospede.
     */
    public List<Hospede> listarTodosHospedes() {
        List<Hospede> hospedes = new ArrayList<>();
        String sql = "SELECT id_hospede, primeiro_nome, ultimo_nome, numero_bilhete_identidade, telefone, email, endereco, data_nascimento, genero, nacionalidade, observacoes FROM hospedes ORDER BY id_hospede";
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            conexao = ConexaoMySQL.getConexao();
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                Hospede hospede = new Hospede();
                hospede.setId(rs.getInt("id_hospede"));
                hospede.setPrimeiroNome(rs.getString("primeiro_nome"));
                hospede.setUltimoNome(rs.getString("ultimo_nome"));
                hospede.setNumeroBilheteIdentidade(rs.getString("numero_bilhete_identidade"));
                hospede.setTelefone(rs.getString("telefone"));
                hospede.setEmail(rs.getString("email"));
                hospede.setEndereco(rs.getString("endereco"));

                // Converte java.sql.Date para LocalDate
                Date sqlDate = rs.getDate("data_nascimento");
                hospede.setDataNascimento(sqlDate != null ? sqlDate.toLocalDate() : null);

                hospede.setGenero(rs.getString("genero"));
                hospede.setNacionalidade(rs.getString("nacionalidade"));
                hospede.setObservacoes(rs.getString("observacoes"));
                hospedes.add(hospede);
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro SQL ao listar hóspedes: " + e.getMessage(), e);
            JOptionPane.showMessageDialog(null, "Erro ao listar hóspedes: " + e.getMessage(), "Erro no Banco de Dados", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (conexao != null) conexao.close(); // Fechar a conexão
            } catch (SQLException ex) {
                logger.log(Level.SEVERE, "Erro ao fechar recursos do banco de dados após listar hóspedes.", ex);
            }
        }
        return hospedes;
    }

    /**
     * Atualiza um hóspede existente no banco de dados.
     *
     * @param hospede O objeto Hospede com os dados atualizados (o ID deve existir).
     * @return true se a atualização foi bem-sucedida, false caso contrário.
     */
    public boolean atualizarHospede(Hospede hospede) {
        String sql = "UPDATE hospedes SET primeiro_nome=?, ultimo_nome=?, numero_bilhete_identidade=?, telefone=?, email=?, endereco=?, data_nascimento=?, genero=?, nacionalidade=?, observacoes=? WHERE id_hospede=?";
        Connection conexao = null;
        PreparedStatement pst = null;
        try {
            conexao = ConexaoMySQL.getConexao();
            pst = conexao.prepareStatement(sql);

            pst.setString(1, hospede.getPrimeiroNome());
            pst.setString(2, hospede.getUltimoNome());
            pst.setString(3, hospede.getNumeroBilheteIdentidade());
            pst.setString(4, hospede.getTelefone());
            pst.setString(5, hospede.getEmail());
            pst.setString(6, hospede.getEndereco());
            pst.setDate(7, hospede.getDataNascimento() != null ? Date.valueOf(hospede.getDataNascimento()) : null);
            pst.setString(8, hospede.getGenero());
            pst.setString(9, hospede.getNacionalidade());
            pst.setString(10, hospede.getObservacoes());
            pst.setInt(11, hospede.getId()); // ID para o WHERE clause

            int linhasAfetadas = pst.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro SQL ao atualizar hóspede: " + e.getMessage(), e);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar hóspede: " + e.getMessage(), "Erro no Banco de Dados", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            try {
                if (pst != null) pst.close();
                if (conexao != null) conexao.close(); // Fechar a conexão
            } catch (SQLException ex) {
                logger.log(Level.SEVERE, "Erro ao fechar PreparedStatement após atualizar hóspede.", ex);
            }
        }
    }

    /**
     * Exclui um hóspede do banco de dados com base no seu ID.
     *
     * @param idHospede O ID do hóspede a ser excluído.
     * @return true se a exclusão foi bem-sucedida, false caso contrário.
     */
    public boolean excluirHospede(int idHospede) {
        String sql = "DELETE FROM hospedes WHERE id_hospede = ?";
        Connection conexao = null;
        PreparedStatement ps = null; // Alterado de pst para ps para consistência, mas pst também funciona
        boolean excluido = false;

        try {
            conexao = ConexaoMySQL.getConexao();
            ps = conexao.prepareStatement(sql);
            ps.setInt(1, idHospede); // Define o ID para a exclusão

            int linhasAfetadas = ps.executeUpdate(); // Executa a exclusão

            if (linhasAfetadas > 0) {
                logger.log(Level.INFO, "Hóspede com ID {0} excluído com sucesso.", idHospede);
                excluido = true;
            } else {
                logger.log(Level.WARNING, "Nenhum hóspede encontrado com ID {0} para exclusão.", idHospede);
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE, "Erro ao excluir hóspede do banco de dados com ID: " + idHospede, e);
            JOptionPane.showMessageDialog(null, "Erro ao excluir hóspede: " + e.getMessage(), "Erro no Banco de Dados", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (ps != null) ps.close();
                if (conexao != null) conexao.close(); // Fechar a conexão
            } catch (SQLException e) {
                logger.log(Level.SEVERE, "Erro ao fechar conexão ou PreparedStatement após exclusão de hóspede.", e);
            }
        }
        return excluido;
    }
}