package model;

import java.math.BigDecimal;
import java.util.Objects; // Used for Objects.hash and Objects.equals in hashCode and equals

public class TipoQuarto {
    private int id;
    private String nome;
    private int capacidade;
    private BigDecimal precoPorNoite;
    private String descricao;

    /**
     * Default constructor.
     */
    public TipoQuarto() {
        // Initialize default values if necessary
        this.precoPorNoite = BigDecimal.ZERO;
    }

    /**
     * Constructor with all fields.
     */
    public TipoQuarto(int id, String nome, int capacidade, BigDecimal precoPorNoite, String descricao) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
        this.precoPorNoite = precoPorNoite;
        this.descricao = descricao;
    }

    /**
     * Constructor without ID, useful for new entries before database assignment.
     */
    public TipoQuarto(String nome, int capacidade, BigDecimal precoPorNoite, String descricao) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.precoPorNoite = precoPorNoite;
        this.descricao = descricao;
    }

    // --- Getters and Setters ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public BigDecimal getPrecoPorNoite() {
        return precoPorNoite;
    }

    public void setPrecoPorNoite(BigDecimal precoPorNoite) {
        // Basic validation: ensure price is not null and not negative
        if (precoPorNoite == null || precoPorNoite.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Preço por noite não pode ser nulo ou negativo.");
        }
        this.precoPorNoite = precoPorNoite;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // --- Utility Methods ---

    /**
     * Overrides the toString method to provide a meaningful string representation.
     * This is especially useful for displaying TipoQuarto objects in UI components
     * like JComboBoxes (as seen in your TelaQuartos.java:385 error context).
     */
    @Override
    public String toString() {
        return nome; // Often, you just want the name to be displayed
    }

    /**
     * Overrides the equals method for proper object comparison,
     * especially useful when working with collections or checking for duplicates.
     * Two TipoQuarto objects are considered equal if their IDs are the same.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoQuarto that = (TipoQuarto) o;
        return id == that.id;
    }

    /**
     * Overrides the hashCode method, essential for collections that rely on hash codes
     * (e.g., HashMap, HashSet). If two objects are equal according to the equals() method,
     * their hashCode() methods must return the same integer.
     */
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}