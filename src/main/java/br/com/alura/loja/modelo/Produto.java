package br.com.alura.loja.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // indicar que essa classe é uma entidade do JPA
@Table(name = "produtos") // indica quequero usar a tabela produtos em meu banco de dados

public class Produto {

	@Id // indica que a linha de baixo será meu ID do banco
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	private Long id;
	private String nome;
	// @Column(name = "desc") //indicar que a coluna que quero do banco e utilizar uma string diferente no código
	private String descricao;
	private BigDecimal preco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
