package com.leiro.breja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Breja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idBreja")
	private Long id;
	
	@NotBlank(message="SKU é obrigatório")
	private String sku;
	
	@NotBlank(message="Nome é obrigatório")
	private String nome;
	
	@Size(min = 1, max = 50, message="O tamanho da descrição deve estar entre 1 e 50 caracteres")
	private String descricao;
	
	public Breja() {}
	
	public Breja(String sku, String nome, String descricao) {
		super();
		this.sku = sku;
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
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

}
