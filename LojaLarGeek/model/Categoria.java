package com.generation.largeek.lojaLarGeek.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_categoria")
public class Categoria 
{
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 200)
	private String nome;
	
	@NotNull
	private boolean disponivel;

	public long getId() 
	{
		return id;
	}

	public void setId(long id) 
	{
		this.id = id;
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public boolean isDisponivel() 
	{
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) 
	{
		this.disponivel = disponivel;
	}
}
