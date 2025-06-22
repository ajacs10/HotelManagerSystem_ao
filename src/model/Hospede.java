package model;

import java.time.LocalDate;

/**
 * Representa um hóspede no sistema, refletindo a estrutura da tabela 'hospedes' no banco de dados.
 */
public class Hospede {

    private int id;
    private String primeiroNome;
    private String ultimoNome;
    private String numeroBilheteIdentidade; // Renomeado de bilhetePassaport
    private String telefone;
    private String email; // Novo campo
    private String endereco;
    private LocalDate dataNascimento;
    private String genero; // Renomeado de sexo
    private String nacionalidade; // Novo campo
    private String observacoes; // Novo campo

    // Construtor vazio (útil para carregar dados do banco)
    public Hospede() {
    }

    // Construtor completo com todos os novos campos
    public Hospede(int id, String primeiroNome, String ultimoNome, String numeroBilheteIdentidade,
                   String telefone, String email, String endereco, LocalDate dataNascimento,
                   String genero, String nacionalidade, String observacoes) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.numeroBilheteIdentidade = numeroBilheteIdentidade;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
        this.observacoes = observacoes;
    }

    // --- Getters e Setters ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getNumeroBilheteIdentidade() {
        return numeroBilheteIdentidade;
    }

    public void setNumeroBilheteIdentidade(String numeroBilheteIdentidade) {
        this.numeroBilheteIdentidade = numeroBilheteIdentidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Hospede{" +
               "id=" + id +
               ", primeiroNome='" + primeiroNome + '\'' +
               ", ultimoNome='" + ultimoNome + '\'' +
               ", numeroBilheteIdentidade='" + numeroBilheteIdentidade + '\'' +
               ", telefone='" + telefone + '\'' +
               ", email='" + email + '\'' +
               ", endereco='" + endereco + '\'' +
               ", dataNascimento=" + dataNascimento +
               ", genero='" + genero + '\'' +
               ", nacionalidade='" + nacionalidade + '\'' +
               ", observacoes='" + observacoes + '\'' +
               '}';
    }
}