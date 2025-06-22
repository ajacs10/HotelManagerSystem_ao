package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Quarto;
import model.TipoQuarto;

public class QuartoDAO {
    private final Connection conexao;

    public QuartoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public List<Quarto> listarQuartos() throws SQLException {
        List<Quarto> quartos = new ArrayList<>();
        String sql = "SELECT q.id_quarto, q.numero_quarto, q.id_tipo_quarto, q.andar, q.status_quarto, q.descricao, q.caminho_imagem, "
                   + "tq.id AS tipo_id, tq.nome, tq.capacidade, tq.preco_por_noite "
                   + "FROM quartos q JOIN tipos_quartos tq ON q.id_tipo_quarto = tq.id";

        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Quarto quarto = new Quarto();
                quarto.setId(rs.getInt("id_quarto"));
                quarto.setNumero(rs.getString("numero_quarto")); // String
                TipoQuarto tipo = new TipoQuarto();
                tipo.setId(rs.getInt("tipo_id"));
                tipo.setNome(rs.getString("nome"));
                tipo.setCapacidade(rs.getInt("capacidade"));
                tipo.setPrecoPorNoite(rs.getBigDecimal("preco_por_noite"));
                quarto.setTipo(tipo);
                quarto.setAndar(rs.getInt("andar"));
                quarto.setStatus(rs.getString("status_quarto"));
                quarto.setDescricao(rs.getString("descricao"));
                quarto.setCaminhoImagem(rs.getString("caminho_imagem"));
                quartos.add(quarto);
            }
        }
        return quartos;
    }

    public void adicionarQuarto(Quarto quarto) throws SQLException {
        String sql = "INSERT INTO quartos (numero_quarto, id_type_quarto, andar, status_quarto, descricao, caminho_imagem) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, quarto.getNumero()); // String
            stmt.setInt(2, quarto.getTipo().getId());
            stmt.setInt(3, quarto.getAndar());
            stmt.setString(4, quarto.getStatus());
            stmt.setString(5, quarto.getDescricao());
            stmt.setString(6, quarto.getCaminhoImagem());
            stmt.executeUpdate();
        }
    }

    public void atualizarQuarto(Quarto quarto) throws SQLException {
        String sql = "UPDATE quartos SET numero_quarto = ?, id_type_quarto = ?, andar = ?, status_quarto = ?, descricao = ?, caminho_imagem = ? WHERE id_quarto = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, quarto.getNumero()); // String
            stmt.setInt(2, quarto.getTipo().getId());
            stmt.setInt(3, quarto.getAndar());
            stmt.setString(4, quarto.getStatus());
            stmt.setString(5, quarto.getDescricao());
            stmt.setString(6, quarto.getCaminhoImagem());
            stmt.setInt(7, quarto.getId());
            stmt.executeUpdate();
        }
    }

    public void excluirQuarto(int id) throws SQLException {
        String sql = "DELETE FROM quartos WHERE id_quarto = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public Quarto buscarQuartoPorId(int id) throws SQLException {
        String sql = "SELECT q.id_quarto, q.numero_quarto, q.id_type_quarto, q.andar, q.status_quarto, q.descricao, q.caminho_imagem, "
                   + "tq.id AS tipo_id, tq.nome, tq.capacidade, tq.preco_por_noite "
                   + "FROM quartos q JOIN tipos_quartos tq ON q.id_type_quarto = tq.id WHERE q.id_quarto = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Quarto quarto = new Quarto();
                    quarto.setId(rs.getInt("id_quarto"));
                    quarto.setNumero(rs.getString("numero_quarto")); // String
                    TipoQuarto tipo = new TipoQuarto();
                    tipo.setId(rs.getInt("tipo_id"));
                    tipo.setNome(rs.getString("nome"));
                    tipo.setCapacidade(rs.getInt("capacidade"));
                    tipo.setPrecoPorNoite(rs.getBigDecimal("preco_por_noite"));
                    quarto.setTipo(tipo);
                    quarto.setAndar(rs.getInt("andar"));
                    quarto.setStatus(rs.getString("status_quarto"));
                    quarto.setDescricao(rs.getString("descricao"));
                    quarto.setCaminhoImagem(rs.getString("caminho_imagem"));
                    return quarto;
                }
            }
        }
        return null;
    }
}