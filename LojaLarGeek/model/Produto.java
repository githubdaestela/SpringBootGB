package com.generation.largeek.lojaLarGeek.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_produto")
public class Produto 
{
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private float preco;
	
	@NotNull
	@Size(max = 75)
	private String titulo;
	
	@Size
	private long quantidadeEstoque;
	
	@ManyToOne
	@JsonIgnoreProperties("tb_produto")
	private Categoria categoria;

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public float getPreco() 
	{
		return preco;
	}

	public void setPreco(float preco) 
	{
		this.preco = preco;
	}

	public long getQuantidadeEstoque() 
	{
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(long quantidadeEstoque) 
	{
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Categoria getCategoria()
	{
		return categoria;
	}

	public void setCategoria(Categoria categoria)
	{
		this.categoria = categoria;
	}

	public String getTitulo() 
	{
		return titulo;
	}

	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}
}
