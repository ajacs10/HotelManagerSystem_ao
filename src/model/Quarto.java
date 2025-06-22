package model;

import java.math.BigDecimal;

public class Quarto {
    private Integer id;
    private String numero;
    private TipoQuarto tipo;
    private Integer andar;
    private String status;
    private String descricao;
    private String caminhoImagem;

    // Construtor padrão
    public Quarto() {
        this.id = null;
        this.numero = "";
        this.tipo = null;
        this.andar = null;
        this.status = "";
        this.descricao = "";
        this.caminhoImagem = "";
    }

    // Construtor parametrizado
    public Quarto(Integer id, String numero, TipoQuarto tipo, Integer andar, String status, String descricao, String caminhoImagem) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.andar = andar;
        this.status = status;
        this.descricao = descricao;
        this.caminhoImagem = caminhoImagem;
    }

    // Getters e Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public TipoQuarto getTipo() { return tipo; }
    public void setTipo(TipoQuarto tipo) { this.tipo = tipo; }
    public Integer getAndar() { return andar; }
    public void setAndar(Integer andar) { this.andar = andar; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getCaminhoImagem() { return caminhoImagem; }
    public void setCaminhoImagem(String caminhoImagem) { this.caminhoImagem = caminhoImagem; }
}