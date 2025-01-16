package com.generation.gamesstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo é obrigatório!")
	private String nome;
	
	@NotBlank(message = "O atributo é obrigatório!")
	private String descricao;
	
	@Column(nullable = false)
	private Double preco;
	
	@Column(nullable = false)
	private Integer quantidadeEstoque;
}
