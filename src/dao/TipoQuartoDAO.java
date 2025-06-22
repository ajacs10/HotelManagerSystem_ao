package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TipoQuarto;

public class TipoQuartoDAO {
    private final Connection conexao;

    public TipoQuartoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public List<TipoQuarto> listarTiposQuartos() throws SQLException {
        List<TipoQuarto> tipos = new ArrayList<>();
        String sql = "SELECT * FROM tipos_quartos";

        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                TipoQuarto tipo = new TipoQuarto();
                tipo.setId(rs.getInt("id"));
                tipo.setNome(rs.getString("nome"));
                tipo.setCapacidade(rs.getInt("capacidade"));
                tipo.setPrecoPorNoite(rs.getBigDecimal("preco_por_noite"));
                tipos.add(tipo);
            }
        }
        return tipos;
    }

    public void inserirTipoQuarto(TipoQuarto tipo) throws SQLException {
        String sql = "INSERT INTO tipos_quartos (nome, capacidade, preco_por_noite) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, tipo.getNome());
            stmt.setInt(2, tipo.getCapacidade());
            stmt.setBigDecimal(3, tipo.getPrecoPorNoite());
            stmt.executeUpdate();
        }
    }

    public void atualizarTipoQuarto(TipoQuarto tipo) throws SQLException {
        String sql = "UPDATE tipos_quartos SET nome = ?, capacidade = ?, preco_por_noite = ? WHERE id = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, tipo.getNome());
            stmt.setInt(2, tipo.getCapacidade());
            stmt.setBigDecimal(3, tipo.getPrecoPorNoite());
            stmt.setInt(4, tipo.getId());
            stmt.executeUpdate();
        }
    }

    public void deletarTipoQuarto(int id) throws SQLException {
        String sql = "DELETE FROM tipos_quartos WHERE id = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}